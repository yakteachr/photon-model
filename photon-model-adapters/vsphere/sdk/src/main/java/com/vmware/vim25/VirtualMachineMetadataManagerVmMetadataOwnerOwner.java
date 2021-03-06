
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineMetadataManagerVmMetadataOwnerOwner.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualMachineMetadataManagerVmMetadataOwnerOwner"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ComVmwareVsphereHA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VirtualMachineMetadataManagerVmMetadataOwnerOwner")
@XmlEnum
public enum VirtualMachineMetadataManagerVmMetadataOwnerOwner {

    @XmlEnumValue("ComVmwareVsphereHA")
    COM_VMWARE_VSPHERE_HA("ComVmwareVsphereHA");
    private final String value;

    VirtualMachineMetadataManagerVmMetadataOwnerOwner(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualMachineMetadataManagerVmMetadataOwnerOwner fromValue(String v) {
        for (VirtualMachineMetadataManagerVmMetadataOwnerOwner c: VirtualMachineMetadataManagerVmMetadataOwnerOwner.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
