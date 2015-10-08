package edu.anb.io;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import edu.anb.core.Chart;

/**
 * Reads a XML file.
 *
 * @author J.T.
 *
 */
public class AnbXmlFileReader {

	/**
	 * Reads an ANB exchange file.
	 * @param anbExchangeFile the ANB exchange file.
	 * @return the created chart instance.
	 * @throws JAXBException
	 */
	public Chart readFile(File anbExchangeFile) throws JAXBException {
		JAXBContext context = AnbXmlContext.getInstance().getJaxbContext();
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Chart chart = Chart.class.cast(unmarshaller.unmarshal(anbExchangeFile));
		return chart;
	}
	
}
