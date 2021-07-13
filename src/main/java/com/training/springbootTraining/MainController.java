package com.training.springbootTraining;
import com.training.springbootTraining.dao.EmployeeDAO;
import com.training.springbootTraining.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    private EmployeeDAO employeeDAO;

    @Autowired
    public MainController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @RequestMapping("/")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
