
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:08.947+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "FileFaultFault", targetNamespace = "urn:vim25")
public class FileFaultFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.FileFault fileFaultFault;

    public FileFaultFaultMsg() {
        super();
    }
    
    public FileFaultFaultMsg(String message) {
        super(message);
    }
    
    public FileFaultFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public FileFaultFaultMsg(String message, com.vmware.vim25.FileFault fileFaultFault) {
        super(message);
        this.fileFaultFault = fileFaultFault;
    }

    public FileFaultFaultMsg(String message, com.vmware.vim25.FileFault fileFaultFault, Throwable cause) {
        super(message, cause);
        this.fileFaultFault = fileFaultFault;
    }

    public com.vmware.vim25.FileFault getFaultInfo() {
        return this.fileFaultFault;
    }
}
