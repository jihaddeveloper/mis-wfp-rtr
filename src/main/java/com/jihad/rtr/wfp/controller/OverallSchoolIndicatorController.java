//  Author: Mohammad Jihad Hossain
//  Create Date: 29/11/2022
//  Modify Date: 29/11/2022
//  Description: OverallSchool Indicator controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.OverallSchoolIndicator;
import com.jihad.rtr.wfp.service.BanglaIndicatorService;
import com.jihad.rtr.wfp.service.OverallSchoolIndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class OverallSchoolIndicatorController {

    @Autowired
    private OverallSchoolIndicatorService overallSchoolIndicatorService;

    //Create new OverallSchoolIndicator
    @RequestMapping(value = "/overall-indicator", method = RequestMethod.POST)
    public ResponseEntity<OverallSchoolIndicator> createOverallSchoolIndicator(@RequestBody OverallSchoolIndicator overallSchoolIndicator) {
        return ResponseEntity.ok().body(this.overallSchoolIndicatorService.createOverallSchoolIndicator(overallSchoolIndicator));
    }

    //Get all OverallSchoolIndicator
    @RequestMapping(value = "/overall-indicator", method = RequestMethod.GET)
    public ResponseEntity<List<OverallSchoolIndicator>> fetchAllOverallSchoolIndicator() {
        return ResponseEntity.ok().body(this.overallSchoolIndicatorService.getAllOverallSchoolIndicator());
    }

    //One OverallSchoolIndicator with id
    @RequestMapping(value = "/overall-indicator/{id}", method = RequestMethod.GET)
    public ResponseEntity<OverallSchoolIndicator> getSingleOverallSchoolIndicator(@PathVariable long id) {
        return ResponseEntity.ok().body(this.overallSchoolIndicatorService.getOverallSchoolIndicatorById(id));
    }

    //Update OverallSchoolIndicator
    @RequestMapping(value = "/overall-indicator/{id}", method = RequestMethod.PUT)
    public ResponseEntity<OverallSchoolIndicator> updateOverallSchoolIndicator(@PathVariable long id, @RequestBody OverallSchoolIndicator overallSchoolIndicator) {
        overallSchoolIndicator.setId(id);
        return ResponseEntity.ok().body(this.overallSchoolIndicatorService.updateOverallSchoolIndicator(overallSchoolIndicator));
    }

    //Delete OverallSchoolIndicator
    @RequestMapping(value = "/overall-indicator/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteOverallSchoolIndicator(@PathVariable long id) {
        this.overallSchoolIndicatorService.deleteOverallSchoolIndicator(id);
        return HttpStatus.OK;
    }
}
