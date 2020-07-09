package com.springboot.MongoDB.service;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import com.springboot.MongoDB.modelo.Customer;


public interface CustomerService {
	
	    public List<Customer> findAll();
		
		public Optional<Customer> findById(String id);
		
		public void save(Customer customer);
		
		public Customer updateById(Customer customer, String id);
		
		public ResponseEntity<Customer> deleteById(String id);


}
