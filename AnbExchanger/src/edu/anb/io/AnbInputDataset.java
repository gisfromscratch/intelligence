package edu.anb.io;

import edu.anb.core.ChartItemCollection;

/**
 * Represents input data which can be directly imported into an ANB chart.
 *
 * @author J.T.
 *
 */
public class AnbInputDataset {
	
	private final ChartItemCollection chartItemCollection;
	
	/**
	 * Creates a new instance.
	 */
	AnbInputDataset() {
		chartItemCollection = new ChartItemCollection();
	}
	
	/**
	 * The chart items of this dataset.
	 * @return the chart items.
	 */
	public ChartItemCollection getChartItemCollection() {
		return chartItemCollection;
	}
}
