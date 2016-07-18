
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConfigChangeOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostConfigChangeOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="add"/&gt;
 *     &lt;enumeration value="remove"/&gt;
 *     &lt;enumeration value="edit"/&gt;
 *     &lt;enumeration value="ignore"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HostConfigChangeOperation")
@XmlEnum
public enum HostConfigChangeOperation {

    @XmlEnumValue("add")
    ADD("add"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("edit")
    EDIT("edit"),
    @XmlEnumValue("ignore")
    IGNORE("ignore");
    private final String value;

    HostConfigChangeOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostConfigChangeOperation fromValue(String v) {
        for (HostConfigChangeOperation c: HostConfigChangeOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
