package com.api.springboot.soap.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.springboot.soap.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, int>{ 
	Client findByClienteId(int clientId); 
}
