//  Author: Mohammad Jihad Hossain
//  Create Date: 15/02/2022
//  Modify Date: 15/02/2022
//  Description: Office service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Designation;
import com.jihad.rtr.wfp.model.Project;
import com.jihad.rtr.wfp.repository.DesignationRepo;
import com.jihad.rtr.wfp.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    //Create new project
    public Project createProject(Project project){
        return this.projectRepo.save(project);
    }

    //Get all projects
    public List<Project> getAllProjects(){
        return this.projectRepo.findAll();
    }

    //Get project with id
    public Project getProjectById(long id){
        Optional<Project> projectDB = this.projectRepo.findById(id);
        if(projectDB.isPresent()){
            return projectDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }

    }

    //Update project
    public Project updateProject(Project project){
        Optional<Project> projectDB = this.projectRepo.findById(project.getId());

        if(projectDB.isPresent()){
            Project projectUpdate = projectDB.get();
            projectUpdate.setId(project.getId());
            projectUpdate.setName(project.getName());
            projectUpdate.setBnName(project.getBnName());

            projectRepo.save(projectUpdate);

            return projectUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ project.getId());
        }
    }

    //Delete project
    public void deleteProject(long id){
        Optional<Project> projectDB = this.projectRepo.findById(id);

        if(projectDB.isPresent()){
            this.projectRepo.delete(projectDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
