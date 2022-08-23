package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.EmployeeTimeOff;

public interface EmployeeTimeOffRepo extends JpaRepository<EmployeeTimeOff, UUID>{

}
