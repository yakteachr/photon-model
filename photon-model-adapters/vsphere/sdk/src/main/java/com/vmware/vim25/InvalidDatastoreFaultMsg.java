
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:08.972+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "InvalidDatastoreFault", targetNamespace = "urn:vim25")
public class InvalidDatastoreFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.InvalidDatastore invalidDatastoreFault;

    public InvalidDatastoreFaultMsg() {
        super();
    }
    
    public InvalidDatastoreFaultMsg(String message) {
        super(message);
    }
    
    public InvalidDatastoreFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDatastoreFaultMsg(String message, com.vmware.vim25.InvalidDatastore invalidDatastoreFault) {
        super(message);
        this.invalidDatastoreFault = invalidDatastoreFault;
    }

    public InvalidDatastoreFaultMsg(String message, com.vmware.vim25.InvalidDatastore invalidDatastoreFault, Throwable cause) {
        super(message, cause);
        this.invalidDatastoreFault = invalidDatastoreFault;
    }

    public com.vmware.vim25.InvalidDatastore getFaultInfo() {
        return this.invalidDatastoreFault;
    }
}
