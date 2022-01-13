//  Author: Mohammad Jihad Hossain
//  Create Date: 09/01/2022
//  Modify Date: 12/01/2022
//  Description: Division controller file

package com.jihad.rtr.wfp.controller;


import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.LibraryObservation;
import com.jihad.rtr.wfp.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/",  produces = "application/json")
public class DivisionController {

    @Autowired
    private DivisionService divisionService;

    //Create new division
    @RequestMapping(value = "/divisions", method = RequestMethod.POST)
    public ResponseEntity<Division> createDivision(@RequestBody Division division) {
        return ResponseEntity.ok().body(this.divisionService.createDivision(division));
    }

    //Get all divisions
    @RequestMapping(value = "/divisions", method = RequestMethod.GET)
    public ResponseEntity <List<Division>> fetchAllDivisions(){
        return ResponseEntity.ok().body(divisionService.getAllDivision()) ;
    }

    //One division with id
    @RequestMapping(value = "/divisions/{id}", method = RequestMethod.GET)
    public ResponseEntity<Division> getSingleDivision(@PathVariable long id) {
        return ResponseEntity.ok().body(divisionService.getDivisionById(id)) ;
    }

    //Update division
    @RequestMapping(value = "/divisions/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Division> updateDivision(@PathVariable long id, @RequestBody Division division) {
        division.setId(id);
        return ResponseEntity.ok().body(divisionService.updateDivision(division));
    }

    //Delete division
    @RequestMapping(value = "/divisions/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteDivision(@PathVariable long id) {
        this.divisionService.deleteDivision(id);
        return HttpStatus.OK;
    }
}
