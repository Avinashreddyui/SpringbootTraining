package com.training.springbootTraining.dao;

import com.training.springbootTraining.dao.EmployeeDAO;
import com.training.springbootTraining.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    //define field for entity manager
    private EntityManager entityManager;

    // set up constructor
    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);
        //create a query
//        String hql = "SELECT count FROM EmployeeDetails";

        Query<Employee> theQuery = currentSession.createQuery("from employeedetails", Employee.class);
        //execute query and get result List
        List<Employee> employees  = theQuery.getResultList();
        System.out.println(employees);
        return employees;
    }
}
