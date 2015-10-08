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
 *         &lt;element ref="{}Font"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LineColour" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MajorTickLabelAlignment" use="required" type="{}TimeBarLabelAlignmentEnum" />
 *       &lt;attribute name="Visible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "font"
})
@XmlRootElement(name = "TimeBarTickBandStyle")
public class TimeBarTickBandStyle {

    @XmlElement(name = "Font", required = true)
    protected Font font;
    @XmlAttribute(name = "LineColour", required = true)
    protected int lineColour;
    @XmlAttribute(name = "MajorTickLabelAlignment", required = true)
    protected TimeBarLabelAlignmentEnum majorTickLabelAlignment;
    @XmlAttribute(name = "Visible", required = true)
    protected boolean visible;

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
     * Gets the value of the lineColour property.
     * 
     */
    public int getLineColour() {
        return lineColour;
    }

    /**
     * Sets the value of the lineColour property.
     * 
     */
    public void setLineColour(int value) {
        this.lineColour = value;
    }

    /**
     * Gets the value of the majorTickLabelAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBarLabelAlignmentEnum }
     *     
     */
    public TimeBarLabelAlignmentEnum getMajorTickLabelAlignment() {
        return majorTickLabelAlignment;
    }

    /**
     * Sets the value of the majorTickLabelAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBarLabelAlignmentEnum }
     *     
     */
    public void setMajorTickLabelAlignment(TimeBarLabelAlignmentEnum value) {
        this.majorTickLabelAlignment = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

}
