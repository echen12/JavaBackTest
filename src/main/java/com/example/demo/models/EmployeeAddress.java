package com.example.demo.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import com.example.demo.entity.CustomerEntity;

@Entity
public class EmployeeAddress extends CustomerEntity{
	
	@Id
	@Type(type = "uuid-char")
    private UUID id;
	
	private String country;
	private String state;
	private String province;
	private String address;
	private String city;
	
	public EmployeeAddress() {};
	
	public EmployeeAddress(String country, String state, String province, String address, String city, UUID id) {
		this.country = country;
		this.state = state;
		this.province = province;
		this.address = address;
		this.city = city;
		this.id = id;
	}
	
//	public String getCountry() {
//		return country;
//	}
//	
//	public String getState() {
//		return state;
//	}
//	
//	public String getProvince() {
//		return province;
//	}
//	
//	public String getAddress() {
//		return address;
//	}
//	
//	public String getCity() {
//		return city;
//	}
}
