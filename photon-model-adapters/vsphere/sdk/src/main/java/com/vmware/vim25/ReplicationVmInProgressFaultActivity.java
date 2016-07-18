
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationVmInProgressFaultActivity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReplicationVmInProgressFaultActivity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fullSync"/&gt;
 *     &lt;enumeration value="delta"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReplicationVmInProgressFaultActivity")
@XmlEnum
public enum ReplicationVmInProgressFaultActivity {

    @XmlEnumValue("fullSync")
    FULL_SYNC("fullSync"),
    @XmlEnumValue("delta")
    DELTA("delta");
    private final String value;

    ReplicationVmInProgressFaultActivity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReplicationVmInProgressFaultActivity fromValue(String v) {
        for (ReplicationVmInProgressFaultActivity c: ReplicationVmInProgressFaultActivity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
