package edu.anb.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import edu.anb.core.Attribute;
import edu.anb.core.AttributeCollection;
import edu.anb.core.ChartItem;
import edu.anb.core.End;
import edu.anb.core.Entity;
import edu.anb.core.EntityType;
import edu.anb.core.Icon;
import edu.anb.core.IconStyle;
import edu.anb.core.Link;
import edu.anb.core.LinkStyle;
import edu.anb.core.LinkType;

/**
 * Defines how instances should be builded.
 *
 * @author J.T.
 *
 */
public class AnbBuilderContext {

	private final Random random;
	
	private final Set<EntityType> entityTypes;
	
	private EntityType defaultEntityType;
	
	public AnbBuilderContext() {
		random = new Random();
		entityTypes = new HashSet<EntityType>();
	}
	
	public EntityType getDefaultEntityType() {
		return defaultEntityType;
	}
	
	public void setDefaultEntityType(EntityType type) {
		defaultEntityType = type;
	}
	
	public Collection<EntityType> getEntityTypes() {
		return entityTypes;
	}
	
	/**
	 * Creates an unique ID and position the chart item at random.
	 * The first attribute value is used for the label.
	 * @param item the chart item which should be enriched.
	 * @return the enriched chart item.
	 */
	public ChartItem buildChartItem(ChartItem item) {
		String unqiueId = AnbUniqueId.generateUniqueId();
		item.setId(unqiueId);
		
		int xPosition = random.nextInt((int) 1e3);
		item.setXPosition(xPosition);
		int yPosition = random.nextInt((int) 1e3);
		
		AttributeCollection attributeCollection = item.getAttributeCollection();
		List<Attribute> attributeList = attributeCollection.getAttribute();
		if (!attributeList.isEmpty()) {
			Attribute labelAttribute = attributeList.get(0);
			item.setLabel(labelAttribute.getValue());
		}
		
		if (null != defaultEntityType) {
			// Create the entity
			End entity = createEnd(defaultEntityType);
			entity.setX(xPosition);
			entity.setY(yPosition);
			item.setEnd(entity);
			
			if (!entityTypes.contains(defaultEntityType)) {
				entityTypes.add(defaultEntityType);
			}
		}
		return item;
	}
	
	private static End createEnd(EntityType entityType) {
		End end = new End();
		Entity entity = new Entity();
		Icon icon = new Icon();
		IconStyle iconStyle = new IconStyle();
		iconStyle.setEntityTypeReference(entityType);
		icon.setIconStyle(iconStyle);
		entity.setIcon(icon);
		end.setEntity(entity);
		return end;
	}

	private static Link createLink(LinkType linkType) {
		Link link = new Link();
		LinkStyle linkStyle = new LinkStyle();
		linkStyle.setLineWidth(5);
		linkStyle.setLinkTypeReference(linkType);
		link.setLinkStyle(linkStyle);
		return link;
	}
}