package com.api.springboot.soap.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.springboot.soap.entities.Client;
import com.api.springboot.soap.repo.ClientRepository;
import com.api.springboot.soap.service.IClientService;

@Service
public class ClientService implements IClientService {

	 @Autowired
	 ClientRepository clienteRepository;
	
	
	@Override
	public  Client getClientById(int clientId) { 
		Client obj = clienteRepository.findByEmployeeId(clientId);
		return obj; 
	}

	@Override
	public  void AddClient(Client client);  {
		clienteRepository.save(client);
	}

	@Override
	public void updateClient(Client client) {
		clienteRepository.save(client); 
	}

	@Override
	public void deleteClient(int clientId) {
		clienteRepository.deleteById(clientId);

	}
	
}
