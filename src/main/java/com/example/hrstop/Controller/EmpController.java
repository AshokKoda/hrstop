package com.example.hrstop.Controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrstop.Entity.Employee;
import com.example.hrstop.Service.EmpService;

@RestController
@RequestMapping("api/v1/employees")
public class EmpController {
    
    @Autowired
    public EmpService empService;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployeeList() {
        return empService.getAllEmployees();
    }

    @PostMapping("/save")
    public void saveEmployee(@RequestBody Employee employee) throws ParseException {
        empService.save(employee);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return empService.update(employee);
    }

    @DeleteMapping("/delete/{emp_id}")
    public String deleteEmployeeById(@PathVariable int emp_id) {
        return empService.delete(emp_id);
    }

    @GetMapping("/getByEmpId/{emp_id}")
    public Employee getEmpById(@PathVariable int emp_id) {
        return empService.getEmpById(emp_id);
    }
}
