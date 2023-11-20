 
package com.api.springboot.soap.interfaces.clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientInfo"
})
@XmlRootElement(name = "updateClientRequest")
public class UpdateClientRequest {

    @XmlElement(required = true)
    protected ClientInfo clientInfo; 

    public ClientInfo getClientInfo() { return clientInfo; }  
    public void setEmployeeInfo(EmployeeInfo value) {
        this.employeeInfo = value;
    }

}
