package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CustomerBaseId;
import com.example.demo.models.CustomerBase;
import com.example.demo.models.EmployeeUser;


public interface EmployeeUserRepo extends JpaRepository<EmployeeUser, UUID>{

}
