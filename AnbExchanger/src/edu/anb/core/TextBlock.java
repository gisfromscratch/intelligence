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
 *         &lt;element ref="{}TextBlockStyle" minOccurs="0"/>
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
    "textBlockStyle"
})
@XmlRootElement(name = "TextBlock")
public class TextBlock {

    @XmlElement(name = "TextBlockStyle")
    protected TextBlockStyle textBlockStyle;

    /**
     * Gets the value of the textBlockStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TextBlockStyle }
     *     
     */
    public TextBlockStyle getTextBlockStyle() {
        return textBlockStyle;
    }

    /**
     * Sets the value of the textBlockStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextBlockStyle }
     *     
     */
    public void setTextBlockStyle(TextBlockStyle value) {
        this.textBlockStyle = value;
    }

}
