//  Author: Mohammad Jihad Hossain
//  Create Date: 15/02/2022
//  Modify Date: 15/02/2022
//  Description: Project controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.Project;
import com.jihad.rtr.wfp.service.DivisionService;
import com.jihad.rtr.wfp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    //Create new project
    @RequestMapping(value = "/projects", method = RequestMethod.POST)
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        return ResponseEntity.ok().body(this.projectService.createProject(project));
    }

    //Get all projects
    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public ResponseEntity<List<Project>> fetchAllProjects() {
        return ResponseEntity.ok().body(this.projectService.getAllProjects());
    }

    //One project with id
    @RequestMapping(value = "/projects/{id}", method = RequestMethod.GET)
    public ResponseEntity<Project> getSingleProject(@PathVariable long id) {
        return ResponseEntity.ok().body(this.projectService.getProjectById(id));
    }

    //Update project
    @RequestMapping(value = "/projects/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Project> updateProject(@PathVariable long id, @RequestBody Project project) {
        project.setId(id);
        return ResponseEntity.ok().body(this.projectService.updateProject(project));
    }

    //Delete project
    @RequestMapping(value = "/projects/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteProject(@PathVariable long id) {
        this.projectService.deleteProject(id);
        return HttpStatus.OK;
    }
}
