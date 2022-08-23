package com.example.demo.entity;

import java.io.Serializable;
import java.util.UUID;

public class EmployeeUserId implements Serializable{
	
	private UUID userId;
	private UUID employeeId;
	
	public EmployeeUserId() {};

    public EmployeeUserId(UUID userId, UUID employeeId) {
        this.userId = userId;
        this.employeeId = employeeId;
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
