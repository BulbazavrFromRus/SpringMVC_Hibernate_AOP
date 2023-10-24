package com.bulba.spring.mvc_hibernate_aop.entity.dao;

import com.bulba.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
