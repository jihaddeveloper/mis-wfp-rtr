//  Author: Mohammad Jihad Hossain
//  Create Date: 14/02/2022
//  Modify Date: 14/02/2022
//  Description: Division controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Designation;
import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/",  produces = "application/json")
public class DesignationController {

    @Autowired
    private DesignationService designationService;

    //Create new designation
    @RequestMapping(value = "/designations", method = RequestMethod.POST)
    public ResponseEntity<Designation> createNewDesignation(@RequestBody Designation designation) {
        return ResponseEntity.ok().body(this.designationService.createDesignation(designation));
    }

    //Get all designations
    @RequestMapping(value = "/designations", method = RequestMethod.GET)
    public ResponseEntity <List<Designation>> fetchAllDivisions(){
        return ResponseEntity.ok().body(designationService.getAllDesignations()) ;
    }

    //Get designation with id
    @RequestMapping(value = "/designations/{id}", method = RequestMethod.GET)
    public ResponseEntity<Designation> getDesignationByID(@PathVariable long id) {
        return ResponseEntity.ok().body(designationService.getDesignationById(id)) ;
    }

    //Update designation
    @RequestMapping(value = "/designations/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Designation> updateDesignation(@PathVariable long id, @RequestBody Designation designation) {
        designation.setId(id);
        return ResponseEntity.ok().body(designationService.updateDesignation(designation));
    }

    //Delete designation
    @RequestMapping(value = "/designations/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteDesignation(@PathVariable long id) {
        this.designationService.deleteDesignation(id);
        return HttpStatus.OK;
    }
}
