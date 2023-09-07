package com.example.hrstop.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrstop.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {
    
    Optional<Employee> findByUsername(String emp_name);

    Boolean existsByUsername(String emp_name);

    Boolean existsByEmail(String emp_email);
}
