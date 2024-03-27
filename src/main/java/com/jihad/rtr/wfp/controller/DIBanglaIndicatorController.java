//  Author: Mohammad Jihad Hossain
//  Create Date: 20/03/2024
//  Modify Date: 20/03/2024
//  Description: DI Bangla Indicator controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.DIBanglaIndicator;
import com.jihad.rtr.wfp.service.BanglaIndicatorService;
import com.jihad.rtr.wfp.service.DIBanglaIndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class DIBanglaIndicatorController {

    @Autowired
    private DIBanglaIndicatorService diBanglaIndicatorService;

    //Create new DIBanglaIndicator
    @RequestMapping(value = "/di-bangla-indicator", method = RequestMethod.POST)
    public ResponseEntity<DIBanglaIndicator> createDIBanglaIndicator(@RequestBody DIBanglaIndicator diBanglaIndicator) {
        return ResponseEntity.ok().body(this.diBanglaIndicatorService.createDIBanglaIndicator(diBanglaIndicator));
    }

    //Get all DIBanglaIndicator
    @RequestMapping(value = "/di-bangla-indicator", method = RequestMethod.GET)
    public ResponseEntity<List<DIBanglaIndicator>> fetchAllDIBanglaIndicator() {
        return ResponseEntity.ok().body(this.diBanglaIndicatorService.getAllDIBanglaIndicator());
    }

    //One DIBanglaIndicator with id
    @RequestMapping(value = "/di-bangla-indicator/{id}", method = RequestMethod.GET)
    public ResponseEntity<DIBanglaIndicator> getSingleDIBanglaIndicator(@PathVariable long id) {
        return ResponseEntity.ok().body(this.diBanglaIndicatorService.getDIBanglaIndicatorById(id));
    }

    //Update DIBanglaIndicator
    @RequestMapping(value = "/di-bangla-indicator/{id}", method = RequestMethod.PUT)
    public ResponseEntity<DIBanglaIndicator> updateDIBanglaIndicator(@PathVariable long id, @RequestBody DIBanglaIndicator diBanglaIndicator) {
        diBanglaIndicator.setId(id);
        return ResponseEntity.ok().body(this.diBanglaIndicatorService.updateDIBanglaIndicator(diBanglaIndicator));
    }

    //Delete DIBanglaIndicator
    @RequestMapping(value = "/di-bangla-indicator/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteDIBanglaIndicator(@PathVariable long id) {
        this.diBanglaIndicatorService.deleteDIBanglaIndicator(id);
        return HttpStatus.OK;
    }
}
