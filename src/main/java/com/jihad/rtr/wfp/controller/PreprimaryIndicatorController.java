//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 20/11/2022
//  Description: Preprimary Indicator controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.PrePrimaryClassIndicator;
import com.jihad.rtr.wfp.service.BanglaIndicatorService;
import com.jihad.rtr.wfp.service.PreprimaryIndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PreprimaryIndicatorController {

    @Autowired
    private PreprimaryIndicatorService preprimaryIndicatorService;

    //Create new PreprimaryIndicator
    @RequestMapping(value = "/preprimary-indicator", method = RequestMethod.POST)
    public ResponseEntity<PrePrimaryClassIndicator> createPrePrimaryClassIndicator(@RequestBody PrePrimaryClassIndicator prePrimaryClassIndicator) {
        return ResponseEntity.ok().body(this.preprimaryIndicatorService.createPrePrimaryClassIndicator(prePrimaryClassIndicator));
    }

    //Get all PreprimaryIndicator
    @RequestMapping(value = "/preprimary-indicator", method = RequestMethod.GET)
    public ResponseEntity<List<PrePrimaryClassIndicator>> fetchAllPrePrimaryClassIndicator() {
        return ResponseEntity.ok().body(this.preprimaryIndicatorService.getAllPrePrimaryClassIndicator());
    }

    //One PreprimaryIndicator with id
    @RequestMapping(value = "/preprimary-indicator/{id}", method = RequestMethod.GET)
    public ResponseEntity<PrePrimaryClassIndicator> getSinglePrePrimaryClassIndicator(@PathVariable long id) {
        return ResponseEntity.ok().body(this.preprimaryIndicatorService.getPrePrimaryClassIndicatorById(id));
    }

    //Update PreprimaryIndicator
    @RequestMapping(value = "/preprimary-indicator/{id}", method = RequestMethod.PUT)
    public ResponseEntity<PrePrimaryClassIndicator> updatePrePrimaryClassIndicator(@PathVariable long id, @RequestBody PrePrimaryClassIndicator prePrimaryClassIndicator) {
        prePrimaryClassIndicator.setId(id);
        return ResponseEntity.ok().body(this.preprimaryIndicatorService.updatePrePrimaryClassIndicator(prePrimaryClassIndicator));
    }

    //Delete PreprimaryIndicator
    @RequestMapping(value = "/preprimary-indicator/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePrePrimaryClassIndicator(@PathVariable long id) {
        this.preprimaryIndicatorService.deletePrePrimaryClassIndicator(id);
        return HttpStatus.OK;
    }
}
