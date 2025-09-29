//  Author: Mohammad Jihad Hossain
//  Create Date: 28/09/2025
//  Modify Date: 28/09/2025
//  Description: PTeacherService file

package com.jihad.rtr.wfp.service.prevail;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.prevail.PTeacher;
import com.jihad.rtr.wfp.repository.DITeacherRepo;
import com.jihad.rtr.wfp.repository.prevail.PTeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PTeacherService {

    @Autowired
    private PTeacherRepo pTeacherRepo;

    //Create new PTeacher
    public PTeacher createPTeacher(PTeacher teacher) {
        return this.pTeacherRepo.save(teacher);
    }

    //Get all PTeacher
    public List<PTeacher> getAllPTeacher() {
        return this.pTeacherRepo.findAll();
    }

    //Get PTeacher with id
    public PTeacher getPTeacherById(long id) {
        Optional<PTeacher> teacherDB = this.pTeacherRepo.findById(id);
        if (teacherDB.isPresent()) {
            return teacherDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update PTeacher
    public PTeacher updatePTeacher(PTeacher teacher) {
        Optional<PTeacher> teacherDB = this.pTeacherRepo.findById(teacher.getId());

        if (teacherDB.isPresent()) {
            PTeacher teacherUpdate = teacherDB.get();
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
            teacherUpdate.setSchoolId(teacher.getSchoolId());
            teacherUpdate.setSchoolName(teacher.getSchoolName());

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

            teacherUpdate.setGradePPrimary(teacher.getGradePPrimary());
            teacherUpdate.setGradeG1(teacher.getGradeG1());
            teacherUpdate.setGradeG2(teacher.getGradeG2());
            teacherUpdate.setGradeG3(teacher.getGradeG3());
            teacherUpdate.setGradeG4(teacher.getGradeG4());
            teacherUpdate.setGradeG5(teacher.getGradeG5());


            teacherUpdate.setTrainingYear(teacher.getTrainingYear());
            teacherUpdate.setActivity(teacher.getActivity());

            teacherUpdate.setIsActive(teacher.getIsActive());
            teacherUpdate.setIsDeleted(teacher.getIsDeleted());

            pTeacherRepo.save(teacherUpdate);

            return teacherUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + teacher.getId());
        }
    }

    //Delete PTeacher
    public void deletePTeacher(long id) {
        Optional<PTeacher> teacherDB = this.pTeacherRepo.findById(id);

        if (teacherDB.isPresent()) {
            this.pTeacherRepo.delete(teacherDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
