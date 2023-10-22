//  Author: Mohammad Jihad Hossain
//  Create Date: 16/02/2022
//  Modify Date: 28/02/2022
//  Description: Teacher service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Project;
import com.jihad.rtr.wfp.model.Teacher;
import com.jihad.rtr.wfp.repository.ProjectRepo;
import com.jihad.rtr.wfp.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    //Create new teacher
    public Teacher createTeacher(Teacher teacher) {
        return this.teacherRepo.save(teacher);
    }

    //Get all teacher
    public List<Teacher> getAllTeachers() {
        return this.teacherRepo.findAll();
    }

    //Get teacher with id
    public Teacher getTeacherById(long id) {
        Optional<Teacher> teacherDB = this.teacherRepo.findById(id);
        if (teacherDB.isPresent()) {
            return teacherDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update teacher
    public Teacher updateTeacher(Teacher teacher) {
        Optional<Teacher> teacherDB = this.teacherRepo.findById(teacher.getId());

        if (teacherDB.isPresent()) {
            Teacher teacherUpdate = teacherDB.get();
            teacherUpdate.setId(teacher.getId());
            teacherUpdate.setName(teacher.getName());
            teacherUpdate.setBnName(teacher.getBnName());

            teacherUpdate.setProject(teacher.getProject());
            teacherUpdate.setDistrict(teacher.getDistrict());
            teacherUpdate.setUpazilla(teacher.getUpazilla());
            teacherUpdate.setGender(teacher.getGender());
            teacherUpdate.setDesignation(teacher.getDesignation());
            teacherUpdate.setPhone1(teacher.getPhone1());
            teacherUpdate.setPhone2(teacher.getPhone2());


            teacherUpdate.setCurrentAddress(teacher.getCurrentAddress());
            teacherUpdate.setPermanentAddress(teacher.getPermanentAddress());
            teacherUpdate.setSchool(teacher.getSchool());
            teacherUpdate.setGrade(teacher.getGrade());
            teacherUpdate.setSection(teacher.getSection());
            teacherUpdate.setTeacherTraining(teacher.getTeacherTraining());

            teacherUpdate.setInstructionPreprimary(teacher.getInstructionPreprimary());
            teacherUpdate.setInstructionG1(teacher.getInstructionG1());
            teacherUpdate.setInstructionG2(teacher.getInstructionG2());
            teacherUpdate.setLibraryManagementSRM(teacher.getLibraryManagementSRM());
            teacherUpdate.setHeadteacherTraining(teacher.getHeadteacherTraining());
            teacherUpdate.setGoodGovernanceHeadteacher(teacher.getGoodGovernanceHeadteacher());
            teacherUpdate.setSchoolPerformanceHeadteacher(teacher.getSchoolPerformanceHeadteacher());
            teacherUpdate.setTrainingYear(teacher.getTrainingYear());
            teacherUpdate.setActivity(teacher.getActivity());

            teacherUpdate.setIsActive(teacher.getIsActive());
            teacherUpdate.setIsDeleted(teacher.getIsDeleted());
            
            teacherRepo.save(teacherUpdate);

            return teacherUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + teacher.getId());
        }
    }

    //Delete teacher
    public void deleteTeacher(long id) {
        Optional<Teacher> teacherDB = this.teacherRepo.findById(id);

        if (teacherDB.isPresent()) {
            this.teacherRepo.delete(teacherDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
