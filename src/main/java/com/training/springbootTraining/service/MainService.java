package com.training.springbootTraining.service;

import com.training.springbootTraining.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainService {
    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theInt);
}
