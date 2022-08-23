package com.example.demo.entity;

import java.io.Serializable;
import java.util.UUID;

public class CarIssueId implements Serializable{
	private UUID issueId;
    private String vin;

    // default constructor
    
    public CarIssueId() {};

    public CarIssueId(String vin, UUID issueId) {
    	this.vin = vin;
    	this.issueId = issueId;
    }
    
    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
