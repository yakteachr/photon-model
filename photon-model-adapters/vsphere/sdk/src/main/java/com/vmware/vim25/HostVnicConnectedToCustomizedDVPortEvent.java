
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVnicConnectedToCustomizedDVPortEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostVnicConnectedToCustomizedDVPortEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}HostEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vnic" type="{urn:vim25}VnicPortArgument"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVnicConnectedToCustomizedDVPortEvent", propOrder = {
    "vnic"
})
public class HostVnicConnectedToCustomizedDVPortEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected VnicPortArgument vnic;

    /**
     * Gets the value of the vnic property.
     * 
     * @return
     *     possible object is
     *     {@link VnicPortArgument }
     *     
     */
    public VnicPortArgument getVnic() {
        return vnic;
    }

    /**
     * Sets the value of the vnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link VnicPortArgument }
     *     
     */
    public void setVnic(VnicPortArgument value) {
        this.vnic = value;
    }

}
