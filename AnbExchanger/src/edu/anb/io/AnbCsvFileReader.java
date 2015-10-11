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

import edu.anb.core.Attribute;
import edu.anb.core.AttributeCollection;
import edu.anb.core.ChartItem;
import edu.anb.core.ChartItemCollection;

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
		HashMap<Integer, String> attributeNames = new HashMap<Integer, String>();
		
		LineNumberReader reader = new LineNumberReader(new FileReader(csvFile));
		try {
			String line;
			while (null != (line = reader.readLine())) {
				boolean readAsHeader = attributeNames.isEmpty();
				boolean hasHeader = parsingContext.hasHeader();
				String separator = parsingContext.getAttributeSeparator();
				StringTokenizer tokenizer = new StringTokenizer(line, separator);
				int attributeCount = tokenizer.countTokens();
				if (!hasHeader) {
					// Generate attribute names
					for (int attributeIndex = 0; attributeIndex < attributeCount; attributeIndex++) {
						attributeNames.put(attributeIndex, String.format("Attribute_%d", attributeIndex));
					}
					readAsHeader = false;
				}
				
				ChartItem chartItem = null;
				for (int tokenIndex = 0; tokenIndex < attributeCount && tokenizer.hasMoreTokens(); tokenIndex++) {
					String nextToken = tokenizer.nextToken().trim();
					if (readAsHeader) {
						// Read the token as attribute name
						if (0 < nextToken.length() && !attributeNames.containsKey(nextToken)) {
							attributeNames.put(tokenIndex, nextToken);
						}
					} else if (attributeNames.containsKey(tokenIndex)) {
						// Read the token as attribute value
						if (null == chartItem) {
							chartItem = new ChartItem();
							chartItem.setAttributeCollection(new AttributeCollection());
						}
						
						// Add the token as attribute value
						AttributeCollection attributeCollection = chartItem.getAttributeCollection();
						List<Attribute> attributeList = attributeCollection.getAttribute();
						Attribute attribute = new Attribute();
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
		}
		finally {
			reader.close();
		}
		return dataset;
	}
}
