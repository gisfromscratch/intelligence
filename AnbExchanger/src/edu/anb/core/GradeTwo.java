//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 09:29:27 PM CEST 
//


package edu.anb.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}StringCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stringCollection"
})
@XmlRootElement(name = "GradeTwo")
public class GradeTwo {

    @XmlElement(name = "StringCollection")
    protected StringCollection stringCollection;

    /**
     * Gets the value of the stringCollection property.
     * 
     * @return
     *     possible object is
     *     {@link StringCollection }
     *     
     */
    public StringCollection getStringCollection() {
        return stringCollection;
    }

    /**
     * Sets the value of the stringCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringCollection }
     *     
     */
    public void setStringCollection(StringCollection value) {
        this.stringCollection = value;
    }

}
