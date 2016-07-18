
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.067+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "CannotAccessLocalSourceFault", targetNamespace = "urn:vim25")
public class CannotAccessLocalSourceFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.CannotAccessLocalSource cannotAccessLocalSourceFault;

    public CannotAccessLocalSourceFaultMsg() {
        super();
    }
    
    public CannotAccessLocalSourceFaultMsg(String message) {
        super(message);
    }
    
    public CannotAccessLocalSourceFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotAccessLocalSourceFaultMsg(String message, com.vmware.vim25.CannotAccessLocalSource cannotAccessLocalSourceFault) {
        super(message);
        this.cannotAccessLocalSourceFault = cannotAccessLocalSourceFault;
    }

    public CannotAccessLocalSourceFaultMsg(String message, com.vmware.vim25.CannotAccessLocalSource cannotAccessLocalSourceFault, Throwable cause) {
        super(message, cause);
        this.cannotAccessLocalSourceFault = cannotAccessLocalSourceFault;
    }

    public com.vmware.vim25.CannotAccessLocalSource getFaultInfo() {
        return this.cannotAccessLocalSourceFault;
    }
}
