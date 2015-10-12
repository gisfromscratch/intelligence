package edu.anb.domain;

import edu.anb.core.EntityType;
import edu.anb.core.LinkType;

/**
 * Creates entity and link types having an unique ID. 
 * 
 * @author J.T.
 *
 */
public class AnbTypeFactory {

	public EntityType createEntityType(String name, String iconFileName) {
		String unqiueId = AnbUniqueId.generateUniqueId();
		EntityType entityType = new EntityType();
		entityType.setId(unqiueId);
		entityType.setName(name);
		entityType.setIconFile(iconFileName);
		return entityType;
	}
	
	public LinkType createLinkType(String name) {
		String uniqueId = AnbUniqueId.generateUniqueId();
		LinkType linkType = new LinkType();
		linkType.setId(uniqueId);
		linkType.setName(name);
		return linkType;
	}
}
