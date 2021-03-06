
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmMacConflictEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmMacConflictEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}VmEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conflictedVm" type="{urn:vim25}VmEventArgument"/&gt;
 *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmMacConflictEvent", propOrder = {
    "conflictedVm",
    "mac"
})
public class VmMacConflictEvent
    extends VmEvent
{

    @XmlElement(required = true)
    protected VmEventArgument conflictedVm;
    @XmlElement(required = true)
    protected String mac;

    /**
     * Gets the value of the conflictedVm property.
     * 
     * @return
     *     possible object is
     *     {@link VmEventArgument }
     *     
     */
    public VmEventArgument getConflictedVm() {
        return conflictedVm;
    }

    /**
     * Sets the value of the conflictedVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmEventArgument }
     *     
     */
    public void setConflictedVm(VmEventArgument value) {
        this.conflictedVm = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

}
