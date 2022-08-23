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
@Table(name="customer")
public class Customer extends CustomerEntity{
	
	@Id
	@Type(type = "uuid-char")
	@Column(name="id")
    private UUID id = UUID.randomUUID();
	
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	
	public Customer(){};
	
	public Customer(String firstName, String lastName, int age, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
	}
	
	public UUID getId() {
		return id;
	}
	
	
}
