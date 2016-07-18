
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.008+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "RecordReplayDisabledFault", targetNamespace = "urn:vim25")
public class RecordReplayDisabledFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.RecordReplayDisabled recordReplayDisabledFault;

    public RecordReplayDisabledFaultMsg() {
        super();
    }
    
    public RecordReplayDisabledFaultMsg(String message) {
        super(message);
    }
    
    public RecordReplayDisabledFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordReplayDisabledFaultMsg(String message, com.vmware.vim25.RecordReplayDisabled recordReplayDisabledFault) {
        super(message);
        this.recordReplayDisabledFault = recordReplayDisabledFault;
    }

    public RecordReplayDisabledFaultMsg(String message, com.vmware.vim25.RecordReplayDisabled recordReplayDisabledFault, Throwable cause) {
        super(message, cause);
        this.recordReplayDisabledFault = recordReplayDisabledFault;
    }

    public com.vmware.vim25.RecordReplayDisabled getFaultInfo() {
        return this.recordReplayDisabledFault;
    }
}
