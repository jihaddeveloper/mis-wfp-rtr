//  Author: Mohammad Jihad Hossain
//  Create Date: 28/07/2022
//  Modify Date: 28/07/2022
//  Description: Student controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Library;
import com.jihad.rtr.wfp.model.Student;
import com.jihad.rtr.wfp.service.DivisionService;
import com.jihad.rtr.wfp.service.LibraryService;
import com.jihad.rtr.wfp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private LibraryService libraryService;

    //Create new Student
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok().body(this.studentService.createStudent(student));
    }

    //Get all Student
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> fetchAllStudent() {
        return ResponseEntity.ok().body(this.studentService.getAllStudents());
    }

    //One Student with id
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ResponseEntity<Student> getStudent(@PathVariable long id) {
        return ResponseEntity.ok().body(this.studentService.getStudentById(id));
    }

    //Update Student
    @RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student student) {
        student.setId(id);
        return ResponseEntity.ok().body(this.studentService.updateStudent(student));
    }

    //Delete Student
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteStudent(@PathVariable long id) {
        this.studentService.deleteStudent(id);
        return HttpStatus.OK;
    }
}
