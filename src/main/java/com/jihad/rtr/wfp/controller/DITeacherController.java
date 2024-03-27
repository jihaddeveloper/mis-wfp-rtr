//  Author: Mohammad Jihad Hossain
//  Create Date: 28/02/2024
//  Modify Date: 28/02/2024
//  Description: DITeacher controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.DITeacher;
import com.jihad.rtr.wfp.model.Teacher;
import com.jihad.rtr.wfp.service.DITeacherService;
import com.jihad.rtr.wfp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class DITeacherController {

    @Autowired
    private DITeacherService diTeacherService;

    //Create new DITeacher
    @RequestMapping(value = "/di-teacher", method = RequestMethod.POST)
    public ResponseEntity<DITeacher> createDITeacher(@RequestBody DITeacher teacher) {
        return ResponseEntity.ok().body(this.diTeacherService.createDITeacher(teacher));
    }

    //Get all DITeacher
    @RequestMapping(value = "/di-teacher", method = RequestMethod.GET)
    public ResponseEntity<List<DITeacher>> fetchAllDITeacher() {
        return ResponseEntity.ok().body(this.diTeacherService.getAllDITeacher());
    }

    //One DITeacher with id
    @RequestMapping(value = "/di-teacher/{id}", method = RequestMethod.GET)
    public ResponseEntity<DITeacher> getSingleDITeacher(@PathVariable long id) {
        return ResponseEntity.ok().body(this.diTeacherService.getDITeacherById(id));
    }

    //Update DITeacher
    @RequestMapping(value = "/di-teacher/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DITeacher> updateDITeacher(@PathVariable long id, @RequestBody DITeacher teacher) {
        teacher.setId(id);
        return ResponseEntity.ok().body(this.diTeacherService.updateDITeacher(teacher));
    }

    //Delete DITeacher
    @RequestMapping(value = "/di-teacher/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteDITeacher(@PathVariable long id) {
        this.diTeacherService.deleteDITeacher(id);
        return HttpStatus.OK;
    }
}
