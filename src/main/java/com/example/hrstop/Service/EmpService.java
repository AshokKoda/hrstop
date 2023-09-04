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

    public Employee update(Employee employee) {
        Employee emp = empRepository.findById(employee.getEmp_id()).orElse(null);
        emp.setEmp_name(employee.getEmp_name());
        emp.setEmp_email(employee.getEmp_email());
        return empRepository.save(emp);
    }

    public String delete(int emp_id) {
        empRepository.deleteById(emp_id);
        return "Employee is deleted " + emp_id;
    }
}
