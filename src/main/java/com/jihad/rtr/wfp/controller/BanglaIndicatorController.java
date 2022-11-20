//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 20/11/2022
//  Description: Bangla Indicator controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.service.BanglaClassService;
import com.jihad.rtr.wfp.service.BanglaIndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class BanglaIndicatorController {

    @Autowired
    private BanglaIndicatorService banglaIndicatorService;

    //Create new BanglaIndicator
    @RequestMapping(value = "/bangla-indicator", method = RequestMethod.POST)
    public ResponseEntity<BanglaIndicator> createBanglaIndicator(@RequestBody BanglaIndicator banglaIndicator) {
        return ResponseEntity.ok().body(this.banglaIndicatorService.createBanglaIndicator(banglaIndicator));
    }

    //Get all BanglaIndicator
    @RequestMapping(value = "/bangla-indicator", method = RequestMethod.GET)
    public ResponseEntity<List<BanglaIndicator>> fetchAllBanglaIndicator() {
        return ResponseEntity.ok().body(this.banglaIndicatorService.getAllBanglaIndicator());
    }

    //One BanglaIndicator with id
    @RequestMapping(value = "/bangla-indicator/{id}", method = RequestMethod.GET)
    public ResponseEntity<BanglaIndicator> getSingleBanglaIndicator(@PathVariable long id) {
        return ResponseEntity.ok().body(this.banglaIndicatorService.getBanglaIndicatorById(id));
    }

    //Update BanglaIndicator
    @RequestMapping(value = "/bangla-indicator/{id}", method = RequestMethod.PUT)
    public ResponseEntity<BanglaIndicator> updateBanglaIndicator(@PathVariable long id, @RequestBody BanglaIndicator banglaIndicator) {
        banglaIndicator.setId(id);
        return ResponseEntity.ok().body(this.banglaIndicatorService.updateBanglaIndicator(banglaIndicator));
    }

    //Delete BanglaIndicator
    @RequestMapping(value = "bangla-indicator/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteBanglaIndicator(@PathVariable long id) {
        this.banglaIndicatorService.deleteBanglaIndicator(id);
        return HttpStatus.OK;
    }
}
