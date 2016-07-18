
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoragePlacementSpecPlacementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoragePlacementSpecPlacementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="create"/&gt;
 *     &lt;enumeration value="reconfigure"/&gt;
 *     &lt;enumeration value="relocate"/&gt;
 *     &lt;enumeration value="clone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StoragePlacementSpecPlacementType")
@XmlEnum
public enum StoragePlacementSpecPlacementType {

    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("reconfigure")
    RECONFIGURE("reconfigure"),
    @XmlEnumValue("relocate")
    RELOCATE("relocate"),
    @XmlEnumValue("clone")
    CLONE("clone");
    private final String value;

    StoragePlacementSpecPlacementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoragePlacementSpecPlacementType fromValue(String v) {
        for (StoragePlacementSpecPlacementType c: StoragePlacementSpecPlacementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
