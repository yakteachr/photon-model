
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.062+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "FcoeFaultPnicHasNoPortSetFault", targetNamespace = "urn:vim25")
public class FcoeFaultPnicHasNoPortSetFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.FcoeFaultPnicHasNoPortSet fcoeFaultPnicHasNoPortSetFault;

    public FcoeFaultPnicHasNoPortSetFaultMsg() {
        super();
    }
    
    public FcoeFaultPnicHasNoPortSetFaultMsg(String message) {
        super(message);
    }
    
    public FcoeFaultPnicHasNoPortSetFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public FcoeFaultPnicHasNoPortSetFaultMsg(String message, com.vmware.vim25.FcoeFaultPnicHasNoPortSet fcoeFaultPnicHasNoPortSetFault) {
        super(message);
        this.fcoeFaultPnicHasNoPortSetFault = fcoeFaultPnicHasNoPortSetFault;
    }

    public FcoeFaultPnicHasNoPortSetFaultMsg(String message, com.vmware.vim25.FcoeFaultPnicHasNoPortSet fcoeFaultPnicHasNoPortSetFault, Throwable cause) {
        super(message, cause);
        this.fcoeFaultPnicHasNoPortSetFault = fcoeFaultPnicHasNoPortSetFault;
    }

    public com.vmware.vim25.FcoeFaultPnicHasNoPortSet getFaultInfo() {
        return this.fcoeFaultPnicHasNoPortSetFault;
    }
}
