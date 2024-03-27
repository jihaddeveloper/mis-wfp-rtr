//  Author: Mohammad Jihad Hossain
//  Create Date: 25/01/2024
//  Modify Date: 25/01/2024
//  Description: DISchool controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.DISchool;
import com.jihad.rtr.wfp.model.School;
import com.jihad.rtr.wfp.service.DISchoolService;
import com.jihad.rtr.wfp.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class DISchoolController {

    @Autowired
    private DISchoolService diSchoolService;


    //Create new DISchool
    @RequestMapping(value = "/di-school", method = RequestMethod.POST)
    public ResponseEntity<DISchool> createDISchool(@RequestBody DISchool diSchool) {
        return ResponseEntity.ok().body(this.diSchoolService.createDISchool(diSchool));
    }

    //Get all DISchool
    @RequestMapping(value = "/di-school", method = RequestMethod.GET)
    public ResponseEntity<List<DISchool>> fetchAllDISchool() {
        return ResponseEntity.ok().body(this.diSchoolService.getAllDISchool());
    }

    //One DISchool with id
    @RequestMapping(value = "/di-school/{id}", method = RequestMethod.GET)
    public ResponseEntity<DISchool> getSingleSchool(@PathVariable long id) {
        return ResponseEntity.ok().body(this.diSchoolService.getDISchoolById(id));
    }

    //Update DISchool
    @RequestMapping(value = "/di-school/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DISchool> updateDISchool(@PathVariable long id, @RequestBody DISchool diSchool) {
        diSchool.setId(id);
        return ResponseEntity.ok().body(this.diSchoolService.updateDISchool(diSchool));
    }

    //Delete DISchool
    @RequestMapping(value = "/di-school/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteDISchool(@PathVariable long id) {
        this.diSchoolService.deleteDISchool(id);
        return HttpStatus.OK;
    }
}
