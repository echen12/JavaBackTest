package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.EmployeeAddress;

public interface EmployeeAddressRepo extends JpaRepository<EmployeeAddress, UUID>{

}
