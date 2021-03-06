
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VMwareDVSConfigInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DVSConfigInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vspanSession" type="{urn:vim25}VMwareVspanSession" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pvlanConfig" type="{urn:vim25}VMwareDVSPvlanMapEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maxMtu" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="linkDiscoveryProtocolConfig" type="{urn:vim25}LinkDiscoveryProtocolConfig" minOccurs="0"/&gt;
 *         &lt;element name="ipfixConfig" type="{urn:vim25}VMwareIpfixConfig" minOccurs="0"/&gt;
 *         &lt;element name="lacpGroupConfig" type="{urn:vim25}VMwareDvsLacpGroupConfig" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lacpApiVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multicastFilteringMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSConfigInfo", propOrder = {
    "vspanSession",
    "pvlanConfig",
    "maxMtu",
    "linkDiscoveryProtocolConfig",
    "ipfixConfig",
    "lacpGroupConfig",
    "lacpApiVersion",
    "multicastFilteringMode"
})
public class VMwareDVSConfigInfo
    extends DVSConfigInfo
{

    protected List<VMwareVspanSession> vspanSession;
    protected List<VMwareDVSPvlanMapEntry> pvlanConfig;
    protected int maxMtu;
    protected LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
    protected VMwareIpfixConfig ipfixConfig;
    protected List<VMwareDvsLacpGroupConfig> lacpGroupConfig;
    protected String lacpApiVersion;
    protected String multicastFilteringMode;

    /**
     * Gets the value of the vspanSession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vspanSession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVspanSession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMwareVspanSession }
     * 
     * 
     */
    public List<VMwareVspanSession> getVspanSession() {
        if (vspanSession == null) {
            vspanSession = new ArrayList<VMwareVspanSession>();
        }
        return this.vspanSession;
    }

    /**
     * Gets the value of the pvlanConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pvlanConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPvlanConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMwareDVSPvlanMapEntry }
     * 
     * 
     */
    public List<VMwareDVSPvlanMapEntry> getPvlanConfig() {
        if (pvlanConfig == null) {
            pvlanConfig = new ArrayList<VMwareDVSPvlanMapEntry>();
        }
        return this.pvlanConfig;
    }

    /**
     * Gets the value of the maxMtu property.
     * 
     */
    public int getMaxMtu() {
        return maxMtu;
    }

    /**
     * Sets the value of the maxMtu property.
     * 
     */
    public void setMaxMtu(int value) {
        this.maxMtu = value;
    }

    /**
     * Gets the value of the linkDiscoveryProtocolConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LinkDiscoveryProtocolConfig }
     *     
     */
    public LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
        return linkDiscoveryProtocolConfig;
    }

    /**
     * Sets the value of the linkDiscoveryProtocolConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkDiscoveryProtocolConfig }
     *     
     */
    public void setLinkDiscoveryProtocolConfig(LinkDiscoveryProtocolConfig value) {
        this.linkDiscoveryProtocolConfig = value;
    }

    /**
     * Gets the value of the ipfixConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareIpfixConfig }
     *     
     */
    public VMwareIpfixConfig getIpfixConfig() {
        return ipfixConfig;
    }

    /**
     * Sets the value of the ipfixConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareIpfixConfig }
     *     
     */
    public void setIpfixConfig(VMwareIpfixConfig value) {
        this.ipfixConfig = value;
    }

    /**
     * Gets the value of the lacpGroupConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacpGroupConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacpGroupConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMwareDvsLacpGroupConfig }
     * 
     * 
     */
    public List<VMwareDvsLacpGroupConfig> getLacpGroupConfig() {
        if (lacpGroupConfig == null) {
            lacpGroupConfig = new ArrayList<VMwareDvsLacpGroupConfig>();
        }
        return this.lacpGroupConfig;
    }

    /**
     * Gets the value of the lacpApiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLacpApiVersion() {
        return lacpApiVersion;
    }

    /**
     * Sets the value of the lacpApiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLacpApiVersion(String value) {
        this.lacpApiVersion = value;
    }

    /**
     * Gets the value of the multicastFilteringMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticastFilteringMode() {
        return multicastFilteringMode;
    }

    /**
     * Sets the value of the multicastFilteringMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticastFilteringMode(String value) {
        this.multicastFilteringMode = value;
    }

}
