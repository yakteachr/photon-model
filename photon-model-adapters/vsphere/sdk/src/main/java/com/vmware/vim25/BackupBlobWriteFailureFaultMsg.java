
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-18T20:02:09.030+03:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "BackupBlobWriteFailureFault", targetNamespace = "urn:vim25")
public class BackupBlobWriteFailureFaultMsg extends Exception {
    public static final long serialVersionUID = 1L;
    
    private com.vmware.vim25.BackupBlobWriteFailure backupBlobWriteFailureFault;

    public BackupBlobWriteFailureFaultMsg() {
        super();
    }
    
    public BackupBlobWriteFailureFaultMsg(String message) {
        super(message);
    }
    
    public BackupBlobWriteFailureFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public BackupBlobWriteFailureFaultMsg(String message, com.vmware.vim25.BackupBlobWriteFailure backupBlobWriteFailureFault) {
        super(message);
        this.backupBlobWriteFailureFault = backupBlobWriteFailureFault;
    }

    public BackupBlobWriteFailureFaultMsg(String message, com.vmware.vim25.BackupBlobWriteFailure backupBlobWriteFailureFault, Throwable cause) {
        super(message, cause);
        this.backupBlobWriteFailureFault = backupBlobWriteFailureFault;
    }

    public com.vmware.vim25.BackupBlobWriteFailure getFaultInfo() {
        return this.backupBlobWriteFailureFault;
    }
}
