
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsHostLeftEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DvsHostLeftEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DvsEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostLeft" type="{urn:vim25}HostEventArgument"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostLeftEvent", propOrder = {
    "hostLeft"
})
public class DvsHostLeftEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected HostEventArgument hostLeft;

    /**
     * Gets the value of the hostLeft property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getHostLeft() {
        return hostLeft;
    }

    /**
     * Sets the value of the hostLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setHostLeft(HostEventArgument value) {
        this.hostLeft = value;
    }

}
