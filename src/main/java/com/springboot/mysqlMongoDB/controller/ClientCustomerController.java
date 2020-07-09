package com.springboot.mysqlMongoDB.controller;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.MongoDB.modelo.Customer;
import com.springboot.MongoDB.repository.CustomerRepository;
import com.springboot.MongoDB.service.CustomerService;
import com.springboot.mysql.modelo.Client;
import com.springboot.mysql.repository.IpersonaRepo;
import com.springboot.mysql.service.ClientService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ClientCustomerController {
	
	@Autowired
	private ClientService cs;
	
	@Autowired
	private IpersonaRepo re;
	

	@Autowired
	private CustomerService csi;
	
	    // Métodos CRUD para MySql y MongoDB
		//String inputFilePath = "C:\\Users\\paola.pino\\Desktop\\Perfil.png";
	    //C:\\Users\\paola.pino\\Pictures\\Limpiar.jpg
	
		public String ConvertBase64( String inputFilePath) throws IOException {
			 File inputFile = new File(inputFilePath);
			 byte[] fileContent = FileUtils.readFileToByteArray( inputFile);
			 String encodedString = Base64.getEncoder().encodeToString(fileContent);
			 return encodedString;
		}
		/*
		@PostMapping("/client")
		public void insertarDatosPrimerForma (@RequestParam ("file") String file, 
				@RequestParam ("ide_number") Long ide_number, @RequestParam ("ide_type") String ide_type,
				@RequestParam ("name") String name, @RequestParam ("surname") String surname,
				@RequestParam ("age") Integer age,@RequestParam ("city_birth") String city_birth) throws IOException 
		{
				Customer cus= new Customer();
			    //cus.setFotografia(file.getOriginalFilename());
			    cus.setFotografia(ConvertBase64(file));
			    csi.save(cus);
			    Client c= new Client();
			    c.setIde_number(ide_number);
			    c.setIde_type(ide_type);
			    c.setName(name);
			    c.setSurname(surname);
			    c.setAge(age);
			    c.setCity_birth(city_birth);
			    c.setId_fotografia(cus.getId());
			    cs.save(c);  	    
		}
		*/
		@PostMapping("/client")
		public void insertarDatosSegundaForma (@RequestParam ("file") String file, 
				@RequestParam ("client") String client
				) throws IOException 
		{
				Customer cus= new Customer();
			    //cus.setFotografia(file.getOriginalFilename());
			    cus.setFotografia(ConvertBase64(file));
			    csi.save(cus);
			    ObjectMapper mapper = new ObjectMapper();
		        Client clientobject = mapper.readValue(client, Client.class);
		        clientobject.setId_fotografia(cus.getId());
			    cs.save(clientobject);  	    
		}
		/*
		@PutMapping("/client/{ide_number}/{ide_type}")
		public void ActualizarDatosPrimeraForma (
				@RequestParam ("file") String file,
				@RequestParam ("name") String name, @RequestParam ("surname") String surname,
				@RequestParam ("age") Integer age, @RequestParam ("city_birth") String city_birth,
				@PathVariable("ide_number") Long ide_number, @PathVariable("ide_type") String ide_type ) throws IOException 
		{
				Customer cus= new Customer();
			    //cus.setFotografia(file.getOriginalFilename());
			    cus.setFotografia(ConvertBase64(file));
			    String idFoto=  re.findByIdFotografia(ide_number, ide_type);
			    System.out.println("---Imprimiendo----"+idFoto);
			    csi.updateById(cus, idFoto);
			    Client c= new Client();
			    c.setName(name);
			    c.setSurname(surname);
			    c.setAge(age);
			    c.setCity_birth(city_birth);
			    c.setId_fotografia(idFoto);
			    cs.updateByIdType(c, ide_number, ide_type);  
		}
		*/
		@PutMapping("/client/{ide_number}/{ide_type}")
		public void ActualizarDatosSegundaForma (
				@RequestParam ("file") String file,
				@RequestParam ("client") String client,
				@PathVariable("ide_number") Long ide_number, @PathVariable("ide_type") String ide_type ) throws IOException 
		{
				Customer cus= new Customer();
			    //cus.setFotografia(file.getOriginalFilename());
			    cus.setFotografia(ConvertBase64(file));
			    String idFoto=  re.findByIdFotografia(ide_number, ide_type);
			    csi.updateById(cus, idFoto);
			    ObjectMapper mapper = new ObjectMapper();
		        Client clientobject = mapper.readValue(client, Client.class);
		        clientobject.setId_fotografia(idFoto);
			    cs.updateByIdType(clientobject, ide_number, ide_type);  
		}
		
		@DeleteMapping("/client/{ide_number}/{ide_type}")
		public void eliminar_id_tipo(@PathVariable("ide_number") Long ide_number, @PathVariable("ide_type") String ide_type ){
			String idFoto=  re.findByIdFotografia(ide_number, ide_type);
			csi.deleteById(idFoto);
			cs.deleteByIdType(ide_number, ide_type);
		}
		
		@GetMapping("/clients")
		public List <Client> findAll(){
			return cs.findAll();
			
		}
		@GetMapping("/client/{ide_number}/{ide_type}")
		public Optional<Client> getPersonIdType(@PathVariable("ide_number") Long ide_number, @PathVariable("ide_type") String ide_type ){
			//String idFoto=  re.findByIdFotografia(ide_number, ide_type);
			//csi.findById(idFoto);
			return re.findByIdAndType(ide_number, ide_type);	
		}
		
		@GetMapping("/client/edad/{age}")
		public List<Client> getPersonedad(@PathVariable("age") Integer age){
			return re.findByEdad(age);
			
		}
}
