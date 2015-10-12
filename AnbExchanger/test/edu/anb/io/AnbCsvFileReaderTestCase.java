package edu.anb.io;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.anb.core.Chart;
import edu.anb.core.ChartItem;
import edu.anb.core.ChartItemCollection;
import edu.anb.core.EntityType;
import edu.anb.domain.AnbBuilderContext;
import edu.anb.domain.AnbChartFactory;
import edu.anb.domain.AnbInputDataset;
import edu.anb.domain.AnbParsingContext;
import edu.anb.domain.AnbTypeFactory;

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
		AnbParsingContext parsingContext = new AnbParsingContext();
		parsingContext.setHeader(true);
		parsingContext.setAttributeSeparator(",");
		
		AnbBuilderContext builderContext = new AnbBuilderContext();
		
		// Create a person type
		AnbTypeFactory entityTypeFactory = new AnbTypeFactory();
		EntityType personType = entityTypeFactory.createEntityType("Person", "anon");
		builderContext.setDefaultEntityType(personType);
		
		AnbInputDataset inputDataset = reader.readFile(csvFile, parsingContext, builderContext);
		assertNotNull("The input dataset must not be null!", inputDataset);
		
		ChartItemCollection chartItemCollection = inputDataset.getChartItemCollection();
		assertNotNull("The chart item collection must not be null!", chartItemCollection);
		
		List<ChartItem> chartItemList = chartItemCollection.getChartItem();
		assertNotNull("The chart item list must not be null!", chartItemList);
		
		int chartItemCount = chartItemList.size();
		assertEquals("The number of chart items is wrong!", 40129, chartItemCount);
	}
	
	@Test
	public void csvReadWithAttributeIdTest() throws IOException {
		File csvFile = new File("data/RAND_Database_of_Worldwide_Terrorism_Incidents.csv");
		assertTrue("CSV file is missing!", csvFile.exists());
		
		AnbCsvFileReader reader = new AnbCsvFileReader();
		AnbParsingContext parsingContext = new AnbParsingContext();
		parsingContext.setHeader(true);
		parsingContext.setAttributeSeparator(",");
		parsingContext.setIdAttributeName("Date");
		
		AnbBuilderContext builderContext = new AnbBuilderContext();
		
		// Create a person type
		AnbTypeFactory entityTypeFactory = new AnbTypeFactory();
		EntityType personType = entityTypeFactory.createEntityType("Person", "anon");
		builderContext.setDefaultEntityType(personType);
		
		AnbInputDataset inputDataset = reader.readFile(csvFile, parsingContext, builderContext);
		assertNotNull("The input dataset must not be null!", inputDataset);
		
		ChartItemCollection chartItemCollection = inputDataset.getChartItemCollection();
		assertNotNull("The chart item collection must not be null!", chartItemCollection);
		
		List<ChartItem> chartItemList = chartItemCollection.getChartItem();
		assertNotNull("The chart item list must not be null!", chartItemList);
		
		int chartItemCount = chartItemList.size();
		//assertEquals("The number of chart items is wrong!", 40129, chartItemCount);
	}

	@Test
	public void csvToAnbTest() throws IOException, JAXBException {
		File csvFile = new File("data/Persons.csv");
		assertTrue("CSV file is missing!", csvFile.exists());
		
		AnbCsvFileReader reader = new AnbCsvFileReader();
		AnbParsingContext parsingContext = new AnbParsingContext();
		parsingContext.setHeader(true);
		parsingContext.setAttributeSeparator(",");
		
		AnbBuilderContext builderContext = new AnbBuilderContext();
		
		// Create a person type
		AnbTypeFactory entityTypeFactory = new AnbTypeFactory();
		EntityType personType = entityTypeFactory.createEntityType("Person", "anon");
		builderContext.setDefaultEntityType(personType);
		
		AnbInputDataset inputDataset = reader.readFile(csvFile, parsingContext, builderContext);
		assertNotNull("The input dataset must not be null!", inputDataset);
		
		ChartItemCollection chartItemCollection = inputDataset.getChartItemCollection();
		assertNotNull("The chart item collection must not be null!", chartItemCollection);
		
		List<ChartItem> chartItemList = chartItemCollection.getChartItem();
		assertNotNull("The chart item list must not be null!", chartItemList);
		
		AnbXmlFileWriter writer = new AnbXmlFileWriter();
		
		AnbChartFactory chartFactory = new AnbChartFactory();
		Chart csvChart = chartFactory.createChart(inputDataset, "Persons");
		
		// Write the ANB exchange file
		String tempFilePath = System.getProperty("java.io.tmpdir");
		File outputFile = new File(tempFilePath + "ANB/Persons.xml");
		writer.writeFile(csvChart, outputFile);
	}
}
