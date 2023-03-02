//  Author: Mohammad Jihad Hossain
//  Create Date: 26/02/2023
//  Modify Date: 26/02/2023
//  Description: CoreBanglaClassService file


package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.CoreBanglaClass;
import com.jihad.rtr.wfp.repository.BanglaIndicatorRepo;
import com.jihad.rtr.wfp.repository.CoreBanglaClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CoreBanglaClassService {


    @Autowired
    private CoreBanglaClassRepo coreBanglaClassRepo;

    //Create new CoreBanglaClass
    public CoreBanglaClass createCoreBanglaClass(CoreBanglaClass coreBanglaClass) {
        return coreBanglaClassRepo.save(coreBanglaClass);
    }

    //Get all CoreBanglaClass
    public List<CoreBanglaClass> getAllCoreBanglaClass() {
        return coreBanglaClassRepo.findAll();
    }

    //Get CoreBanglaClass with id
    public CoreBanglaClass getCoreBanglaClassById(long id) {
        Optional<CoreBanglaClass> coreBanglaClassDB = coreBanglaClassRepo.findById(id);
        if (coreBanglaClassDB.isPresent()) {
            return coreBanglaClassDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update CoreBanglaClass
    public CoreBanglaClass updateCoreBanglaClass(CoreBanglaClass coreBanglaClass) {
        Optional<CoreBanglaClass> coreBanglaClassDB = coreBanglaClassRepo.findById(coreBanglaClass.getId());

        if (coreBanglaClassDB.isPresent()) {
            CoreBanglaClass coreBanglaClassUpdate = coreBanglaClassDB.get();
            coreBanglaClassUpdate.setId(coreBanglaClass.getId());
            coreBanglaClassUpdate.setDate(coreBanglaClass.getDate());
            coreBanglaClassUpdate.setMonth(coreBanglaClass.getMonth());
            coreBanglaClassUpdate.setYear(coreBanglaClass.getYear());
            coreBanglaClassUpdate.setDistrict(coreBanglaClass.getDistrict());
            coreBanglaClassUpdate.setUpazilla(coreBanglaClass.getUpazilla());
            coreBanglaClassUpdate.setFieldOffice(coreBanglaClass.getFieldOffice());
            coreBanglaClassUpdate.setProject(coreBanglaClass.getProject());
            coreBanglaClassUpdate.setProject(coreBanglaClass.getProject());
            coreBanglaClassUpdate.setVisitNo(coreBanglaClass.getVisitNo());
            coreBanglaClassUpdate.setLf(coreBanglaClass.getLf());
            coreBanglaClassUpdate.setLfName(coreBanglaClass.getLfName());
            coreBanglaClassUpdate.setLpo(coreBanglaClass.getLpo());
            coreBanglaClassUpdate.setLpoName(coreBanglaClass.getLpoName());
            coreBanglaClassUpdate.setSchool(coreBanglaClass.getSchool());
            coreBanglaClassUpdate.setVisitor(coreBanglaClass.getVisitor());
            coreBanglaClassUpdate.setVisitorDesignation(coreBanglaClass.getVisitorDesignation());
            coreBanglaClassUpdate.setVisitorOffice(coreBanglaClass.getVisitorOffice());
            coreBanglaClassUpdate.setClassTeacher(coreBanglaClass.getClassTeacher());
            coreBanglaClassUpdate.setTeacherGender(coreBanglaClass.getTeacherGender());
            coreBanglaClassUpdate.setIsTrained(coreBanglaClass.getIsTrained());
            coreBanglaClassUpdate.setGrade(coreBanglaClass.getGrade());
            coreBanglaClassUpdate.setSection(coreBanglaClass.getSection());
            coreBanglaClassUpdate.setClassStartTime(coreBanglaClass.getClassStartTime());
            coreBanglaClassUpdate.setClassEndTime(coreBanglaClass.getClassEndTime());
            coreBanglaClassUpdate.setContentName(coreBanglaClass.getContentName());
            coreBanglaClassUpdate.setPeriodDay(coreBanglaClass.getPeriodDay());
            coreBanglaClassUpdate.setTotalAdmittedStudent(coreBanglaClass.getTotalAdmittedStudent());
            coreBanglaClassUpdate.setTotalAdmittedGirl(coreBanglaClass.getTotalAdmittedGirl());
            coreBanglaClassUpdate.setTotalAdmittedBoy(coreBanglaClass.getTotalAdmittedBoy());
            coreBanglaClassUpdate.setTotalPresentStudent(coreBanglaClass.getTotalPresentStudent());
            coreBanglaClassUpdate.setTotalPresentGirl(coreBanglaClass.getTotalPresentGirl());
            coreBanglaClassUpdate.setTotalPresentBoy(coreBanglaClass.getTotalPresentBoy());


            coreBanglaClassUpdate.setLastFollowupTopic1(coreBanglaClass.getLastFollowupTopic1());
            coreBanglaClassUpdate.setLastFollowupTopic2(coreBanglaClass.getLastFollowupTopic2());
            coreBanglaClassUpdate.setLastFollowupTopic3(coreBanglaClass.getLastFollowupTopic3());

            coreBanglaClassUpdate.setInd11FollowedTeacherManualStatus(coreBanglaClass.getInd11FollowedTeacherManualStatus());
            coreBanglaClassUpdate.setInd11FollowedTeacherManualNotes(coreBanglaClass.getInd11FollowedTeacherManualNotes());
            coreBanglaClassUpdate.setInd12FollowedIWeYouDoStatus(coreBanglaClass.getInd12FollowedIWeYouDoStatus());
            coreBanglaClassUpdate.setInd12FollowedIWeYouDoNotes(coreBanglaClass.getInd12FollowedIWeYouDoNotes());
            coreBanglaClassUpdate.setInd13AllowedOpenReadingStatus(coreBanglaClass.getInd13AllowedOpenReadingStatus());
            coreBanglaClassUpdate.setInd13AllowedOpenReadingNotes(coreBanglaClass.getInd13AllowedOpenReadingNotes());
            coreBanglaClassUpdate.setInd14TeachingContinuityStatus(coreBanglaClass.getInd14TeachingContinuityStatus());
            coreBanglaClassUpdate.setInd14TeachingContinuityNotes(coreBanglaClass.getInd14TeachingContinuityNotes());
            coreBanglaClassUpdate.setInd15WorkbookUsingInstructionStatus(coreBanglaClass.getInd15WorkbookUsingInstructionStatus());
            coreBanglaClassUpdate.setInd15WorkbookUsingInstructionNotes(coreBanglaClass.getInd15WorkbookUsingInstructionNotes());
            coreBanglaClassUpdate.setInd16StepContinuityStatus(coreBanglaClass.getInd16StepContinuityStatus());
            coreBanglaClassUpdate.setInd16StepContinuityNotes(coreBanglaClass.getInd16StepContinuityNotes());
            coreBanglaClassUpdate.setInd21FollowedAllStepIntimeStatus(coreBanglaClass.getInd21FollowedAllStepIntimeStatus());
            coreBanglaClassUpdate.setInd21FollowedAllStepIntimeNotes(coreBanglaClass.getInd21FollowedAllStepIntimeNotes());
            coreBanglaClassUpdate.setInd22CorrectPronunciationStatus(coreBanglaClass.getInd22CorrectPronunciationStatus());
            coreBanglaClassUpdate.setInd22CorrectPronunciationNotes(coreBanglaClass.getInd22CorrectPronunciationNotes());
            coreBanglaClassUpdate.setInd23TeachingAndPracticeStatus(coreBanglaClass.getInd23TeachingAndPracticeStatus());
            coreBanglaClassUpdate.setInd23TeachingAndPracticeNotes(coreBanglaClass.getInd23TeachingAndPracticeNotes());
            coreBanglaClassUpdate.setInd24FluentReadingStatus(coreBanglaClass.getInd24FluentReadingStatus());
            coreBanglaClassUpdate.setInd24FluentReadingNotes(coreBanglaClass.getInd24FluentReadingNotes());
            coreBanglaClassUpdate.setInd25MultipleReadingPracticeStatus(coreBanglaClass.getInd25MultipleReadingPracticeStatus());
            coreBanglaClassUpdate.setInd25MultipleReadingPracticeNotes(coreBanglaClass.getInd25MultipleReadingPracticeNotes());
            coreBanglaClassUpdate.setInd31AskedQuestionStatus(coreBanglaClass.getInd31AskedQuestionStatus());
            coreBanglaClassUpdate.setInd31AskedQuestionNotes(coreBanglaClass.getInd31AskedQuestionNotes());
            coreBanglaClassUpdate.setInd32VocabularyWordUsingStatus(coreBanglaClass.getInd32VocabularyWordUsingStatus());
            coreBanglaClassUpdate.setInd32VocabularyWordUsingNotes(coreBanglaClass.getInd32VocabularyWordUsingNotes());
            coreBanglaClassUpdate.setInd33CheckedSpellingStatus(coreBanglaClass.getInd33CheckedSpellingStatus());
            coreBanglaClassUpdate.setInd33CheckedSpellingNotes(coreBanglaClass.getInd33CheckedSpellingNotes());
            coreBanglaClassUpdate.setInd34WeYouParticipationCheckStatus(coreBanglaClass.getInd34WeYouParticipationCheckStatus());
            coreBanglaClassUpdate.setInd34WeYouParticipationCheckNotes(coreBanglaClass.getInd34WeYouParticipationCheckNotes());


            coreBanglaClassUpdate.setBestPracticeInd1(coreBanglaClass.getBestPracticeInd1());
            coreBanglaClassUpdate.setBestPracticeInd2(coreBanglaClass.getBestPracticeInd2());
            coreBanglaClassUpdate.setBestPracticeInd3(coreBanglaClass.getBestPracticeInd3());

            coreBanglaClassUpdate.setCoachingSupportInd1(coreBanglaClass.getCoachingSupportInd1());
            coreBanglaClassUpdate.setCoachingSupportInd2(coreBanglaClass.getCoachingSupportInd2());
            coreBanglaClassUpdate.setCoachingSupportTeacher(coreBanglaClass.getCoachingSupportTeacher());
            coreBanglaClassUpdate.setCoachingSupportLF(coreBanglaClass.getCoachingSupportLF());

            coreBanglaClassUpdate.setAgreedStatement1(coreBanglaClass.getAgreedStatement1());
            coreBanglaClassUpdate.setAgreedStatement2(coreBanglaClass.getAgreedStatement2());

            coreBanglaClassUpdate.setQuestion1(coreBanglaClass.getQuestion1());


            coreBanglaClassUpdate.setTeacherStatus(coreBanglaClass.getTeacherStatus());

            coreBanglaClassUpdate.setIsActive(coreBanglaClass.getIsActive());
            coreBanglaClassUpdate.setIsDeleted(coreBanglaClass.getIsDeleted());

            coreBanglaClassRepo.save(coreBanglaClassUpdate);

            return coreBanglaClassUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + coreBanglaClass.getId());
        }
    }

    //Delete BanglaIndicator
    public void deleteCoreBanglaClass(long id) {
        Optional<CoreBanglaClass> coreBanglaClassDB = this.coreBanglaClassRepo.findById(id);

        if (coreBanglaClassDB.isPresent()) {
            this.coreBanglaClassRepo.delete(coreBanglaClassDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
