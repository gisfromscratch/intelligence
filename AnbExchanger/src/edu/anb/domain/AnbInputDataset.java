package edu.anb.domain;

import edu.anb.core.AttributeClassCollection;
import edu.anb.core.ChartItemCollection;
import edu.anb.core.EntityTypeCollection;
import edu.anb.core.LinkTypeCollection;

/**
 * Represents input data which can be directly imported into an ANB chart.
 *
 * @author J.T.
 *
 */
public class AnbInputDataset {
	
	private final ChartItemCollection chartItemCollection;
	
	private final EntityTypeCollection entityTypeCollection;
	
	private final LinkTypeCollection linkTypeCollection;
	
	private final AttributeClassCollection attributeClassCollection;
	
	/**
	 * Creates a new instance.
	 */
	public AnbInputDataset() {
		chartItemCollection = new ChartItemCollection();
		entityTypeCollection = new EntityTypeCollection();
		linkTypeCollection = new LinkTypeCollection();
		attributeClassCollection = new AttributeClassCollection();
	}
	
	/**
	 * The chart items of this dataset.
	 * @return the chart items.
	 */
	public ChartItemCollection getChartItemCollection() {
		return chartItemCollection;
	}
	
	/**
	 * The entity types of this dataset.
	 * @return the entity types.
	 */
	public EntityTypeCollection getEntityTypeCollection() {
		return entityTypeCollection;
	}
	
	/**
	 * The link types of this dataset.
	 * @return the link types.
	 */
	public LinkTypeCollection getLinkTypeCollection() {
		return linkTypeCollection;
	}
	
	/**
	 * The attribute classes of this dataset.
	 * @return the attribute classes.
	 */
	public AttributeClassCollection getAttributeClassCollection() {
		return attributeClassCollection;
	}
}
