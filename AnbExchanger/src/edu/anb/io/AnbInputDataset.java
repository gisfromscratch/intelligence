package edu.anb.io;

import edu.anb.core.ChartItemCollection;
import edu.anb.core.EntityTypeCollection;

/**
 * Represents input data which can be directly imported into an ANB chart.
 *
 * @author J.T.
 *
 */
public class AnbInputDataset {
	
	private final ChartItemCollection chartItemCollection;
	
	private final EntityTypeCollection entityTypeCollection;
	
	/**
	 * Creates a new instance.
	 */
	AnbInputDataset() {
		chartItemCollection = new ChartItemCollection();
		entityTypeCollection = new EntityTypeCollection();
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
}
