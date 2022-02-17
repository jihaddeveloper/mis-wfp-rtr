//  Author: Mohammad Jihad Hossain
//  Create Date: 14/02/2022
//  Modify Date: 14/02/2022
//  Description: Office controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Designation;
import com.jihad.rtr.wfp.model.Office;
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

    //Create new office
    @RequestMapping(value = "/offices", method = RequestMethod.POST)
    public ResponseEntity<Office> createNewOffice(@RequestBody Office office) {
        return ResponseEntity.ok().body(this.officeService.createOffice(office));
    }

    //Get all office
    @RequestMapping(value = "/offices", method = RequestMethod.GET)
    public ResponseEntity <List<Office>> fetchAllOffices(){
        return ResponseEntity.ok().body(officeService.getAllOffices()) ;
    }

    //Get office with id
    @RequestMapping(value = "/offices/{id}", method = RequestMethod.GET)
    public ResponseEntity<Office> getOfficeByID(@PathVariable long id) {
        return ResponseEntity.ok().body(officeService.getOfficeById(id)) ;
    }

    //Update office
    @RequestMapping(value = "/offices/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Office> updateOffice(@PathVariable long id, @RequestBody Office office) {
        office.setId(id);
        return ResponseEntity.ok().body(officeService.updateOffice(office));
    }

    //Delete office
    @RequestMapping(value = "/offices/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteOffice(@PathVariable long id) {
        this.officeService.deleteOffice(id);
        return HttpStatus.OK;
    }
}
