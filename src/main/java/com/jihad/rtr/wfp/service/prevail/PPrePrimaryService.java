//  Author: Mohammad Jihad Hossain
//  Create Date: 05/01/2026
//  Modify Date: 05/01/2026
//  Description: PPrePrimaryService file

package com.jihad.rtr.wfp.service.prevail;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.prevail.PPrePrimary;
import com.jihad.rtr.wfp.model.prevail.PPrePrimary;
import com.jihad.rtr.wfp.repository.prevail.PPrePrimaryRepo;
import com.jihad.rtr.wfp.repository.prevail.PPrePrimaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PPrePrimaryService {

    @Autowired
    private PPrePrimaryRepo pPrePrimaryRepo;

    //Create new PPrePrimary
    public PPrePrimary createPPrePrimary(PPrePrimary pPrePrimary) {
        return pPrePrimaryRepo.save(pPrePrimary);
    }

    //Get all PPrePrimary
    public List<PPrePrimary> getAllPPrePrimary() {
        return pPrePrimaryRepo.findAll();
    }

    //Get PPrePrimary with id
    public PPrePrimary getPPrePrimaryById(long id) {
        Optional<PPrePrimary> pPrePrimaryDB = pPrePrimaryRepo.findById(id);
        if (pPrePrimaryDB.isPresent()) {
            return pPrePrimaryDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update PPrePrimary
    public PPrePrimary updatePPrePrimary(PPrePrimary pPrePrimary) {
        Optional<PPrePrimary> pPrePrimaryDB = pPrePrimaryRepo.findById(pPrePrimary.getId());

        if (pPrePrimaryDB.isPresent()) {
            PPrePrimary pPrePrimaryUpdate = pPrePrimaryDB.get();

            pPrePrimaryUpdate.setId(pPrePrimary.getId());
            pPrePrimaryUpdate.setDate(pPrePrimary.getDate());
            pPrePrimaryUpdate.setMonth(pPrePrimary.getMonth());
            pPrePrimaryUpdate.setYear(pPrePrimary.getYear());
            pPrePrimaryUpdate.setDistrict(pPrePrimary.getDistrict());
            pPrePrimaryUpdate.setUpazilla(pPrePrimary.getUpazilla());
            pPrePrimaryUpdate.setOffice(pPrePrimary.getOffice());
            pPrePrimaryUpdate.setRtrSchoolId(pPrePrimary.getRtrSchoolId());
            pPrePrimaryUpdate.setYearOfSupport(pPrePrimary.getYearOfSupport());
            pPrePrimaryUpdate.setProject(pPrePrimary.getProject());
            pPrePrimaryUpdate.setVisitNo(pPrePrimary.getVisitNo());
            pPrePrimaryUpdate.setLf(pPrePrimary.getLf());
            pPrePrimaryUpdate.setLfName(pPrePrimary.getLfName());
            pPrePrimaryUpdate.setLpo(pPrePrimary.getLpo());
            pPrePrimaryUpdate.setLpoName(pPrePrimary.getLpoName());
            pPrePrimaryUpdate.setSchool(pPrePrimary.getSchool());
            pPrePrimaryUpdate.setVisitor(pPrePrimary.getVisitor());
            pPrePrimaryUpdate.setVisitorDesignation(pPrePrimary.getVisitorDesignation());
            pPrePrimaryUpdate.setClassTeacher(pPrePrimary.getClassTeacher());
            pPrePrimaryUpdate.setGrade(pPrePrimary.getGrade());
            pPrePrimaryUpdate.setSection(pPrePrimary.getSection());
            pPrePrimaryUpdate.setClassStartTime(pPrePrimary.getClassStartTime());
            pPrePrimaryUpdate.setClassEndTime(pPrePrimary.getClassEndTime());
            pPrePrimaryUpdate.setLessonNo(pPrePrimary.getLessonNo());
            pPrePrimaryUpdate.setLessonName(pPrePrimary.getLessonName());
            pPrePrimaryUpdate.setStoryName(pPrePrimary.getStoryName());
            pPrePrimaryUpdate.setPictureName(pPrePrimary.getPictureName());
            pPrePrimaryUpdate.setCardName(pPrePrimary.getCardName());
            pPrePrimaryUpdate.setGameName(pPrePrimary.getGameName());

            pPrePrimaryUpdate.setClassStartTime(pPrePrimary.getClassStartTime());
            pPrePrimaryUpdate.setClassEndTime(pPrePrimary.getClassEndTime());

            pPrePrimaryUpdate.setTotalPresentGirl(pPrePrimary.getTotalPresentGirl());
            pPrePrimaryUpdate.setTotalPresentBoy(pPrePrimary.getTotalPresentBoy());
            pPrePrimaryUpdate.setTotalPresentStudent(pPrePrimary.getTotalPresentStudent());
            pPrePrimaryUpdate.setTotalPresentSpecial(pPrePrimary.getTotalPresentSpecial());

            pPrePrimaryUpdate.setNote(pPrePrimary.getNote());

            pPrePrimaryUpdate.setLastFollowupIndicator1(pPrePrimary.getLastFollowupIndicator1());
            pPrePrimaryUpdate.setLastFollowupIndicator2(pPrePrimary.getLastFollowupIndicator2());
            pPrePrimaryUpdate.setLastFollowupIndicator3(pPrePrimary.getLastFollowupIndicator3());

            pPrePrimaryUpdate.setInd11UsedRtRMaterialStatus(pPrePrimary.getInd11UsedRtRMaterialStatus());
            pPrePrimaryUpdate.setInd11UsedRtRMaterialNote(pPrePrimary.getInd11UsedRtRMaterialNote());
            pPrePrimaryUpdate.setInd12PlanWiseTeachingStatus(pPrePrimary.getInd12PlanWiseTeachingStatus());
            pPrePrimaryUpdate.setInd12PlanWiseTeachingNote(pPrePrimary.getInd12PlanWiseTeachingNote());
            pPrePrimaryUpdate.setInd13FollowedIWeUDoStatus(pPrePrimary.getInd13FollowedIWeUDoStatus());
            pPrePrimaryUpdate.setInd13FollowedIWeUDoNote(pPrePrimary.getInd13FollowedIWeUDoNote());
            pPrePrimaryUpdate.setInd14UsedStandardLanguageAllowPracticeStatus(pPrePrimary.getInd14UsedStandardLanguageAllowPracticeStatus());
            pPrePrimaryUpdate.setInd14UsedStandardLanguageAllowPracticeNote(pPrePrimary.getInd14UsedStandardLanguageAllowPracticeNote());
            pPrePrimaryUpdate.setInd21UsedRtRReadingMaterialStatus(pPrePrimary.getInd21UsedRtRReadingMaterialStatus());
            pPrePrimaryUpdate.setInd21UsedRtRReadingMaterialNote(pPrePrimary.getInd21UsedRtRReadingMaterialNote());
            pPrePrimaryUpdate.setInd22FollowedPlanContinuityStatus(pPrePrimary.getInd22FollowedPlanContinuityStatus());
            pPrePrimaryUpdate.setInd22FollowedPlanContinuityNote(pPrePrimary.getInd22FollowedPlanContinuityNote());
            pPrePrimaryUpdate.setInd23AskedRelatedQuestionStatus(pPrePrimary.getInd23AskedRelatedQuestionStatus());
            pPrePrimaryUpdate.setInd23AskedRelatedQuestionNote(pPrePrimary.getInd23AskedRelatedQuestionNote());
            pPrePrimaryUpdate.setInd24ShowedPictureAllowedSpeakingStatus(pPrePrimary.getInd24ShowedPictureAllowedSpeakingStatus());
            pPrePrimaryUpdate.setInd24ShowedPictureAllowedSpeakingStatus(pPrePrimary.getInd24ShowedPictureAllowedSpeakingStatus());
            pPrePrimaryUpdate.setInd31UsedReadingMaterialForAssessmentStatus(pPrePrimary.getInd31UsedReadingMaterialForAssessmentStatus());
            pPrePrimaryUpdate.setInd31UsedReadingMaterialForAssessmentNote(pPrePrimary.getInd31UsedReadingMaterialForAssessmentNote());
            pPrePrimaryUpdate.setInd32FollowedTeachingPlanStatus(pPrePrimary.getInd32FollowedTeachingPlanStatus());
            pPrePrimaryUpdate.setInd32FollowedTeachingPlanNote(pPrePrimary.getInd32FollowedTeachingPlanNote());
            pPrePrimaryUpdate.setInd33AssessmentOn5StudentStatus(pPrePrimary.getInd33AssessmentOn5StudentStatus());
            pPrePrimaryUpdate.setInd33AssessmentOn5StudentNote(pPrePrimary.getInd33AssessmentOn5StudentNote());
            pPrePrimaryUpdate.setInd34Allowed5StudentStoryTellingStatus(pPrePrimary.getInd34Allowed5StudentStoryTellingStatus());
            pPrePrimaryUpdate.setInd34Allowed5StudentStoryTellingNote(pPrePrimary.getInd34Allowed5StudentStoryTellingNote());


            pPrePrimaryUpdate.setBestPracticeIndicator1(pPrePrimary.getBestPracticeIndicator1());
            pPrePrimaryUpdate.setBestPracticeIndicator2(pPrePrimary.getBestPracticeIndicator2());
            pPrePrimaryUpdate.setBestPracticeIndicator3(pPrePrimary.getBestPracticeIndicator3());

            pPrePrimaryUpdate.setCoachingSupportIndicator1(pPrePrimary.getCoachingSupportIndicator1());
            pPrePrimaryUpdate.setCoachingSupportIndicator2(pPrePrimary.getCoachingSupportIndicator2());
            pPrePrimaryUpdate.setCoachingSupportIndicator3(pPrePrimary.getCoachingSupportIndicator3());

            pPrePrimaryUpdate.setAgreedStatement1(pPrePrimary.getAgreedStatement1());
            pPrePrimaryUpdate.setAgreedStatement2(pPrePrimary.getAgreedStatement2());

            pPrePrimaryUpdate.setTeacherStatus(pPrePrimary.getTeacherStatus());

            pPrePrimaryUpdate.setIsChecked(pPrePrimary.getIsChecked());
            pPrePrimaryUpdate.setIsActive(pPrePrimary.getIsActive());
            pPrePrimaryUpdate.setIsDeleted(pPrePrimary.getIsDeleted());

            pPrePrimaryRepo.save(pPrePrimaryUpdate);

            return pPrePrimaryUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + pPrePrimary.getId());
        }
    }

    //Delete PPrePrimary
    public void deletePPrePrimary(long id) {
        Optional<PPrePrimary> pPrePrimaryDB = this.pPrePrimaryRepo.findById(id);

        if (pPrePrimaryDB.isPresent()) {
            this.pPrePrimaryRepo.delete(pPrePrimaryDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
