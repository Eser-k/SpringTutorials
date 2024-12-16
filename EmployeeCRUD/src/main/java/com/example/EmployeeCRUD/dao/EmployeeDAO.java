package com.example.EmployeeCRUD.dao;

import com.example.EmployeeCRUD.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
