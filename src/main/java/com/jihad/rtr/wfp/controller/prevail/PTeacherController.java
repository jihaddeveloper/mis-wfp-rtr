//  Author: Mohammad Jihad Hossain
//  Create Date: 29/09/2025
//  Modify Date: 29/09/2025
//  Description: PTeacherController controller file

package com.jihad.rtr.wfp.controller.prevail;


import com.jihad.rtr.wfp.model.DITeacher;
import com.jihad.rtr.wfp.model.prevail.PTeacher;
import com.jihad.rtr.wfp.service.DITeacherService;
import com.jihad.rtr.wfp.service.prevail.PTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PTeacherController {

    @Autowired
    private PTeacherService pTeacherService;

    //Create new PTeacher
    @RequestMapping(value = "/p-teacher", method = RequestMethod.POST)
    public ResponseEntity<PTeacher> createPTeacher(@RequestBody PTeacher teacher) {
        return ResponseEntity.ok().body(this.pTeacherService.createPTeacher(teacher));
    }

    //Get all PTeacher
    @RequestMapping(value = "/p-teacher", method = RequestMethod.GET)
    public ResponseEntity<List<PTeacher>> fetchAllPTeacher() {
        return ResponseEntity.ok().body(this.pTeacherService.getAllPTeacher());
    }

    //One PTeacher with id
    @RequestMapping(value = "/p-teacher/{id}", method = RequestMethod.GET)
    public ResponseEntity<PTeacher> getSinglePTeacher(@PathVariable long id) {
        return ResponseEntity.ok().body(this.pTeacherService.getPTeacherById(id));
    }

    //Update PTeacher
    @RequestMapping(value = "/p-teacher/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PTeacher> updatePTeacher(@PathVariable long id, @RequestBody PTeacher teacher) {
        teacher.setId(id);
        return ResponseEntity.ok().body(this.pTeacherService.updatePTeacher(teacher));
    }

    //Delete PTeacher
    @RequestMapping(value = "/p-teacher/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePTeacher(@PathVariable long id) {
        this.pTeacherService.deletePTeacher(id);
        return HttpStatus.OK;
    }
}
