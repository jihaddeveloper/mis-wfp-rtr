//  Author: Mohammad Jihad Hossain
//  Create Date: 28/02/2022
//  Modify Date: 28/02/2022
//  Description: Teacher controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Project;
import com.jihad.rtr.wfp.model.Teacher;
import com.jihad.rtr.wfp.service.ProjectService;
import com.jihad.rtr.wfp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/",  produces = "application/json")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //Create new teacher
    @RequestMapping(value = "/teachers", method = RequestMethod.POST)
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
        return ResponseEntity.ok().body(this.teacherService.createTeacher(teacher));
    }

    //Get all teachers
    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public ResponseEntity <List<Teacher>> fetchAllTeachers(){
        return ResponseEntity.ok().body(this.teacherService.getAllTeachers()) ;
    }

    //One teacher with id
    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.GET)
    public ResponseEntity<Teacher> getSingleTeacher(@PathVariable long id) {
        return ResponseEntity.ok().body(this.teacherService.getTeacherById(id)) ;
    }

    //Update teacher
    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Teacher> updateTeacher(@PathVariable long id, @RequestBody Teacher teacher) {
        teacher.setId(id);
        return ResponseEntity.ok().body(this.teacherService.updateTeacher(teacher));
    }

    //Delete teacher
    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteTeacher(@PathVariable long id) {
        this.teacherService.deleteTeacher(id);
        return HttpStatus.OK;
    }
}
