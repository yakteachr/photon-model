
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerfStatsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerfStatsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="absolute"/&gt;
 *     &lt;enumeration value="delta"/&gt;
 *     &lt;enumeration value="rate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PerfStatsType")
@XmlEnum
public enum PerfStatsType {

    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),
    @XmlEnumValue("delta")
    DELTA("delta"),
    @XmlEnumValue("rate")
    RATE("rate");
    private final String value;

    PerfStatsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerfStatsType fromValue(String v) {
        for (PerfStatsType c: PerfStatsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
