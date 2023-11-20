package com.api.springboot.soap.service;

import com.api.springboot.soap.entities.Client;

public interface IClientService { 
	void AddClient(Client client); 
	Client getClientById(int clientId); 
     void updateClient(Client client); 
     void deleteClient(int clientId);
}
