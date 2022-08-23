package com.example.demo.entity;

import java.io.Serializable;
import java.util.UUID;

public class CustomerCarId implements Serializable{
	private UUID customerId;
    private String vin;

    // default constructor
    
    public CustomerCarId() {};

    public CustomerCarId(UUID customerId, String vin) {
        this.customerId = customerId;
        this.vin = vin;
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
