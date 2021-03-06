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
 * <p>Java class for LegendArrangementEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegendArrangementEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LegendArrangementSquare"/>
 *     &lt;enumeration value="LegendArrangementTall"/>
 *     &lt;enumeration value="LegendArrangementWide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegendArrangementEnum")
@XmlEnum
public enum LegendArrangementEnum {


    /**
     * The legend height and width are equal.
     * 
     */
    @XmlEnumValue("LegendArrangementSquare")
    LEGEND_ARRANGEMENT_SQUARE("LegendArrangementSquare"),

    /**
     * The legend is given a height larger than the width.
     * 
     */
    @XmlEnumValue("LegendArrangementTall")
    LEGEND_ARRANGEMENT_TALL("LegendArrangementTall"),

    /**
     * The legend is given a width larger than the height.
     * 
     */
    @XmlEnumValue("LegendArrangementWide")
    LEGEND_ARRANGEMENT_WIDE("LegendArrangementWide");
    private final java.lang.String value;

    LegendArrangementEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LegendArrangementEnum fromValue(java.lang.String v) {
        for (LegendArrangementEnum c: LegendArrangementEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
