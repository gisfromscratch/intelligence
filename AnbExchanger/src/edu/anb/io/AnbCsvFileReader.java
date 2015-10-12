package edu.anb.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.UUID;

import edu.anb.core.Attribute;
import edu.anb.core.AttributeClass;
import edu.anb.core.AttributeClassCollection;
import edu.anb.core.AttributeCollection;
import edu.anb.core.AttributeTypeEnum;
import edu.anb.core.ChartItem;
import edu.anb.core.ChartItemCollection;
import edu.anb.core.End;
import edu.anb.core.EntityType;
import edu.anb.core.EntityTypeCollection;
import edu.anb.core.LinkType;
import edu.anb.core.LinkTypeCollection;
import edu.anb.domain.AnbBuilderContext;
import edu.anb.domain.AnbInputDataset;
import edu.anb.domain.AnbParsingContext;
import edu.anb.domain.AnbUniqueId;

/**
 * Reads simple CSV files and creates items representing nodes or links with attributes.
 *
 * @author J.T.
 *
 */
public class AnbCsvFileReader {

	/**
	 * Reads a CSV file line by line and treats it as an input dataset.
	 * @param csvFile the CSV file which should be read.
	 * @param parsingContext defines how the parsing should be done.
	 * @param builderContext defines how the instances should be builded.
	 * @return the input dataset.
	 * @throws IOException 
	 */
	public AnbInputDataset readFile(File csvFile, AnbParsingContext parsingContext, AnbBuilderContext builderContext) throws IOException {
		AnbInputDataset dataset = new AnbInputDataset();
		ChartItemCollection chartItemCollection = dataset.getChartItemCollection();
		List<ChartItem> chartItemList = chartItemCollection.getChartItem();
		AttributeClassCollection attributeClassCollection = dataset.getAttributeClassCollection();
		HashMap<Integer, AttributeClass> attributeClasses = new HashMap<Integer, AttributeClass>();
		HashMap<String, ChartItem> uniqueItems = new HashMap<String, ChartItem>();
		
		LineNumberReader reader = new LineNumberReader(new FileReader(csvFile));
		try {
			String line;
			while (null != (line = reader.readLine())) {
				boolean readAsHeader = attributeClasses.isEmpty();
				boolean hasHeader = parsingContext.hasHeader();
				String separator = parsingContext.getAttributeSeparator();
				StringTokenizer tokenizer = new StringTokenizer(line, separator);
				int attributeCount = tokenizer.countTokens();
				if (!hasHeader) {
					// Generate attribute names
					for (int attributeIndex = 0; attributeIndex < attributeCount; attributeIndex++) {
						String attributeName = String.format("Attribute_%d", attributeIndex);
						AttributeClass attributeClass = addAttributeClass(attributeName, attributeClassCollection);
						attributeClasses.put(attributeIndex, attributeClass);
					}
					readAsHeader = false;
				}
				
				ChartItem chartItem = null;
				ChartItem existingItem = null;
				for (int tokenIndex = 0; tokenIndex < attributeCount && tokenizer.hasMoreTokens(); tokenIndex++) {
					String nextToken = tokenizer.nextToken().trim();
					if (readAsHeader) {
						// Read the token as attribute name
						if (0 < nextToken.length() && !attributeClasses.containsKey(nextToken)) {
							AttributeClass attributeClass = addAttributeClass(nextToken, attributeClassCollection);
							attributeClasses.put(tokenIndex, attributeClass);
						}
					} else if (attributeClasses.containsKey(tokenIndex)) {						
						// Read the token as attribute value
						if (null == chartItem) {
							chartItem = new ChartItem();
							chartItem.setAttributeCollection(new AttributeCollection());
						}
						
						// Add the token as attribute value
						AttributeCollection attributeCollection = chartItem.getAttributeCollection();
						List<Attribute> attributeList = attributeCollection.getAttribute();
						Attribute attribute = new Attribute();
						AttributeClass attributeClass = attributeClasses.get(tokenIndex);
						attribute.setAttributeClassReference(attributeClass);
						attribute.setValue(nextToken);
						attributeList.add(attribute);
						
						String idAttributeName = parsingContext.getIdAttributeName();
						if (null != idAttributeName 
								&& 0 == attributeClass.getName().compareToIgnoreCase(idAttributeName)) {
							// Try to find the corresponding chart item
							if (uniqueItems.containsKey(nextToken)) {
								// We have a duplicate
								existingItem = uniqueItems.get(nextToken);
							} else {
								// Add a new item with an unique attribute ID
								uniqueItems.put(nextToken, chartItem);
							}
						}
					}
				}
				if (null != chartItem) {
					// Build the item and add it to the collection
					chartItem = builderContext.buildChartItem(chartItem);
					chartItemList.add(chartItem);
					
					if (null != existingItem) {
						// The item was already added
						// create a link item
						ChartItem linkItem = builderContext.buildLinkChartItem(existingItem, chartItem);
						chartItemList.add(linkItem);
					}
				}
			}
			
			// Add the entity types to the dataset
			EntityTypeCollection entityTypeCollection = dataset.getEntityTypeCollection();
			List<EntityType> entityTypeList = entityTypeCollection.getEntityType();
			entityTypeList.addAll(builderContext.getEntityTypes());
			
			// Add the link types to the dataset
			LinkTypeCollection linkTypeCollection = dataset.getLinkTypeCollection();
			List<LinkType> linkTypeList = linkTypeCollection.getLinkType();
			linkTypeList.addAll(builderContext.getLinkTypes());
		}
		finally {
			reader.close();
		}
		return dataset;
	}
	
	private static AttributeClass addAttributeClass(String attributeName, AttributeClassCollection attributeClassCollection) {
		List<AttributeClass> attributeClassList = attributeClassCollection.getAttributeClass();
		AttributeClass attributeClass = new AttributeClass();
		String uniqueId = AnbUniqueId.generateUniqueId();
		attributeClass.setId(uniqueId);
		attributeClass.setName(attributeName);
		attributeClass.setType(AttributeTypeEnum.ATT_TEXT);
		attributeClass.setUserCanAdd(true);
		attributeClass.setUserCanRemove(true);
		attributeClassList.add(attributeClass);
		return attributeClass;
	}
}
