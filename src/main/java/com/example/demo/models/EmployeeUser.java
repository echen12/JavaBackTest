package com.example.demo.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.hibernate.annotations.Type;

import com.example.demo.entity.EmployeeUserId;

@Entity
@IdClass(EmployeeUserId.class)
public class EmployeeUser {
	
	@Id
	@Type(type = "uuid-char")
    private UUID userId;

    @Id
    @Type(type = "uuid-char")
    private UUID employeeId;
    
    public EmployeeUser() {};
    
    public EmployeeUser(UUID employeeId, UUID userId) {
    	this.employeeId = employeeId;
    	this.userId = userId;
    }
	
}
