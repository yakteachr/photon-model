
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DasHostIsolatedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DasHostIsolatedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}ClusterEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isolatedHost" type="{urn:vim25}HostEventArgument"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DasHostIsolatedEvent", propOrder = {
    "isolatedHost"
})
public class DasHostIsolatedEvent
    extends ClusterEvent
{

    @XmlElement(required = true)
    protected HostEventArgument isolatedHost;

    /**
     * Gets the value of the isolatedHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getIsolatedHost() {
        return isolatedHost;
    }

    /**
     * Sets the value of the isolatedHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setIsolatedHost(HostEventArgument value) {
        this.isolatedHost = value;
    }

}
