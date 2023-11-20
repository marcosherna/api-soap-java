 
package com.api.springboot.soap.interfaces.clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id"
})
@XmlRootElement(name = "deleteClientRequest")
public class DeleteClientRequest {

    protected int id;
    public int getId() { return this.id; }
    public void setId(int id) { 
        this.id = id; 
    }

}
