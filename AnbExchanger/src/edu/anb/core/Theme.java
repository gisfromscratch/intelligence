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
 *         &lt;element ref="{}ThemeStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TextX" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="TextY" type="{http://www.w3.org/2001/XMLSchema}int" default="16" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "themeStyle"
})
@XmlRootElement(name = "Theme")
public class Theme {

    @XmlElement(name = "ThemeStyle")
    protected ThemeStyle themeStyle;
    @XmlAttribute(name = "TextX")
    protected Integer textX;
    @XmlAttribute(name = "TextY")
    protected Integer textY;

    /**
     * Gets the value of the themeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link ThemeStyle }
     *     
     */
    public ThemeStyle getThemeStyle() {
        return themeStyle;
    }

    /**
     * Sets the value of the themeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThemeStyle }
     *     
     */
    public void setThemeStyle(ThemeStyle value) {
        this.themeStyle = value;
    }

    /**
     * Gets the value of the textX property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTextX() {
        if (textX == null) {
            return  0;
        } else {
            return textX;
        }
    }

    /**
     * Sets the value of the textX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTextX(Integer value) {
        this.textX = value;
    }

    /**
     * Gets the value of the textY property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTextY() {
        if (textY == null) {
            return  16;
        } else {
            return textY;
        }
    }

    /**
     * Sets the value of the textY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTextY(Integer value) {
        this.textY = value;
    }

}