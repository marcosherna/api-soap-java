package com.api.springboot.soap.application;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.vkakarla.springboot.soap.entities.Client; 
import com.vkakarla.springboot.soap.serviceImpl.ClientService;
import com.vkakarla.springboot.soap.interfaces.clients.*;

@Endpoint
public class ClientEndpoint {

	private static final String NAMESPACE_URI = "http://interfaces.soap.springboot.vkakarla.com";

	@Autowired
	private ClientService clientService;


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addClientRequest")
	@ResponsePayload
	public AddClientResponse addEmployee(@RequestPayload AddClientRequest request) {
		AddClientResponse response = new AddClientResponse();
		ServiceStatus serviceStatus = new ServiceStatus();

		Client client = new Client();
		BeanUtils.copyProperties(request.getClientInfo(), client);

		clientService.AddClient(client);

		serviceStatus.setStatus("SUCCESS");
 	    serviceStatus.setMessage("Content Added Successfully");

		response.setServiceStatus(serviceStatus);
		return response;
	}

	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClientByIdRequest")
	@ResponsePayload
	public GetClientResponse getClient(@RequestPayload GetClientByIdRequest request) {

		GetClientResponse response = new GetClientResponse();
		ClientInfo clientInfo = new ClientInfo();

		BeanUtils.copyProperties(clientService.getClientById(request.getId()), clientInfo);
		response.setClientInfo(clientInfo);
        
		return response;
	}


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateClientRequest")
	@ResponsePayload
	public UpdateClientResponse updateClient(@RequestPayload UpdateClientRequest request) {

		Client client = new Client();
		BeanUtils.copyProperties(request.getEmployeeInfo(), client);
		clientService.updateEmployee(client);

		ServiceStatus serviceStatus = new ServiceStatus();
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Content Updated Successfully");

		UpdateClientResponse response = new UpdateClientResponse();
		response.setServiceStatus(serviceStatus); 
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteClientRequest")
	@ResponsePayload
	public DeleteClientResponse deleteClient(@RequestPayload DeleteClientRequest request) {
		clientService.deleteClient(request.getId());
		ServiceStatus serviceStatus = new ServiceStatus();

		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Content Deleted Successfully");

		DeleteClientResponse response = new DeleteClientResponse();
		response.setServiceStatus(serviceStatus); 
		return response;
	}

}
