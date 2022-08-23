package com.example.demo.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class FixedBy {
	
	@Id
	@Type(type = "uuid-char")
    private UUID id = UUID.randomUUID();
	
	private String vin;
	private String customerId;
	private String employeeId;
	private String issueId;
	
	public String getVin() {
		return vin;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getIssueId() {
		return issueId;
	}
}
