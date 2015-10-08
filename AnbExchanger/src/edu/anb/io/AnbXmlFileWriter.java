package edu.anb.io;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import edu.anb.core.Chart;

/**
 * Writes a chart instance to an ANB exchange file.
 *
 * @author J.T.
 *
 */
public class AnbXmlFileWriter {

	/**
	 * Writes to an ANB exchange file.
	 * @param chart the chart which should be written.
	 * @param outputFile the ANB exchange output file.
	 * @throws JAXBException
	 * @throws IOException 
	 */
	public void writeFile(Chart chart, File outputFile) throws JAXBException, IOException {
		if (outputFile.exists()) {
			outputFile.delete();
		}
		File outputDirectory = outputFile.getParentFile();
		if (!outputDirectory.exists()) {
			outputDirectory.mkdirs();
		}
		outputFile.createNewFile();
		
		JAXBContext context = AnbXmlContext.getInstance().getJaxbContext();
		Marshaller marshaller = context.createMarshaller();
		
		// We have to use the formatted output
		// Otherwise ANB will strip off long lines and blame the XML as malformed
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(chart, outputFile);
	}
}
