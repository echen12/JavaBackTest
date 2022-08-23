package com.example.demo.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.hibernate.annotations.Type;

import com.example.demo.entity.CustomerBaseId;

@Entity
@IdClass(CustomerBaseId.class)
public class CustomerBase {
	
	@Id
	@Type(type = "uuid-char")
    private UUID userId;

    @Id
    @Type(type = "uuid-char")
    private UUID customerId;
    
    public CustomerBase() {};
    
    public CustomerBase(UUID userId, UUID customerId) {
    	this.userId = userId;
    	this.customerId = customerId;
    }
	
}

