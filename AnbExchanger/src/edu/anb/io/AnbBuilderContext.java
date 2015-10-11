package edu.anb.io;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import edu.anb.core.Attribute;
import edu.anb.core.AttributeCollection;
import edu.anb.core.ChartItem;

/**
 * Defines how instances should be builded.
 *
 * @author J.T.
 *
 */
public class AnbBuilderContext {

	private final Random random;
	
	public AnbBuilderContext() {
		random = new Random();
	}
	
	/**
	 * Creates an unique ID and position the chart item at random.
	 * The first attribute value is used for the label.
	 * @param item the chart item which should be enriched.
	 * @return the enriched chart item.
	 */
	public ChartItem buildChartItem(ChartItem item) {
		UUID unqiueId = UUID.randomUUID();
		item.setId(unqiueId.toString());
		
		int xPosition = random.nextInt(500);
		item.setXPosition(xPosition);
		
		AttributeCollection attributeCollection = item.getAttributeCollection();
		List<Attribute> attributeList = attributeCollection.getAttribute();
		if (!attributeList.isEmpty()) {
			Attribute labelAttribute = attributeList.get(0);
			item.setLabel(labelAttribute.getValue());
		}
		
		return item;
	}
}
