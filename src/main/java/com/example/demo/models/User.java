package com.example.demo.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;


@Entity
public class User{
	
	@Id
	@Type(type = "uuid-char")
	@Column(name="id")
    private UUID id = UUID.randomUUID();
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	
	public UUID getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
}
