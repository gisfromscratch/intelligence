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
 *       &lt;sequence>
 *         &lt;element ref="{}Font" minOccurs="0"/>
 *         &lt;element ref="{}SubItemCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Background" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DateTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}DateTimeFormatReference"/>
 *       &lt;attribute name="ShowDateTimeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SubTextWidth" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="UseSubTextWidth" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "font",
    "subItemCollection"
})
@XmlRootElement(name = "CIStyle")
public class CIStyle {

    @XmlElement(name = "Font")
    protected Font font;
    @XmlElement(name = "SubItemCollection")
    protected SubItemCollection subItemCollection;
    @XmlAttribute(name = "Background")
    protected Boolean background;
    @XmlAttribute(name = "DateTimeFormat")
    protected java.lang.String dateTimeFormat;
    @XmlAttribute(name = "DateTimeFormatReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object dateTimeFormatReference;
    @XmlAttribute(name = "ShowDateTimeDescription")
    protected Boolean showDateTimeDescription;
    @XmlAttribute(name = "SubTextWidth")
    protected Double subTextWidth;
    @XmlAttribute(name = "UseSubTextWidth")
    protected Boolean useSubTextWidth;

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * Gets the value of the subItemCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SubItemCollection }
     *     
     */
    public SubItemCollection getSubItemCollection() {
        return subItemCollection;
    }

    /**
     * Sets the value of the subItemCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubItemCollection }
     *     
     */
    public void setSubItemCollection(SubItemCollection value) {
        this.subItemCollection = value;
    }

    /**
     * Gets the value of the background property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackground() {
        return background;
    }

    /**
     * Sets the value of the background property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackground(Boolean value) {
        this.background = value;
    }

    /**
     * Gets the value of the dateTimeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDateTimeFormat() {
        return dateTimeFormat;
    }

    /**
     * Sets the value of the dateTimeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDateTimeFormat(java.lang.String value) {
        this.dateTimeFormat = value;
    }

    /**
     * Format IDREF of the Date value when it is shown.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDateTimeFormatReference() {
        return dateTimeFormatReference;
    }

    /**
     * Sets the value of the dateTimeFormatReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDateTimeFormatReference(Object value) {
        this.dateTimeFormatReference = value;
    }

    /**
     * Gets the value of the showDateTimeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowDateTimeDescription() {
        return showDateTimeDescription;
    }

    /**
     * Sets the value of the showDateTimeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDateTimeDescription(Boolean value) {
        this.showDateTimeDescription = value;
    }

    /**
     * Gets the value of the subTextWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubTextWidth() {
        return subTextWidth;
    }

    /**
     * Sets the value of the subTextWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubTextWidth(Double value) {
        this.subTextWidth = value;
    }

    /**
     * Gets the value of the useSubTextWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSubTextWidth() {
        return useSubTextWidth;
    }

    /**
     * Sets the value of the useSubTextWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSubTextWidth(Boolean value) {
        this.useSubTextWidth = value;
    }

}
