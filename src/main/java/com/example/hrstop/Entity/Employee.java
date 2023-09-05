package com.example.hrstop.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int emp_id;
    @Column(name = "emp_name")
    private String emp_name;
    @Column(name = "emp_code")
    private String emp_code;
    @Column(name = "emp_email")
    private String emp_email;
    @Column(name = "emp_password")
    private String emp_password;
    @Column(name = "emp_phoneno")
    private String emp_phoneno;
    @Column(name = "emp_doj")
    private Date emp_doj;
}
