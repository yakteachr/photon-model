
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.049+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "InvalidEventFault", targetNamespace = "urn:vim25")
public class InvalidEventFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.InvalidEvent invalidEventFault;

    public InvalidEventFaultMsg() {
        super();
    }
    
    public InvalidEventFaultMsg(String message) {
        super(message);
    }
    
    public InvalidEventFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidEventFaultMsg(String message, com.vmware.vim25.InvalidEvent invalidEventFault) {
        super(message);
        this.invalidEventFault = invalidEventFault;
    }

    public InvalidEventFaultMsg(String message, com.vmware.vim25.InvalidEvent invalidEventFault, Throwable cause) {
        super(message, cause);
        this.invalidEventFault = invalidEventFault;
    }

    public com.vmware.vim25.InvalidEvent getFaultInfo() {
        return this.invalidEventFault;
    }
}
