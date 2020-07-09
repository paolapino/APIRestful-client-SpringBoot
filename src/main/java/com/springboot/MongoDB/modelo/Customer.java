package com.springboot.MongoDB.modelo;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public String id;
	
	public String fotografia;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public Customer() {}
	
	public Customer(String id, String fotografia) {
		this.id = id;
		this.fotografia = fotografia;
	}
	
	 @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%s, fotografia='%s']",
	        id, fotografia);
	  }
	
	
}
