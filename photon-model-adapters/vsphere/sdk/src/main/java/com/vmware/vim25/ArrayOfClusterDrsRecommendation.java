
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClusterDrsRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClusterDrsRecommendation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClusterDrsRecommendation" type="{urn:vim25}ClusterDrsRecommendation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDrsRecommendation", propOrder = {
    "clusterDrsRecommendation"
})
public class ArrayOfClusterDrsRecommendation {

    @XmlElement(name = "ClusterDrsRecommendation")
    protected List<ClusterDrsRecommendation> clusterDrsRecommendation;

    /**
     * Gets the value of the clusterDrsRecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterDrsRecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusterDrsRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDrsRecommendation }
     * 
     * 
     */
    public List<ClusterDrsRecommendation> getClusterDrsRecommendation() {
        if (clusterDrsRecommendation == null) {
            clusterDrsRecommendation = new ArrayList<ClusterDrsRecommendation>();
        }
        return this.clusterDrsRecommendation;
    }

}
