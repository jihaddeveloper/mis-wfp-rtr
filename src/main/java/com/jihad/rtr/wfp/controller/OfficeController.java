//  Author: Mohammad Jihad Hossain
//  Create Date: 14/02/2022
//  Modify Date: 14/02/2022
//  Description: Office controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Designation;
import com.jihad.rtr.wfp.service.DesignationService;
import com.jihad.rtr.wfp.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/",  produces = "application/json")
public class OfficeController {

    @Autowired
    private DesignationService designationService;


    @Autowired
    private OfficeService officeService;

    //Create new designation
    @RequestMapping(value = "/offices", method = RequestMethod.POST)
    public ResponseEntity<Designation> createNewDesignation(@RequestBody Designation designation) {
        return ResponseEntity.ok().body(this.designationService.createDesignation(designation));
    }

    //Get all designations
    @RequestMapping(value = "/offices", method = RequestMethod.GET)
    public ResponseEntity <List<Designation>> fetchAllDivisions(){
        return ResponseEntity.ok().body(designationService.getAllDesignations()) ;
    }

    //Get designation with id
    @RequestMapping(value = "/offices/{id}", method = RequestMethod.GET)
    public ResponseEntity<Designation> getDesignationByID(@PathVariable long id) {
        return ResponseEntity.ok().body(designationService.getDesignationById(id)) ;
    }

    //Update designation
    @RequestMapping(value = "/offices/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Designation> updateDesignation(@PathVariable long id, @RequestBody Designation designation) {
        designation.setId(id);
        return ResponseEntity.ok().body(designationService.updateDesignation(designation));
    }

    //Delete designation
    @RequestMapping(value = "/offices/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteDesignation(@PathVariable long id) {
        this.designationService.deleteDesignation(id);
        return HttpStatus.OK;
    }
}
