package com.example.hrstop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrstop.Entity.Employee;
import com.example.hrstop.Repository.EmpRepository;

@Service
public class EmpService {
    
    @Autowired
    private EmpRepository empRepository;

    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

    public void save(Employee employee) {
        empRepository.save(employee);
    }
}
