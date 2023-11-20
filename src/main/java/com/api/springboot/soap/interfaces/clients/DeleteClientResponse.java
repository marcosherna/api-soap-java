 
package com.api.springboot.soap.interfaces.clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceStatus"
})
@XmlRootElement(name = "deleteClientResponse")
public class DeleteClientResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;  

    public ServiceStatus getServiceStatus() { return this.serviceStatus; }
    public void setServiceStatus(ServiceStatus serviceStatus) { 
        this.serviceStatus = serviceStatus; 
    }

}
