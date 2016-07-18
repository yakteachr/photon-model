
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSRollbackCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DVSRollbackCapability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DynamicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rollbackSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSRollbackCapability", propOrder = {
    "rollbackSupported"
})
public class DVSRollbackCapability
    extends DynamicData
{

    protected boolean rollbackSupported;

    /**
     * Gets the value of the rollbackSupported property.
     * 
     */
    public boolean isRollbackSupported() {
        return rollbackSupported;
    }

    /**
     * Sets the value of the rollbackSupported property.
     * 
     */
    public void setRollbackSupported(boolean value) {
        this.rollbackSupported = value;
    }

}
