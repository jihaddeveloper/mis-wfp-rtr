//  Author: Mohammad Jihad Hossain
//  Create Date: 20/03/2024
//  Modify Date: 20/03/2024
//  Description: DIBanglaClass controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.DIBanglaClass;
import com.jihad.rtr.wfp.service.BanglaClassService;
import com.jihad.rtr.wfp.service.DIBanglaClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class DIBanglaClassController {

    @Autowired
    private DIBanglaClassService diBanglaClassService;

    //Create new DIBanglaClass
    @RequestMapping(value = "/di-bangla-class", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DIBanglaClass> createDIBanglaClass(@RequestBody DIBanglaClass diBanglaClass) {
        return ResponseEntity.ok().body(this.diBanglaClassService.createDIBanglaClass(diBanglaClass));
    }

    //Get all DIBanglaClass
    @RequestMapping(value = "/di-bangla-class", method = RequestMethod.GET)
    public ResponseEntity<List<DIBanglaClass>> fetchAllDIBanglaClass() {
        return ResponseEntity.ok().body(this.diBanglaClassService.getAllDIBanglaClass());
    }

    //One DIBanglaClass with id
    @RequestMapping(value = "/di-bangla-class/{id}", method = RequestMethod.GET)
    public ResponseEntity<DIBanglaClass> getSingleDIBanglaClass(@PathVariable long id) {
        return ResponseEntity.ok().body(this.diBanglaClassService.getDIBanglaClassById(id));
    }

    //Update DIBanglaClass
    @RequestMapping(value = "/di-bangla-class/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DIBanglaClass> updateDIBanglaClass(@PathVariable long id, @RequestBody DIBanglaClass diBanglaClass) {
        diBanglaClass.setId(id);
        return ResponseEntity.ok().body(this.diBanglaClassService.updateDIBanglaClass(diBanglaClass));
    }

    //Delete DIBanglaClass
    @RequestMapping(value = "/di-bangla-class/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteDIBanglaClass(@PathVariable long id) {
        this.diBanglaClassService.deleteDIBanglaClass(id);
        return HttpStatus.OK;
    }
}
