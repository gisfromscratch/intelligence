package edu.anb.exchanger;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExchangeOptionParserTestCase {

	private ExchangeOptionParser optionParser;
	
	@Before
	public void beforeEachTest() {
		optionParser = new ExchangeOptionParser();
	}
	
	@Test
	public void parseFileOptionTest() {
		String filePath = "C:/temp/data.csv";
		String fileOption = optionParser.getOption(new String[] { "-f=" + filePath }, ExchangeArgumentType.InputFile);
		assertTrue("File path is wrong!", 0 == filePath.compareTo(fileOption));
	}
	
	@Test
	public void parseLabelOptionTest() {
		String labelAttributes = "Name,Date";
		String labelOption = optionParser.getOption(new String[] { "-l=" + labelAttributes}, ExchangeArgumentType.LabelAttribute);
		assertTrue("Label attributes are wrong!", 0 == labelAttributes.compareTo(labelOption));
	}
}
