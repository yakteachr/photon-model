
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostCnxFailedAlreadyManagedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostCnxFailedAlreadyManagedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}HostEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCnxFailedAlreadyManagedEvent", propOrder = {
    "serverName"
})
public class HostCnxFailedAlreadyManagedEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected String serverName;

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

}
