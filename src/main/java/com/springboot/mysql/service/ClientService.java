package com.springboot.mysql.service;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.springboot.mysql.modelo.Client;

public interface ClientService {
	
    public List<Client> findAll();
	
	public Optional<Client> findById(Long id);
	
	public void save(Client person);
	
	public Client update(Client person, Long id);
	
	public Client updateByIdType(Client person, Long id, String type);
	
	public ResponseEntity<Client> deleteById(Long id);

	public ResponseEntity<Client> deleteByIdType(Long id, String type);

}
