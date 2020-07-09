package com.springboot.MongoDB.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.springboot.MongoDB.modelo.Customer;
import com.springboot.MongoDB.repository.CustomerRepository;
import com.springboot.mysql.exception.ResourceNotFoundException;
import com.springboot.mysql.modelo.Client;


@Service
public class CustomerServiceImpl implements  CustomerService{
	
	@Autowired
	private CustomerRepository cr;
	
	@Override
	public List<Customer> findAll() {
		return cr.findAll();
	}

	@Override
	public Optional<Customer> findById(String id) {
		return Optional.ofNullable(cr.findById(id).orElseThrow(()->new ResourceNotFoundException("Client not found with id :"+id)));
		
	}

	@Override
	public void save(Customer customer) {
		cr.save(customer);
		
	}

	@Override
	public Customer updateById(Customer customer, String id) {
		Customer cus=cr.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id :" + id));
		cus.setFotografia(customer.getFotografia());
		return cr.save(cus);
	}


	@Override
	public ResponseEntity<Customer> deleteById(String id) {
		Customer cus = cr.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id :" + id));
		cr.delete(cus);
		return ResponseEntity.ok().build();	
	}

}
