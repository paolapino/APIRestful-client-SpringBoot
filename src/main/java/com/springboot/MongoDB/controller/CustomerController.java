package com.springboot.MongoDB.controller;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.MongoDB.modelo.Customer;
import com.springboot.MongoDB.repository.CustomerRepository;
import com.springboot.MongoDB.service.CustomerService;
import com.springboot.mysql.repository.IpersonaRepo;
import com.springboot.mysql.service.ClientService;

/*
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
*/
public class CustomerController {
	/*
	@Autowired
	private ClientService cs;
	
	@Autowired
	private CustomerRepository rmongo;
	
	@Autowired
	private IpersonaRepo re;
	

	@Autowired
	private CustomerService csi;
	
	*/
	
	//Con esto probe que me estuviera guardando datos en la bd
	
	/* @Autowired
	  private CustomerRepository repository;
	 
	 @GetMapping("/greeting")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			
			//Esta logica se encapsula en una paquete que se llama servise
			Customer p= new Customer();
			p.setId("123");
			p.setFotografia("paola");
			repository.save(p);
			model.addAttribute("name", name);
			return "greeting";
		}
	 
	 @GetMapping("/listar")
		public String greeting (Model model) {
			model.addAttribute("personas", repository.findAll());
		    return "greeting";	
		}*/
	
	//Base de datos Mongo DB
	
		/*
		@PostMapping("/client/mongo")
		public void insertarMongoDB (@RequestParam ("file") MultipartFile file) throws IOException {
			//String destFile2 = new File(".").getCanonicalPath() + File.separator + file.getOriginalFilename();
			//String filePath = System.getProperty("java.io.tmpdir") + "/" + file.getOriginalFilename();
			//String filePath = System.getProperty("java.io.tmpdir")  + file.getOriginalFilename();
			File dir = new File(file.getOriginalFilename());
			String valor= dir.getAbsolutePath();
			Customer cus= new Customer();
			cus.setFotografia(ConvertBase64mongo(valor));
			rmongo.save(cus);
		}
		public String ConvertBase64mongo(String inputFilePath) throws IOException {
		    //String inputFilePath = "C:\\Users\\paola.pino\\Desktop\\Perfil.png";
			//C:\\Users\\paola.pino\\Pictures\\Limpiar.jpg 
			 File inputFile = new File(inputFilePath);
			// System.out.println("La ruta del fichero dentro de la funcion: " + inputFile.getAbsolutePath());
			 byte[] fileContent = FileUtils.readFileToByteArray( inputFile);
			 String encodedString = Base64.getEncoder().encodeToString(fileContent);
			 return encodedString;
		}
		
		@GetMapping("/clients/mongo")
		public List <Customer> findAllCustomer(){
			return rmongo.findAll();
		}
		*/
}
