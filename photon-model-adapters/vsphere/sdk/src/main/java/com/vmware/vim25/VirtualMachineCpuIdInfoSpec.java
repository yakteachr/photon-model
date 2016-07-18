
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineCpuIdInfoSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineCpuIdInfoSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}ArrayUpdateSpec"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="info" type="{urn:vim25}HostCpuIdInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineCpuIdInfoSpec", propOrder = {
    "info"
})
public class VirtualMachineCpuIdInfoSpec
    extends ArrayUpdateSpec
{

    protected HostCpuIdInfo info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link HostCpuIdInfo }
     *     
     */
    public HostCpuIdInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostCpuIdInfo }
     *     
     */
    public void setInfo(HostCpuIdInfo value) {
        this.info = value;
    }

}
