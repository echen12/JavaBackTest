package com.example.demo.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.hibernate.annotations.Type;

import com.example.demo.entity.CarIssueId;

@Entity
@IdClass(CarIssueId.class)
public class CarIssue {
	
	@Id
	@Type(type = "uuid-char")
    private UUID issueId;

    @Id
    private String vin;
    
    public CarIssue() {};
    
    public CarIssue(String vin, UUID issueId) {
    	this.issueId = issueId;
    	this.vin = vin;
    }
	
}
