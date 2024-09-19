//  Author: Mohammad Jihad Hossain
//  Create Date: 15/09/2024
//  Modify Date: 15/09/2024
//  Description: School Monitoring Service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.SchoolMonitoring;
import com.jihad.rtr.wfp.repository.BanglaClassRepo;
import com.jihad.rtr.wfp.repository.SchoolMonitoringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SchoolMonitoringService {

    @Autowired
    private SchoolMonitoringRepo schoolMonitoringRepo;

    //Create new SchoolMonitoring
    public SchoolMonitoring createSchoolMonitoring(SchoolMonitoring schoolMonitoring) {
        return schoolMonitoringRepo.save(schoolMonitoring);
    }

    //Get all SchoolMonitoring
    public List<SchoolMonitoring> getAllSchoolMonitoring() {
        return schoolMonitoringRepo.findAll();
    }

    //Get SchoolMonitoring with id
    public SchoolMonitoring getSchoolMonitoringById(long id) {
        Optional<SchoolMonitoring> schoolMonitoringDB = schoolMonitoringRepo.findById(id);
        if (schoolMonitoringDB.isPresent()) {
            return schoolMonitoringDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update SchoolMonitoring
    public SchoolMonitoring updateSchoolMonitoring(SchoolMonitoring schoolMonitoring) {
        Optional<SchoolMonitoring> schoolMonitoringDB = schoolMonitoringRepo.findById(schoolMonitoring.getId());

        if (schoolMonitoringDB.isPresent()) {
            SchoolMonitoring schoolMonitoringUpdate = schoolMonitoringDB.get();
            schoolMonitoringUpdate.setId(schoolMonitoring.getId());

            schoolMonitoringUpdate.setDate(schoolMonitoring.getDate());
            schoolMonitoringUpdate.setMonth(schoolMonitoring.getMonth());
            schoolMonitoringUpdate.setYear(schoolMonitoring.getYear());
            schoolMonitoringUpdate.setDistrict(schoolMonitoring.getDistrict());
            schoolMonitoringUpdate.setUpazilla(schoolMonitoring.getUpazilla());
            schoolMonitoringUpdate.setFieldOffice(schoolMonitoring.getFieldOffice());
            schoolMonitoringUpdate.setProject(schoolMonitoring.getProject());
            schoolMonitoringUpdate.setVisitNo(schoolMonitoring.getVisitNo());
            schoolMonitoringUpdate.setLf(schoolMonitoring.getLf());
            schoolMonitoringUpdate.setLfName(schoolMonitoring.getLfName());
            schoolMonitoringUpdate.setLpo(schoolMonitoring.getLpo());
            schoolMonitoringUpdate.setLpoName(schoolMonitoring.getLpoName());
            schoolMonitoringUpdate.setSchool(schoolMonitoring.getSchool());
            schoolMonitoringUpdate.setVisitor(schoolMonitoring.getVisitor());
            schoolMonitoringUpdate.setVisitorDesignation(schoolMonitoring.getVisitorDesignation());
            schoolMonitoringUpdate.setVisitorOffice(schoolMonitoring.getVisitorOffice());
            schoolMonitoringUpdate.setClassTeacher(schoolMonitoring.getClassTeacher());
            schoolMonitoringUpdate.setTeacherGender(schoolMonitoring.getTeacherGender());
            schoolMonitoringUpdate.setIsTrained(schoolMonitoring.getIsTrained());
            schoolMonitoringUpdate.setGrade(schoolMonitoring.getGrade());
            schoolMonitoringUpdate.setSection(schoolMonitoring.getSection());
            schoolMonitoringUpdate.setClassStartTime(schoolMonitoring.getClassStartTime());
            schoolMonitoringUpdate.setClassEndTime(schoolMonitoring.getClassEndTime());
            schoolMonitoringUpdate.setContentName(schoolMonitoring.getContentName());
            schoolMonitoringUpdate.setPeriodDay(schoolMonitoring.getPeriodDay());
            schoolMonitoringUpdate.setTotalAdmittedStudent(schoolMonitoring.getTotalAdmittedStudent());
            schoolMonitoringUpdate.setTotalAdmittedGirl(schoolMonitoring.getTotalAdmittedGirl());
            schoolMonitoringUpdate.setTotalAdmittedBoy(schoolMonitoring.getTotalAdmittedBoy());
            schoolMonitoringUpdate.setTotalPresentStudent(schoolMonitoring.getTotalPresentStudent());
            schoolMonitoringUpdate.setTotalPresentGirl(schoolMonitoring.getTotalPresentGirl());
            schoolMonitoringUpdate.setTotalPresentBoy(schoolMonitoring.getTotalPresentBoy());

            schoolMonitoringUpdate.setNote(schoolMonitoring.getNote());


            schoolMonitoringUpdate.setInd11LFArrivalTimeStatus(schoolMonitoring.getInd11LFArrivalTimeStatus());
            schoolMonitoringUpdate.setInd11LFArrivalTimeNotes(schoolMonitoring.getInd11LFArrivalTimeNotes());

            schoolMonitoringUpdate.setInd12ChallanDocumentStatus(schoolMonitoring.getInd12ChallanDocumentStatus());
            schoolMonitoringUpdate.setInd12ChallanDocumentNotes(schoolMonitoring.getInd12ChallanDocumentNotes());

            schoolMonitoringUpdate.setInd13VisitorRegisterStatus(schoolMonitoring.getInd13VisitorRegisterStatus());
            schoolMonitoringUpdate.setInd13VisitorRegisterNotes(schoolMonitoring.getInd13VisitorRegisterNotes());

            schoolMonitoringUpdate.setInd14RelatedDocumentStatus(schoolMonitoring.getInd14RelatedDocumentStatus());
            schoolMonitoringUpdate.setInd14RelatedDocumentNotes(schoolMonitoring.getInd14RelatedDocumentNotes());

            schoolMonitoringUpdate.setInd21WorkbookProvidedStatus(schoolMonitoring.getInd21WorkbookProvidedStatus());
            schoolMonitoringUpdate.setInd21WorkbookProvidedNotes(schoolMonitoring.getInd21WorkbookProvidedNotes());

            schoolMonitoringUpdate.setInd22InstructionMaterialStatus(schoolMonitoring.getInd22InstructionMaterialStatus());
            schoolMonitoringUpdate.setInd22InstructionMaterialNotes(schoolMonitoring.getInd22InstructionMaterialNotes());

            schoolMonitoringUpdate.setInd23OtherMaterialStatus(schoolMonitoring.getInd23OtherMaterialStatus());
            schoolMonitoringUpdate.setInd23OtherMaterialNotes(schoolMonitoring.getInd23OtherMaterialNotes());

            schoolMonitoringUpdate.setInd24ClassOnTimeStatus(schoolMonitoring.getInd24ClassOnTimeStatus());
            schoolMonitoringUpdate.setInd24ClassOnTimeNotes(schoolMonitoring.getInd24ClassOnTimeNotes());

            schoolMonitoringUpdate.setInd25TeacherIsTrainedStatus(schoolMonitoring.getInd25TeacherIsTrainedStatus());
            schoolMonitoringUpdate.setInd25TeacherIsTrainedNotes(schoolMonitoring.getInd25TeacherIsTrainedNotes());

            schoolMonitoringUpdate.setInd26FollowedRtRInstructionStatus(schoolMonitoring.getInd26FollowedRtRInstructionStatus());
            schoolMonitoringUpdate.setInd26FollowedRtRInstructionNotes(schoolMonitoring.getInd26FollowedRtRInstructionNotes());

            schoolMonitoringUpdate.setInd27StudentTrackingDocumentStatus(schoolMonitoring.getInd27StudentTrackingDocumentStatus());
            schoolMonitoringUpdate.setInd27StudentTrackingDocumentNotes(schoolMonitoring.getInd27StudentTrackingDocumentNotes());

            schoolMonitoringUpdate.setInd31OneTeacherReadingTrainingStatus(schoolMonitoring.getInd31OneTeacherReadingTrainingStatus());
            schoolMonitoringUpdate.setInd310BookCaptainSelectedNotes(schoolMonitoring.getInd310BookCaptainSelectedNotes());

            schoolMonitoringUpdate.setInd32SRMMentionedRoutineStatus(schoolMonitoring.getInd32SRMMentionedRoutineStatus());
            schoolMonitoringUpdate.setInd32SRMMentionedRoutineNotes(schoolMonitoring.getInd32SRMMentionedRoutineNotes());

            schoolMonitoringUpdate.setInd33TeacherConductReadingActivityStatus(schoolMonitoring.getInd33TeacherConductReadingActivityStatus());
            schoolMonitoringUpdate.setInd33TeacherConductReadingActivityNotes(schoolMonitoring.getInd33TeacherConductReadingActivityNotes());

            schoolMonitoringUpdate.setInd34BookshelfConditionGoodStatus(schoolMonitoring.getInd34BookshelfConditionGoodStatus());
            schoolMonitoringUpdate.setInd34BookshelfConditionGoodNotes(schoolMonitoring.getInd34BookshelfConditionGoodNotes());

            schoolMonitoringUpdate.setInd35RtRStoryAvailableRegisterUpdatedStatus(schoolMonitoring.getInd35RtRStoryAvailableRegisterUpdatedStatus());
            schoolMonitoringUpdate.setInd35RtRStoryAvailableRegisterUpdatedNotes(schoolMonitoring.getInd35RtRStoryAvailableRegisterUpdatedNotes());

            schoolMonitoringUpdate.setInd36BooksDisplayingStatus(schoolMonitoring.getInd36BooksDisplayingStatus());
            schoolMonitoringUpdate.setInd36BooksDisplayingNotes(schoolMonitoring.getInd36BooksDisplayingNotes());

            schoolMonitoringUpdate.setInd37LibraryPosterAvailableStatus(schoolMonitoring.getInd37LibraryPosterAvailableStatus());
            schoolMonitoringUpdate.setInd37LibraryPosterAvailableNotes(schoolMonitoring.getInd37LibraryPosterAvailableNotes());

            schoolMonitoringUpdate.setInd38BCORegisterAvailableConsistentStatus(schoolMonitoring.getInd38BCORegisterAvailableConsistentStatus());
            schoolMonitoringUpdate.setInd38BCORegisterAvailableConsistentNotes(schoolMonitoring.getInd38BCORegisterAvailableConsistentNotes());

            schoolMonitoringUpdate.setInd39ReadingActivityRegisterStatus(schoolMonitoring.getInd39ReadingActivityRegisterStatus());
            schoolMonitoringUpdate.setInd39ReadingActivityRegisterNotes(schoolMonitoring.getInd39ReadingActivityRegisterNotes());

            schoolMonitoringUpdate.setInd310BookCaptainSelectedStatus(schoolMonitoring.getInd310BookCaptainSelectedStatus());
            schoolMonitoringUpdate.setInd310BookCaptainSelectedNotes(schoolMonitoring.getInd310BookCaptainSelectedNotes());

            schoolMonitoringUpdate.setInd41TeacherInteractionStatus(schoolMonitoring.getInd41TeacherInteractionStatus());
            schoolMonitoringUpdate.setInd41TeacherInteractionNotes(schoolMonitoring.getInd41TeacherInteractionNotes());

            schoolMonitoringUpdate.setInd42DiscussionPoints(schoolMonitoring.getInd42DiscussionPoints());

            schoolMonitoringUpdate.setSchoolStatus(schoolMonitoring.getSchoolStatus());

            schoolMonitoringUpdate.setIsActive(schoolMonitoring.getIsActive());
            schoolMonitoringUpdate.setIsDeleted(schoolMonitoring.getIsDeleted());

            schoolMonitoringRepo.save(schoolMonitoringUpdate);

            return schoolMonitoringUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + schoolMonitoring.getId());
        }
    }

    //Delete SchoolMonitoring
    public void deleteSchoolMonitoring(long id) {
        Optional<SchoolMonitoring> schoolMonitoringDB = this.schoolMonitoringRepo.findById(id);

        if (schoolMonitoringDB.isPresent()) {
            this.schoolMonitoringRepo.delete(schoolMonitoringDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
