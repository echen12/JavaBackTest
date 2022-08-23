package com.example.demo.models;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.example.demo.entity.CustomerEntity;

@Entity
@Table(name = "Customer_Address")
public class CustomerAddress extends CustomerEntity{
	
	@Id
	@Type(type = "uuid-char")
	@Column(name="id")
    private UUID addressId;
	
	private String country;
	private String province;
	private String address;
	private String city;
	
	public CustomerAddress(){};
	
	public CustomerAddress(String country, String province, String address, String city, UUID uuid) {
		this.country = country;
		this.province = province;
		this.address = address;
		this.city = city;
		this.addressId = uuid;
	}
	
}
