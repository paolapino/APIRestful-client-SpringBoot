package com.springboot.mysql.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.MongoDB.modelo.Customer;
import com.springboot.MongoDB.repository.CustomerRepository;
import com.springboot.MongoDB.service.CustomerService;
import com.springboot.mysql.modelo.Client;
import com.springboot.mysql.repository.IpersonaRepo;
import com.springboot.mysql.service.ClientService;

/*
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
*/
public class ClientController {
	/*
	@Autowired
	private ClientService cs;
	
	@Autowired
	private CustomerRepository rmongo;
	
	@Autowired
	private IpersonaRepo re;
	

	@Autowired
	private CustomerService csi;
	
	//Métodos CRUD MYSQL
	
	
	@GetMapping("/clients")
	public List <Client> findAll(){
		return cs.findAll();
	}
	
	@GetMapping("/client/{id}")
	public Optional<Client> getPerson(@PathVariable("id") Long id){
		return cs.findById(id);	
	}
	
	@GetMapping("/client/{ide_number}/{ide_type}")
	public Optional<Client> getPersonIdType(@PathVariable("ide_number") Long ide_number, @PathVariable("ide_type") String ide_type ){
		return re.findByIdAndType(ide_number, ide_type);
		
	}
	
	@GetMapping("/client/edad/{age}")
	public List<Client> getPersonedad(@PathVariable("age") Integer age){
		return re.findByEdad(age);
		
	}
	
	@PostMapping("/client")
	public void insertar (@RequestBody Client per) {
		cs.save(per);
	}
	
	@PutMapping("/client/{id}")
	public Client modificar (@RequestBody Client client, @PathVariable ("id") Long id ) {
		return cs.update(client, id);
	}
	
	@PutMapping("/client/{id}/{type}")
	public Client modificarIdType (@RequestBody Client client, @PathVariable ("id") Long id, @PathVariable ("type") String type ) {
		return cs.updateByIdType(client, id, type);
	}
	
	
	@DeleteMapping("/client/{id}")
	public void eliminar (@PathVariable ("id") Long id)
	{
		cs.deleteById(id);
	}
	
	@DeleteMapping("/client/{ide_number}/{ide_type}")
	public void eliminar_id_tipo(@PathVariable("ide_number") Long ide_number, @PathVariable("ide_type") String ide_type ){
		cs.deleteByIdType(ide_number, ide_type);
	}
	*/
	
}
