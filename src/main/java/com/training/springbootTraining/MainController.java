package com.training.springbootTraining;

import com.training.springbootTraining.entity.Employee;
import com.training.springbootTraining.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private MainService mainService;

    @Autowired
    public MainController(MainService theService) {
        mainService = theService;
    }

//     to get all employees from table
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return mainService.findAll();
    }

//    // to get an employee from table using an Id
    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId) {

        Employee theEmployee = mainService.findById(employeeId);
        if(theEmployee == null) {
            throw new RuntimeException("Employee id is not found" + employeeId);
        }
        return theEmployee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        mainService.save(theEmployee);
        return theEmployee;
    }
}
