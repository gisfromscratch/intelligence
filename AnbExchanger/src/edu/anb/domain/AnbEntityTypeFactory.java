package edu.anb.domain;

import edu.anb.core.EntityType;

/**
 * Creates entity types having an unique ID. 
 * 
 * @author J.T.
 *
 */
public class AnbEntityTypeFactory {

	public EntityType create(String name, String iconFileName) {
		String unqiueId = AnbUniqueId.generateUniqueId();
		EntityType entityType = new EntityType();
		entityType.setId(unqiueId);
		entityType.setName(name);
		entityType.setIconFile(iconFileName);
		return entityType;
	}
}
