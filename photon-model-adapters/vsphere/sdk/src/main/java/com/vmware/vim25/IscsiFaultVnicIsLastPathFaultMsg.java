
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.042+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "IscsiFaultVnicIsLastPathFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicIsLastPathFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.IscsiFaultVnicIsLastPath iscsiFaultVnicIsLastPathFault;

    public IscsiFaultVnicIsLastPathFaultMsg() {
        super();
    }
    
    public IscsiFaultVnicIsLastPathFaultMsg(String message) {
        super(message);
    }
    
    public IscsiFaultVnicIsLastPathFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public IscsiFaultVnicIsLastPathFaultMsg(String message, com.vmware.vim25.IscsiFaultVnicIsLastPath iscsiFaultVnicIsLastPathFault) {
        super(message);
        this.iscsiFaultVnicIsLastPathFault = iscsiFaultVnicIsLastPathFault;
    }

    public IscsiFaultVnicIsLastPathFaultMsg(String message, com.vmware.vim25.IscsiFaultVnicIsLastPath iscsiFaultVnicIsLastPathFault, Throwable cause) {
        super(message, cause);
        this.iscsiFaultVnicIsLastPathFault = iscsiFaultVnicIsLastPathFault;
    }

    public com.vmware.vim25.IscsiFaultVnicIsLastPath getFaultInfo() {
        return this.iscsiFaultVnicIsLastPathFault;
    }
}
