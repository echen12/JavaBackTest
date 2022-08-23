package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.CustomerAddress;

public interface CustomerAddressRepo extends JpaRepository<CustomerAddress, UUID>{

}
