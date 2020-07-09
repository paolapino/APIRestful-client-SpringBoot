package com.springboot.MongoDB.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.springboot.MongoDB.modelo.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String> {

	public Customer findByFotografia (String fotografia);
	
	
}
