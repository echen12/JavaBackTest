package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.CarIssue;

public interface CarIssueRepo extends JpaRepository<CarIssue, String>{

}
