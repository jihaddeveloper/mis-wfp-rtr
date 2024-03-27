//  Author: Mohammad Jihad Hossain
//  Create Date: 26/02/2023
//  Modify Date: 26/02/2023
//  Description: CoreBanglaClassService file


package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DIBanglaClass;
import com.jihad.rtr.wfp.repository.DIBanglaClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DIBanglaClassService {


    @Autowired
    private DIBanglaClassRepo diBanglaClassRepo;

    //Create new DIBanglaClass
    public DIBanglaClass createDIBanglaClass(DIBanglaClass diBanglaClass) {
        return diBanglaClassRepo.save(diBanglaClass);
    }

    //Get all DIBanglaClass
    public List<DIBanglaClass> getAllDIBanglaClass() {
        return diBanglaClassRepo.findAll();
    }

    //Get DIBanglaClass with id
    public DIBanglaClass getDIBanglaClassById(long id) {
        Optional<DIBanglaClass> diBanglaClassDB = diBanglaClassRepo.findById(id);
        if (diBanglaClassDB.isPresent()) {
            return diBanglaClassDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update DIBanglaClass
    public DIBanglaClass updateDIBanglaClass(DIBanglaClass diBanglaClass) {
        Optional<DIBanglaClass> diBanglaClassDB = diBanglaClassRepo.findById(diBanglaClass.getId());

        if (diBanglaClassDB.isPresent()) {
            DIBanglaClass diBanglaClassUpdate = diBanglaClassDB.get();
            diBanglaClassUpdate.setId(diBanglaClass.getId());
            diBanglaClassUpdate.setDate(diBanglaClass.getDate());
            diBanglaClassUpdate.setMonth(diBanglaClass.getMonth());
            diBanglaClassUpdate.setYear(diBanglaClass.getYear());
            diBanglaClassUpdate.setDistrict(diBanglaClass.getDistrict());
            diBanglaClassUpdate.setUpazilla(diBanglaClass.getUpazilla());
            diBanglaClassUpdate.setFieldOffice(diBanglaClass.getFieldOffice());
            diBanglaClassUpdate.setRtrSchoolId(diBanglaClass.getRtrSchoolId());
            diBanglaClassUpdate.setYearOfSupport(diBanglaClass.getYearOfSupport());
            diBanglaClassUpdate.setProject(diBanglaClass.getProject());
            diBanglaClassUpdate.setVisitNo(diBanglaClass.getVisitNo());
            diBanglaClassUpdate.setLf(diBanglaClass.getLf());
            diBanglaClassUpdate.setLfName(diBanglaClass.getLfName());
            diBanglaClassUpdate.setLpo(diBanglaClass.getLpo());
            diBanglaClassUpdate.setLpoName(diBanglaClass.getLpoName());
            diBanglaClassUpdate.setSchool(diBanglaClass.getSchool());
            diBanglaClassUpdate.setVisitor(diBanglaClass.getVisitor());
            diBanglaClassUpdate.setVisitorDesignation(diBanglaClass.getVisitorDesignation());
            diBanglaClassUpdate.setVisitorOffice(diBanglaClass.getVisitorOffice());
            diBanglaClassUpdate.setClassTeacher(diBanglaClass.getClassTeacher());
            diBanglaClassUpdate.setTeacherGender(diBanglaClass.getTeacherGender());
            diBanglaClassUpdate.setIsTrained(diBanglaClass.getIsTrained());
            diBanglaClassUpdate.setGrade(diBanglaClass.getGrade());
            diBanglaClassUpdate.setSection(diBanglaClass.getSection());
            diBanglaClassUpdate.setClassStartTime(diBanglaClass.getClassStartTime());
            diBanglaClassUpdate.setClassEndTime(diBanglaClass.getClassEndTime());
            diBanglaClassUpdate.setContentName(diBanglaClass.getContentName());
            diBanglaClassUpdate.setPeriodDay(diBanglaClass.getPeriodDay());
            diBanglaClassUpdate.setTotalAdmittedStudent(diBanglaClass.getTotalAdmittedStudent());
            diBanglaClassUpdate.setTotalAdmittedGirl(diBanglaClass.getTotalAdmittedGirl());
            diBanglaClassUpdate.setTotalAdmittedBoy(diBanglaClass.getTotalAdmittedBoy());
            diBanglaClassUpdate.setTotalPresentStudent(diBanglaClass.getTotalPresentStudent());
            diBanglaClassUpdate.setTotalPresentGirl(diBanglaClass.getTotalPresentGirl());
            diBanglaClassUpdate.setTotalPresentBoy(diBanglaClass.getTotalPresentBoy());


            diBanglaClassUpdate.setLastFollowupTopic1(diBanglaClass.getLastFollowupTopic1());
            diBanglaClassUpdate.setLastFollowupTopic2(diBanglaClass.getLastFollowupTopic2());
            diBanglaClassUpdate.setLastFollowupTopic3(diBanglaClass.getLastFollowupTopic3());

            diBanglaClassUpdate.setInd11TeacherFollowedTeacherGuideInClassStatus(diBanglaClass.getInd11TeacherFollowedTeacherGuideInClassStatus());
            diBanglaClassUpdate.setInd11TeacherFollowedTeacherGuideInClassNote(diBanglaClass.getInd11TeacherFollowedTeacherGuideInClassNote());
            diBanglaClassUpdate.setInd12FollowedIDoWeDoYouDoStatus(diBanglaClass.getInd12FollowedIDoWeDoYouDoStatus());
            diBanglaClassUpdate.setInd12FollowedIDoWeDoYouDoNote(diBanglaClass.getInd12FollowedIDoWeDoYouDoNote());
            diBanglaClassUpdate.setInd13FollowedContinuityOfLessonStatus(diBanglaClass.getInd13FollowedContinuityOfLessonStatus());
            diBanglaClassUpdate.setInd13FollowedContinuityOfLessonNote(diBanglaClass.getInd13FollowedContinuityOfLessonNote());
            diBanglaClassUpdate.setInd14ImplementedAllTaskInTimeStatus(diBanglaClass.getInd14ImplementedAllTaskInTimeStatus());
            diBanglaClassUpdate.setInd14ImplementedAllTaskInTimeNote(diBanglaClass.getInd14ImplementedAllTaskInTimeNote());
            diBanglaClassUpdate.setInd15InstructedToUseWorkbookStatus(diBanglaClass.getInd15InstructedToUseWorkbookStatus());
            diBanglaClassUpdate.setInd15InstructedToUseWorkbookNote(diBanglaClass.getInd15InstructedToUseWorkbookNote());
            diBanglaClassUpdate.setInd16IndependentReadingOpportunityStatus(diBanglaClass.getInd16IndependentReadingOpportunityStatus());
            diBanglaClassUpdate.setInd16IndependentReadingOpportunityNote(diBanglaClass.getInd16IndependentReadingOpportunityNote());
            diBanglaClassUpdate.setInd21CorrectlyPronouncedStatus(diBanglaClass.getInd21CorrectlyPronouncedStatus());
            diBanglaClassUpdate.setInd21CorrectlyPronouncedNote(diBanglaClass.getInd21CorrectlyPronouncedNote());
            diBanglaClassUpdate.setInd22TaughtCorrectlyAllowPracticeStatus(diBanglaClass.getInd22TaughtCorrectlyAllowPracticeStatus());
            diBanglaClassUpdate.setInd22TaughtCorrectlyAllowPracticeNote(diBanglaClass.getInd22TaughtCorrectlyAllowPracticeNote());
            diBanglaClassUpdate.setInd23DemonstratesFluentReadingStatus(diBanglaClass.getInd23DemonstratesFluentReadingStatus());
            diBanglaClassUpdate.setInd23DemonstratesFluentReadingNote(diBanglaClass.getInd23DemonstratesFluentReadingNote());
            diBanglaClassUpdate.setInd24AllowReadIndividuallyPairGroupsStatus(diBanglaClass.getInd24AllowReadIndividuallyPairGroupsStatus());
            diBanglaClassUpdate.setInd24AllowReadIndividuallyPairGroupsNote(diBanglaClass.getInd24AllowReadIndividuallyPairGroupsNote());
            diBanglaClassUpdate.setInd25FollowsInstructionsInWritingStatus(diBanglaClass.getInd25FollowsInstructionsInWritingStatus());
            diBanglaClassUpdate.setInd25FollowsInstructionsInWritingNote(diBanglaClass.getInd25FollowsInstructionsInWritingNote());
            diBanglaClassUpdate.setInd31AskedHelpfulQuestionsStatus(diBanglaClass.getInd31AskedHelpfulQuestionsStatus());
            diBanglaClassUpdate.setInd31AskedHelpfulQuestionsNote(diBanglaClass.getInd31AskedHelpfulQuestionsNote());
            diBanglaClassUpdate.setInd32TaughtVocabularyNewSentenceStatus(diBanglaClass.getInd32TaughtVocabularyNewSentenceStatus());
            diBanglaClassUpdate.setInd32TaughtVocabularyNewSentenceNote(diBanglaClass.getInd32TaughtVocabularyNewSentenceNote());
            diBanglaClassUpdate.setInd33CheckWritingSpellingPunctuationStatus(diBanglaClass.getInd33CheckWritingSpellingPunctuationStatus());
            diBanglaClassUpdate.setInd33CheckWritingSpellingPunctuationNote(diBanglaClass.getInd33CheckWritingSpellingPunctuationNote());
            diBanglaClassUpdate.setInd34CheckedWeDoYouDoStatus(diBanglaClass.getInd34CheckedWeDoYouDoStatus());
            diBanglaClassUpdate.setInd34CheckedWeDoYouDoNote(diBanglaClass.getInd34CheckedWeDoYouDoNote());


            diBanglaClassUpdate.setBestPracticeInd1(diBanglaClass.getBestPracticeInd1());
            diBanglaClassUpdate.setBestPracticeInd2(diBanglaClass.getBestPracticeInd2());
            diBanglaClassUpdate.setBestPracticeInd3(diBanglaClass.getBestPracticeInd3());

            diBanglaClassUpdate.setCoachingSupportInd1(diBanglaClass.getCoachingSupportInd1());
            diBanglaClassUpdate.setCoachingSupportInd2(diBanglaClass.getCoachingSupportInd2());

            diBanglaClassUpdate.setCoachingSupportTeacher(diBanglaClass.getCoachingSupportTeacher());
            diBanglaClassUpdate.setCoachingSupportLF(diBanglaClass.getCoachingSupportLF());

            diBanglaClassUpdate.setAgreedStatement1(diBanglaClass.getAgreedStatement1());
            diBanglaClassUpdate.setAgreedStatement2(diBanglaClass.getAgreedStatement2());

            diBanglaClassUpdate.setQuestion1(diBanglaClass.getQuestion1());


            diBanglaClassUpdate.setTeacherStatus(diBanglaClass.getTeacherStatus());

            diBanglaClassUpdate.setIsActive(diBanglaClass.getIsActive());
            diBanglaClassUpdate.setIsDeleted(diBanglaClass.getIsDeleted());

            diBanglaClassRepo.save(diBanglaClassUpdate);

            return diBanglaClassUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + diBanglaClass.getId());
        }
    }

    //Delete DIBanglaClass
    public void deleteDIBanglaClass(long id) {
        Optional<DIBanglaClass> diBanglaClassDB = this.diBanglaClassRepo.findById(id);

        if (diBanglaClassDB.isPresent()) {
            this.diBanglaClassRepo.delete(diBanglaClassDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
