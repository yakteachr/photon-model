
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVPortgroupConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DVPortgroupConfigInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DynamicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numPorts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="distributedVirtualSwitch" type="{urn:vim25}ManagedObjectReference" minOccurs="0"/&gt;
 *         &lt;element name="defaultPortConfig" type="{urn:vim25}DVPortSetting" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="policy" type="{urn:vim25}DVPortgroupPolicy"/&gt;
 *         &lt;element name="portNameFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{urn:vim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendorSpecificConfig" type="{urn:vim25}DistributedVirtualSwitchKeyedOpaqueBlob" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="configVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autoExpand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="vmVnicNetworkResourcePoolKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortgroupConfigInfo", propOrder = {
    "key",
    "name",
    "numPorts",
    "distributedVirtualSwitch",
    "defaultPortConfig",
    "description",
    "type",
    "policy",
    "portNameFormat",
    "scope",
    "vendorSpecificConfig",
    "configVersion",
    "autoExpand",
    "vmVnicNetworkResourcePoolKey"
})
public class DVPortgroupConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String name;
    protected int numPorts;
    protected ManagedObjectReference distributedVirtualSwitch;
    protected DVPortSetting defaultPortConfig;
    protected String description;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected DVPortgroupPolicy policy;
    protected String portNameFormat;
    protected List<ManagedObjectReference> scope;
    protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
    protected String configVersion;
    protected Boolean autoExpand;
    protected String vmVnicNetworkResourcePoolKey;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the distributedVirtualSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }

    /**
     * Sets the value of the distributedVirtualSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDistributedVirtualSwitch(ManagedObjectReference value) {
        this.distributedVirtualSwitch = value;
    }

    /**
     * Gets the value of the defaultPortConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortSetting }
     *     
     */
    public DVPortSetting getDefaultPortConfig() {
        return defaultPortConfig;
    }

    /**
     * Sets the value of the defaultPortConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortSetting }
     *     
     */
    public void setDefaultPortConfig(DVPortSetting value) {
        this.defaultPortConfig = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortgroupPolicy }
     *     
     */
    public DVPortgroupPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortgroupPolicy }
     *     
     */
    public void setPolicy(DVPortgroupPolicy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the portNameFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNameFormat() {
        return portNameFormat;
    }

    /**
     * Sets the value of the portNameFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNameFormat(String value) {
        this.portNameFormat = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * 
     * 
     */
    public List<ManagedObjectReference> getScope() {
        if (scope == null) {
            scope = new ArrayList<ManagedObjectReference>();
        }
        return this.scope;
    }

    /**
     * Gets the value of the vendorSpecificConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorSpecificConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorSpecificConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchKeyedOpaqueBlob }
     * 
     * 
     */
    public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
        if (vendorSpecificConfig == null) {
            vendorSpecificConfig = new ArrayList<DistributedVirtualSwitchKeyedOpaqueBlob>();
        }
        return this.vendorSpecificConfig;
    }

    /**
     * Gets the value of the configVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigVersion() {
        return configVersion;
    }

    /**
     * Sets the value of the configVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigVersion(String value) {
        this.configVersion = value;
    }

    /**
     * Gets the value of the autoExpand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExpand() {
        return autoExpand;
    }

    /**
     * Sets the value of the autoExpand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExpand(Boolean value) {
        this.autoExpand = value;
    }

    /**
     * Gets the value of the vmVnicNetworkResourcePoolKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmVnicNetworkResourcePoolKey() {
        return vmVnicNetworkResourcePoolKey;
    }

    /**
     * Sets the value of the vmVnicNetworkResourcePoolKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmVnicNetworkResourcePoolKey(String value) {
        this.vmVnicNetworkResourcePoolKey = value;
    }

}
