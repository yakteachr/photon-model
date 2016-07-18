
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.061+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "DasConfigFaultFault", targetNamespace = "urn:vim25")
public class DasConfigFaultFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.DasConfigFault dasConfigFaultFault;

    public DasConfigFaultFaultMsg() {
        super();
    }
    
    public DasConfigFaultFaultMsg(String message) {
        super(message);
    }
    
    public DasConfigFaultFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public DasConfigFaultFaultMsg(String message, com.vmware.vim25.DasConfigFault dasConfigFaultFault) {
        super(message);
        this.dasConfigFaultFault = dasConfigFaultFault;
    }

    public DasConfigFaultFaultMsg(String message, com.vmware.vim25.DasConfigFault dasConfigFaultFault, Throwable cause) {
        super(message, cause);
        this.dasConfigFaultFault = dasConfigFaultFault;
    }

    public com.vmware.vim25.DasConfigFault getFaultInfo() {
        return this.dasConfigFaultFault;
    }
}
