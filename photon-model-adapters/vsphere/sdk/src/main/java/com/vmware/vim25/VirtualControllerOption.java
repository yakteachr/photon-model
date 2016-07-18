
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualControllerOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualControllerOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}VirtualDeviceOption"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="devices" type="{urn:vim25}IntOption"/&gt;
 *         &lt;element name="supportedDevice" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualControllerOption", propOrder = {
    "devices",
    "supportedDevice"
})
@XmlSeeAlso({
    VirtualIDEControllerOption.class,
    VirtualPCIControllerOption.class,
    VirtualPS2ControllerOption.class,
    VirtualSATAControllerOption.class,
    VirtualSCSIControllerOption.class,
    VirtualSIOControllerOption.class,
    VirtualUSBControllerOption.class,
    VirtualUSBXHCIControllerOption.class
})
public class VirtualControllerOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected IntOption devices;
    protected List<String> supportedDevice;

    /**
     * Gets the value of the devices property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getDevices() {
        return devices;
    }

    /**
     * Sets the value of the devices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setDevices(IntOption value) {
        this.devices = value;
    }

    /**
     * Gets the value of the supportedDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedDevice() {
        if (supportedDevice == null) {
            supportedDevice = new ArrayList<String>();
        }
        return this.supportedDevice;
    }

}
