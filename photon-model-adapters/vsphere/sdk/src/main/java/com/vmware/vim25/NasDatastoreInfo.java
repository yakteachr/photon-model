
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NasDatastoreInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasDatastoreInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DatastoreInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nas" type="{urn:vim25}HostNasVolume" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasDatastoreInfo", propOrder = {
    "nas"
})
public class NasDatastoreInfo
    extends DatastoreInfo
{

    protected HostNasVolume nas;

    /**
     * Gets the value of the nas property.
     * 
     * @return
     *     possible object is
     *     {@link HostNasVolume }
     *     
     */
    public HostNasVolume getNas() {
        return nas;
    }

    /**
     * Sets the value of the nas property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNasVolume }
     *     
     */
    public void setNas(HostNasVolume value) {
        this.nas = value;
    }

}
