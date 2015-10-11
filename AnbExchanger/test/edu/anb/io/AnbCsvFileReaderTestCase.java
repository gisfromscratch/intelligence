package edu.anb.io;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.anb.core.ChartItem;
import edu.anb.core.ChartItemCollection;

public class AnbCsvFileReaderTestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void csvReadTest() throws IOException {
		File csvFile = new File("data/RAND_Database_of_Worldwide_Terrorism_Incidents.csv");
		assertTrue("CSV file is missing!", csvFile.exists());
		
		AnbCsvFileReader reader = new AnbCsvFileReader();
		AnbInputDataset inputDataset = reader.readFile(csvFile, true, ",");
		assertNotNull("The input dataset must not be null!", inputDataset);
		
		ChartItemCollection chartItemCollection = inputDataset.getChartItemCollection();
		assertNotNull("The chart item collection must not be null!", chartItemCollection);
		
		List<ChartItem> chartItemList = chartItemCollection.getChartItem();
		assertNotNull("The chart item list must not be null!", chartItemList);
		
		int chartItemCount = chartItemList.size();
		assertEquals("The number of chart items is wrong!", 40129, chartItemCount);
	}

}
