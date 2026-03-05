//  Author: Mohammad Jihad Hossain
//  Create Date: 10/09/2025
//  Modify Date: 4/12/2025
//  Description: PSRMClass Service file

package com.jihad.rtr.wfp.service.prevail;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.prevail.PSRMClass;
import com.jihad.rtr.wfp.model.prevail.PSRMClass;
import com.jihad.rtr.wfp.repository.prevail.PSRMClassRepo;
import com.jihad.rtr.wfp.repository.prevail.PSRMClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PSRMClassService {

    @Autowired
    private PSRMClassRepo psrmClassRepo;

    // Create new PSRMClass
    public PSRMClass createPSRMClass(PSRMClass psrmClass) {
        return psrmClassRepo.save(psrmClass);
    }

    // Get all PSRMClass
    public List<PSRMClass> getAllPSRMClass() {
        return psrmClassRepo.findAll();
    }

    // Get PSRMClass with id
    public PSRMClass getPSRMClassById(long id) {
        Optional<PSRMClass> psrmClassDB = psrmClassRepo.findById(id);

        if (psrmClassDB.isPresent()) {
            return psrmClassDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);

        }

    }

    // Update PSRMClass
    public PSRMClass updatePSRMClass(PSRMClass psrmClass) {
        Optional<PSRMClass> psrmClassDB = psrmClassRepo.findById(psrmClass.getId());

        if (psrmClassDB.isPresent()) {
            PSRMClass psrmClassUpdate = psrmClassDB.get();

            psrmClassUpdate.setId(psrmClass.getId());
            psrmClassUpdate.setVisitNo(psrmClass.getVisitNo());
            psrmClassUpdate.setDate(psrmClass.getDate());
            psrmClassUpdate.setOffice(psrmClass.getOffice());
            psrmClassUpdate.setProject(psrmClass.getProject());
            psrmClassUpdate.setDistrict(psrmClass.getDistrict());
            psrmClassUpdate.setUpazilla(psrmClass.getUpazilla());
            psrmClassUpdate.setVisitor(psrmClass.getVisitor());
            psrmClassUpdate.setVisitorDesignation(psrmClass.getVisitorDesignation());
            psrmClassUpdate.setLf(psrmClass.getLf());
            psrmClassUpdate.setLfName(psrmClass.getLfName());
            psrmClassUpdate.setLpo(psrmClass.getLpo());
            psrmClassUpdate.setLpoName(psrmClass.getLpoName());
            psrmClassUpdate.setSchool(psrmClass.getSchool());
            psrmClassUpdate.setMonth(psrmClass.getMonth());
            psrmClassUpdate.setYear(psrmClass.getYear());
            psrmClassUpdate.setRtrSchoolId(psrmClass.getRtrSchoolId());
            psrmClassUpdate.setYearOfSupport(psrmClass.getYearOfSupport());
            psrmClassUpdate.setPointTeacher(psrmClass.getPointTeacher());
            psrmClassUpdate.setYearOfEstablish(psrmClass.getYearOfEstablish());
            psrmClassUpdate.setPhase(psrmClass.getPhase());
            psrmClassUpdate.setTotalAdmittedStudent(psrmClass.getTotalAdmittedStudent());
            psrmClassUpdate.setTotalPresentStudent(psrmClass.getTotalPresentStudent());

            psrmClassUpdate.setNote(psrmClass.getNote());

            psrmClassUpdate.setLastFollowupTopic1(psrmClass.getLastFollowupTopic1());
            psrmClassUpdate.setLastFollowupTopic2(psrmClass.getLastFollowupTopic2());
            psrmClassUpdate.setLastFollowupTopic3(psrmClass.getLastFollowupTopic3());

            psrmClassUpdate.setPartAInd11TeacherHelpedStudentToSeatStatus(psrmClass.getPartAInd11TeacherHelpedStudentToSeatStatus());
            psrmClassUpdate.setPartAInd11TeacherHelpedStudentToSeatNote(psrmClass.getPartAInd11TeacherHelpedStudentToSeatNote());

            psrmClassUpdate.setPartAInd12TeacherShowedABookDetailStatus(psrmClass.getPartAInd12TeacherShowedABookDetailStatus());
            psrmClassUpdate.setPartAInd12TeacherShowedABookDetailNote(psrmClass.getPartAInd12TeacherShowedABookDetailNote());

            psrmClassUpdate.setPartAInd13TeacherTeachesWordWithMeaningStatus(psrmClass.getPartAInd13TeacherTeachesWordWithMeaningStatus());
            psrmClassUpdate.setPartAInd13TeacherTeachesWordWithMeaningNote(psrmClass.getPartAInd13TeacherTeachesWordWithMeaningNote());

            psrmClassUpdate.setPartAInd21TeacherInspireToParticipateStatus(psrmClass.getPartAInd21TeacherInspireToParticipateStatus());
            psrmClassUpdate.setPartAInd21TeacherInspireToParticipateNote(psrmClass.getPartAInd21TeacherInspireToParticipateNote());

            psrmClassUpdate.setPartAInd22TeacherShowedPictureTextStatus(psrmClass.getPartAInd22TeacherShowedPictureTextStatus());
            psrmClassUpdate.setPartAInd22TeacherShowedPictureTextNote(psrmClass.getPartAInd22TeacherShowedPictureTextNote());

            psrmClassUpdate.setPartAInd23TeacherTeachesByActionStatus(psrmClass.getPartAInd23TeacherTeachesByActionStatus());
            psrmClassUpdate.setPartAInd23TeacherTeachesByActionNote(psrmClass.getPartAInd23TeacherTeachesByActionNote());

            psrmClassUpdate.setPartAInd24TeacherAskedNextStepStatus(psrmClass.getPartAInd24TeacherAskedNextStepStatus());
            psrmClassUpdate.setPartAInd24TeacherAskedNextStepNote(psrmClass.getPartAInd24TeacherAskedNextStepNote());

            psrmClassUpdate.setPartAInd25TeacherSelectedBookAsLevelStatus(psrmClass.getPartAInd25TeacherSelectedBookAsLevelStatus());
            psrmClassUpdate.setPartAInd25TeacherSelectedBookAsLevelNote(psrmClass.getPartAInd25TeacherSelectedBookAsLevelNote());

            psrmClassUpdate.setPartAInd26TeacherAskedToParticipateInReadingStatus(psrmClass.getPartAInd26TeacherAskedToParticipateInReadingStatus());
            psrmClassUpdate.setPartAInd26TeacherAskedToParticipateInReadingNote(psrmClass.getPartAInd26TeacherAskedToParticipateInReadingNote());

            psrmClassUpdate.setPartAInd31TeacherAllowToBCOStatus(psrmClass.getPartAInd31TeacherAllowToBCOStatus());
            psrmClassUpdate.setPartAInd31TeacherAllowToBCONote(psrmClass.getPartAInd31TeacherAllowToBCONote());

            psrmClassUpdate.setPartAInd32TeacherAskedQuestionForAssessmentStatus(psrmClass.getPartAInd32TeacherAskedQuestionForAssessmentStatus());
            psrmClassUpdate.setPartAInd32TeacherAskedQuestionForAssessmentNote(psrmClass.getPartAInd32TeacherAskedQuestionForAssessmentNote());

            psrmClassUpdate.setPartAInd33TeacherParticipateStudentToSRMStatus(psrmClass.getPartAInd33TeacherParticipateStudentToSRMStatus());
            psrmClassUpdate.setPartAInd33TeacherParticipateStudentToSRMNote(psrmClass.getPartAInd33TeacherParticipateStudentToSRMNote());

            psrmClassUpdate.setPartAInd34TeacherCongratulatedStudentStatus(psrmClass.getPartAInd34TeacherCongratulatedStudentStatus());
            psrmClassUpdate.setPartAInd34TeacherCongratulatedStudentNote(psrmClass.getPartAInd34TeacherCongratulatedStudentNote());

            psrmClassUpdate.setBestPracticeIndicator1PartA(psrmClass.getBestPracticeIndicator1PartA());
            psrmClassUpdate.setBestPracticeIndicator2PartA(psrmClass.getBestPracticeIndicator2PartA());

            psrmClassUpdate.setCoachingSupportIndicator1PartA(psrmClass.getCoachingSupportIndicator1PartA());
            psrmClassUpdate.setCoachingSupportIndicator2PartA(psrmClass.getCoachingSupportIndicator2PartA());

            psrmClassUpdate.setAgreedStatementTeacherPartA(psrmClass.getAgreedStatementTeacherPartA());
            psrmClassUpdate.setAgreedStatementLFPartA(psrmClass.getAgreedStatementLFPartA());

            /// ///

            psrmClassUpdate.setPartBInd11TeacherHelpedStudentToSeatStatus(psrmClass.getPartBInd11TeacherHelpedStudentToSeatStatus());
            psrmClassUpdate.setPartBInd11TeacherHelpedStudentToSeatNote(psrmClass.getPartBInd11TeacherHelpedStudentToSeatNote());

            psrmClassUpdate.setPartBInd12TeacherInstructSRMStatus(psrmClass.getPartBInd12TeacherInstructSRMStatus());
            psrmClassUpdate.setPartAInd12TeacherShowedABookDetailNote(psrmClass.getPartBInd12TeacherInstructSRMNote());

            psrmClassUpdate.setPartBInd13TeacherCheckedBookLevelStatus(psrmClass.getPartBInd13TeacherCheckedBookLevelStatus());
            psrmClassUpdate.setPartBInd13TeacherCheckedBookLevelNote(psrmClass.getPartBInd13TeacherCheckedBookLevelNote());

            psrmClassUpdate.setPartBInd21TeacherListenAndAskQuestionStatus(psrmClass.getPartBInd21TeacherListenAndAskQuestionStatus());
            psrmClassUpdate.setPartBInd21TeacherListenAndAskQuestionStatus(psrmClass.getPartBInd21TeacherListenAndAskQuestionNote());

            psrmClassUpdate.setPartBInd22TeacherCheckedStudentParticipationStatus(psrmClass.getPartBInd22TeacherCheckedStudentParticipationStatus());
            psrmClassUpdate.setPartBInd22TeacherCheckedStudentParticipationNote(psrmClass.getPartBInd22TeacherCheckedStudentParticipationNote());

            psrmClassUpdate.setPartBInd31TeacherHelpedStudentToShareStatus(psrmClass.getPartBInd31TeacherHelpedStudentToShareStatus());
            psrmClassUpdate.setPartBInd31TeacherHelpedStudentToShareNote(psrmClass.getPartBInd31TeacherHelpedStudentToShareNote());

            psrmClassUpdate.setPartBInd32TeacherInspiredStudentEffortStatus(psrmClass.getPartBInd32TeacherInspiredStudentEffortStatus());
            psrmClassUpdate.setPartBInd32TeacherInspiredStudentEffortNote(psrmClass.getPartBInd32TeacherInspiredStudentEffortNote());

            psrmClassUpdate.setPartBInd33TeacherInspiredStudentForSRMStatus(psrmClass.getPartBInd33TeacherInspiredStudentForSRMStatus());
            psrmClassUpdate.setPartBInd33TeacherInspiredStudentForSRMNote(psrmClass.getPartBInd33TeacherInspiredStudentForSRMNote());

            psrmClassUpdate.setPartBInd34TeacherAllowedStudentToBCOStatus(psrmClass.getPartBInd34TeacherAllowedStudentToBCOStatus());
            psrmClassUpdate.setPartBInd34TeacherAllowedStudentToBCONote(psrmClass.getPartBInd34TeacherAllowedStudentToBCONote());


            psrmClassUpdate.setBestPracticeIndicator1PartB(psrmClass.getBestPracticeIndicator1PartB());
            psrmClassUpdate.setBestPracticeIndicator2PartB(psrmClass.getBestPracticeIndicator2PartB());

            psrmClassUpdate.setCoachingSupportIndicator1PartB(psrmClass.getCoachingSupportIndicator1PartB());
            psrmClassUpdate.setCoachingSupportIndicator2PartB(psrmClass.getCoachingSupportIndicator2PartB());

            psrmClassUpdate.setAgreedStatementTeacherPartB(psrmClass.getAgreedStatementTeacherPartB());
            psrmClassUpdate.setAgreedStatementLFPartB(psrmClass.getAgreedStatementLFPartB());


            psrmClassUpdate.setTeacherStatus(psrmClass.getTeacherStatus());


            psrmClassUpdate.setIsChecked(psrmClass.getIsChecked());
            psrmClassUpdate.setIsActive(psrmClass.getIsActive());
            psrmClassUpdate.setIsDeleted(psrmClass.getIsDeleted());

            psrmClassRepo.save(psrmClassUpdate);
            return psrmClassUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + psrmClass.getId());

        }

    }

    // Delete PSRMClass
    public void deletePSRMClass(long id) {
        Optional<PSRMClass> psrmClassDb = this.psrmClassRepo.findById(id);

        if (psrmClassDb.isPresent()) {
            this.psrmClassRepo.delete(psrmClassDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }
}
