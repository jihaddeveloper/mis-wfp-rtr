//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 29/11/2022
//  Description: SRM Indicator controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.SRMIndicator;
import com.jihad.rtr.wfp.service.BanglaIndicatorService;
import com.jihad.rtr.wfp.service.SRMIndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class SRMIndicatorController {


    @Autowired
    private SRMIndicatorService srmIndicatorService;

    //Create new SRMIndicator
    @RequestMapping(value = "/srm-indicator", method = RequestMethod.POST)
    public ResponseEntity<SRMIndicator> createSRMIndicator(@RequestBody SRMIndicator srmIndicator) {
        return ResponseEntity.ok().body(this.srmIndicatorService.createSRMIndicator(srmIndicator));
    }

    //Get all SRMIndicator
    @RequestMapping(value = "/srm-indicator", method = RequestMethod.GET)
    public ResponseEntity<List<SRMIndicator>> fetchAllSRMIndicator() {
        return ResponseEntity.ok().body(this.srmIndicatorService.getAllSRMIndicator());
    }

    //One SRMIndicator with id
    @RequestMapping(value = "/srm-indicator/{id}", method = RequestMethod.GET)
    public ResponseEntity<SRMIndicator> getSingleSRMIndicator(@PathVariable long id) {
        return ResponseEntity.ok().body(this.srmIndicatorService.getSRMIndicatorById(id));
    }

    //Update SRMIndicator
    @RequestMapping(value = "/srm-indicator/{id}", method = RequestMethod.PUT)
    public ResponseEntity<SRMIndicator> updateSRMIndicator(@PathVariable long id, @RequestBody SRMIndicator srmIndicator) {
        srmIndicator.setId(id);
        return ResponseEntity.ok().body(this.srmIndicatorService.updateSRMIndicator(srmIndicator));
    }

    //Delete SRMIndicator
    @RequestMapping(value = "srm-indicator/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteSRMIndicator(@PathVariable long id) {
        this.srmIndicatorService.deleteSRMIndicator(id);
        return HttpStatus.OK;
    }
}
