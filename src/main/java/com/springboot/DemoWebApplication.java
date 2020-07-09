package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import com.springboot.MongoDB.modelo.Customer;
import com.springboot.MongoDB.repository.CustomerRepository;

@SpringBootApplication
public class DemoWebApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
		
	}
	public void run(String... args) throws Exception {
		//repository.save(new Customer("123456", "Fotografia"));
	}
}

/*import org.springframework.data.repository.CrudRepository;*/
 