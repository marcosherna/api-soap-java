 
package com.api.springboot.soap.interfaces.clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceStatus",
    "clientInfo"
})
@XmlRootElement(name = "addClientResponse")
public class AddClientResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;

    @XmlElement(required = true)
    protected ClientInfo clientInfo;
 
    public ServiceStatus getServiceStatus() { return this.serviceStatus; }
    public void setServiceStatus(ServiceStatus serviceStatus) { 
        this.serviceStatus = serviceStatus; 
    }  

    public ClientInfo getClientInfo() {  return clientInfo; }
    public void setClientInfo(ClientInfo clientInfo) { 
        this.clientInfo = clientInfo; 
    } 

}
