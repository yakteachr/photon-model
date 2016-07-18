
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestRegKeyWowSpec.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestRegKeyWowSpec"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WOWNative"/&gt;
 *     &lt;enumeration value="WOW32"/&gt;
 *     &lt;enumeration value="WOW64"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GuestRegKeyWowSpec")
@XmlEnum
public enum GuestRegKeyWowSpec {

    @XmlEnumValue("WOWNative")
    WOW_NATIVE("WOWNative"),
    @XmlEnumValue("WOW32")
    WOW_32("WOW32"),
    @XmlEnumValue("WOW64")
    WOW_64("WOW64");
    private final String value;

    GuestRegKeyWowSpec(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestRegKeyWowSpec fromValue(String v) {
        for (GuestRegKeyWowSpec c: GuestRegKeyWowSpec.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
