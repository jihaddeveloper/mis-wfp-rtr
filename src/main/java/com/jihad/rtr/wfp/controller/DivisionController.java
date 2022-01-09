//  Author: Mohammad Jihad Hossain
//  Create Date: 09/01/2022
//  Modify Date: 09/01/2022
//  Description: Division controller file

package com.jihad.rtr.wfp.controller;


import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.LibraryObservation;
import com.jihad.rtr.wfp.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class DivisionController {

    @Autowired
    private DivisionService divisionService;

    //Create new division
    @RequestMapping(value = "/division", method = RequestMethod.POST)
    public ResponseEntity<Division> createLibraryObservation(@RequestBody Division division) {
        return ResponseEntity.ok().body(this.divisionService.createDivision(division));
    }

    //Get all divisions

    //One division with id

    //Update division

    //Delete division

}
