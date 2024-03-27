//  Author: Mohammad Jihad Hossain
//  Create Date: 06/03/2024
//  Modify Date: 06/03/2024
//  Description: DIEmployee controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.DIEmployee;
import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.service.DIEmployeeService;
import com.jihad.rtr.wfp.service.DivisionService;
import com.jihad.rtr.wfp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class DIEmployeeController {

    @Autowired
    private DIEmployeeService diEmployeeService;


    //Create new DIEmployee
    @RequestMapping(value = "/di-employee", method = RequestMethod.POST)
    public ResponseEntity<DIEmployee> createDIEmployee(@RequestBody DIEmployee employee) {
        return ResponseEntity.ok().body(this.diEmployeeService.createDIEmployee(employee));
    }

    //Get all DIEmployee
    @RequestMapping(value = "/di-employee", method = RequestMethod.GET)
    public ResponseEntity<List<DIEmployee>> fetchAllDIEmployee() {
        return ResponseEntity.ok().body(this.diEmployeeService.getAllDIEmployee());
    }

    //One DIEmployee with id
    @RequestMapping(value = "/di-employee/{id}", method = RequestMethod.GET)
    public ResponseEntity<DIEmployee> getSingleDIEmployee(@PathVariable long id) {
        return ResponseEntity.ok().body(this.diEmployeeService.getDIEmployeeById(id));
    }

    //Update DIEmployee
    @RequestMapping(value = "/di-employee/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DIEmployee> updateDIEmployee(@PathVariable long id, @RequestBody DIEmployee employee) {
        employee.setId(id);
        return ResponseEntity.ok().body(this.diEmployeeService.updateDIEmployee(employee));
    }

    //Delete DIEmployee
    @RequestMapping(value = "/di-employee/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteEmployee(@PathVariable long id) {
        this.diEmployeeService.deleteDIEmployee(id);
        return HttpStatus.OK;
    }
}
