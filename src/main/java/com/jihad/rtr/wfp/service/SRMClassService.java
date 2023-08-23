//  Author: Mohammad Jihad Hossain
//  Create Date: 29/11/2022
//  Modify Date: 29/11/2022
//  Description: SRM class service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.SRMClass;
import com.jihad.rtr.wfp.repository.BanglaClassRepo;
import com.jihad.rtr.wfp.repository.SRMClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SRMClassService {

    @Autowired
    private SRMClassRepo srmClassRepo;

    //Create new SRMClass
    public SRMClass createSRMClass(SRMClass srmClass) {
        return srmClassRepo.save(srmClass);
    }

    //Get all SRMClass
    public List<SRMClass> getAllSRMClass() {
        return srmClassRepo.findAll();
    }

    //Get SRMClass with id
    public SRMClass getSRMClassById(long id) {
        Optional<SRMClass> srmClassDB = srmClassRepo.findById(id);
        if (srmClassDB.isPresent()) {
            return srmClassDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update SRMClass
    public SRMClass updateSRMClass(SRMClass srmClass) {
        Optional<SRMClass> srmClassDB = srmClassRepo.findById(srmClass.getId());

        if (srmClassDB.isPresent()) {
            SRMClass srmClassUpdate = srmClassDB.get();

            srmClassUpdate.setId(srmClass.getId());
            srmClassUpdate.setDate(srmClass.getDate());
            srmClassUpdate.setMonth(srmClass.getMonth());
            srmClassUpdate.setYear(srmClass.getYear());
            srmClassUpdate.setDistrict(srmClass.getDistrict());
            srmClassUpdate.setUpazilla(srmClass.getUpazilla());
            srmClassUpdate.setFieldOffice(srmClass.getFieldOffice());
            srmClassUpdate.setProject(srmClass.getProject());
            srmClassUpdate.setProject(srmClass.getProject());
            srmClassUpdate.setVisitNo(srmClass.getVisitNo());
            srmClassUpdate.setLf(srmClass.getLf());
            srmClassUpdate.setLfName(srmClass.getLfName());
            srmClassUpdate.setLpo(srmClass.getLpo());
            srmClassUpdate.setLpoName(srmClass.getLpoName());
            srmClassUpdate.setSchool(srmClass.getSchool());
            srmClassUpdate.setVisitor(srmClass.getVisitor());
            srmClassUpdate.setVisitorDesignation(srmClass.getVisitorDesignation());
            srmClassUpdate.setVisitorOffice(srmClass.getVisitorOffice());
            srmClassUpdate.setClassTeacher(srmClass.getClassTeacher());
            srmClassUpdate.setTeacherGender(srmClass.getTeacherGender());
            srmClassUpdate.setIsTrained(srmClass.getIsTrained());
            srmClassUpdate.setGrade(srmClass.getGrade());
            srmClassUpdate.setSection(srmClass.getSection());
            srmClassUpdate.setClassStartTime(srmClass.getClassStartTime());
            srmClassUpdate.setClassEndTime(srmClass.getClassEndTime());
            srmClassUpdate.setContentName(srmClass.getContentName());
            srmClassUpdate.setPeriodDay(srmClass.getPeriodDay());
            srmClassUpdate.setTotalAdmittedStudent(srmClass.getTotalAdmittedStudent());
            srmClassUpdate.setTotalAdmittedGirl(srmClass.getTotalAdmittedGirl());
            srmClassUpdate.setTotalAdmittedBoy(srmClass.getTotalAdmittedBoy());
            srmClassUpdate.setTotalPresentStudent(srmClass.getTotalPresentStudent());
            srmClassUpdate.setTotalPresentGirl(srmClass.getTotalPresentGirl());
            srmClassUpdate.setTotalPresentBoy(srmClass.getTotalPresentBoy());

            srmClassUpdate.setNote(srmClass.getNote());
            
            srmClassUpdate.setLastFollowupTopic1(srmClass.getLastFollowupTopic1());
            srmClassUpdate.setLastFollowupTopic2(srmClass.getLastFollowupTopic2());
            srmClassUpdate.setLastFollowupTopic3(srmClass.getLastFollowupTopic3());

            srmClassUpdate.setTypeOfReading(srmClass.getTypeOfReading());
            srmClassUpdate.setTimeOfReading(srmClass.getTimeOfReading());

            srmClassUpdate.setInd1FriendlyCommunicationStatus(srmClass.getInd1FriendlyCommunicationStatus());
            srmClassUpdate.setInd1FriendlyCommunicationNotes(srmClass.getInd1FriendlyCommunicationNotes());
            srmClassUpdate.setInd2SRMInspiringStatus(srmClass.getInd2SRMInspiringStatus());
            srmClassUpdate.setInd2SRMInspiringNotes(srmClass.getInd2SRMInspiringNotes());
            srmClassUpdate.setInd3SRMInstructionStatus(srmClass.getInd3SRMInstructionStatus());
            srmClassUpdate.setInd3SRMInstructionNotes(srmClass.getInd3SRMInstructionNotes());
            srmClassUpdate.setInd4BookShowingStatus(srmClass.getInd4BookShowingStatus());
            srmClassUpdate.setInd4BookShowingNotes(srmClass.getInd4BookShowingNotes());
            srmClassUpdate.setInd5WordTeachingStatus(srmClass.getInd5WordTeachingStatus());
            srmClassUpdate.setInd5WordTeachingNotes(srmClass.getInd5WordTeachingNotes());
            srmClassUpdate.setInd6StoryReadingStatus(srmClass.getInd6StoryReadingStatus());
            srmClassUpdate.setInd6StoryReadingNotes(srmClass.getInd6StoryReadingNotes());
            srmClassUpdate.setInd7StorySuitableStatus(srmClass.getInd7StorySuitableStatus());
            srmClassUpdate.setInd7StorySuitableNotes(srmClass.getInd7StorySuitableNotes());
            srmClassUpdate.setInd8StoryReadingCombinationStatus(srmClass.getInd8StoryReadingCombinationStatus());
            srmClassUpdate.setInd8StoryReadingCombinationNotes(srmClass.getInd8StoryReadingCombinationNotes());
            srmClassUpdate.setInd9AllStudentEngagementStatus(srmClass.getInd9AllStudentEngagementStatus());
            srmClassUpdate.setInd9AllStudentEngagementNotes(srmClass.getInd9AllStudentEngagementNotes());
            srmClassUpdate.setInd10InclusiveAssessmentStatus(srmClass.getInd10InclusiveAssessmentStatus());
            srmClassUpdate.setInd10InclusiveAssessmentNotes(srmClass.getInd10InclusiveAssessmentNotes());
            srmClassUpdate.setInd11AskingForBCOStatus(srmClass.getInd11AskingForBCOStatus());
            srmClassUpdate.setInd11AskingForBCONotes(srmClass.getInd11AskingForBCONotes());


            srmClassUpdate.setBestPracticeInd1(srmClass.getBestPracticeInd1());
            srmClassUpdate.setBestPracticeInd2(srmClass.getBestPracticeInd2());
            srmClassUpdate.setBestPracticeInd3(srmClass.getBestPracticeInd3());

            srmClassUpdate.setCoachingSupportInd1(srmClass.getCoachingSupportInd1());
            srmClassUpdate.setCoachingSupportDetailsInd1(srmClass.getCoachingSupportDetailsInd1());
            srmClassUpdate.setCoachingSupportInd2(srmClass.getCoachingSupportInd2());
            srmClassUpdate.setCoachingSupportDetailsInd2(srmClass.getCoachingSupportDetailsInd2());

            srmClassUpdate.setAgreedStatement1(srmClass.getAgreedStatement1());
            srmClassUpdate.setAgreedStatement2(srmClass.getAgreedStatement2());


            srmClassUpdate.setTeacherStatus(srmClass.getTeacherStatus());

            srmClassUpdate.setIsActive(srmClass.getIsActive());
            srmClassUpdate.setIsDeleted(srmClass.getIsDeleted());

            srmClassRepo.save(srmClassUpdate);

            return srmClassUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + srmClass.getId());
        }
    }

    //Delete SRMClass
    public void deleteSRMClass(long id) {
        Optional<SRMClass> srmClassDB = this.srmClassRepo.findById(id);

        if (srmClassDB.isPresent()) {
            this.srmClassRepo.delete(srmClassDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
