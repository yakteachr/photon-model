
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskFilterSpecByEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskFilterSpecByEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DynamicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entity" type="{urn:vim25}ManagedObjectReference"/&gt;
 *         &lt;element name="recursion" type="{urn:vim25}TaskFilterSpecRecursionOption"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskFilterSpecByEntity", propOrder = {
    "entity",
    "recursion"
})
public class TaskFilterSpecByEntity
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference entity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaskFilterSpecRecursionOption recursion;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setEntity(ManagedObjectReference value) {
        this.entity = value;
    }

    /**
     * Gets the value of the recursion property.
     * 
     * @return
     *     possible object is
     *     {@link TaskFilterSpecRecursionOption }
     *     
     */
    public TaskFilterSpecRecursionOption getRecursion() {
        return recursion;
    }

    /**
     * Sets the value of the recursion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskFilterSpecRecursionOption }
     *     
     */
    public void setRecursion(TaskFilterSpecRecursionOption value) {
        this.recursion = value;
    }

}
