
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceAllocationOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceAllocationOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DynamicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sharesOption" type="{urn:vim25}SharesOption"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceAllocationOption", propOrder = {
    "sharesOption"
})
public class ResourceAllocationOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected SharesOption sharesOption;

    /**
     * Gets the value of the sharesOption property.
     * 
     * @return
     *     possible object is
     *     {@link SharesOption }
     *     
     */
    public SharesOption getSharesOption() {
        return sharesOption;
    }

    /**
     * Sets the value of the sharesOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesOption }
     *     
     */
    public void setSharesOption(SharesOption value) {
        this.sharesOption = value;
    }

}
