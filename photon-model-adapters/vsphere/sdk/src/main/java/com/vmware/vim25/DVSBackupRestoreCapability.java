
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSBackupRestoreCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DVSBackupRestoreCapability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DynamicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="backupRestoreSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSBackupRestoreCapability", propOrder = {
    "backupRestoreSupported"
})
public class DVSBackupRestoreCapability
    extends DynamicData
{

    protected boolean backupRestoreSupported;

    /**
     * Gets the value of the backupRestoreSupported property.
     * 
     */
    public boolean isBackupRestoreSupported() {
        return backupRestoreSupported;
    }

    /**
     * Sets the value of the backupRestoreSupported property.
     * 
     */
    public void setBackupRestoreSupported(boolean value) {
        this.backupRestoreSupported = value;
    }

}
