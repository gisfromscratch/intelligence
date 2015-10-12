package edu.anb.exchanger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.xml.bind.JAXBException;

import edu.anb.core.Chart;
import edu.anb.core.EntityType;
import edu.anb.domain.AnbBuilderContext;
import edu.anb.domain.AnbChartFactory;
import edu.anb.domain.AnbTypeFactory;
import edu.anb.domain.AnbInputDataset;
import edu.anb.domain.AnbParsingContext;
import edu.anb.io.AnbCsvFileReader;
import edu.anb.io.AnbXmlFileWriter;

public class Exchanger {
	
	public static void main(String[] arguments) throws JAXBException, IOException {		
		if (arguments.length < 3 || ExchangeArgumentType.values().length < arguments.length) {
			printOptions();
			return;
		}
		
		AnbCsvFileReader reader = new AnbCsvFileReader();
		AnbParsingContext parsingContext = new AnbParsingContext();
		parsingContext.setAttributeSeparator(",");
		
		String tempFilePath = System.getProperty("java.io.tmpdir");
		
		ExchangeOptionParser optionParser = new ExchangeOptionParser();
		String filePath = optionParser.getOption(arguments, ExchangeArgumentType.InputFile);
		if (null == filePath) {
			printOptions();
			return;
		}
		
		File csvFile = new File(filePath);
		
		String entityTypeName = optionParser.getOption(arguments, ExchangeArgumentType.EntityType);
		if (null == entityTypeName) {
			printOptions();
			return;
		}
		
		String iconFileName = optionParser.getOption(arguments, ExchangeArgumentType.Icon);
		if (null == iconFileName) {
			printOptions();
			return;
		}
		
		parsingContext.setHeader(optionParser.hasOption(arguments, ExchangeArgumentType.Header));
		
		String labelAttributeNames = optionParser.getOption(arguments, ExchangeArgumentType.LabelAttribute);
		if (null != labelAttributeNames) {
			String[] labelAttributeNameList = labelAttributeNames.split(",");
			if (0 < labelAttributeNameList.length) {
				parsingContext.setLabelAttributeNames(Arrays.asList(labelAttributeNameList));
			}
		}
		
		String idAttributeName = optionParser.getOption(arguments, ExchangeArgumentType.IdAttribute);
		if (null != idAttributeName) {
			parsingContext.setIdAttributeName(idAttributeName);
		}	
		
		AnbTypeFactory entityTypeFactory = new AnbTypeFactory();
		EntityType entityType = entityTypeFactory.createEntityType(entityTypeName, iconFileName);
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

	private static void printOptions() {
		System.out.println("Creates an exchange file from a CSV input. The data must fit into main memory!");
		System.out.println("");
		System.out.println(String.format("Usage: %s [%s] [%s] %s %s [%s] [%s]", 
				ExchangeArgumentType.InputFile.getPrefix(),
				ExchangeArgumentType.Header.getPrefix(),
				ExchangeArgumentType.Separator.getPrefix(),
				ExchangeArgumentType.EntityType.getPrefix(), 
				ExchangeArgumentType.Icon.getPrefix(),
				ExchangeArgumentType.IdAttribute.getPrefix(),
				ExchangeArgumentType.LabelAttribute.getPrefix()));
		System.out.println(String.format("\t%s <file>:\t\tThe path to the CSV file.", ExchangeArgumentType.InputFile.getPrefix()));
		System.out.println(String.format("\t%s <type>:\t\tThe name of the entity type.", ExchangeArgumentType.EntityType.getPrefix()));
		System.out.println(String.format("\t%s <name>:\t\tThe name of the icon file.", ExchangeArgumentType.Icon.getPrefix()));
		System.out.println(String.format("Example: %s=C:/input/events.csv %s=Events %s=event", 
				ExchangeArgumentType.InputFile.getPrefix(),
				ExchangeArgumentType.EntityType.getPrefix(),
				ExchangeArgumentType.Icon.getPrefix()));
		System.out.println("");
		System.out.println("\tOptional:");
		System.out.println(String.format("\t%s:\t\t\tUse when the CSV file has a header.", ExchangeArgumentType.Header.getPrefix()));
		System.out.println(String.format("\t%s <value>:\t\tThe field separator to use. Comma is default.", ExchangeArgumentType.Separator.getPrefix()));
		System.out.println(String.format("\t%s <name>:\t\tThe name of the ID attribute.", ExchangeArgumentType.IdAttribute.getPrefix()));
		System.out.println(String.format("\t%s <name>:\t\tThe names of the label attributes.", ExchangeArgumentType.LabelAttribute.getPrefix()));
		System.out.println(String.format("Example: %s=C:/input/events.csv -head -sep=; %s=Events %s=event %s=EventId %s=Name,Date", 
				ExchangeArgumentType.InputFile.getPrefix(),
				ExchangeArgumentType.EntityType.getPrefix(),
				ExchangeArgumentType.Icon.getPrefix(),
				ExchangeArgumentType.IdAttribute.getPrefix(),
				ExchangeArgumentType.LabelAttribute.getPrefix()));
		System.out.println("");
	}
}
