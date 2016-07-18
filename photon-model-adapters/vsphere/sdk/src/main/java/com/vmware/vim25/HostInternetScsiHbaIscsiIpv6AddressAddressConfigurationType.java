
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DHCP"/&gt;
 *     &lt;enumeration value="AutoConfigured"/&gt;
 *     &lt;enumeration value="Static"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType")
@XmlEnum
public enum HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType {

    DHCP("DHCP"),
    @XmlEnumValue("AutoConfigured")
    AUTO_CONFIGURED("AutoConfigured"),
    @XmlEnumValue("Static")
    STATIC("Static"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType fromValue(String v) {
        for (HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType c: HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
