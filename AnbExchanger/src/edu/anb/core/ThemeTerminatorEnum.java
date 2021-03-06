//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 09:29:27 PM CEST 
//


package edu.anb.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThemeTerminatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThemeTerminatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TerminatorArrow"/>
 *     &lt;enumeration value="TerminatorBar"/>
 *     &lt;enumeration value="TerminatorBox"/>
 *     &lt;enumeration value="TerminatorClosedCircle"/>
 *     &lt;enumeration value="TerminatorInverseArrow"/>
 *     &lt;enumeration value="TerminatorNone"/>
 *     &lt;enumeration value="TerminatorOpenCircle"/>
 *     &lt;enumeration value="TerminatorTriangle"/>
 *     &lt;enumeration value="TerminatorY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThemeTerminatorEnum")
@XmlEnum
public enum ThemeTerminatorEnum {


    /**
     * Arrow terminator, which points outwards from the theme line.
     * 
     */
    @XmlEnumValue("TerminatorArrow")
    TERMINATOR_ARROW("TerminatorArrow"),

    /**
     * Bar terminator.
     * 
     */
    @XmlEnumValue("TerminatorBar")
    TERMINATOR_BAR("TerminatorBar"),

    /**
     * Filled box terminator.
     * 
     */
    @XmlEnumValue("TerminatorBox")
    TERMINATOR_BOX("TerminatorBox"),

    /**
     * Filled circle terminator.
     * 
     */
    @XmlEnumValue("TerminatorClosedCircle")
    TERMINATOR_CLOSED_CIRCLE("TerminatorClosedCircle"),

    /**
     * Inverted arrow terminator, which points in towards the theme line.
     * 
     */
    @XmlEnumValue("TerminatorInverseArrow")
    TERMINATOR_INVERSE_ARROW("TerminatorInverseArrow"),

    /**
     * No terminator.
     * 
     */
    @XmlEnumValue("TerminatorNone")
    TERMINATOR_NONE("TerminatorNone"),

    /**
     * Unfilled circle terminator.
     * 
     */
    @XmlEnumValue("TerminatorOpenCircle")
    TERMINATOR_OPEN_CIRCLE("TerminatorOpenCircle"),

    /**
     * Triangle terminator.
     * 
     */
    @XmlEnumValue("TerminatorTriangle")
    TERMINATOR_TRIANGLE("TerminatorTriangle"),

    /**
     * Y terminator.
     * 
     */
    @XmlEnumValue("TerminatorY")
    TERMINATOR_Y("TerminatorY");
    private final java.lang.String value;

    ThemeTerminatorEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ThemeTerminatorEnum fromValue(java.lang.String v) {
        for (ThemeTerminatorEnum c: ThemeTerminatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
