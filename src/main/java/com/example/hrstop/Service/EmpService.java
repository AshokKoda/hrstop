package com.example.hrstop.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.hrstop.Entity.Employee;
import com.example.hrstop.Repository.EmpRepository;

@Service
public class EmpService {
    
    @Autowired
    private EmpRepository empRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

    public void save(Employee employee) {
        String currenrDate = new SimpleDateFormat("yy-MM-dd", Locale.getDefault()).format(new Date());
        String[] dateParts = currenrDate.split("-");
        String year = dateParts[0];
        String month = dateParts[1];
        String day = dateParts[2];

        int random = (int) Math.floor(Math.random() * (100 - 10 + 1) + 10);

        String empCode = year + month + day + random;
        employee.setEmp_code(empCode);

        encodePassword(employee);
        empRepository.save(employee);
    }

    public Employee update(Employee employee) {
        Employee emp = empRepository.findById(employee.getEmp_id()).orElse(null);
        emp.setEmp_name(employee.getEmp_name());
        emp.setEmp_email(employee.getEmp_email());
        emp.setEmp_password(employee.getEmp_password());
        encodePassword(emp);
        return empRepository.save(emp);
    }

    public String delete(int emp_id) {
        empRepository.deleteById(emp_id);
        return "Employee is deleted " + emp_id;
    }

    public Employee getEmpById(int emp_id) {
        return empRepository.findById(emp_id).get();
    }

    public void encodePassword(Employee password) {
        String encoded = passwordEncoder.encode(password.getEmp_password());
        password.setEmp_password(encoded);
    }
}
