package edu.anb.domain;

/**
 * Defines how the parsing of input datasets should be done.
 *
 * @author J.T.
 *
 */
public class AnbParsingContext {

	private boolean hasHeader;
	
	private String attributeSeparator;
	
	public boolean hasHeader() {
		return hasHeader;
	}
	
	public void setHeader(boolean hasHeader) {
		this.hasHeader = hasHeader;
	}
	
	public String getAttributeSeparator() {
		return attributeSeparator;
	}
	
	public void setAttributeSeparator(String separator) {
		attributeSeparator = separator;
	}
}
