package edu.anb.exchanger;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import edu.anb.core.Chart;
import edu.anb.core.EntityType;
import edu.anb.domain.AnbBuilderContext;
import edu.anb.domain.AnbChartFactory;
import edu.anb.domain.AnbEntityTypeFactory;
import edu.anb.domain.AnbInputDataset;
import edu.anb.domain.AnbParsingContext;
import edu.anb.io.AnbCsvFileReader;
import edu.anb.io.AnbXmlFileWriter;

public class Exchanger {

	public static void main(String[] args) throws JAXBException, IOException {		
		if (3 != args.length) {
			System.out.println("Usage: <csv> <name> <icon> <start> <end> <link>");
			System.out.println("\t<csv>:\t\tThe path to the CSV file.");
			System.out.println("\t<name>:\t\tThe name of the entity type.");
			System.out.println("\t<icon>:\t\tThe name of the icon.");
			System.out.println("\texample:\tC:/input/dates.csv Events event");
			System.out.println("");
			return;
		}
		
		AnbCsvFileReader reader = new AnbCsvFileReader();
		AnbParsingContext parsingContext = new AnbParsingContext();
		parsingContext.setHeader(true);
		parsingContext.setAttributeSeparator(",");
		
		String tempFilePath = System.getProperty("java.io.tmpdir");
		
		File csvFile = new File(args[0]);
		String entityName = args[1];
		String iconFileName = args[2];
		AnbEntityTypeFactory entityTypeFactory = new AnbEntityTypeFactory();
		EntityType entityType = entityTypeFactory.create(entityName, iconFileName);
		AnbBuilderContext builderContext = new AnbBuilderContext();
		builderContext.setDefaultEntityType(entityType);
		
		AnbInputDataset csvDataset = reader.readFile(csvFile, parsingContext, builderContext);
		AnbChartFactory chartFactory = new AnbChartFactory();
		Chart csvChart = chartFactory.createChart(csvDataset, "CSV");
		
		File outputFile = new File(tempFilePath + "ANB/" + csvFile.getName() + ".xml");
		AnbXmlFileWriter writer = new AnbXmlFileWriter();
		writer.writeFile(csvChart, outputFile);
		System.out.println(String.format("%s created", outputFile.getAbsolutePath()));
	}
}
