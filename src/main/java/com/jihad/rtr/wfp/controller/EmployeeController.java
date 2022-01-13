//  Author: Mohammad Jihad Hossain
//  Create Date: 12/01/2022
//  Modify Date: 12/01/2022
//  Description: Employee controller file



package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.service.DivisionService;
import com.jihad.rtr.wfp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/",  produces = "application/json")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DivisionService divisionService;

    //Create new employee
    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok().body(this.employeeService.createEmployee(employee));
    }

    //Get all employees
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public ResponseEntity <List<Employee>> fetchAllEmployees(){
        return ResponseEntity.ok().body(this.employeeService.getAllEmployee()) ;
    }

    //One employee with id
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> getSingleEmployee(@PathVariable long id) {
        return ResponseEntity.ok().body(this.employeeService.getEmployeeById(id)) ;
    }

    //Update employee
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        employee.setId(id);
        return ResponseEntity.ok().body(this.employeeService.updateEmployee(employee));
    }

    //Delete employee
    @RequestMapping(value = "employees/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteEmployee(@PathVariable long id) {
        this.employeeService.deleteEmployee(id);
        return HttpStatus.OK;
    }
}
