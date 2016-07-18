
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryEventsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryEventsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/&gt;
 *         &lt;element name="filter" type="{urn:vim25}EventFilterSpec"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryEventsRequestType", propOrder = {
    "_this",
    "filter"
})
public class QueryEventsRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected EventFilterSpec filter;

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
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link EventFilterSpec }
     *     
     */
    public EventFilterSpec getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFilterSpec }
     *     
     */
    public void setFilter(EventFilterSpec value) {
        this.filter = value;
    }

}
