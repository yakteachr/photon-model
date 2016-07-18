
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProxySwitch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostProxySwitch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DynamicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dvsUuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dvsName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numPorts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="configNumPorts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numPortsAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="uplinkPort" type="{urn:vim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pnic" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="spec" type="{urn:vim25}HostProxySwitchSpec"/&gt;
 *         &lt;element name="hostLag" type="{urn:vim25}HostProxySwitchHostLagConfig" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="networkReservationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProxySwitch", propOrder = {
    "dvsUuid",
    "dvsName",
    "key",
    "numPorts",
    "configNumPorts",
    "numPortsAvailable",
    "uplinkPort",
    "mtu",
    "pnic",
    "spec",
    "hostLag",
    "networkReservationSupported"
})
public class HostProxySwitch
    extends DynamicData
{

    @XmlElement(required = true)
    protected String dvsUuid;
    @XmlElement(required = true)
    protected String dvsName;
    @XmlElement(required = true)
    protected String key;
    protected int numPorts;
    protected Integer configNumPorts;
    protected int numPortsAvailable;
    protected List<KeyValue> uplinkPort;
    protected Integer mtu;
    protected List<String> pnic;
    @XmlElement(required = true)
    protected HostProxySwitchSpec spec;
    protected List<HostProxySwitchHostLagConfig> hostLag;
    protected Boolean networkReservationSupported;

    /**
     * Gets the value of the dvsUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvsUuid() {
        return dvsUuid;
    }

    /**
     * Sets the value of the dvsUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvsUuid(String value) {
        this.dvsUuid = value;
    }

    /**
     * Gets the value of the dvsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvsName() {
        return dvsName;
    }

    /**
     * Sets the value of the dvsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvsName(String value) {
        this.dvsName = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the numPorts property.
     * 
     */
    public int getNumPorts() {
        return numPorts;
    }

    /**
     * Sets the value of the numPorts property.
     * 
     */
    public void setNumPorts(int value) {
        this.numPorts = value;
    }

    /**
     * Gets the value of the configNumPorts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfigNumPorts() {
        return configNumPorts;
    }

    /**
     * Sets the value of the configNumPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfigNumPorts(Integer value) {
        this.configNumPorts = value;
    }

    /**
     * Gets the value of the numPortsAvailable property.
     * 
     */
    public int getNumPortsAvailable() {
        return numPortsAvailable;
    }

    /**
     * Sets the value of the numPortsAvailable property.
     * 
     */
    public void setNumPortsAvailable(int value) {
        this.numPortsAvailable = value;
    }

    /**
     * Gets the value of the uplinkPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uplinkPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUplinkPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * 
     * 
     */
    public List<KeyValue> getUplinkPort() {
        if (uplinkPort == null) {
            uplinkPort = new ArrayList<KeyValue>();
        }
        return this.uplinkPort;
    }

    /**
     * Gets the value of the mtu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMtu(Integer value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the pnic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPnic() {
        if (pnic == null) {
            pnic = new ArrayList<String>();
        }
        return this.pnic;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link HostProxySwitchSpec }
     *     
     */
    public HostProxySwitchSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostProxySwitchSpec }
     *     
     */
    public void setSpec(HostProxySwitchSpec value) {
        this.spec = value;
    }

    /**
     * Gets the value of the hostLag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostLag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostLag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProxySwitchHostLagConfig }
     * 
     * 
     */
    public List<HostProxySwitchHostLagConfig> getHostLag() {
        if (hostLag == null) {
            hostLag = new ArrayList<HostProxySwitchHostLagConfig>();
        }
        return this.hostLag;
    }

    /**
     * Gets the value of the networkReservationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkReservationSupported() {
        return networkReservationSupported;
    }

    /**
     * Sets the value of the networkReservationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkReservationSupported(Boolean value) {
        this.networkReservationSupported = value;
    }

}
