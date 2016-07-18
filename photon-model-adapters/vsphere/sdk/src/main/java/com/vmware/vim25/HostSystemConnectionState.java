
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSystemConnectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostSystemConnectionState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="connected"/&gt;
 *     &lt;enumeration value="notResponding"/&gt;
 *     &lt;enumeration value="disconnected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HostSystemConnectionState")
@XmlEnum
public enum HostSystemConnectionState {

    @XmlEnumValue("connected")
    CONNECTED("connected"),
    @XmlEnumValue("notResponding")
    NOT_RESPONDING("notResponding"),
    @XmlEnumValue("disconnected")
    DISCONNECTED("disconnected");
    private final String value;

    HostSystemConnectionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostSystemConnectionState fromValue(String v) {
        for (HostSystemConnectionState c: HostSystemConnectionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
