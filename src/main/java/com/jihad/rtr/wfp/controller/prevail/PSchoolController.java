//  Author: Mohammad Jihad Hossain
//  Create Date: 28/09/2025
//  Modify Date: 29/09/2025
//  Description: PSchoolController controller file

package com.jihad.rtr.wfp.controller.prevail;

import com.jihad.rtr.wfp.model.DISchool;
import com.jihad.rtr.wfp.model.prevail.PSchool;
import com.jihad.rtr.wfp.service.DISchoolService;
import com.jihad.rtr.wfp.service.prevail.PSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PSchoolController {

    @Autowired
    private PSchoolService pSchoolService;


    //Create new PSchool
    @RequestMapping(value = "/p-school", method = RequestMethod.POST)
    public ResponseEntity<PSchool> createPSchool(@RequestBody PSchool diSchool) {
        return ResponseEntity.ok().body(this.pSchoolService.createPSchool(diSchool));
    }

    //Get all PSchool
    @RequestMapping(value = "/p-school", method = RequestMethod.GET)
    public ResponseEntity<List<PSchool>> fetchAllPSchool() {
        return ResponseEntity.ok().body(this.pSchoolService.getAllPSchool());
    }

    //One PSchool with id
    @RequestMapping(value = "/p-school/{id}", method = RequestMethod.GET)
    public ResponseEntity<PSchool> getSingleSchool(@PathVariable long id) {
        return ResponseEntity.ok().body(this.pSchoolService.getPSchoolById(id));
    }

    //Update PSchool
    @RequestMapping(value = "/p-school/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PSchool> updatePSchool(@PathVariable long id, @RequestBody PSchool diSchool) {
        diSchool.setId(id);
        return ResponseEntity.ok().body(this.pSchoolService.updatePSchool(diSchool));
    }

    //Delete PSchool
    @RequestMapping(value = "/p-school/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePSchool(@PathVariable long id) {
        this.pSchoolService.deletePSchool(id);
        return HttpStatus.OK;
    }
}
