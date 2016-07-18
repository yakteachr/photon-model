
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineBootOptionsBootableEthernetDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineBootOptionsBootableEthernetDevice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}VirtualMachineBootOptionsBootableDevice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceKey" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineBootOptionsBootableEthernetDevice", propOrder = {
    "deviceKey"
})
public class VirtualMachineBootOptionsBootableEthernetDevice
    extends VirtualMachineBootOptionsBootableDevice
{

    protected int deviceKey;

    /**
     * Gets the value of the deviceKey property.
     * 
     */
    public int getDeviceKey() {
        return deviceKey;
    }

    /**
     * Sets the value of the deviceKey property.
     * 
     */
    public void setDeviceKey(int value) {
        this.deviceKey = value;
    }

}
