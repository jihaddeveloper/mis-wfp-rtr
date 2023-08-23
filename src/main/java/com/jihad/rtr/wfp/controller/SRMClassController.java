//  Author: Mohammad Jihad Hossain
//  Create Date: 29/11/2022
//  Modify Date: 29/11/2022
//  Description: SRM Class controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.SRMClass;
import com.jihad.rtr.wfp.service.BanglaClassService;
import com.jihad.rtr.wfp.service.SRMClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class SRMClassController {

    @Autowired
    private SRMClassService srmClassService;

    //Create new SRMClass
    @RequestMapping(value = "/srm-class", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SRMClass> createSRMClass(@RequestBody SRMClass srmClass) {
        return ResponseEntity.ok().body(this.srmClassService.createSRMClass(srmClass));
    }

    //Get all SRMClass
    @RequestMapping(value = "/srm-class", method = RequestMethod.GET)
    public ResponseEntity<List<SRMClass>> fetchAllSRMClass() {
        return ResponseEntity.ok().body(this.srmClassService.getAllSRMClass());
    }

    //One SRMClass with id
    @RequestMapping(value = "/srm-class/{id}", method = RequestMethod.GET)
    public ResponseEntity<SRMClass> getSingleSRMClass(@PathVariable long id) {
        return ResponseEntity.ok().body(this.srmClassService.getSRMClassById(id));
    }

    //Update SRMClass
    @RequestMapping(value = "/srm-class/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SRMClass> updateSRMClass(@PathVariable long id, @RequestBody SRMClass srmClass) {
        srmClass.setId(id);
        return ResponseEntity.ok().body(this.srmClassService.updateSRMClass(srmClass));
    }

    //Delete SRMClass
    @RequestMapping(value = "srm-class/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteSRMClass(@PathVariable long id) {
        this.srmClassService.deleteSRMClass(id);
        return HttpStatus.OK;
    }
}
