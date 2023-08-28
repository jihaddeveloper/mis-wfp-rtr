//  Author: Mohammad Jihad Hossain
//  Create Date: 13/01/2022
//  Modify Date: 13/01/2022
//  Description: School controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.School;
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
public class SchoolController {

    @Autowired
    private SchoolService schoolService;


    //Create new school
    @RequestMapping(value = "/schools", method = RequestMethod.POST)
    public ResponseEntity<School> createSchool(@RequestBody School school) {
        return ResponseEntity.ok().body(this.schoolService.createSchool(school));
    }

    //Get all school
    @RequestMapping(value = "/schools", method = RequestMethod.GET)
    public ResponseEntity<List<School>> fetchAllSchools() {
        return ResponseEntity.ok().body(this.schoolService.getAllSchool());
    }

    //One school with id
    @RequestMapping(value = "/schools/{id}", method = RequestMethod.GET)
    public ResponseEntity<School> getSingleSchool(@PathVariable long id) {
        return ResponseEntity.ok().body(this.schoolService.getSchoolById(id));
    }

    //Update school
    @RequestMapping(value = "/schools/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<School> updateSchool(@PathVariable long id, @RequestBody School school) {
        school.setId(id);
        return ResponseEntity.ok().body(this.schoolService.updateSchool(school));
    }

    //Delete school
    @RequestMapping(value = "/schools/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteSchool(@PathVariable long id) {
        this.schoolService.deleteSchool(id);
        return HttpStatus.OK;
    }
}
