package com.example.hrstop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrstop.Entity.Employee;
import com.example.hrstop.Service.EmpService;

@RestController
public class EmpController {
    
    @Autowired
    public EmpService empService;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployeeList() {
        return empService.getAllEmployees();
    }

    @PostMapping("/save")
    public void saveEmployee(@RequestBody Employee employee) {
        empService.save(employee);
    }
}
