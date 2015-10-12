package edu.anb.domain;

import java.util.List;

import edu.anb.core.AttributeClass;
import edu.anb.core.AttributeClassCollection;
import edu.anb.core.AttributeClassEntry;
import edu.anb.core.AttributeClassEntryCollection;
import edu.anb.core.Chart;
import edu.anb.core.ChartItemCollection;
import edu.anb.core.EntityType;
import edu.anb.core.EntityTypeCollection;
import edu.anb.core.EntityTypeEntry;
import edu.anb.core.EntityTypeEntryCollection;
import edu.anb.core.LinkType;
import edu.anb.core.LinkTypeCollection;
import edu.anb.core.LinkTypeEntry;
import edu.anb.core.LinkTypeEntryCollection;
import edu.anb.core.Palette;
import edu.anb.core.PaletteCollection;

/**
 * Creates chart using input data.
 * 
 * @author J.T:
 *
 */
public class AnbChartFactory {

	public Chart createChart(AnbInputDataset dataset, String paletteName) {
		Chart chart = new Chart();
		
		// Add the entity type collection of the dataset
		List<Object> collections = chart.getApplicationVersionAndLibraryCatalogueAndPropertyBagCollection();
		EntityTypeCollection entityTypeCollection = dataset.getEntityTypeCollection();
		collections.add(entityTypeCollection);
		
		// Add the link type collection of the dataset
		LinkTypeCollection linkTypeCollection = dataset.getLinkTypeCollection();
		collections.add(linkTypeCollection);
		
		// Add the attribute class collection of the dataset
		AttributeClassCollection attributeClassCollection = dataset.getAttributeClassCollection();
		collections.add(attributeClassCollection);
		
		// Add a palette collection referring to the entity types, link types and attribute classes of the dataset
		PaletteCollection paletteCollection = new PaletteCollection();
		List<Palette> paletteList = paletteCollection.getPalette();
		Palette palette = new Palette();
		palette.setName(paletteName);
		
		EntityTypeEntryCollection entityTypeEntryCollection = createEntityTypeEntryCollection(entityTypeCollection);
		palette.setEntityTypeEntryCollection(entityTypeEntryCollection);
		
		LinkTypeEntryCollection linkTypeEntryCollection = createLinkTypeEntryCollection(linkTypeCollection);
		palette.setLinkTypeEntryCollection(linkTypeEntryCollection);
		
		AttributeClassEntryCollection attributeClassEntryCollection = createAttributeClassEntryCollection(attributeClassCollection);
		palette.setAttributeClassEntryCollection(attributeClassEntryCollection);
		
		paletteList.add(palette);
		collections.add(paletteCollection);
		
		// Add the chart item collection of the dataset
		ChartItemCollection chartItemCollection = dataset.getChartItemCollection();
		collections.add(chartItemCollection);
		
		return chart;
	}

	private EntityTypeEntryCollection createEntityTypeEntryCollection(EntityTypeCollection entityTypeCollection) {
		EntityTypeEntryCollection entityTypeEntryCollection = new EntityTypeEntryCollection();
		List<EntityTypeEntry> entityTypeEntryList = entityTypeEntryCollection.getEntityTypeEntry();
		List<EntityType> entityTypeList = entityTypeCollection.getEntityType();
		for (EntityType entityType : entityTypeList) {
			EntityTypeEntry entityTypeEntry = new EntityTypeEntry();
			entityTypeEntry.setEntityTypeReference(entityType);
			entityTypeEntry.setEntity(entityType.getName());
			entityTypeEntryList.add(entityTypeEntry);
		}
		return entityTypeEntryCollection;
	}
	
	private LinkTypeEntryCollection createLinkTypeEntryCollection(LinkTypeCollection linkTypeCollection) {
		LinkTypeEntryCollection linkTypeEntryCollection = new LinkTypeEntryCollection();
		List<LinkTypeEntry> linkTypeEntryList = linkTypeEntryCollection.getLinkTypeEntry();
		List<LinkType> linkTypeList = linkTypeCollection.getLinkType();
		for (LinkType linkType : linkTypeList) {
			LinkTypeEntry linkTypeEntry = new LinkTypeEntry();
			linkTypeEntry.setLinkTypeReference(linkType);
			linkTypeEntry.setLinkType(linkType.getName());
			linkTypeEntryList.add(linkTypeEntry);
		}
		return linkTypeEntryCollection;
	}
	
	private AttributeClassEntryCollection createAttributeClassEntryCollection(AttributeClassCollection attributeClassCollection) {
		AttributeClassEntryCollection attributeClassEntryCollection = new AttributeClassEntryCollection();
		List<AttributeClassEntry> attributeClassEntryList = attributeClassEntryCollection.getAttributeClassEntry();
		List<AttributeClass> attributeClassList = attributeClassCollection.getAttributeClass();
		for (AttributeClass attributeClass : attributeClassList) {
			AttributeClassEntry attributeClassEntry = new AttributeClassEntry();
			attributeClassEntry.setAttributeClassReference(attributeClass);
			attributeClassEntry.setAttributeClass(attributeClass.getName());
			attributeClassEntryList.add(attributeClassEntry);
		}
		return attributeClassEntryCollection;
	}
}
