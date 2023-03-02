//  Author: Mohammad Jihad Hossain
//  Create Date: 02/03/2023
//  Modify Date: 02/03/2023
//  Description: PreprimaryClassService file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.CoreBanglaClass;
import com.jihad.rtr.wfp.model.PrePrimaryClass;
import com.jihad.rtr.wfp.repository.CoreBanglaClassRepo;
import com.jihad.rtr.wfp.repository.PreprimaryClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PreprimaryClassService {

    @Autowired
    private PreprimaryClassRepo preprimaryClassRepo;

    //Create new PrePrimaryClass
    public PrePrimaryClass createPrePrimaryClass(PrePrimaryClass prePrimaryClass) {
        return preprimaryClassRepo.save(prePrimaryClass);
    }

    //Get all PrePrimaryClass
    public List<PrePrimaryClass> getAllPrePrimaryClass() {
        return preprimaryClassRepo.findAll();
    }

    //Get PrePrimaryClass with id
    public PrePrimaryClass getPrePrimaryClassById(long id) {
        Optional<PrePrimaryClass> prePrimaryClassDB = preprimaryClassRepo.findById(id);
        if (prePrimaryClassDB.isPresent()) {
            return prePrimaryClassDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update PrePrimaryClass
    public PrePrimaryClass updatePrePrimaryClass(PrePrimaryClass prePrimaryClass) {
        Optional<PrePrimaryClass> prePrimaryClassDB = preprimaryClassRepo.findById(prePrimaryClass.getId());

        if (prePrimaryClassDB.isPresent()) {
            PrePrimaryClass prePrimaryClassUpdate = prePrimaryClassDB.get();
            prePrimaryClassUpdate.setId(prePrimaryClass.getId());
            prePrimaryClassUpdate.setDate(prePrimaryClass.getDate());
            prePrimaryClassUpdate.setMonth(prePrimaryClass.getMonth());
            prePrimaryClassUpdate.setYear(prePrimaryClass.getYear());
            prePrimaryClassUpdate.setDistrict(prePrimaryClass.getDistrict());
            prePrimaryClassUpdate.setUpazilla(prePrimaryClass.getUpazilla());
            prePrimaryClassUpdate.setFieldOffice(prePrimaryClass.getFieldOffice());
            prePrimaryClassUpdate.setProject(prePrimaryClass.getProject());
            prePrimaryClassUpdate.setProject(prePrimaryClass.getProject());
            prePrimaryClassUpdate.setVisitNo(prePrimaryClass.getVisitNo());
            prePrimaryClassUpdate.setLf(prePrimaryClass.getLf());
            prePrimaryClassUpdate.setLfName(prePrimaryClass.getLfName());
            prePrimaryClassUpdate.setLpo(prePrimaryClass.getLpo());
            prePrimaryClassUpdate.setLpoName(prePrimaryClass.getLpoName());
            prePrimaryClassUpdate.setSchool(prePrimaryClass.getSchool());
            prePrimaryClassUpdate.setVisitor(prePrimaryClass.getVisitor());
            prePrimaryClassUpdate.setVisitorDesignation(prePrimaryClass.getVisitorDesignation());
            prePrimaryClassUpdate.setVisitorOffice(prePrimaryClass.getVisitorOffice());
            prePrimaryClassUpdate.setClassTeacher(prePrimaryClass.getClassTeacher());
            prePrimaryClassUpdate.setTeacherGender(prePrimaryClass.getTeacherGender());
            prePrimaryClassUpdate.setIsTrained(prePrimaryClass.getIsTrained());
            prePrimaryClassUpdate.setGrade(prePrimaryClass.getGrade());
            prePrimaryClassUpdate.setSection(prePrimaryClass.getSection());
            prePrimaryClassUpdate.setClassStartTime(prePrimaryClass.getClassStartTime());
            prePrimaryClassUpdate.setClassEndTime(prePrimaryClass.getClassEndTime());
            prePrimaryClassUpdate.setContentName1(prePrimaryClass.getContentName1());
            prePrimaryClassUpdate.setContentName2(prePrimaryClass.getContentName2());
            prePrimaryClassUpdate.setContentName3(prePrimaryClass.getContentName3());
            prePrimaryClassUpdate.setPeriodDay(prePrimaryClass.getPeriodDay());

            prePrimaryClassUpdate.setTotalPresentStudent(prePrimaryClass.getTotalPresentStudent());
            prePrimaryClassUpdate.setTotalPresentGirl(prePrimaryClass.getTotalPresentGirl());
            prePrimaryClassUpdate.setTotalPresentBoy(prePrimaryClass.getTotalPresentBoy());
            prePrimaryClassUpdate.setTotalPresentSpecial(prePrimaryClass.getTotalPresentSpecial());


            prePrimaryClassUpdate.setLastFollowupTopic1(prePrimaryClass.getLastFollowupTopic1());
            prePrimaryClassUpdate.setLastFollowupTopic2(prePrimaryClass.getLastFollowupTopic2());
            prePrimaryClassUpdate.setLastFollowupTopic3(prePrimaryClass.getLastFollowupTopic3());

            prePrimaryClassUpdate.setInd11UsingBigbookStatus(prePrimaryClass.getInd11UsingBigbookStatus());
            prePrimaryClassUpdate.setInd11UsingBigbookNotes(prePrimaryClass.getInd11UsingBigbookNotes());
            prePrimaryClassUpdate.setInd12PictureDiscussionStatus(prePrimaryClass.getInd12PictureDiscussionStatus());
            prePrimaryClassUpdate.setInd12PictureDiscussionNotes(prePrimaryClass.getInd12PictureDiscussionNotes());
            prePrimaryClassUpdate.setInd13FollowedInstructionStatus(prePrimaryClass.getInd13FollowedInstructionStatus());
            prePrimaryClassUpdate.setInd13FollowedInstructionNotes(prePrimaryClass.getInd13FollowedInstructionNotes());
            prePrimaryClassUpdate.setInd21UsingTalkingChartStatus(prePrimaryClass.getInd21UsingTalkingChartStatus());
            prePrimaryClassUpdate.setInd21UsingTalkingChartNotes(prePrimaryClass.getInd21UsingTalkingChartNotes());
            prePrimaryClassUpdate.setInd22UsingPictureElementStatus(prePrimaryClass.getInd22UsingPictureElementStatus());
            prePrimaryClassUpdate.setInd22UsingPictureElementNotes(prePrimaryClass.getInd22UsingPictureElementNotes());
            prePrimaryClassUpdate.setInd23FollowedInstructionStepStatus(prePrimaryClass.getInd23FollowedInstructionStepStatus());
            prePrimaryClassUpdate.setInd23FollowedInstructionStepNotes(prePrimaryClass.getInd23FollowedInstructionStepNotes());
            prePrimaryClassUpdate.setInd31LanguageGameStatus(prePrimaryClass.getInd31LanguageGameStatus());
            prePrimaryClassUpdate.setInd31LanguageGameNotes(prePrimaryClass.getInd31LanguageGameNotes());
            prePrimaryClassUpdate.setInd32LanguageGameIWeYouStatus(prePrimaryClass.getInd32LanguageGameIWeYouStatus());
            prePrimaryClassUpdate.setInd32LanguageGameIWeYouNotes(prePrimaryClass.getInd32LanguageGameIWeYouStatus());
            prePrimaryClassUpdate.setInd33LanguageGameExtraStatus(prePrimaryClass.getInd33LanguageGameExtraStatus());
            prePrimaryClassUpdate.setInd33LanguageGameExtraNotes(prePrimaryClass.getInd33LanguageGameExtraNotes());


            prePrimaryClassUpdate.setBestPracticeInd1(prePrimaryClass.getBestPracticeInd1());
            prePrimaryClassUpdate.setBestPracticeInd2(prePrimaryClass.getBestPracticeInd2());
            prePrimaryClassUpdate.setBestPracticeInd3(prePrimaryClass.getBestPracticeInd3());

            prePrimaryClassUpdate.setCoachingSupportInd1(prePrimaryClass.getCoachingSupportInd1());
            prePrimaryClassUpdate.setCoachingSupportInd2(prePrimaryClass.getCoachingSupportInd2());


            prePrimaryClassUpdate.setAgreedStatement1(prePrimaryClass.getAgreedStatement1());
            prePrimaryClassUpdate.setAgreedStatement2(prePrimaryClass.getAgreedStatement2());


            prePrimaryClassUpdate.setTeacherStatus(prePrimaryClass.getTeacherStatus());

            prePrimaryClassUpdate.setIsActive(prePrimaryClass.getIsActive());
            prePrimaryClassUpdate.setIsDeleted(prePrimaryClass.getIsDeleted());

            preprimaryClassRepo.save(prePrimaryClassUpdate);

            return prePrimaryClassUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + prePrimaryClass.getId());
        }
    }

    //Delete PrePrimaryClass
    public void deletePrePrimaryClass(long id) {
        Optional<PrePrimaryClass> prePrimaryClassDB = this.preprimaryClassRepo.findById(id);

        if (prePrimaryClassDB.isPresent()) {
            this.preprimaryClassRepo.delete(prePrimaryClassDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
