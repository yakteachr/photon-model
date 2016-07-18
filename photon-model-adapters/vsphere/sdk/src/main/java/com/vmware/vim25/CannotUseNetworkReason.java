
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CannotUseNetworkReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CannotUseNetworkReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NetworkReservationNotSupported"/&gt;
 *     &lt;enumeration value="MismatchedNetworkPolicies"/&gt;
 *     &lt;enumeration value="MismatchedDvsVersionOrVendor"/&gt;
 *     &lt;enumeration value="VMotionToUnsupportedNetworkType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CannotUseNetworkReason")
@XmlEnum
public enum CannotUseNetworkReason {

    @XmlEnumValue("NetworkReservationNotSupported")
    NETWORK_RESERVATION_NOT_SUPPORTED("NetworkReservationNotSupported"),
    @XmlEnumValue("MismatchedNetworkPolicies")
    MISMATCHED_NETWORK_POLICIES("MismatchedNetworkPolicies"),
    @XmlEnumValue("MismatchedDvsVersionOrVendor")
    MISMATCHED_DVS_VERSION_OR_VENDOR("MismatchedDvsVersionOrVendor"),
    @XmlEnumValue("VMotionToUnsupportedNetworkType")
    V_MOTION_TO_UNSUPPORTED_NETWORK_TYPE("VMotionToUnsupportedNetworkType");
    private final String value;

    CannotUseNetworkReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CannotUseNetworkReason fromValue(String v) {
        for (CannotUseNetworkReason c: CannotUseNetworkReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
