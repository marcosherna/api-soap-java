 

package com.api.springboot.soap.interfaces;

import javax.xml.bind.annotation.XmlRegistry;

import com.vkakarla.springboot.soap.interfaces.clients.*;

 
@XmlRegistry
public class ObjectFactory {

 
    public ObjectFactory() {
    }
 
    public AddClientRequest createAddClientRequest() {
        return new AddClientRequest();
    }
 
    public ClientInfo createClientInfo() {
        return new ClientInfo();
    } 

    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }
 
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }
 
    public GetClientByIdRequest createGetClientByIdRequest() {
        return new GetClientByIdRequest();
    }

     
    public DeleteClientRequest createDeleteClientRequest() {
        return new DeleteClientRequest();
    }

     
    public AddClientResponse createAddClientResponse() {
        return new AddClientResponse();
    }

     
    public UpdateClientRequest createUpdateClientRequest() {
        return new UpdateClientRequest();
    }
 
    public UpdateClientResponse createUpdateClientResponse() {
        return new UpdateClientResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetClientResponse createGetClientResponse() {
        return new GetClientResponse();
    }

}
