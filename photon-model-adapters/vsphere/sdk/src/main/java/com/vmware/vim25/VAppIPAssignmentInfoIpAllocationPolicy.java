
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VAppIPAssignmentInfoIpAllocationPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VAppIPAssignmentInfoIpAllocationPolicy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dhcpPolicy"/&gt;
 *     &lt;enumeration value="transientPolicy"/&gt;
 *     &lt;enumeration value="fixedPolicy"/&gt;
 *     &lt;enumeration value="fixedAllocatedPolicy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VAppIPAssignmentInfoIpAllocationPolicy")
@XmlEnum
public enum VAppIPAssignmentInfoIpAllocationPolicy {

    @XmlEnumValue("dhcpPolicy")
    DHCP_POLICY("dhcpPolicy"),
    @XmlEnumValue("transientPolicy")
    TRANSIENT_POLICY("transientPolicy"),
    @XmlEnumValue("fixedPolicy")
    FIXED_POLICY("fixedPolicy"),
    @XmlEnumValue("fixedAllocatedPolicy")
    FIXED_ALLOCATED_POLICY("fixedAllocatedPolicy");
    private final String value;

    VAppIPAssignmentInfoIpAllocationPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VAppIPAssignmentInfoIpAllocationPolicy fromValue(String v) {
        for (VAppIPAssignmentInfoIpAllocationPolicy c: VAppIPAssignmentInfoIpAllocationPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
