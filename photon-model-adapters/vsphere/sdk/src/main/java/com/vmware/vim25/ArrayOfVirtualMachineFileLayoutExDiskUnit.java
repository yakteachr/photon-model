
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineFileLayoutExDiskUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVirtualMachineFileLayoutExDiskUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VirtualMachineFileLayoutExDiskUnit" type="{urn:vim25}VirtualMachineFileLayoutExDiskUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutExDiskUnit", propOrder = {
    "virtualMachineFileLayoutExDiskUnit"
})
public class ArrayOfVirtualMachineFileLayoutExDiskUnit {

    @XmlElement(name = "VirtualMachineFileLayoutExDiskUnit")
    protected List<VirtualMachineFileLayoutExDiskUnit> virtualMachineFileLayoutExDiskUnit;

    /**
     * Gets the value of the virtualMachineFileLayoutExDiskUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineFileLayoutExDiskUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualMachineFileLayoutExDiskUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFileLayoutExDiskUnit }
     * 
     * 
     */
    public List<VirtualMachineFileLayoutExDiskUnit> getVirtualMachineFileLayoutExDiskUnit() {
        if (virtualMachineFileLayoutExDiskUnit == null) {
            virtualMachineFileLayoutExDiskUnit = new ArrayList<VirtualMachineFileLayoutExDiskUnit>();
        }
        return this.virtualMachineFileLayoutExDiskUnit;
    }

}
