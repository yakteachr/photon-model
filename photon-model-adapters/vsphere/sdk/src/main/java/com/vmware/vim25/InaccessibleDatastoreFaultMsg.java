
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.020+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "InaccessibleDatastoreFault", targetNamespace = "urn:vim25")
public class InaccessibleDatastoreFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.InaccessibleDatastore inaccessibleDatastoreFault;

    public InaccessibleDatastoreFaultMsg() {
        super();
    }
    
    public InaccessibleDatastoreFaultMsg(String message) {
        super(message);
    }
    
    public InaccessibleDatastoreFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public InaccessibleDatastoreFaultMsg(String message, com.vmware.vim25.InaccessibleDatastore inaccessibleDatastoreFault) {
        super(message);
        this.inaccessibleDatastoreFault = inaccessibleDatastoreFault;
    }

    public InaccessibleDatastoreFaultMsg(String message, com.vmware.vim25.InaccessibleDatastore inaccessibleDatastoreFault, Throwable cause) {
        super(message, cause);
        this.inaccessibleDatastoreFault = inaccessibleDatastoreFault;
    }

    public com.vmware.vim25.InaccessibleDatastore getFaultInfo() {
        return this.inaccessibleDatastoreFault;
    }
}
