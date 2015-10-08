package edu.anb.io;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import edu.anb.core.Chart;

/**
 * Represents an ANB XML context.
 *
 * @author J.T.
 *
 */
public class AnbXmlContext {

	private static final AnbXmlContext instance;
	private static JAXBContext jaxbContext;
	
	private AnbXmlContext() {
	}
	
	static {
		instance = new AnbXmlContext();
		try {
			jaxbContext = JAXBContext.newInstance(Chart.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static AnbXmlContext getInstance() {
		return instance;
	}
	
	public JAXBContext getJaxbContext() {
		return jaxbContext;
	}
}
