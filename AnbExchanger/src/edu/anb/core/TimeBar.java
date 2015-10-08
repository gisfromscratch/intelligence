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
 *         &lt;element ref="{}TimeBarIntervalBandStyle"/>
 *         &lt;element ref="{}TimeBarMarkerBandStyle"/>
 *         &lt;element ref="{}TimeBarTickBandStyle"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BackColour" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="BorderLineColour" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NewViewTimeBarVisible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timeBarIntervalBandStyle",
    "timeBarMarkerBandStyle",
    "timeBarTickBandStyle"
})
@XmlRootElement(name = "TimeBar")
public class TimeBar {

    @XmlElement(name = "TimeBarIntervalBandStyle", required = true)
    protected TimeBarIntervalBandStyle timeBarIntervalBandStyle;
    @XmlElement(name = "TimeBarMarkerBandStyle", required = true)
    protected TimeBarMarkerBandStyle timeBarMarkerBandStyle;
    @XmlElement(name = "TimeBarTickBandStyle", required = true)
    protected TimeBarTickBandStyle timeBarTickBandStyle;
    @XmlAttribute(name = "BackColour", required = true)
    protected int backColour;
    @XmlAttribute(name = "BorderLineColour", required = true)
    protected int borderLineColour;
    @XmlAttribute(name = "NewViewTimeBarVisible", required = true)
    protected boolean newViewTimeBarVisible;

    /**
     * Gets the value of the timeBarIntervalBandStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBarIntervalBandStyle }
     *     
     */
    public TimeBarIntervalBandStyle getTimeBarIntervalBandStyle() {
        return timeBarIntervalBandStyle;
    }

    /**
     * Sets the value of the timeBarIntervalBandStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBarIntervalBandStyle }
     *     
     */
    public void setTimeBarIntervalBandStyle(TimeBarIntervalBandStyle value) {
        this.timeBarIntervalBandStyle = value;
    }

    /**
     * Gets the value of the timeBarMarkerBandStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBarMarkerBandStyle }
     *     
     */
    public TimeBarMarkerBandStyle getTimeBarMarkerBandStyle() {
        return timeBarMarkerBandStyle;
    }

    /**
     * Sets the value of the timeBarMarkerBandStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBarMarkerBandStyle }
     *     
     */
    public void setTimeBarMarkerBandStyle(TimeBarMarkerBandStyle value) {
        this.timeBarMarkerBandStyle = value;
    }

    /**
     * Gets the value of the timeBarTickBandStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBarTickBandStyle }
     *     
     */
    public TimeBarTickBandStyle getTimeBarTickBandStyle() {
        return timeBarTickBandStyle;
    }

    /**
     * Sets the value of the timeBarTickBandStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBarTickBandStyle }
     *     
     */
    public void setTimeBarTickBandStyle(TimeBarTickBandStyle value) {
        this.timeBarTickBandStyle = value;
    }

    /**
     * Gets the value of the backColour property.
     * 
     */
    public int getBackColour() {
        return backColour;
    }

    /**
     * Sets the value of the backColour property.
     * 
     */
    public void setBackColour(int value) {
        this.backColour = value;
    }

    /**
     * Gets the value of the borderLineColour property.
     * 
     */
    public int getBorderLineColour() {
        return borderLineColour;
    }

    /**
     * Sets the value of the borderLineColour property.
     * 
     */
    public void setBorderLineColour(int value) {
        this.borderLineColour = value;
    }

    /**
     * Gets the value of the newViewTimeBarVisible property.
     * 
     */
    public boolean isNewViewTimeBarVisible() {
        return newViewTimeBarVisible;
    }

    /**
     * Sets the value of the newViewTimeBarVisible property.
     * 
     */
    public void setNewViewTimeBarVisible(boolean value) {
        this.newViewTimeBarVisible = value;
    }

}