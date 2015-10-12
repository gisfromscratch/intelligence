package edu.anb.domain;

import java.util.UUID;

/**
 * Generates an unique ID which can be used as xsd:ID.
 * 
 * @author J.T.
 *
 */
public class AnbUniqueId {

	private AnbUniqueId() {
	}
	
	public static String generateUniqueId() {
		UUID uniqueId = UUID.randomUUID();
		return String.format("ID_%s", uniqueId.toString());
	}
}
