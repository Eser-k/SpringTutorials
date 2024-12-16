package com.example.EmployeeCRUD.dao;

import com.example.EmployeeCRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
