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
		AttributeClassCollection attributeClassCollection = dataset.getAttributeClassCollection();
		HashMap<Integer, AttributeClass> attributeClasses = new HashMap<Integer, AttributeClass>();
		
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
				for (int tokenIndex = 0; tokenIndex < attributeCount && tokenizer.hasMoreTokens(); tokenIndex++) {
					String nextToken = tokenizer.nextToken().trim();
					if (readAsHeader) {
						// Read the token as attribute name
						if (0 < nextToken.length() && !attributeClasses.containsKey(nextToken)) {
							AttributeClass attributeClass = addAttributeClass(nextToken, attributeClassCollection);
							attributeClasses.put(tokenIndex, attributeClass);
						}
					} else if (attributeClasses.containsKey(tokenIndex)) {
						AttributeClass attributeClass = attributeClasses.get(tokenIndex);
						
						// Read the token as attribute value
						if (null == chartItem) {
							chartItem = new ChartItem();
							chartItem.setAttributeCollection(new AttributeCollection());
						}
						
						// Add the token as attribute value
						AttributeCollection attributeCollection = chartItem.getAttributeCollection();
						List<Attribute> attributeList = attributeCollection.getAttribute();
						Attribute attribute = new Attribute();
						attribute.setAttributeClassReference(attributeClass);
						attribute.setValue(nextToken);
						attributeList.add(attribute);
					}
				}
				if (null != chartItem) {
					// Build the item
					chartItem = builderContext.buildChartItem(chartItem);
					
					ChartItemCollection chartItemCollection = dataset.getChartItemCollection();
					List<ChartItem> chartItemList = chartItemCollection.getChartItem();
					chartItemList.add(chartItem);
				}
			}
			
			// Add the entity types to the dataset
			EntityTypeCollection entityTypeCollection = dataset.getEntityTypeCollection();
			List<EntityType> entityTypeList = entityTypeCollection.getEntityType();
			entityTypeList.addAll(builderContext.getEntityTypes());			
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
