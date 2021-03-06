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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}EntityTypeReference"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EntityTypeEntry")
public class EntityTypeEntry {

    @XmlAttribute(name = "Entity")
    protected java.lang.String entity;
    @XmlAttribute(name = "EntityTypeReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object entityTypeReference;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEntity(java.lang.String value) {
        this.entity = value;
    }

    /**
     * Type IDREF of entity used by this entry. An entity type is a category of entity.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEntityTypeReference() {
        return entityTypeReference;
    }

    /**
     * Sets the value of the entityTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEntityTypeReference(Object value) {
        this.entityTypeReference = value;
    }

}
