package com.example.demo.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class EmployeeTimeOff {
	
	@Id
	@Type(type = "uuid-char")
	private UUID id;
	
	private String duration;
	private String reason;
	private Boolean isOff;
	
	public UUID getId() {
		return id;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public String getReason() {
		return reason;
	}
	
	public Boolean getIsOff() {
		return isOff;
	}
}
