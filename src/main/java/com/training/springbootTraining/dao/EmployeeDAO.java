package com.training.springbootTraining.dao;

import com.training.springbootTraining.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
