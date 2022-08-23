package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CustomerBaseId;
import com.example.demo.models.CustomerBase;


public interface CustomerBaseRepo extends JpaRepository<CustomerBase, UUID>{

}