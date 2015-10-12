package edu.anb.domain;

import java.util.Collection;

/**
 * Defines how the parsing of input datasets should be done.
 *
 * @author J.T.
 *
 */
public class AnbParsingContext {

	private boolean hasHeader;
	
	private String attributeSeparator;
	
	private String idAttributeName;
	
	private Collection<String> labelAttributeNames;
	
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

	public String getIdAttributeName() {
		return idAttributeName;
	}

	public void setIdAttributeName(String name) {
		idAttributeName = name;
	}
	
	public Collection<String> getLabelAttributeNames() {
		return labelAttributeNames;
	}

	public void setLabelAttributeNames(Collection<String> labelAttributeNames) {
		this.labelAttributeNames = labelAttributeNames;
	}
}
