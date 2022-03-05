//  Author: Mohammad Jihad Hossain
//  Create Date: 01/03/2022
//  Modify Date: 01/03/2022
//  Description: Grade controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Designation;
import com.jihad.rtr.wfp.model.Grade;
import com.jihad.rtr.wfp.service.DesignationService;
import com.jihad.rtr.wfp.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/",  produces = "application/json")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    //Create new grade
    @RequestMapping(value = "/grades", method = RequestMethod.POST)
    public ResponseEntity<Grade> createNewGrade(@RequestBody Grade grade) {
        return ResponseEntity.ok().body(this.gradeService.createGrade(grade));
    }

    //Get all grade
    @RequestMapping(value = "/grades", method = RequestMethod.GET)
    public ResponseEntity <List<Grade>> fetchAllGrades(){
        return ResponseEntity.ok().body(gradeService.getAllGrade()) ;
    }

    //Get grade with id
    @RequestMapping(value = "/grades/{id}", method = RequestMethod.GET)
    public ResponseEntity<Grade> getGradeByID(@PathVariable long id) {
        return ResponseEntity.ok().body(gradeService.getGradeById(id)) ;
    }

    //Update grade
    @RequestMapping(value = "/grades/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Grade> updateGrade(@PathVariable long id, @RequestBody Grade grade) {
        grade.setId(id);
        return ResponseEntity.ok().body(this.gradeService.updateGrade(grade));
    }

    //Delete grade
    @RequestMapping(value = "/grades/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteGrade(@PathVariable long id) {
        this.gradeService.deleteGrade(id);
        return HttpStatus.OK;
    }
}
