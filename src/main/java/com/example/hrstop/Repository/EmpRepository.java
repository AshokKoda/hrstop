package com.example.hrstop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrstop.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {
    
}
