//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 09:29:27 PM CEST 
//


package edu.anb.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.anb.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Property_QNAME = new QName("http://www.i2group.com/Schemas/2001-12-07/LCXSchema", "Property");
    private final static QName _Domain_QNAME = new QName("http://www.i2group.com/Schemas/2001-12-07/LCXSchema", "Domain");
    private final static QName _Rationale_QNAME = new QName("http://www.i2group.com/Schemas/2001-12-07/LCXSchema", "Rationale");
    private final static QName _LibraryCatalogue_QNAME = new QName("http://www.i2group.com/Schemas/2001-12-07/LCXSchema", "LibraryCatalogue");
    private final static QName _Synonym_QNAME = new QName("http://www.i2group.com/Schemas/2001-12-07/LCXSchema", "Synonym");
    private final static QName _Form_QNAME = new QName("http://www.i2group.com/Schemas/2001-12-07/LCXSchema", "Form");
    private final static QName _Sector_QNAME = new QName("http://www.i2group.com/Schemas/2001-12-07/LCXSchema", "Sector");
    private final static QName _Type_QNAME = new QName("http://www.i2group.com/Schemas/2001-12-07/LCXSchema", "Type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.anb.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link FormType }
     * 
     */
    public FormType createFormType() {
        return new FormType();
    }

    /**
     * Create an instance of {@link FormType.Formatters }
     * 
     */
    public FormType.Formatters createFormTypeFormatters() {
        return new FormType.Formatters();
    }

    /**
     * Create an instance of {@link TypeType }
     * 
     */
    public TypeType createTypeType() {
        return new TypeType();
    }

    /**
     * Create an instance of {@link DateTimeFormatCollection }
     * 
     */
    public DateTimeFormatCollection createDateTimeFormatCollection() {
        return new DateTimeFormatCollection();
    }

    /**
     * Create an instance of {@link DateTimeFormat }
     * 
     */
    public DateTimeFormat createDateTimeFormat() {
        return new DateTimeFormat();
    }

    /**
     * Create an instance of {@link Origin }
     * 
     */
    public Origin createOrigin() {
        return new Origin();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link Box }
     * 
     */
    public Box createBox() {
        return new Box();
    }

    /**
     * Create an instance of {@link BoxStyle }
     * 
     */
    public BoxStyle createBoxStyle() {
        return new BoxStyle();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link CircleStyle }
     * 
     */
    public CircleStyle createCircleStyle() {
        return new CircleStyle();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link EventStyle }
     * 
     */
    public EventStyle createEventStyle() {
        return new EventStyle();
    }

    /**
     * Create an instance of {@link IconPicture }
     * 
     */
    public IconPicture createIconPicture() {
        return new IconPicture();
    }

    /**
     * Create an instance of {@link Icon }
     * 
     */
    public Icon createIcon() {
        return new Icon();
    }

    /**
     * Create an instance of {@link IconStyle }
     * 
     */
    public IconStyle createIconStyle() {
        return new IconStyle();
    }

    /**
     * Create an instance of {@link FrameStyle }
     * 
     */
    public FrameStyle createFrameStyle() {
        return new FrameStyle();
    }

    /**
     * Create an instance of {@link OleItem }
     * 
     */
    public OleItem createOleItem() {
        return new OleItem();
    }

    /**
     * Create an instance of {@link OleItemStyle }
     * 
     */
    public OleItemStyle createOleItemStyle() {
        return new OleItemStyle();
    }

    /**
     * Create an instance of {@link TextBlock }
     * 
     */
    public TextBlock createTextBlock() {
        return new TextBlock();
    }

    /**
     * Create an instance of {@link TextBlockStyle }
     * 
     */
    public TextBlockStyle createTextBlockStyle() {
        return new TextBlockStyle();
    }

    /**
     * Create an instance of {@link Theme }
     * 
     */
    public Theme createTheme() {
        return new Theme();
    }

    /**
     * Create an instance of {@link ThemeStyle }
     * 
     */
    public ThemeStyle createThemeStyle() {
        return new ThemeStyle();
    }

    /**
     * Create an instance of {@link DatabaseKeyCollection }
     * 
     */
    public DatabaseKeyCollection createDatabaseKeyCollection() {
        return new DatabaseKeyCollection();
    }

    /**
     * Create an instance of {@link DatabaseKey }
     * 
     */
    public DatabaseKey createDatabaseKey() {
        return new DatabaseKey();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new Key();
    }

    /**
     * Create an instance of {@link DatabasePropertyCollection }
     * 
     */
    public DatabasePropertyCollection createDatabasePropertyCollection() {
        return new DatabasePropertyCollection();
    }

    /**
     * Create an instance of {@link DatabaseProperty }
     * 
     */
    public DatabaseProperty createDatabaseProperty() {
        return new DatabaseProperty();
    }

    /**
     * Create an instance of {@link CardCollection }
     * 
     */
    public CardCollection createCardCollection() {
        return new CardCollection();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link TimeZone }
     * 
     */
    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    /**
     * Create an instance of {@link TimeBar }
     * 
     */
    public TimeBar createTimeBar() {
        return new TimeBar();
    }

    /**
     * Create an instance of {@link TimeBarIntervalBandStyle }
     * 
     */
    public TimeBarIntervalBandStyle createTimeBarIntervalBandStyle() {
        return new TimeBarIntervalBandStyle();
    }

    /**
     * Create an instance of {@link Font }
     * 
     */
    public Font createFont() {
        return new Font();
    }

    /**
     * Create an instance of {@link TimeBarMarkerBandStyle }
     * 
     */
    public TimeBarMarkerBandStyle createTimeBarMarkerBandStyle() {
        return new TimeBarMarkerBandStyle();
    }

    /**
     * Create an instance of {@link TimeBarTickBandStyle }
     * 
     */
    public TimeBarTickBandStyle createTimeBarTickBandStyle() {
        return new TimeBarTickBandStyle();
    }

    /**
     * Create an instance of {@link edu.anb.core.String }
     * 
     */
    public edu.anb.core.String createString() {
        return new edu.anb.core.String();
    }

    /**
     * Create an instance of {@link PrintSettings }
     * 
     */
    public PrintSettings createPrintSettings() {
        return new PrintSettings();
    }

    /**
     * Create an instance of {@link HeaderCollection }
     * 
     */
    public HeaderCollection createHeaderCollection() {
        return new HeaderCollection();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link FooterCollection }
     * 
     */
    public FooterCollection createFooterCollection() {
        return new FooterCollection();
    }

    /**
     * Create an instance of {@link Footer }
     * 
     */
    public Footer createFooter() {
        return new Footer();
    }

    /**
     * Create an instance of {@link PageSettings }
     * 
     */
    public PageSettings createPageSettings() {
        return new PageSettings();
    }

    /**
     * Create an instance of {@link GradeOne }
     * 
     */
    public GradeOne createGradeOne() {
        return new GradeOne();
    }

    /**
     * Create an instance of {@link StringCollection }
     * 
     */
    public StringCollection createStringCollection() {
        return new StringCollection();
    }

    /**
     * Create an instance of {@link GradeTwo }
     * 
     */
    public GradeTwo createGradeTwo() {
        return new GradeTwo();
    }

    /**
     * Create an instance of {@link LinkTypeEntryCollection }
     * 
     */
    public LinkTypeEntryCollection createLinkTypeEntryCollection() {
        return new LinkTypeEntryCollection();
    }

    /**
     * Create an instance of {@link LinkTypeEntry }
     * 
     */
    public LinkTypeEntry createLinkTypeEntry() {
        return new LinkTypeEntry();
    }

    /**
     * Create an instance of {@link Snapshot }
     * 
     */
    public Snapshot createSnapshot() {
        return new Snapshot();
    }

    /**
     * Create an instance of {@link SnapshotItemCollection }
     * 
     */
    public SnapshotItemCollection createSnapshotItemCollection() {
        return new SnapshotItemCollection();
    }

    /**
     * Create an instance of {@link SnapshotItem }
     * 
     */
    public SnapshotItem createSnapshotItem() {
        return new SnapshotItem();
    }

    /**
     * Create an instance of {@link CurrentCircleStyle }
     * 
     */
    public CurrentCircleStyle createCurrentCircleStyle() {
        return new CurrentCircleStyle();
    }

    /**
     * Create an instance of {@link CIStyle }
     * 
     */
    public CIStyle createCIStyle() {
        return new CIStyle();
    }

    /**
     * Create an instance of {@link SubItemCollection }
     * 
     */
    public SubItemCollection createSubItemCollection() {
        return new SubItemCollection();
    }

    /**
     * Create an instance of {@link SubItem }
     * 
     */
    public SubItem createSubItem() {
        return new SubItem();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link CornerCollection }
     * 
     */
    public CornerCollection createCornerCollection() {
        return new CornerCollection();
    }

    /**
     * Create an instance of {@link Corner }
     * 
     */
    public Corner createCorner() {
        return new Corner();
    }

    /**
     * Create an instance of {@link LinkStyle }
     * 
     */
    public LinkStyle createLinkStyle() {
        return new LinkStyle();
    }

    /**
     * Create an instance of {@link LinkTypeCollection }
     * 
     */
    public LinkTypeCollection createLinkTypeCollection() {
        return new LinkTypeCollection();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link PropertyBagCollection }
     * 
     */
    public PropertyBagCollection createPropertyBagCollection() {
        return new PropertyBagCollection();
    }

    /**
     * Create an instance of {@link PropertyBag }
     * 
     */
    public PropertyBag createPropertyBag() {
        return new PropertyBag();
    }

    /**
     * Create an instance of {@link PropertyBagProperty }
     * 
     */
    public PropertyBagProperty createPropertyBagProperty() {
        return new PropertyBagProperty();
    }

    /**
     * Create an instance of {@link CurrentLabelStyle }
     * 
     */
    public CurrentLabelStyle createCurrentLabelStyle() {
        return new CurrentLabelStyle();
    }

    /**
     * Create an instance of {@link LabelStyle }
     * 
     */
    public LabelStyle createLabelStyle() {
        return new LabelStyle();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link CurrentIconStyle }
     * 
     */
    public CurrentIconStyle createCurrentIconStyle() {
        return new CurrentIconStyle();
    }

    /**
     * Create an instance of {@link SourceHints }
     * 
     */
    public SourceHints createSourceHints() {
        return new SourceHints();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link EntityTypeCollection }
     * 
     */
    public EntityTypeCollection createEntityTypeCollection() {
        return new EntityTypeCollection();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link LinkObjects }
     * 
     */
    public LinkObjects createLinkObjects() {
        return new LinkObjects();
    }

    /**
     * Create an instance of {@link DatabaseObjectProxy }
     * 
     */
    public DatabaseObjectProxy createDatabaseObjectProxy() {
        return new DatabaseObjectProxy();
    }

    /**
     * Create an instance of {@link DatabasePropertyTypeCollection }
     * 
     */
    public DatabasePropertyTypeCollection createDatabasePropertyTypeCollection() {
        return new DatabasePropertyTypeCollection();
    }

    /**
     * Create an instance of {@link DatabasePropertyType }
     * 
     */
    public DatabasePropertyType createDatabasePropertyType() {
        return new DatabasePropertyType();
    }

    /**
     * Create an instance of {@link CustomImageCollection }
     * 
     */
    public CustomImageCollection createCustomImageCollection() {
        return new CustomImageCollection();
    }

    /**
     * Create an instance of {@link CustomImage }
     * 
     */
    public CustomImage createCustomImage() {
        return new CustomImage();
    }

    /**
     * Create an instance of {@link CurrentLinkStyle }
     * 
     */
    public CurrentLinkStyle createCurrentLinkStyle() {
        return new CurrentLinkStyle();
    }

    /**
     * Create an instance of {@link ChartItem }
     * 
     */
    public ChartItem createChartItem() {
        return new ChartItem();
    }

    /**
     * Create an instance of {@link End }
     * 
     */
    public End createEnd() {
        return new End();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link AttributeCollection }
     * 
     */
    public AttributeCollection createAttributeCollection() {
        return new AttributeCollection();
    }

    /**
     * Create an instance of {@link Chart }
     * 
     */
    public Chart createChart() {
        return new Chart();
    }

    /**
     * Create an instance of {@link ApplicationVersion }
     * 
     */
    public ApplicationVersion createApplicationVersion() {
        return new ApplicationVersion();
    }

    /**
     * Create an instance of {@link LibraryCatalogueType }
     * 
     */
    public LibraryCatalogueType createLibraryCatalogueType() {
        return new LibraryCatalogueType();
    }

    /**
     * Create an instance of {@link GradeThree }
     * 
     */
    public GradeThree createGradeThree() {
        return new GradeThree();
    }

    /**
     * Create an instance of {@link StrengthCollection }
     * 
     */
    public StrengthCollection createStrengthCollection() {
        return new StrengthCollection();
    }

    /**
     * Create an instance of {@link Strength }
     * 
     */
    public Strength createStrength() {
        return new Strength();
    }

    /**
     * Create an instance of {@link AttributeClassCollection }
     * 
     */
    public AttributeClassCollection createAttributeClassCollection() {
        return new AttributeClassCollection();
    }

    /**
     * Create an instance of {@link AttributeClass }
     * 
     */
    public AttributeClass createAttributeClass() {
        return new AttributeClass();
    }

    /**
     * Create an instance of {@link DatabaseProxyCollection }
     * 
     */
    public DatabaseProxyCollection createDatabaseProxyCollection() {
        return new DatabaseProxyCollection();
    }

    /**
     * Create an instance of {@link DatabaseProxy }
     * 
     */
    public DatabaseProxy createDatabaseProxy() {
        return new DatabaseProxy();
    }

    /**
     * Create an instance of {@link EntityObjects }
     * 
     */
    public EntityObjects createEntityObjects() {
        return new EntityObjects();
    }

    /**
     * Create an instance of {@link CurrentStyleCollection }
     * 
     */
    public CurrentStyleCollection createCurrentStyleCollection() {
        return new CurrentStyleCollection();
    }

    /**
     * Create an instance of {@link ConnectionStyle }
     * 
     */
    public ConnectionStyle createConnectionStyle() {
        return new ConnectionStyle();
    }

    /**
     * Create an instance of {@link CurrentBoxStyle }
     * 
     */
    public CurrentBoxStyle createCurrentBoxStyle() {
        return new CurrentBoxStyle();
    }

    /**
     * Create an instance of {@link CurrentEventStyle }
     * 
     */
    public CurrentEventStyle createCurrentEventStyle() {
        return new CurrentEventStyle();
    }

    /**
     * Create an instance of {@link CurrentOleItemStyle }
     * 
     */
    public CurrentOleItemStyle createCurrentOleItemStyle() {
        return new CurrentOleItemStyle();
    }

    /**
     * Create an instance of {@link CurrentTextBlockStyle }
     * 
     */
    public CurrentTextBlockStyle createCurrentTextBlockStyle() {
        return new CurrentTextBlockStyle();
    }

    /**
     * Create an instance of {@link CurrentThemeStyle }
     * 
     */
    public CurrentThemeStyle createCurrentThemeStyle() {
        return new CurrentThemeStyle();
    }

    /**
     * Create an instance of {@link Summary }
     * 
     */
    public Summary createSummary() {
        return new Summary();
    }

    /**
     * Create an instance of {@link FieldCollection }
     * 
     */
    public FieldCollection createFieldCollection() {
        return new FieldCollection();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link CustomPropertyCollection }
     * 
     */
    public CustomPropertyCollection createCustomPropertyCollection() {
        return new CustomPropertyCollection();
    }

    /**
     * Create an instance of {@link CustomProperty }
     * 
     */
    public CustomProperty createCustomProperty() {
        return new CustomProperty();
    }

    /**
     * Create an instance of {@link ChartItemCollection }
     * 
     */
    public ChartItemCollection createChartItemCollection() {
        return new ChartItemCollection();
    }

    /**
     * Create an instance of {@link ConnectionCollection }
     * 
     */
    public ConnectionCollection createConnectionCollection() {
        return new ConnectionCollection();
    }

    /**
     * Create an instance of {@link Connection }
     * 
     */
    public Connection createConnection() {
        return new Connection();
    }

    /**
     * Create an instance of {@link JunctionCollection }
     * 
     */
    public JunctionCollection createJunctionCollection() {
        return new JunctionCollection();
    }

    /**
     * Create an instance of {@link ThemeJunctions }
     * 
     */
    public ThemeJunctions createThemeJunctions() {
        return new ThemeJunctions();
    }

    /**
     * Create an instance of {@link Junction }
     * 
     */
    public Junction createJunction() {
        return new Junction();
    }

    /**
     * Create an instance of {@link JunctionStyle }
     * 
     */
    public JunctionStyle createJunctionStyle() {
        return new JunctionStyle();
    }

    /**
     * Create an instance of {@link GroupCollection }
     * 
     */
    public GroupCollection createGroupCollection() {
        return new GroupCollection();
    }

    /**
     * Create an instance of {@link PaletteCollection }
     * 
     */
    public PaletteCollection createPaletteCollection() {
        return new PaletteCollection();
    }

    /**
     * Create an instance of {@link Palette }
     * 
     */
    public Palette createPalette() {
        return new Palette();
    }

    /**
     * Create an instance of {@link AttributeClassEntryCollection }
     * 
     */
    public AttributeClassEntryCollection createAttributeClassEntryCollection() {
        return new AttributeClassEntryCollection();
    }

    /**
     * Create an instance of {@link AttributeClassEntry }
     * 
     */
    public AttributeClassEntry createAttributeClassEntry() {
        return new AttributeClassEntry();
    }

    /**
     * Create an instance of {@link AttributeEntryCollection }
     * 
     */
    public AttributeEntryCollection createAttributeEntryCollection() {
        return new AttributeEntryCollection();
    }

    /**
     * Create an instance of {@link EntityTypeEntryCollection }
     * 
     */
    public EntityTypeEntryCollection createEntityTypeEntryCollection() {
        return new EntityTypeEntryCollection();
    }

    /**
     * Create an instance of {@link EntityTypeEntry }
     * 
     */
    public EntityTypeEntry createEntityTypeEntry() {
        return new EntityTypeEntry();
    }

    /**
     * Create an instance of {@link PaletteBarCollection }
     * 
     */
    public PaletteBarCollection createPaletteBarCollection() {
        return new PaletteBarCollection();
    }

    /**
     * Create an instance of {@link PaletteBar }
     * 
     */
    public PaletteBar createPaletteBar() {
        return new PaletteBar();
    }

    /**
     * Create an instance of {@link LegendDefinition }
     * 
     */
    public LegendDefinition createLegendDefinition() {
        return new LegendDefinition();
    }

    /**
     * Create an instance of {@link LegendItem }
     * 
     */
    public LegendItem createLegendItem() {
        return new LegendItem();
    }

    /**
     * Create an instance of {@link SnapshotCollection }
     * 
     */
    public SnapshotCollection createSnapshotCollection() {
        return new SnapshotCollection();
    }

    /**
     * Create an instance of {@link SectorDefinition }
     * 
     */
    public SectorDefinition createSectorDefinition() {
        return new SectorDefinition();
    }

    /**
     * Create an instance of {@link DomainType }
     * 
     */
    public DomainType createDomainType() {
        return new DomainType();
    }

    /**
     * Create an instance of {@link SimpleDocumentationType }
     * 
     */
    public SimpleDocumentationType createSimpleDocumentationType() {
        return new SimpleDocumentationType();
    }

    /**
     * Create an instance of {@link DocumentationType }
     * 
     */
    public DocumentationType createDocumentationType() {
        return new DocumentationType();
    }

    /**
     * Create an instance of {@link PropertyType.RelatedType }
     * 
     */
    public PropertyType.RelatedType createPropertyTypeRelatedType() {
        return new PropertyType.RelatedType();
    }

    /**
     * Create an instance of {@link PropertyType.UnrelatedType }
     * 
     */
    public PropertyType.UnrelatedType createPropertyTypeUnrelatedType() {
        return new PropertyType.UnrelatedType();
    }

    /**
     * Create an instance of {@link PropertyType.Form }
     * 
     */
    public PropertyType.Form createPropertyTypeForm() {
        return new PropertyType.Form();
    }

    /**
     * Create an instance of {@link PropertyType.UnrelatedForm }
     * 
     */
    public PropertyType.UnrelatedForm createPropertyTypeUnrelatedForm() {
        return new PropertyType.UnrelatedForm();
    }

    /**
     * Create an instance of {@link FormType.Formatters.Formatter }
     * 
     */
    public FormType.Formatters.Formatter createFormTypeFormattersFormatter() {
        return new FormType.Formatters.Formatter();
    }

    /**
     * Create an instance of {@link TypeType.LNMapping }
     * 
     */
    public TypeType.LNMapping createTypeTypeLNMapping() {
        return new TypeType.LNMapping();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2group.com/Schemas/2001-12-07/LCXSchema", name = "Property")
    public JAXBElement<PropertyType> createProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_Property_QNAME, PropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2group.com/Schemas/2001-12-07/LCXSchema", name = "Domain")
    public JAXBElement<DomainType> createDomain(DomainType value) {
        return new JAXBElement<DomainType>(_Domain_QNAME, DomainType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2group.com/Schemas/2001-12-07/LCXSchema", name = "Rationale")
    public JAXBElement<java.lang.String> createRationale(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_Rationale_QNAME, java.lang.String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryCatalogueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2group.com/Schemas/2001-12-07/LCXSchema", name = "LibraryCatalogue")
    public JAXBElement<LibraryCatalogueType> createLibraryCatalogue(LibraryCatalogueType value) {
        return new JAXBElement<LibraryCatalogueType>(_LibraryCatalogue_QNAME, LibraryCatalogueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2group.com/Schemas/2001-12-07/LCXSchema", name = "Synonym")
    public JAXBElement<java.lang.String> createSynonym(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_Synonym_QNAME, java.lang.String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2group.com/Schemas/2001-12-07/LCXSchema", name = "Form")
    public JAXBElement<FormType> createForm(FormType value) {
        return new JAXBElement<FormType>(_Form_QNAME, FormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2group.com/Schemas/2001-12-07/LCXSchema", name = "Sector")
    @XmlIDREF
    public JAXBElement<Object> createSector(Object value) {
        return new JAXBElement<Object>(_Sector_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2group.com/Schemas/2001-12-07/LCXSchema", name = "Type")
    public JAXBElement<TypeType> createType(TypeType value) {
        return new JAXBElement<TypeType>(_Type_QNAME, TypeType.class, null, value);
    }

}
