
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.050+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "LogBundlingFailedFault", targetNamespace = "urn:vim25")
public class LogBundlingFailedFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.LogBundlingFailed logBundlingFailedFault;

    public LogBundlingFailedFaultMsg() {
        super();
    }
    
    public LogBundlingFailedFaultMsg(String message) {
        super(message);
    }
    
    public LogBundlingFailedFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public LogBundlingFailedFaultMsg(String message, com.vmware.vim25.LogBundlingFailed logBundlingFailedFault) {
        super(message);
        this.logBundlingFailedFault = logBundlingFailedFault;
    }

    public LogBundlingFailedFaultMsg(String message, com.vmware.vim25.LogBundlingFailed logBundlingFailedFault, Throwable cause) {
        super(message, cause);
        this.logBundlingFailedFault = logBundlingFailedFault;
    }

    public com.vmware.vim25.LogBundlingFailed getFaultInfo() {
        return this.logBundlingFailedFault;
    }
}
