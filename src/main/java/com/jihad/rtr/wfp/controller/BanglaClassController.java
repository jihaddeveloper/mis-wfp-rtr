//  Author: Mohammad Jihad Hossain
//  Create Date: 15/11/2022
//  Modify Date: 15/11/2022
//  Description: BanglaClass controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.service.BanglaClassService;
import com.jihad.rtr.wfp.service.DivisionService;
import com.jihad.rtr.wfp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class BanglaClassController {
    
    @Autowired
    private BanglaClassService banglaClassService;

    //Create new BanglaClass
    @RequestMapping(value = "/bangla-class", method = RequestMethod.POST)
    public ResponseEntity<BanglaClass> createBanglaClass(@RequestBody BanglaClass banglaClass) {
        return ResponseEntity.ok().body(this.banglaClassService.createBanglaClass(banglaClass));
    }

    //Get all BanglaClass
    @RequestMapping(value = "/bangla-class", method = RequestMethod.GET)
    public ResponseEntity<List<BanglaClass>> fetchAllBanglaClass() {
        return ResponseEntity.ok().body(this.banglaClassService.getAllBanglaClass());
    }

    //One BanglaClass with id
    @RequestMapping(value = "/bangla-class/{id}", method = RequestMethod.GET)
    public ResponseEntity<BanglaClass> getSingleBanglaClass(@PathVariable long id) {
        return ResponseEntity.ok().body(this.banglaClassService.getBanglaClassById(id));
    }

    //Update BanglaClass
    @RequestMapping(value = "/bangla-class/{id}", method = RequestMethod.PUT)
    public ResponseEntity<BanglaClass> updateBanglaClass(@PathVariable long id, @RequestBody BanglaClass banglaClass) {
        banglaClass.setId(id);
        return ResponseEntity.ok().body(this.banglaClassService.updateBanglaClass(banglaClass));
    }

    //Delete BanglaClass
    @RequestMapping(value = "bangla-class/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteBanglaClass(@PathVariable long id) {
        this.banglaClassService.deleteBanglaClass(id);
        return HttpStatus.OK;
    }
}
