
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostStorageOperationalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHostStorageOperationalInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HostStorageOperationalInfo" type="{urn:vim25}HostStorageOperationalInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostStorageOperationalInfo", propOrder = {
    "hostStorageOperationalInfo"
})
public class ArrayOfHostStorageOperationalInfo {

    @XmlElement(name = "HostStorageOperationalInfo")
    protected List<HostStorageOperationalInfo> hostStorageOperationalInfo;

    /**
     * Gets the value of the hostStorageOperationalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostStorageOperationalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostStorageOperationalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostStorageOperationalInfo }
     * 
     * 
     */
    public List<HostStorageOperationalInfo> getHostStorageOperationalInfo() {
        if (hostStorageOperationalInfo == null) {
            hostStorageOperationalInfo = new ArrayList<HostStorageOperationalInfo>();
        }
        return this.hostStorageOperationalInfo;
    }

}
