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
 * <p>Java class for FontCharSetEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FontCharSetEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CharSetANSI"/>
 *     &lt;enumeration value="CharSetArabic"/>
 *     &lt;enumeration value="CharSetBaltic"/>
 *     &lt;enumeration value="CharSetChineseBig5"/>
 *     &lt;enumeration value="CharSetDefault"/>
 *     &lt;enumeration value="CharSetEastEuropean"/>
 *     &lt;enumeration value="CharSetGB2312"/>
 *     &lt;enumeration value="CharSetGreek"/>
 *     &lt;enumeration value="CharSetHangul"/>
 *     &lt;enumeration value="CharSetHebrew"/>
 *     &lt;enumeration value="CharSetJohab"/>
 *     &lt;enumeration value="CharSetMAC"/>
 *     &lt;enumeration value="CharSetOEM"/>
 *     &lt;enumeration value="CharSetRussian"/>
 *     &lt;enumeration value="CharSetShiftJIS"/>
 *     &lt;enumeration value="CharSetSymbol"/>
 *     &lt;enumeration value="CharSetThai"/>
 *     &lt;enumeration value="CharSetTurkish"/>
 *     &lt;enumeration value="CharSetVietnamese"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FontCharSetEnum")
@XmlEnum
public enum FontCharSetEnum {


    /**
     * ANSI character set.
     * 
     */
    @XmlEnumValue("CharSetANSI")
    CHAR_SET_ANSI("CharSetANSI"),

    /**
     * Arabic character set.
     * 
     */
    @XmlEnumValue("CharSetArabic")
    CHAR_SET_ARABIC("CharSetArabic"),

    /**
     * Baltic character set.
     * 
     */
    @XmlEnumValue("CharSetBaltic")
    CHAR_SET_BALTIC("CharSetBaltic"),

    /**
     * Chinese Big 5 character set.
     * 
     */
    @XmlEnumValue("CharSetChineseBig5")
    CHAR_SET_CHINESE_BIG_5("CharSetChineseBig5"),

    /**
     * Default character set. See the Windows CreateFont documentation in MSDN.
     * 
     */
    @XmlEnumValue("CharSetDefault")
    CHAR_SET_DEFAULT("CharSetDefault"),

    /**
     * Eastern European character set.
     * 
     */
    @XmlEnumValue("CharSetEastEuropean")
    CHAR_SET_EAST_EUROPEAN("CharSetEastEuropean"),

    /**
     * GB2312 character set.
     * 
     */
    @XmlEnumValue("CharSetGB2312")
    CHAR_SET_GB_2312("CharSetGB2312"),

    /**
     * Greek character set.
     * 
     */
    @XmlEnumValue("CharSetGreek")
    CHAR_SET_GREEK("CharSetGreek"),

    /**
     * Hangul character set.
     * 
     */
    @XmlEnumValue("CharSetHangul")
    CHAR_SET_HANGUL("CharSetHangul"),

    /**
     * Hebrew character set.
     * 
     */
    @XmlEnumValue("CharSetHebrew")
    CHAR_SET_HEBREW("CharSetHebrew"),

    /**
     * Johab character set.
     * 
     */
    @XmlEnumValue("CharSetJohab")
    CHAR_SET_JOHAB("CharSetJohab"),

    /**
     * Macintosh character set.
     * 
     */
    @XmlEnumValue("CharSetMAC")
    CHAR_SET_MAC("CharSetMAC"),

    /**
     * OEM character set.
     * 
     */
    @XmlEnumValue("CharSetOEM")
    CHAR_SET_OEM("CharSetOEM"),

    /**
     * Russian character set.
     * 
     */
    @XmlEnumValue("CharSetRussian")
    CHAR_SET_RUSSIAN("CharSetRussian"),

    /**
     * ShiftJIS character set.
     * 
     */
    @XmlEnumValue("CharSetShiftJIS")
    CHAR_SET_SHIFT_JIS("CharSetShiftJIS"),

    /**
     * Symbol character set.
     * 
     */
    @XmlEnumValue("CharSetSymbol")
    CHAR_SET_SYMBOL("CharSetSymbol"),

    /**
     * Thai character set.
     * 
     */
    @XmlEnumValue("CharSetThai")
    CHAR_SET_THAI("CharSetThai"),

    /**
     * Turkish character set.
     * 
     */
    @XmlEnumValue("CharSetTurkish")
    CHAR_SET_TURKISH("CharSetTurkish"),

    /**
     * Vietnamese character set.
     * 
     */
    @XmlEnumValue("CharSetVietnamese")
    CHAR_SET_VIETNAMESE("CharSetVietnamese");
    private final java.lang.String value;

    FontCharSetEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FontCharSetEnum fromValue(java.lang.String v) {
        for (FontCharSetEnum c: FontCharSetEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}