package com.example.demo.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Issue {
	
	@Id
	@Type(type = "uuid-char")
    private UUID id = UUID.randomUUID();
	
	private UUID fixedBy;
	private String issueDescription;
	private String issueResolution;
	private String amountBilled;
	private String isFixed;
	
	public UUID getFixedBy() {
		return fixedBy;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getIssueDescription() {
		return issueDescription;
	}
	
	public String getAmountBilled() {
		return amountBilled;
	}
	
	public String getIsFixed() {
		return isFixed;
	}
	
	public String getIssueResolution() {
		return issueResolution;
	}
	
}
