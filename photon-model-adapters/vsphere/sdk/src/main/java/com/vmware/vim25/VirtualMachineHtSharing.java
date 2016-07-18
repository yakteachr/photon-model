
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineHtSharing.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualMachineHtSharing"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="any"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="internal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VirtualMachineHtSharing")
@XmlEnum
public enum VirtualMachineHtSharing {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("internal")
    INTERNAL("internal");
    private final String value;

    VirtualMachineHtSharing(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualMachineHtSharing fromValue(String v) {
        for (VirtualMachineHtSharing c: VirtualMachineHtSharing.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
