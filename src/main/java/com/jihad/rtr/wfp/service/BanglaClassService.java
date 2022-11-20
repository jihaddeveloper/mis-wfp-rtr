//  Author: Mohammad Jihad Hossain
//  Create Date: 15/11/2022
//  Modify Date: 15/11/2022
//  Description: Bangla class service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.repository.BanglaClassRepo;
import com.jihad.rtr.wfp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BanglaClassService {

    @Autowired
    private BanglaClassRepo banglaClassRepo;
    
    //Create new BanglaClass
    public BanglaClass createBanglaClass(BanglaClass banglaClass) {
        return banglaClassRepo.save(banglaClass);
    }

    //Get all BanglaClass
    public List<BanglaClass> getAllBanglaClass() {
        return banglaClassRepo.findAll();
    }

    //Get BanglaClass with id
    public BanglaClass getBanglaClassById(long id) {
        Optional<BanglaClass> banglaClassDB = banglaClassRepo.findById(id);
        if (banglaClassDB.isPresent()) {
            return banglaClassDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update BanglaClass
    public BanglaClass updateBanglaClass(BanglaClass banglaClass) {
        Optional<BanglaClass> banglaClassDB = banglaClassRepo.findById(banglaClass.getId());

        if (banglaClassDB.isPresent()) {
            BanglaClass banglaClassUpdate = banglaClassDB.get();
            banglaClassUpdate.setId(banglaClass.getId());
            banglaClassUpdate.setDate(banglaClass.getDate());
            banglaClassUpdate.setMonth(banglaClass.getMonth());
            banglaClassUpdate.setYear(banglaClass.getYear());
            banglaClassUpdate.setDistrict(banglaClass.getDistrict());
            banglaClassUpdate.setUpazilla(banglaClass.getUpazilla());
            banglaClassUpdate.setFieldOffice(banglaClass.getFieldOffice());
            banglaClassUpdate.setProject(banglaClass.getProject());
            banglaClassUpdate.setProject(banglaClass.getProject());
            banglaClassUpdate.setVisitNo(banglaClass.getVisitNo());
            banglaClassUpdate.setLf(banglaClass.getLf());
            banglaClassUpdate.setLfName(banglaClass.getLfName());
            banglaClassUpdate.setLpo(banglaClass.getLpo());
            banglaClassUpdate.setLpoName(banglaClass.getLpoName());
            banglaClassUpdate.setSchool(banglaClass.getSchool());
            banglaClassUpdate.setVisitor(banglaClass.getVisitor());
            banglaClassUpdate.setVisitorDesignation(banglaClass.getVisitorDesignation());
            banglaClassUpdate.setVisitorOffice(banglaClass.getVisitorOffice());
            banglaClassUpdate.setClassTeacher(banglaClass.getClassTeacher());
            banglaClassUpdate.setTeacherGender(banglaClass.getTeacherGender());
            banglaClassUpdate.setIsTrained(banglaClass.getIsTrained());
            banglaClassUpdate.setGrade(banglaClass.getGrade());
            banglaClassUpdate.setSection(banglaClass.getSection());
            banglaClassUpdate.setClassStartTime(banglaClass.getClassStartTime());
            banglaClassUpdate.setClassEndTime(banglaClass.getClassEndTime());
            banglaClassUpdate.setContentName(banglaClass.getContentName());
            banglaClassUpdate.setPeriodDay(banglaClass.getPeriodDay());
            banglaClassUpdate.setTotalAdmittedStudent(banglaClass.getTotalAdmittedStudent());
            banglaClassUpdate.setTotalAdmittedGirl(banglaClass.getTotalAdmittedGirl());
            banglaClassUpdate.setTotalAdmittedBoy(banglaClass.getTotalAdmittedBoy());
            banglaClassUpdate.setTotalPresentStudent(banglaClass.getTotalPresentStudent());
            banglaClassUpdate.setTotalPresentGirl(banglaClass.getTotalPresentGirl());
            banglaClassUpdate.setTotalPresentBoy(banglaClass.getTotalPresentBoy());


            banglaClassUpdate.setLastFollowupTopic1(banglaClass.getLastFollowupTopic1());
            banglaClassUpdate.setLastFollowupTopic2(banglaClass.getLastFollowupTopic2());
            banglaClassUpdate.setLastFollowupTopic3(banglaClass.getLastFollowupTopic3());

            banglaClassUpdate.setInd1PhonemicAwarenessStatus(banglaClass.getInd1PhonemicAwarenessStatus());
            banglaClassUpdate.setInd1PhonemicAwarenessNotes(banglaClass.getInd1PhonemicAwarenessNotes());
            banglaClassUpdate.setInd2LetterIdentificationStatus(banglaClass.getInd2LetterIdentificationStatus());
            banglaClassUpdate.setInd2LetterIdentificationNotes(banglaClass.getInd2LetterIdentificationNotes());
            banglaClassUpdate.setInd3VocabularyIdentificationStatus(banglaClass.getInd3VocabularyIdentificationStatus());
            banglaClassUpdate.setInd3VocabularyIdentificationNotes(banglaClass.getInd3VocabularyIdentificationNotes());
            banglaClassUpdate.setInd4FluencyIdentificationStatus(banglaClass.getInd4FluencyIdentificationStatus());
            banglaClassUpdate.setInd4FluencyIdentificationNotes(banglaClass.getInd4FluencyIdentificationNotes());
            banglaClassUpdate.setInd5ComprehensionStatus(banglaClass.getInd5ComprehensionStatus());
            banglaClassUpdate.setInd5ComprehensionNotes(banglaClass.getInd5ComprehensionNotes());
            banglaClassUpdate.setInd6WritingActivitiesStatus(banglaClass.getInd6WritingActivitiesStatus());
            banglaClassUpdate.setInd6WritingActivitiesNotes(banglaClass.getInd6WritingActivitiesNotes());
            banglaClassUpdate.setInd7IDoWeDoYouDoStatus(banglaClass.getInd7IDoWeDoYouDoStatus());
            banglaClassUpdate.setInd7IDoWeDoYouDoNotes(banglaClass.getInd7IDoWeDoYouDoNotes());
            banglaClassUpdate.setInd8GroupWorkStatus(banglaClass.getInd8GroupWorkStatus());
            banglaClassUpdate.setInd8GroupWorkNotes(banglaClass.getInd8GroupWorkNotes());
            banglaClassUpdate.setInd9TimeOnTaskStatus(banglaClass.getInd9TimeOnTaskStatus());
            banglaClassUpdate.setInd9TimeOnTaskNotes(banglaClass.getInd9TimeOnTaskNotes());
            banglaClassUpdate.setInd10UseTeachingAidStatus(banglaClass.getInd10UseTeachingAidStatus());
            banglaClassUpdate.setInd10UseTeachingAidNotes(banglaClass.getInd10UseTeachingAidNotes());
            banglaClassUpdate.setInd11ContinuityOfLessonsStatus(banglaClass.getInd11ContinuityOfLessonsStatus());
            banglaClassUpdate.setInd11ContinuityOfLessonsNotes(banglaClass.getInd11ContinuityOfLessonsNotes());
            banglaClassUpdate.setInd12AssessmentStatus(banglaClass.getInd12AssessmentStatus());
            banglaClassUpdate.setInd12AssessmentNotes(banglaClass.getInd12AssessmentNotes());


            banglaClassUpdate.setBestPracticeInd1(banglaClass.getBestPracticeInd1());
            banglaClassUpdate.setBestPracticeInd2(banglaClass.getBestPracticeInd2());
            banglaClassUpdate.setBestPracticeInd3(banglaClass.getBestPracticeInd3());

            banglaClassUpdate.setCoachingSupportInd1(banglaClass.getCoachingSupportInd1());
            banglaClassUpdate.setCoachingSupportDetailsInd1(banglaClass.getCoachingSupportDetailsInd1());
            banglaClassUpdate.setCoachingSupportInd2(banglaClass.getCoachingSupportInd2());
            banglaClassUpdate.setCoachingSupportDetailsInd2(banglaClass.getCoachingSupportDetailsInd2());

            banglaClassUpdate.setAgreedStatement1(banglaClass.getAgreedStatement1());
            banglaClassUpdate.setAgreedStatement2(banglaClass.getAgreedStatement2());

            banglaClassUpdate.setQuestion1(banglaClass.getQuestion1());


            banglaClassUpdate.setTeacherStatus(banglaClass.getTeacherStatus());

            banglaClassUpdate.setIsActive(banglaClass.getIsActive());
            banglaClassUpdate.setIsDeleted(banglaClass.getIsDeleted());

            banglaClassRepo.save(banglaClassUpdate);

            return banglaClassUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + banglaClass.getId());
        }
    }

    //Delete BanglaClass
    public void deleteBanglaClass(long id) {
        Optional<BanglaClass> banglaClassDB = this.banglaClassRepo.findById(id);

        if (banglaClassDB.isPresent()) {
            this.banglaClassRepo.delete(banglaClassDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
