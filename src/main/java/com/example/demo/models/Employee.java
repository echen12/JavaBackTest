package com.example.demo.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import com.example.demo.entity.CustomerEntity;

@Entity
public class Employee extends CustomerEntity{
	
	@Id
	@Type(type = "uuid-char")
    private UUID id = UUID.randomUUID();
	
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String hireDate;
	private String address;
	private String city;
	private String country;
	private String province;
	
	public UUID getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getHireDate() {
		return hireDate;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getProvince() {
		return province;
	}

}
