package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	private String vin;

	private String licensePlate;
	private String make;
	private String model;
	private String year;
	private String color;
	private String mileage;
	private String energyType;

	public Car() {
	};

	public Car(String vin, String licensePlate, String make, String model, String year, String color, String mileage, String energyType) {
		this.vin = vin;
		this.licensePlate = licensePlate;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.mileage = mileage;
		this.energyType = energyType;
	}
	
	public String getVin() {
		return vin;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMileage() {
		return mileage;
	}
	
	public String getEnergyType() {
		return energyType;
	}

}
