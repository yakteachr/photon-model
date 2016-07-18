
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendDatastoresRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendDatastoresRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/&gt;
 *         &lt;element name="storageSpec" type="{urn:vim25}StoragePlacementSpec"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendDatastoresRequestType", propOrder = {
    "_this",
    "storageSpec"
})
public class RecommendDatastoresRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected StoragePlacementSpec storageSpec;

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
     * Gets the value of the storageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link StoragePlacementSpec }
     *     
     */
    public StoragePlacementSpec getStorageSpec() {
        return storageSpec;
    }

    /**
     * Sets the value of the storageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoragePlacementSpec }
     *     
     */
    public void setStorageSpec(StoragePlacementSpec value) {
        this.storageSpec = value;
    }

}
