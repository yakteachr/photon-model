
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostFirewallRuleset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHostFirewallRuleset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HostFirewallRuleset" type="{urn:vim25}HostFirewallRuleset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFirewallRuleset", propOrder = {
    "hostFirewallRuleset"
})
public class ArrayOfHostFirewallRuleset {

    @XmlElement(name = "HostFirewallRuleset")
    protected List<HostFirewallRuleset> hostFirewallRuleset;

    /**
     * Gets the value of the hostFirewallRuleset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostFirewallRuleset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostFirewallRuleset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFirewallRuleset }
     * 
     * 
     */
    public List<HostFirewallRuleset> getHostFirewallRuleset() {
        if (hostFirewallRuleset == null) {
            hostFirewallRuleset = new ArrayList<HostFirewallRuleset>();
        }
        return this.hostFirewallRuleset;
    }

}
