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
 *       &lt;attribute name="Alignment" type="{}TextAlignmentEnum" />
 *       &lt;attribute name="AutoSizeOption" type="{}AutoSizeOptionEnum" />
 *       &lt;attribute name="BackColour" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute ref="{}EntityTypeReference"/>
 *       &lt;attribute name="Filled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FillStyle" type="{}FillStyleEnum" />
 *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Strength" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}StrengthReference"/>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TextBlockStyle")
public class TextBlockStyle {

    @XmlAttribute(name = "Alignment")
    protected TextAlignmentEnum alignment;
    @XmlAttribute(name = "AutoSizeOption")
    protected AutoSizeOptionEnum autoSizeOption;
    @XmlAttribute(name = "BackColour")
    protected Integer backColour;
    @XmlAttribute(name = "EntityTypeReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object entityTypeReference;
    @XmlAttribute(name = "Filled")
    protected Boolean filled;
    @XmlAttribute(name = "FillStyle")
    protected FillStyleEnum fillStyle;
    @XmlAttribute(name = "Height")
    protected Double height;
    @XmlAttribute(name = "LineWidth")
    protected Integer lineWidth;
    @XmlAttribute(name = "Strength")
    protected java.lang.String strength;
    @XmlAttribute(name = "StrengthReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object strengthReference;
    @XmlAttribute(name = "Type")
    protected java.lang.String type;
    @XmlAttribute(name = "Width")
    protected Double width;

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link TextAlignmentEnum }
     *     
     */
    public TextAlignmentEnum getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAlignmentEnum }
     *     
     */
    public void setAlignment(TextAlignmentEnum value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the autoSizeOption property.
     * 
     * @return
     *     possible object is
     *     {@link AutoSizeOptionEnum }
     *     
     */
    public AutoSizeOptionEnum getAutoSizeOption() {
        return autoSizeOption;
    }

    /**
     * Sets the value of the autoSizeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoSizeOptionEnum }
     *     
     */
    public void setAutoSizeOption(AutoSizeOptionEnum value) {
        this.autoSizeOption = value;
    }

    /**
     * Gets the value of the backColour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackColour() {
        return backColour;
    }

    /**
     * Sets the value of the backColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackColour(Integer value) {
        this.backColour = value;
    }

    /**
     * Type IDREF of entity used by this style. An entity type is a category of entity.
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

    /**
     * Gets the value of the filled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilled() {
        return filled;
    }

    /**
     * Sets the value of the filled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilled(Boolean value) {
        this.filled = value;
    }

    /**
     * Gets the value of the fillStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FillStyleEnum }
     *     
     */
    public FillStyleEnum getFillStyle() {
        return fillStyle;
    }

    /**
     * Sets the value of the fillStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillStyleEnum }
     *     
     */
    public void setFillStyle(FillStyleEnum value) {
        this.fillStyle = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the lineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineWidth(Integer value) {
        this.lineWidth = value;
    }

    /**
     * Gets the value of the strength property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setStrength(java.lang.String value) {
        this.strength = value;
    }

    /**
     * Strength IDREF associated with the text block, which controls the text block border appearance.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStrengthReference() {
        return strengthReference;
    }

    /**
     * Sets the value of the strengthReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStrengthReference(Object value) {
        this.strengthReference = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setType(java.lang.String value) {
        this.type = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

}
