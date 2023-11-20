 
package com.api.springboot.soap.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceStatus", propOrder = {
    "status",
    "message"
})
public class ServiceStatus {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String message;

     
    public String getStatus() {  return status; } 
    public void setStatus(String value) {
        this.status = value;
    } 

    public String getMessage() { return message; } 
    public void setMessage(String value) {
        this.message = value;
    }

}
