
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmwareDistributedVirtualSwitchPvlanSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmwareDistributedVirtualSwitchPvlanSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}VmwareDistributedVirtualSwitchVlanSpec"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pvlanId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchPvlanSpec", propOrder = {
    "pvlanId"
})
public class VmwareDistributedVirtualSwitchPvlanSpec
    extends VmwareDistributedVirtualSwitchVlanSpec
{

    protected int pvlanId;

    /**
     * Gets the value of the pvlanId property.
     * 
     */
    public int getPvlanId() {
        return pvlanId;
    }

    /**
     * Sets the value of the pvlanId property.
     * 
     */
    public void setPvlanId(int value) {
        this.pvlanId = value;
    }

}
