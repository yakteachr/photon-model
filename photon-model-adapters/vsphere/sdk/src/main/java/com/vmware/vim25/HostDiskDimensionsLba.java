
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDiskDimensionsLba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostDiskDimensionsLba"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vim25}DynamicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blockSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskDimensionsLba", propOrder = {
    "blockSize",
    "block"
})
public class HostDiskDimensionsLba
    extends DynamicData
{

    protected int blockSize;
    protected long block;

    /**
     * Gets the value of the blockSize property.
     * 
     */
    public int getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     */
    public void setBlockSize(int value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the block property.
     * 
     */
    public long getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     */
    public void setBlock(long value) {
        this.block = value;
    }

}
