package com.springboot.mysql.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.mysql.exception.*;
import com.springboot.mysql.modelo.Client;
import com.springboot.mysql.repository.IpersonaRepo;


@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private IpersonaRepo repo;
	
	@Override
	public List<Client> findAll() {
		return this.repo.findAll();
	}

	@Override
	public Optional<Client> findById(Long id) {
		return Optional.ofNullable(repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Client not found with id :"+id)));
		
	}

	@Override
	public void save(Client person) {
		repo.save(person);
	}

	@Override
	public ResponseEntity<Client> deleteById(Long id) {
		 Client cli = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id :" + id));
		 repo.delete(cli);
		 return ResponseEntity.ok().build();	
	}

	@Override
	public Client update(Client person, Long id) {
	Client cli=repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id :" + id));
		cli.setIde_type(person.getIde_type());
		cli.setName(person.getName());
		cli.setSurname(person.getSurname());
		cli.setAge(person.getAge());
		cli.setCity_birth(person.getCity_birth());
		return repo.save(cli);
	}

	@Override
	public Client updateByIdType(Client person, Long id, String type) {
		Client cli=repo.findByIdAndType(id, type).orElseThrow(() -> new ResourceNotFoundException("Client not found with id :" + id+" and type:"+type));
		cli.setName(person.getName());
		cli.setSurname(person.getSurname());
		cli.setAge(person.getAge());
		cli.setCity_birth(person.getCity_birth());
		cli.setId_fotografia(person.getId_fotografia());
		return repo.save(cli);
	}

	@Override
	public ResponseEntity<Client> deleteByIdType(Long id, String type) {
		Client cli = repo.findByIdAndType(id, type).orElseThrow(() -> new ResourceNotFoundException("Client not found with id :" + id+" and type:"+type));
		 repo.delete(cli);
		 return ResponseEntity.ok().build();	
	}
}


