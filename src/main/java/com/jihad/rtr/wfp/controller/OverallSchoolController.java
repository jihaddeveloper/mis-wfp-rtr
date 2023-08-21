//  Author: Mohammad Jihad Hossain
//  Create Date: 15/11/2022
//  Modify Date: 10/01/2023
//  Description: OverallSchool controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.OverallSchool;
import com.jihad.rtr.wfp.service.BanglaClassService;
import com.jihad.rtr.wfp.service.OverallSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class OverallSchoolController {

    @Autowired
    private OverallSchoolService overallSchoolService;

    //Create new OverallSchool
    @RequestMapping(value = "/overall-school", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OverallSchool> createOverallSchool(@RequestBody OverallSchool overallSchool) {
        return ResponseEntity.ok().body(this.overallSchoolService.createOverallSchool(overallSchool));
    }

    //Get all OverallSchool
    @RequestMapping(value = "/overall-school", method = RequestMethod.GET)
    public ResponseEntity<List<OverallSchool>> fetchAllOverallSchool() {
        return ResponseEntity.ok().body(this.overallSchoolService.getAllOverallSchool());
    }

    //One OverallSchool with id
    @RequestMapping(value = "/overall-school/{id}", method = RequestMethod.GET)
    public ResponseEntity<OverallSchool> getSingleOverallSchool(@PathVariable long id) {
        return ResponseEntity.ok().body(this.overallSchoolService.getOverallSchoolById(id));
    }

    //Update OverallSchool
    @RequestMapping(value = "/overall-school/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OverallSchool> updateOverallSchool(@PathVariable long id, @RequestBody OverallSchool overallSchool) {
        overallSchool.setId(id);
        return ResponseEntity.ok().body(this.overallSchoolService.updateOverallSchool(overallSchool));
    }

    //Delete OverallSchool
    @RequestMapping(value = "overall-school/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteOverallSchool(@PathVariable long id) {
        this.overallSchoolService.deleteOverallSchool(id);
        return HttpStatus.OK;
    }
}
