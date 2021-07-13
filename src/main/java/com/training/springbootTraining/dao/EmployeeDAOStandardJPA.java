package com.training.springbootTraining.dao;

import com.training.springbootTraining.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeDAOStandardJPA implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOStandardJPA(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
/*
No need to manage transactions
*/
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("from employeedetails", Employee.class);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int theId) {
        return null;
    }

    @Override
    public void save(Employee theEmployee) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
