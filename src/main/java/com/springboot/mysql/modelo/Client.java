package com.springboot.mysql.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(
		name = "client",
		indexes= {@Index(name="age_index", columnList="age")}
)
public class Client {
	@Id
	private long ide_number;
	
	@Column(name="ide_type", length=50)
	private String ide_type;
	
	@Column(name="name", length=50)
	private String name;
	
	@Column(name="surname", length=50)
	private String surname;
	
	@Column(name="age", length=10)
	private Integer age;
	
	@Column(name="city_birth", length=50)
	private String city_birth;
	
	@Column(name="id_fotografia", length=50)
	private String id_fotografia;

	public long getIde_number() {
		return ide_number;
	}
	public void setIde_number(long ide_number) {
		this.ide_number = ide_number;
	}
	public String getIde_type() {
		return ide_type;
	}
	public void setIde_type(String ide_type) {
		this.ide_type = ide_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity_birth() {
		return city_birth;
	}
	public void setCity_birth(String city_birth) {
		this.city_birth = city_birth;
	}

	public String getId_fotografia() {
		return id_fotografia;
	}
	public void setId_fotografia(String id_fotografia) {
		this.id_fotografia = id_fotografia;
	}

	

}
