//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 09:29:27 PM CEST 
//


package edu.anb.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AttributeClassEntryCollection" minOccurs="0"/>
 *         &lt;element ref="{}AttributeEntryCollection" minOccurs="0"/>
 *         &lt;element ref="{}EntityTypeEntryCollection" minOccurs="0"/>
 *         &lt;element ref="{}LinkTypeEntryCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attributeClassEntryCollection",
    "attributeEntryCollection",
    "entityTypeEntryCollection",
    "linkTypeEntryCollection"
})
@XmlRootElement(name = "Palette")
public class Palette {

    @XmlElement(name = "AttributeClassEntryCollection")
    protected AttributeClassEntryCollection attributeClassEntryCollection;
    @XmlElement(name = "AttributeEntryCollection")
    protected AttributeEntryCollection attributeEntryCollection;
    @XmlElement(name = "EntityTypeEntryCollection")
    protected EntityTypeEntryCollection entityTypeEntryCollection;
    @XmlElement(name = "LinkTypeEntryCollection")
    protected LinkTypeEntryCollection linkTypeEntryCollection;
    @XmlAttribute(name = "Name", required = true)
    protected java.lang.String name;
    @XmlAttribute(name = "Locked")
    protected Boolean locked;

    /**
     * Gets the value of the attributeClassEntryCollection property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeClassEntryCollection }
     *     
     */
    public AttributeClassEntryCollection getAttributeClassEntryCollection() {
        return attributeClassEntryCollection;
    }

    /**
     * Sets the value of the attributeClassEntryCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeClassEntryCollection }
     *     
     */
    public void setAttributeClassEntryCollection(AttributeClassEntryCollection value) {
        this.attributeClassEntryCollection = value;
    }

    /**
     * Gets the value of the attributeEntryCollection property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeEntryCollection }
     *     
     */
    public AttributeEntryCollection getAttributeEntryCollection() {
        return attributeEntryCollection;
    }

    /**
     * Sets the value of the attributeEntryCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeEntryCollection }
     *     
     */
    public void setAttributeEntryCollection(AttributeEntryCollection value) {
        this.attributeEntryCollection = value;
    }

    /**
     * Gets the value of the entityTypeEntryCollection property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeEntryCollection }
     *     
     */
    public EntityTypeEntryCollection getEntityTypeEntryCollection() {
        return entityTypeEntryCollection;
    }

    /**
     * Sets the value of the entityTypeEntryCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeEntryCollection }
     *     
     */
    public void setEntityTypeEntryCollection(EntityTypeEntryCollection value) {
        this.entityTypeEntryCollection = value;
    }

    /**
     * Gets the value of the linkTypeEntryCollection property.
     * 
     * @return
     *     possible object is
     *     {@link LinkTypeEntryCollection }
     *     
     */
    public LinkTypeEntryCollection getLinkTypeEntryCollection() {
        return linkTypeEntryCollection;
    }

    /**
     * Sets the value of the linkTypeEntryCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkTypeEntryCollection }
     *     
     */
    public void setLinkTypeEntryCollection(LinkTypeEntryCollection value) {
        this.linkTypeEntryCollection = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

}
