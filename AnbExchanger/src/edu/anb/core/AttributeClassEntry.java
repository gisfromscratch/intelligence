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
 *       &lt;attribute name="AttributeClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}AttributeClassReference"/>
 *       &lt;attribute name="Value" type="{}AttributeValue" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AttributeClassEntry")
public class AttributeClassEntry {

    @XmlAttribute(name = "AttributeClass")
    protected java.lang.String attributeClass;
    @XmlAttribute(name = "AttributeClassReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object attributeClassReference;
    @XmlAttribute(name = "Value")
    protected java.lang.String value;

    /**
     * Gets the value of the attributeClass property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAttributeClass() {
        return attributeClass;
    }

    /**
     * Sets the value of the attributeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAttributeClass(java.lang.String value) {
        this.attributeClass = value;
    }

    /**
     * Attribute class IDREF of attribute entry attached to a palette. An attribute class has no value. An attribute entry has a value associated with a defined attribute class, and is attached to a palette.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttributeClassReference() {
        return attributeClassReference;
    }

    /**
     * Sets the value of the attributeClassReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttributeClassReference(Object value) {
        this.attributeClassReference = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

}
