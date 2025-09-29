//  Author: Mohammad Jihad Hossain
//  Create Date: 09/09/2025
//  Modify Date: 09/09/2025
//  Description: PBanglaClassService file

package com.jihad.rtr.wfp.service.prevail;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DIBanglaClass;
import com.jihad.rtr.wfp.model.prevail.PBanglaClass;
import com.jihad.rtr.wfp.repository.DIBanglaClassRepo;
import com.jihad.rtr.wfp.repository.prevail.PBanglaClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PBanglaClassService {

    @Autowired
    private PBanglaClassRepo pBanglaClassRepo;

    //Create new PBanglaClass
    public PBanglaClass createPBanglaClass(PBanglaClass pBanglaClass) {
        return pBanglaClassRepo.save(pBanglaClass);
    }

    //Get all PBanglaClass
    public List<PBanglaClass> getAllPBanglaClass() {
        return pBanglaClassRepo.findAll();
    }

    //Get PBanglaClass with id
    public PBanglaClass getPBanglaClassById(long id) {
        Optional<PBanglaClass> pBanglaClassDB = pBanglaClassRepo.findById(id);
        if (pBanglaClassDB.isPresent()) {
            return pBanglaClassDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update PBanglaClass
    public PBanglaClass updatePBanglaClass(PBanglaClass pBanglaClass) {
        Optional<PBanglaClass> pBanglaClassDB = pBanglaClassRepo.findById(pBanglaClass.getId());

        if (pBanglaClassDB.isPresent()) {
            PBanglaClass pBanglaClassUpdate = pBanglaClassDB.get();


            pBanglaClassUpdate.setId(pBanglaClass.getId());
            pBanglaClassUpdate.setDate(pBanglaClass.getDate());
            pBanglaClassUpdate.setMonth(pBanglaClass.getMonth());
            pBanglaClassUpdate.setYear(pBanglaClass.getYear());
            pBanglaClassUpdate.setDistrict(pBanglaClass.getDistrict());
            pBanglaClassUpdate.setUpazilla(pBanglaClass.getUpazilla());
            pBanglaClassUpdate.setFieldOffice(pBanglaClass.getFieldOffice());
            pBanglaClassUpdate.setRtrSchoolId(pBanglaClass.getRtrSchoolId());
            pBanglaClassUpdate.setYearOfSupport(pBanglaClass.getYearOfSupport());
            pBanglaClassUpdate.setProject(pBanglaClass.getProject());
            pBanglaClassUpdate.setVisitNo(pBanglaClass.getVisitNo());
            pBanglaClassUpdate.setLf(pBanglaClass.getLf());
            pBanglaClassUpdate.setLfName(pBanglaClass.getLfName());
            pBanglaClassUpdate.setLpo(pBanglaClass.getLpo());
            pBanglaClassUpdate.setLpoName(pBanglaClass.getLpoName());
            pBanglaClassUpdate.setSchool(pBanglaClass.getSchool());
            pBanglaClassUpdate.setVisitor(pBanglaClass.getVisitor());
            pBanglaClassUpdate.setVisitorDesignation(pBanglaClass.getVisitorDesignation());
            pBanglaClassUpdate.setVisitorOffice(pBanglaClass.getVisitorOffice());
            pBanglaClassUpdate.setClassTeacher(pBanglaClass.getClassTeacher());
            pBanglaClassUpdate.setTeacherGender(pBanglaClass.getTeacherGender());
            pBanglaClassUpdate.setIsTrained(pBanglaClass.getIsTrained());
            pBanglaClassUpdate.setGrade(pBanglaClass.getGrade());
            pBanglaClassUpdate.setSection(pBanglaClass.getSection());
            pBanglaClassUpdate.setClassStartTime(pBanglaClass.getClassStartTime());
            pBanglaClassUpdate.setClassEndTime(pBanglaClass.getClassEndTime());
            pBanglaClassUpdate.setContentName(pBanglaClass.getContentName());
            pBanglaClassUpdate.setPeriodDay(pBanglaClass.getPeriodDay());
            pBanglaClassUpdate.setTotalAdmittedStudent(pBanglaClass.getTotalAdmittedStudent());
            pBanglaClassUpdate.setTotalPresentStudent(pBanglaClass.getTotalPresentStudent());

            pBanglaClassUpdate.setNote(pBanglaClass.getNote());

            pBanglaClassUpdate.setLastFollowupTopic1(pBanglaClass.getLastFollowupTopic1());
            pBanglaClassUpdate.setLastFollowupTopic2(pBanglaClass.getLastFollowupTopic2());
            pBanglaClassUpdate.setLastFollowupTopic3(pBanglaClass.getLastFollowupTopic3());

            pBanglaClassUpdate.setInd11TeacherFollowedTeacherGuideInClassStatus(pBanglaClass.getInd11TeacherFollowedTeacherGuideInClassStatus());
            pBanglaClassUpdate.setInd11TeacherFollowedTeacherGuideInClassNote(pBanglaClass.getInd11TeacherFollowedTeacherGuideInClassNote());
            pBanglaClassUpdate.setInd12FollowedIDoWeDoYouDoStatus(pBanglaClass.getInd12FollowedIDoWeDoYouDoStatus());
            pBanglaClassUpdate.setInd12FollowedIDoWeDoYouDoNote(pBanglaClass.getInd12FollowedIDoWeDoYouDoNote());
            pBanglaClassUpdate.setInd13FollowedContinuityOfLessonStatus(pBanglaClass.getInd13FollowedContinuityOfLessonStatus());
            pBanglaClassUpdate.setInd13FollowedContinuityOfLessonNote(pBanglaClass.getInd13FollowedContinuityOfLessonNote());
            pBanglaClassUpdate.setInd14ImplementedAllTaskInTimeStatus(pBanglaClass.getInd14ImplementedAllTaskInTimeStatus());
            pBanglaClassUpdate.setInd14ImplementedAllTaskInTimeNote(pBanglaClass.getInd14ImplementedAllTaskInTimeNote());
            pBanglaClassUpdate.setInd15InstructedToUseWorkbookStatus(pBanglaClass.getInd15InstructedToUseWorkbookStatus());
            pBanglaClassUpdate.setInd15InstructedToUseWorkbookNote(pBanglaClass.getInd15InstructedToUseWorkbookNote());
            pBanglaClassUpdate.setInd16IndependentReadingOpportunityStatus(pBanglaClass.getInd16IndependentReadingOpportunityStatus());
            pBanglaClassUpdate.setInd16IndependentReadingOpportunityNote(pBanglaClass.getInd16IndependentReadingOpportunityNote());
            pBanglaClassUpdate.setInd21CorrectlyPronouncedStatus(pBanglaClass.getInd21CorrectlyPronouncedStatus());
            pBanglaClassUpdate.setInd21CorrectlyPronouncedNote(pBanglaClass.getInd21CorrectlyPronouncedNote());
            pBanglaClassUpdate.setInd22TaughtCorrectlyAllowPracticeStatus(pBanglaClass.getInd22TaughtCorrectlyAllowPracticeStatus());
            pBanglaClassUpdate.setInd22TaughtCorrectlyAllowPracticeNote(pBanglaClass.getInd22TaughtCorrectlyAllowPracticeNote());
            pBanglaClassUpdate.setInd23DemonstratesFluentReadingStatus(pBanglaClass.getInd23DemonstratesFluentReadingStatus());
            pBanglaClassUpdate.setInd23DemonstratesFluentReadingNote(pBanglaClass.getInd23DemonstratesFluentReadingNote());
            pBanglaClassUpdate.setInd24AllowReadIndividuallyPairGroupsStatus(pBanglaClass.getInd24AllowReadIndividuallyPairGroupsStatus());
            pBanglaClassUpdate.setInd24AllowReadIndividuallyPairGroupsNote(pBanglaClass.getInd24AllowReadIndividuallyPairGroupsNote());
            pBanglaClassUpdate.setInd25FollowsInstructionsInWritingStatus(pBanglaClass.getInd25FollowsInstructionsInWritingStatus());
            pBanglaClassUpdate.setInd25FollowsInstructionsInWritingNote(pBanglaClass.getInd25FollowsInstructionsInWritingNote());
            pBanglaClassUpdate.setInd31AskedHelpfulQuestionsStatus(pBanglaClass.getInd31AskedHelpfulQuestionsStatus());
            pBanglaClassUpdate.setInd31AskedHelpfulQuestionsNote(pBanglaClass.getInd31AskedHelpfulQuestionsNote());
            pBanglaClassUpdate.setInd32TaughtVocabularyNewSentenceStatus(pBanglaClass.getInd32TaughtVocabularyNewSentenceStatus());
            pBanglaClassUpdate.setInd32TaughtVocabularyNewSentenceNote(pBanglaClass.getInd32TaughtVocabularyNewSentenceNote());
            pBanglaClassUpdate.setInd33CheckWritingSpellingPunctuationStatus(pBanglaClass.getInd33CheckWritingSpellingPunctuationStatus());
            pBanglaClassUpdate.setInd33CheckWritingSpellingPunctuationNote(pBanglaClass.getInd33CheckWritingSpellingPunctuationNote());
            pBanglaClassUpdate.setInd34CheckedWeDoYouDoStatus(pBanglaClass.getInd34CheckedWeDoYouDoStatus());
            pBanglaClassUpdate.setInd34CheckedWeDoYouDoNote(pBanglaClass.getInd34CheckedWeDoYouDoNote());


            pBanglaClassUpdate.setBestPracticeInd1(pBanglaClass.getBestPracticeInd1());
            pBanglaClassUpdate.setBestPracticeInd2(pBanglaClass.getBestPracticeInd2());
            pBanglaClassUpdate.setBestPracticeInd3(pBanglaClass.getBestPracticeInd3());

            pBanglaClassUpdate.setCoachingSupportInd1(pBanglaClass.getCoachingSupportInd1());
            pBanglaClassUpdate.setCoachingSupportInd2(pBanglaClass.getCoachingSupportInd2());

            pBanglaClassUpdate.setCoachingSupportTeacher(pBanglaClass.getCoachingSupportTeacher());
            pBanglaClassUpdate.setCoachingSupportLF(pBanglaClass.getCoachingSupportLF());

            pBanglaClassUpdate.setAgreedStatement1(pBanglaClass.getAgreedStatement1());
            pBanglaClassUpdate.setAgreedStatement2(pBanglaClass.getAgreedStatement2());

            pBanglaClassUpdate.setQuestion1(pBanglaClass.getQuestion1());

            pBanglaClassUpdate.setStudent1(pBanglaClass.getStudent1());
            pBanglaClassUpdate.setStudent2(pBanglaClass.getStudent2());
            pBanglaClassUpdate.setStudent3(pBanglaClass.getStudent3());

            pBanglaClassUpdate.setNoRightFor1(pBanglaClass.getNoRightFor1());
            pBanglaClassUpdate.setNoWrongFor1(pBanglaClass.getNoWrongFor1());
            pBanglaClassUpdate.setTotalFor1(pBanglaClass.getTotalFor1());

            pBanglaClassUpdate.setNoRightFor2(pBanglaClass.getNoRightFor2());
            pBanglaClassUpdate.setNoWrongFor2(pBanglaClass.getNoWrongFor2());
            pBanglaClassUpdate.setTotalFor2(pBanglaClass.getTotalFor2());

            pBanglaClassUpdate.setNoRightFor3(pBanglaClass.getNoRightFor3());
            pBanglaClassUpdate.setNoWrongFor3(pBanglaClass.getNoWrongFor3());
            pBanglaClassUpdate.setTotalFor3(pBanglaClass.getTotalFor3());

            pBanglaClassUpdate.setTeacherStatus(pBanglaClass.getTeacherStatus());

            pBanglaClassUpdate.setIsChecked(pBanglaClass.getIsChecked());
            pBanglaClassUpdate.setIsActive(pBanglaClass.getIsActive());
            pBanglaClassUpdate.setIsDeleted(pBanglaClass.getIsDeleted());

            pBanglaClassRepo.save(pBanglaClassUpdate);

            return pBanglaClassUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + pBanglaClass.getId());
        }
    }

    //Delete PBanglaClass
    public void deletePBanglaClass(long id) {
        Optional<PBanglaClass> pBanglaClassDB = this.pBanglaClassRepo.findById(id);

        if (pBanglaClassDB.isPresent()) {
            this.pBanglaClassRepo.delete(pBanglaClassDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
