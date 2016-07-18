
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostVsanInternalSystemVsanObjectOperationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHostVsanInternalSystemVsanObjectOperationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HostVsanInternalSystemVsanObjectOperationResult" type="{urn:vim25}HostVsanInternalSystemVsanObjectOperationResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVsanInternalSystemVsanObjectOperationResult", propOrder = {
    "hostVsanInternalSystemVsanObjectOperationResult"
})
public class ArrayOfHostVsanInternalSystemVsanObjectOperationResult {

    @XmlElement(name = "HostVsanInternalSystemVsanObjectOperationResult")
    protected List<HostVsanInternalSystemVsanObjectOperationResult> hostVsanInternalSystemVsanObjectOperationResult;

    /**
     * Gets the value of the hostVsanInternalSystemVsanObjectOperationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostVsanInternalSystemVsanObjectOperationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostVsanInternalSystemVsanObjectOperationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVsanInternalSystemVsanObjectOperationResult }
     * 
     * 
     */
    public List<HostVsanInternalSystemVsanObjectOperationResult> getHostVsanInternalSystemVsanObjectOperationResult() {
        if (hostVsanInternalSystemVsanObjectOperationResult == null) {
            hostVsanInternalSystemVsanObjectOperationResult = new ArrayList<HostVsanInternalSystemVsanObjectOperationResult>();
        }
        return this.hostVsanInternalSystemVsanObjectOperationResult;
    }

}
