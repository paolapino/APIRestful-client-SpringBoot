package com.springboot.mysql.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.mysql.modelo.Client;


public interface IpersonaRepo extends JpaRepository<Client, Long> {
	
	@Query(value="select * from Client where age >= :age", nativeQuery = true)
	public List<Client> findByEdad(Integer age);
	
	
	@Query(value="select * from Client where ide_number = :ide_number and ide_type= :ide_type", nativeQuery = true)
	public Optional<Client> findByIdAndType(long ide_number, String ide_type);
	
	@Query(value="select id_fotografia from Client where ide_number = :ide_number and ide_type= :ide_type", nativeQuery = true)
	public String findByIdFotografia(long ide_number, String ide_type);
	
	
}