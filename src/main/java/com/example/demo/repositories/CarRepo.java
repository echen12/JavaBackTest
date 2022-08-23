package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Car;

public interface CarRepo extends JpaRepository<Car, String>{

}
