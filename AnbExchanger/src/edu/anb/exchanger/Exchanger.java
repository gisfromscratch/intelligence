package edu.anb.exchanger;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import edu.anb.core.Chart;
import edu.anb.core.ChartItem;
import edu.anb.core.ChartItemCollection;
import edu.anb.core.End;
import edu.anb.core.Entity;
import edu.anb.core.EntityType;
import edu.anb.core.EntityTypeCollection;
import edu.anb.core.EntityTypeEntry;
import edu.anb.core.EntityTypeEntryCollection;
import edu.anb.core.Icon;
import edu.anb.core.IconStyle;
import edu.anb.core.Link;
import edu.anb.core.LinkStyle;
import edu.anb.core.LinkType;
import edu.anb.core.LinkTypeCollection;
import edu.anb.core.Palette;
import edu.anb.core.PaletteCollection;
import edu.anb.io.AnbXmlFileReader;
import edu.anb.io.AnbXmlFileWriter;

public class Exchanger {

	public static void main(String[] args) throws JAXBException, IOException {
		
		AnbXmlFileReader reader = new AnbXmlFileReader();
		AnbXmlFileWriter writer = new AnbXmlFileWriter();
		String tempFilePath = System.getProperty("java.io.tmpdir");
		for (String arg : args) {
			File inputFile = new File(arg);
			Chart chart = reader.readFile(inputFile);
			
			File outputFile = new File(tempFilePath + "ANB/" + inputFile.getName());
			writer.writeFile(chart, outputFile);
		}
		
		// Create a new chart and get the collections
		Chart testChart = new Chart();
		List<Object> collections = testChart.getApplicationVersionAndLibraryCatalogueAndPropertyBagCollection();
		
		// Create and add an entity type collection
		EntityTypeCollection entityTypeCollection = new EntityTypeCollection();
		List<EntityType> entityTypeList = entityTypeCollection.getEntityType();
		
		// Create a person type
		EntityType personType = new EntityType();
		personType.setId("ET_ID1");
		personType.setIconFile("anon");
		personType.setName("Person");
		entityTypeList.add(personType);
		
		// Create a document type
		EntityType documentType = new EntityType();
		documentType.setId("ET_ID2");
		documentType.setIconFile("document");
		documentType.setName("Dokument");
		entityTypeList.add(documentType);
		
		collections.add(entityTypeCollection);
		
		// Create and add an link type collection
		LinkTypeCollection linkTypeCollection = new LinkTypeCollection();
		List<LinkType> linkTypeList = linkTypeCollection.getLinkType();
		
		// Create a link type
		LinkType linkType = new LinkType();
		linkType.setId("LT_1");
		linkType.setName("Verknüpfung");
		linkTypeList.add(linkType);
		collections.add(linkTypeCollection);
		
		// Create a palette collection referring to the entity types
		PaletteCollection paletteCollection = new PaletteCollection();
		List<Palette> paletteList = paletteCollection.getPalette();
		Palette palette = new Palette();
		palette.setName("Standard");
		EntityTypeEntryCollection entityTypeEntryCollection = new EntityTypeEntryCollection();
		List<EntityTypeEntry> entityTypeEntryList = entityTypeEntryCollection.getEntityTypeEntry();
		for (EntityType entityType : entityTypeList) {
			EntityTypeEntry entityTypeEntry = new EntityTypeEntry();
			entityTypeEntry.setEntityTypeReference(entityType);
			entityTypeEntry.setEntity(entityType.getName());
			entityTypeEntryList.add(entityTypeEntry);
		}
		palette.setEntityTypeEntryCollection(entityTypeEntryCollection);
		paletteList.add(palette);
		collections.add(paletteCollection);
		
		// Create a chart item collection
		ChartItemCollection chartItemCollection = new ChartItemCollection();
		List<ChartItem> chartItemList = chartItemCollection.getChartItem();
		
		// Create a person
		ChartItem person = new ChartItem();
		person.setId("CI_ID_1");
		person.setLabel("Test Person");
		person.setXPosition(0);
		End personAsEnd = createEnd(personType);
		person.setEnd(personAsEnd);
		chartItemList.add(person);
		
		// Create a document
		ChartItem document = new ChartItem();
		document.setId("CI_ID_2");
		document.setLabel("Test Dokument");
		document.setXPosition(150);
		End documentAsEnd = createEnd(documentType);
		document.setEnd(documentAsEnd);
		chartItemList.add(document);
		
		// Create a link
		ChartItem connection = new ChartItem();
		connection.setId("CI_ID3");
		connection.setLabel("verknüpft");
		
		Link link = createLink(linkType);
		link.setEnd1Reference(person);
		link.setEnd2Reference(document);
		connection.setLink(link);
		chartItemList.add(connection);
		
		collections.add(chartItemCollection);
		
		// Write the ANB exchange file
		File outputFile = new File(tempFilePath + "ANB/Person.xml");
		writer.writeFile(testChart, outputFile);
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
