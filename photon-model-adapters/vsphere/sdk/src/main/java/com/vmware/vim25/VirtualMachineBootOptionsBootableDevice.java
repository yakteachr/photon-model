
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineBootOptionsBootableDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineBootOptionsBootableDevice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DynamicData"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineBootOptionsBootableDevice")
@XmlSeeAlso({
    VirtualMachineBootOptionsBootableDiskDevice.class,
    VirtualMachineBootOptionsBootableEthernetDevice.class,
    VirtualMachineBootOptionsBootableFloppyDevice.class,
    VirtualMachineBootOptionsBootableCdromDevice.class
})
public class VirtualMachineBootOptionsBootableDevice
    extends DynamicData
{


}
