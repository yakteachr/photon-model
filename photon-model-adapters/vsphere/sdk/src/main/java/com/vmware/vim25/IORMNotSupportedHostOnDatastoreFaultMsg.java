
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.048+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "IORMNotSupportedHostOnDatastoreFault", targetNamespace = "urn:vim25")
public class IORMNotSupportedHostOnDatastoreFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.IORMNotSupportedHostOnDatastore iormNotSupportedHostOnDatastoreFault;

    public IORMNotSupportedHostOnDatastoreFaultMsg() {
        super();
    }
    
    public IORMNotSupportedHostOnDatastoreFaultMsg(String message) {
        super(message);
    }
    
    public IORMNotSupportedHostOnDatastoreFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public IORMNotSupportedHostOnDatastoreFaultMsg(String message, com.vmware.vim25.IORMNotSupportedHostOnDatastore iormNotSupportedHostOnDatastoreFault) {
        super(message);
        this.iormNotSupportedHostOnDatastoreFault = iormNotSupportedHostOnDatastoreFault;
    }

    public IORMNotSupportedHostOnDatastoreFaultMsg(String message, com.vmware.vim25.IORMNotSupportedHostOnDatastore iormNotSupportedHostOnDatastoreFault, Throwable cause) {
        super(message, cause);
        this.iormNotSupportedHostOnDatastoreFault = iormNotSupportedHostOnDatastoreFault;
    }

    public com.vmware.vim25.IORMNotSupportedHostOnDatastore getFaultInfo() {
        return this.iormNotSupportedHostOnDatastoreFault;
    }
}
