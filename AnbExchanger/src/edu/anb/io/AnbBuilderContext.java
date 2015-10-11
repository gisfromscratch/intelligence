package edu.anb.io;

import java.util.List;
import java.util.Random;
import java.util.UUID;

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
	
	private EntityType defaultEntityType;
	
	public AnbBuilderContext() {
		random = new Random();
		
	}
	
	public EntityType getDefaultEntityType() {
		return defaultEntityType;
	}
	
	public void setDefaultEntityType(EntityType type) {
		defaultEntityType = type;
	}
	
	/**
	 * Creates an unique ID and position the chart item at random.
	 * The first attribute value is used for the label.
	 * @param item the chart item which should be enriched.
	 * @return the enriched chart item.
	 */
	public ChartItem buildChartItem(ChartItem item) {
		UUID unqiueId = UUID.randomUUID();
		item.setId(unqiueId.toString());
		
		int xPosition = random.nextInt(500);
		item.setXPosition(xPosition);
		
		AttributeCollection attributeCollection = item.getAttributeCollection();
		List<Attribute> attributeList = attributeCollection.getAttribute();
		if (!attributeList.isEmpty()) {
			Attribute labelAttribute = attributeList.get(0);
			item.setLabel(labelAttribute.getValue());
		}
		
		if (null != defaultEntityType) {
			// Create the entity
			End entity = createEnd(defaultEntityType);
			item.setEnd(entity);
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
