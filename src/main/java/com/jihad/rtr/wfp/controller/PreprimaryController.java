//  Author: Mohammad Jihad Hossain
//  Create Date: 15/11/2022
//  Modify Date: 15/11/2022
//  Description: Preprimary controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.PrePrimaryClass;
import com.jihad.rtr.wfp.service.BanglaClassService;
import com.jihad.rtr.wfp.service.PreprimaryClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PreprimaryController {

    @Autowired
    private PreprimaryClassService preprimaryClassService;

    //Create new Preprimary
    @RequestMapping(value = "/preprimary", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PrePrimaryClass> createPrePrimaryClass(@RequestBody PrePrimaryClass prePrimaryClass) {
        return ResponseEntity.ok().body(this.preprimaryClassService.createPrePrimaryClass(prePrimaryClass));
    }

    //Get all Preprimary
    @RequestMapping(value = "/preprimary", method = RequestMethod.GET)
    public ResponseEntity<List<PrePrimaryClass>> fetchAllPrePrimaryClass() {
        return ResponseEntity.ok().body(this.preprimaryClassService.getAllPrePrimaryClass());
    }

    //One Preprimary with id
    @RequestMapping(value = "/preprimary/{id}", method = RequestMethod.GET)
    public ResponseEntity<PrePrimaryClass> getSinglePrePrimaryClass(@PathVariable long id) {
        return ResponseEntity.ok().body(this.preprimaryClassService.getPrePrimaryClassById(id));
    }

    //Update BanglaClass
    @RequestMapping(value = "/preprimary/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PrePrimaryClass> updatePrePrimaryClass(@PathVariable long id, @RequestBody PrePrimaryClass prePrimaryClass) {
        prePrimaryClass.setId(id);
        return ResponseEntity.ok().body(this.preprimaryClassService.updatePrePrimaryClass(prePrimaryClass));
    }

    //Delete Preprimary
    @RequestMapping(value = "preprimary/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePrePrimaryClass(@PathVariable long id) {
        this.preprimaryClassService.deletePrePrimaryClass(id);
        return HttpStatus.OK;
    }
}
