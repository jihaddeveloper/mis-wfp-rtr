//  Author: Mohammad Jihad Hossain
//  Create Date: 19/09/2024
//  Modify Date: 19/09/2024
//  Description: School Monitoring controller file

package com.jihad.rtr.wfp.controller;


import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.SchoolMonitoring;
import com.jihad.rtr.wfp.service.BanglaClassService;
import com.jihad.rtr.wfp.service.SchoolMonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class SchoolMonitoringController {

    @Autowired
    private SchoolMonitoringService schoolMonitoringService;

    //Create new SchoolMonitoring
    @RequestMapping(value = "/school-monitoring", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SchoolMonitoring> createSchoolMonitoring(@RequestBody SchoolMonitoring schoolMonitoring) {
        return ResponseEntity.ok().body(this.schoolMonitoringService.createSchoolMonitoring(schoolMonitoring));
    }

    //Get all SchoolMonitoring
    @RequestMapping(value = "/school-monitoring", method = RequestMethod.GET)
    public ResponseEntity<List<SchoolMonitoring>> fetchAllSchoolMonitoring() {
        return ResponseEntity.ok().body(this.schoolMonitoringService.getAllSchoolMonitoring());
    }

    //One SchoolMonitoring with id
    @RequestMapping(value = "/school-monitoring/{id}", method = RequestMethod.GET)
    public ResponseEntity<SchoolMonitoring> getSingleSchoolMonitoring(@PathVariable long id) {
        return ResponseEntity.ok().body(this.schoolMonitoringService.getSchoolMonitoringById(id));
    }

    //Update SchoolMonitoring
    @RequestMapping(value = "/school-monitoring/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SchoolMonitoring> updateSchoolMonitoring(@PathVariable long id, @RequestBody SchoolMonitoring schoolMonitoring) {
        schoolMonitoring.setId(id);
        return ResponseEntity.ok().body(this.schoolMonitoringService.updateSchoolMonitoring(schoolMonitoring));
    }

    //Delete SchoolMonitoring
    @RequestMapping(value = "/school-monitoring/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteSchoolMonitoring(@PathVariable long id) {
        this.schoolMonitoringService.deleteSchoolMonitoring(id);
        return HttpStatus.OK;
    }
}
