//  Author: Mohammad Jihad Hossain
//  Create Date: 16/02/2022
//  Modify Date: 28/02/2022
//  Description: Teacher service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DITeacher;
import com.jihad.rtr.wfp.model.Teacher;
import com.jihad.rtr.wfp.repository.DITeacherRepo;
import com.jihad.rtr.wfp.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DITeacherService {

    @Autowired
    private DITeacherRepo diTeacherRepo;

    //Create new DITeacher
    public DITeacher createDITeacher(DITeacher teacher) {
        return this.diTeacherRepo.save(teacher);
    }

    //Get all DITeacher
    public List<DITeacher> getAllDITeacher() {
        return this.diTeacherRepo.findAll();
    }

    //Get DITeacher with id
    public DITeacher getDITeacherById(long id) {
        Optional<DITeacher> teacherDB = this.diTeacherRepo.findById(id);
        if (teacherDB.isPresent()) {
            return teacherDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update DITeacher
    public DITeacher updateDITeacher(DITeacher teacher) {
        Optional<DITeacher> teacherDB = this.diTeacherRepo.findById(teacher.getId());

        if (teacherDB.isPresent()) {
            DITeacher teacherUpdate = teacherDB.get();
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

            teacherUpdate.setGradeG1(teacher.getGradeG1());
            teacherUpdate.setGradeG2(teacher.getGradeG2());
            teacherUpdate.setGradePPrimary(teacher.getGradePPrimary());


            teacherUpdate.setTrainingYear(teacher.getTrainingYear());
            teacherUpdate.setActivity(teacher.getActivity());

            teacherUpdate.setIsActive(teacher.getIsActive());
            teacherUpdate.setIsDeleted(teacher.getIsDeleted());

            diTeacherRepo.save(teacherUpdate);

            return teacherUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + teacher.getId());
        }
    }

    //Delete teacher
    public void deleteDITeacher(long id) {
        Optional<DITeacher> teacherDB = this.diTeacherRepo.findById(id);

        if (teacherDB.isPresent()) {
            this.diTeacherRepo.delete(teacherDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
