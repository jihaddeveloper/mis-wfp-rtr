//  Author: Mohammad Jihad Hossain
//  Create Date: 29/09/2025
//  Modify Date: 29/09/2025
//  Description: PEmployeeController controller file

package com.jihad.rtr.wfp.controller.prevail;



import com.jihad.rtr.wfp.model.prevail.PEmployee;
import com.jihad.rtr.wfp.service.DIEmployeeService;
import com.jihad.rtr.wfp.service.prevail.PEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PEmployeeController {

    @Autowired
    private PEmployeeService pEmployeeService;


    //Create new PEmployee
    @RequestMapping(value = "/p-employee", method = RequestMethod.POST)
    public ResponseEntity<PEmployee> createPEmployee(@RequestBody PEmployee employee) {
        return ResponseEntity.ok().body(this.pEmployeeService.createPEmployee(employee));
    }

    //Get all PEmployee
    @RequestMapping(value = "/p-employee", method = RequestMethod.GET)
    public ResponseEntity<List<PEmployee>> fetchAllPEmployee() {
        return ResponseEntity.ok().body(this.pEmployeeService.getAllPEmployee());
    }

    //One PEmployee with id
    @RequestMapping(value = "/p-employee/{id}", method = RequestMethod.GET)
    public ResponseEntity<PEmployee> getSinglePEmployee(@PathVariable long id) {
        return ResponseEntity.ok().body(this.pEmployeeService.getPEmployeeById(id));
    }

    //Update PEmployee
    @RequestMapping(value = "/p-employee/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PEmployee> updatePEmployee(@PathVariable long id, @RequestBody PEmployee employee) {
        employee.setId(id);
        return ResponseEntity.ok().body(this.pEmployeeService.updatePEmployee(employee));
    }

    //Delete PEmployee
    @RequestMapping(value = "/p-employee/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteEmployee(@PathVariable long id) {
        this.pEmployeeService.deletePEmployee(id);
        return HttpStatus.OK;
    }
}
