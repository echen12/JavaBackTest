package com.example.demo.entity;

import java.io.Serializable;
import java.util.UUID;

public class CustomerBaseId implements Serializable{
	private UUID userId;
    private UUID customerId;

    // default constructor
    
    public CustomerBaseId() {};

    public CustomerBaseId(UUID userId, UUID customerId) {
        this.userId = userId;
        this.customerId = customerId;
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
