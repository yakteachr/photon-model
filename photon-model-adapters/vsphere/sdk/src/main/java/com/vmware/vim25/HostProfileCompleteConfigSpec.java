
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileCompleteConfigSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostProfileCompleteConfigSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}HostProfileConfigSpec"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applyProfile" type="{urn:vim25}HostApplyProfile" minOccurs="0"/&gt;
 *         &lt;element name="customComplyProfile" type="{urn:vim25}ComplianceProfile" minOccurs="0"/&gt;
 *         &lt;element name="disabledExpressionListChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="disabledExpressionList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="validatorHost" type="{urn:vim25}ManagedObjectReference" minOccurs="0"/&gt;
 *         &lt;element name="validating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileCompleteConfigSpec", propOrder = {
    "applyProfile",
    "customComplyProfile",
    "disabledExpressionListChanged",
    "disabledExpressionList",
    "validatorHost",
    "validating"
})
public class HostProfileCompleteConfigSpec
    extends HostProfileConfigSpec
{

    protected HostApplyProfile applyProfile;
    protected ComplianceProfile customComplyProfile;
    protected boolean disabledExpressionListChanged;
    protected List<String> disabledExpressionList;
    protected ManagedObjectReference validatorHost;
    protected Boolean validating;

    /**
     * Gets the value of the applyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getApplyProfile() {
        return applyProfile;
    }

    /**
     * Sets the value of the applyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setApplyProfile(HostApplyProfile value) {
        this.applyProfile = value;
    }

    /**
     * Gets the value of the customComplyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceProfile }
     *     
     */
    public ComplianceProfile getCustomComplyProfile() {
        return customComplyProfile;
    }

    /**
     * Sets the value of the customComplyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceProfile }
     *     
     */
    public void setCustomComplyProfile(ComplianceProfile value) {
        this.customComplyProfile = value;
    }

    /**
     * Gets the value of the disabledExpressionListChanged property.
     * 
     */
    public boolean isDisabledExpressionListChanged() {
        return disabledExpressionListChanged;
    }

    /**
     * Sets the value of the disabledExpressionListChanged property.
     * 
     */
    public void setDisabledExpressionListChanged(boolean value) {
        this.disabledExpressionListChanged = value;
    }

    /**
     * Gets the value of the disabledExpressionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabledExpressionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabledExpressionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisabledExpressionList() {
        if (disabledExpressionList == null) {
            disabledExpressionList = new ArrayList<String>();
        }
        return this.disabledExpressionList;
    }

    /**
     * Gets the value of the validatorHost property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getValidatorHost() {
        return validatorHost;
    }

    /**
     * Sets the value of the validatorHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setValidatorHost(ManagedObjectReference value) {
        this.validatorHost = value;
    }

    /**
     * Gets the value of the validating property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidating() {
        return validating;
    }

    /**
     * Sets the value of the validating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidating(Boolean value) {
        this.validating = value;
    }

}
