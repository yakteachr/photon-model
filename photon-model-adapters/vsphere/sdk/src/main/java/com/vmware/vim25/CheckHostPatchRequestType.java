
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckHostPatchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckHostPatchRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/&gt;
 *         &lt;element name="metaUrls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bundleUrls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="spec" type="{urn:vim25}HostPatchManagerPatchManagerOperationSpec" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckHostPatchRequestType", propOrder = {
    "_this",
    "metaUrls",
    "bundleUrls",
    "spec"
})
public class CheckHostPatchRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected List<String> metaUrls;
    protected List<String> bundleUrls;
    protected HostPatchManagerPatchManagerOperationSpec spec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the metaUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetaUrls() {
        if (metaUrls == null) {
            metaUrls = new ArrayList<String>();
        }
        return this.metaUrls;
    }

    /**
     * Gets the value of the bundleUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundleUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundleUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBundleUrls() {
        if (bundleUrls == null) {
            bundleUrls = new ArrayList<String>();
        }
        return this.bundleUrls;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link HostPatchManagerPatchManagerOperationSpec }
     *     
     */
    public HostPatchManagerPatchManagerOperationSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPatchManagerPatchManagerOperationSpec }
     *     
     */
    public void setSpec(HostPatchManagerPatchManagerOperationSpec value) {
        this.spec = value;
    }

}
