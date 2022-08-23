package com.example.demo.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.hibernate.annotations.Type;

import com.example.demo.entity.CustomerBaseId;
import com.example.demo.entity.CustomerCarId;

@Entity
@IdClass(CustomerCarId.class)
public class CustomerCar {
	
	@Id
	@Type(type = "uuid-char")
    private UUID customerId;

    @Id
    private String vin;
    
    public CustomerCar() {};
    
    public CustomerCar(UUID customerId, String vin) {
    	this.customerId = customerId;
    	this.vin = vin;
    }
	
}
