//  Author: Mohammad Jihad Hossain
//  Create Date: 15/11/2022
//  Modify Date: 08/01/2023
//  Description: OverallSchool service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.OverallSchool;
import com.jihad.rtr.wfp.repository.BanglaClassRepo;
import com.jihad.rtr.wfp.repository.OverallSchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OverallSchoolService {

    @Autowired
    private OverallSchoolRepo overallSchoolRepo;

    //Create new OverallSchool
    public OverallSchool createOverallSchool(OverallSchool overallSchool) {
        return this.overallSchoolRepo.save(overallSchool);
    }

    //Get all OverallSchool
    public List<OverallSchool> getAllOverallSchool() {
        return overallSchoolRepo.findAll();
    }

    //Get OverallSchool with id
    public OverallSchool getOverallSchoolById(long id) {
        Optional<OverallSchool> overallSchoolDB = overallSchoolRepo.findById(id);
        if (overallSchoolDB.isPresent()) {
            return overallSchoolDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update OverallSchool
    public OverallSchool updateOverallSchool(OverallSchool overallSchool) {
        Optional<OverallSchool> overallSchoolDB = overallSchoolRepo.findById(overallSchool.getId());

        if (overallSchoolDB.isPresent()) {
            OverallSchool overallSchoolUpdate = overallSchoolDB.get();
            overallSchoolUpdate.setId(overallSchool.getId());
            overallSchoolUpdate.setDate(overallSchool.getDate());
            overallSchoolUpdate.setMonth(overallSchool.getMonth());
            overallSchoolUpdate.setYear(overallSchool.getYear());
            overallSchoolUpdate.setDistrict(overallSchool.getDistrict());
            overallSchoolUpdate.setUpazilla(overallSchool.getUpazilla());
            overallSchoolUpdate.setFieldOffice(overallSchool.getFieldOffice());
            overallSchoolUpdate.setProject(overallSchool.getProject());
            overallSchoolUpdate.setProject(overallSchool.getProject());
            overallSchoolUpdate.setVisitNo(overallSchool.getVisitNo());
            overallSchoolUpdate.setLf(overallSchool.getLf());
            overallSchoolUpdate.setLfName(overallSchool.getLfName());
            overallSchoolUpdate.setLpo(overallSchool.getLpo());
            overallSchoolUpdate.setLpoName(overallSchool.getLpoName());
            overallSchoolUpdate.setSchool(overallSchool.getSchool());
            overallSchoolUpdate.setVisitor(overallSchool.getVisitor());
            overallSchoolUpdate.setVisitorDesignation(overallSchool.getVisitorDesignation());
            overallSchoolUpdate.setVisitorOffice(overallSchool.getVisitorOffice());
            overallSchoolUpdate.setHeadTeacher(overallSchool.getHeadTeacher());
            overallSchoolUpdate.setTeacherGender(overallSchool.getTeacherGender());

            overallSchoolUpdate.setNote(overallSchool.getNote());

            overallSchoolUpdate.setLastFollowupTopic1(overallSchool.getLastFollowupTopic1());
            overallSchoolUpdate.setLastFollowupTopic2(overallSchool.getLastFollowupTopic2());
            overallSchoolUpdate.setLastFollowupTopic3(overallSchool.getLastFollowupTopic3());

            overallSchoolUpdate.setPrePrimaryClassObservation(overallSchool.getPrePrimaryClassObservation());
            overallSchoolUpdate.setPrePrimaryBanglaClassObservation1(overallSchool.getPrePrimaryBanglaClassObservation1());
            overallSchoolUpdate.setPrePrimaryBanglaClassObservation2(overallSchool.getPrePrimaryBanglaClassObservation2());
            overallSchoolUpdate.setPrePrimarySRMClassObservation1(overallSchool.getPrePrimarySRMClassObservation1());
            overallSchoolUpdate.setPrePrimarySRMClassObservation2(overallSchool.getPrePrimarySRMClassObservation2());
            overallSchoolUpdate.setPrePrimaryLibraryObservation(overallSchool.getPrePrimaryLibraryObservation());

            overallSchoolUpdate.setOneClassObservation(overallSchool.getOneClassObservation());
            overallSchoolUpdate.setOneBanglaClassObservation1(overallSchool.getOneBanglaClassObservation1());
            overallSchoolUpdate.setOneBanglaClassObservation2(overallSchool.getOneBanglaClassObservation2());
            overallSchoolUpdate.setOneSRMClassObservation1(overallSchool.getOneSRMClassObservation1());
            overallSchoolUpdate.setOneSRMClassObservation2(overallSchool.getOneSRMClassObservation2());
            overallSchoolUpdate.setOneLibraryObservation(overallSchool.getOneLibraryObservation());

            overallSchoolUpdate.setTwoClassObservation(overallSchool.getTwoClassObservation());
            overallSchoolUpdate.setTwoBanglaClassObservation1(overallSchool.getTwoBanglaClassObservation1());
            overallSchoolUpdate.setTwoBanglaClassObservation2(overallSchool.getTwoBanglaClassObservation2());
            overallSchoolUpdate.setTwoSRMClassObservation1(overallSchool.getTwoSRMClassObservation1());
            overallSchoolUpdate.setTwoSRMClassObservation2(overallSchool.getTwoSRMClassObservation2());
            overallSchoolUpdate.setTwoLibraryObservation(overallSchool.getTwoLibraryObservation());

            overallSchoolUpdate.setThreeClassObservation(overallSchool.getThreeClassObservation());
            overallSchoolUpdate.setThreeBanglaClassObservation1(overallSchool.getThreeBanglaClassObservation1());
            overallSchoolUpdate.setThreeBanglaClassObservation2(overallSchool.getThreeBanglaClassObservation2());
            overallSchoolUpdate.setThreeSRMClassObservation1(overallSchool.getThreeSRMClassObservation1());
            overallSchoolUpdate.setThreeSRMClassObservation2(overallSchool.getThreeSRMClassObservation2());
            overallSchoolUpdate.setThreeLibraryObservation(overallSchool.getThreeLibraryObservation());

            overallSchoolUpdate.setFourClassObservation(overallSchool.getFourClassObservation());
            overallSchoolUpdate.setFourBanglaClassObservation1(overallSchool.getFourBanglaClassObservation1());
            overallSchoolUpdate.setFourBanglaClassObservation2(overallSchool.getFourBanglaClassObservation2());
            overallSchoolUpdate.setFourSRMClassObservation1(overallSchool.getFourSRMClassObservation1());
            overallSchoolUpdate.setFourSRMClassObservation2(overallSchool.getFourSRMClassObservation2());
            overallSchoolUpdate.setFourLibraryObservation(overallSchool.getFourLibraryObservation());

            overallSchoolUpdate.setFiveClassObservation(overallSchool.getFiveClassObservation());
            overallSchoolUpdate.setFiveBanglaClassObservation1(overallSchool.getFiveBanglaClassObservation1());
            overallSchoolUpdate.setFiveBanglaClassObservation2(overallSchool.getFiveBanglaClassObservation2());
            overallSchoolUpdate.setFiveSRMClassObservation1(overallSchool.getFiveSRMClassObservation1());
            overallSchoolUpdate.setFiveSRMClassObservation2(overallSchool.getFiveSRMClassObservation2());
            overallSchoolUpdate.setFiveLibraryObservation(overallSchool.getFiveLibraryObservation());

            overallSchoolUpdate.setClassObservationComment(overallSchool.getClassObservationComment());
            overallSchoolUpdate.setBanglaClassComment1(overallSchool.getBanglaClassComment1());
            overallSchoolUpdate.setBanglaClassComment2(overallSchool.getBanglaClassComment2());
            overallSchoolUpdate.setSrmComment1(overallSchool.getSrmComment1());
            overallSchoolUpdate.setSrmComment2(overallSchool.getSrmComment2());
            overallSchoolUpdate.setLibraryObservationComment(overallSchool.getLibraryObservationComment());


            overallSchoolUpdate.setClassObservationTeacherPriority(overallSchool.getClassObservationTeacherPriority());
            overallSchoolUpdate.setBanglaTeacherPriority1(overallSchool.getBanglaTeacherPriority1());
            overallSchoolUpdate.setBanglaTeacherPriority2(overallSchool.getBanglaTeacherPriority2());
            overallSchoolUpdate.setSrmTeacherPriority1(overallSchool.getSrmTeacherPriority1());
            overallSchoolUpdate.setSrmTeacherPriority2(overallSchool.getSrmTeacherPriority2());
            overallSchoolUpdate.setLibraryObservationTeacherPriority(overallSchool.getLibraryObservationTeacherPriority());

            overallSchoolUpdate.setSchoolStatus(overallSchool.getSchoolPriorityArea());
            overallSchoolUpdate.setComment(overallSchool.getComment());
            overallSchoolUpdate.setOther(overallSchool.getOther());

            overallSchoolUpdate.setInd1AllTeacherTrainedStatus(overallSchool.getInd1AllTeacherTrainedStatus());
            overallSchoolUpdate.setInd1AllTeacherTrainedNotes(overallSchool.getInd1AllTeacherTrainedNotes());

            overallSchoolUpdate.setInd2FollowedRTRTrainingSixtyStatus(overallSchool.getInd2FollowedRTRTrainingSixtyStatus());
            overallSchoolUpdate.setInd2FollowedRTRTrainingSixtyNotes(overallSchool.getInd2FollowedRTRTrainingSixtyNotes());

            overallSchoolUpdate.setInd3RTRMaterialStatus(overallSchool.getInd3RTRMaterialStatus());
            overallSchoolUpdate.setInd3RTRMaterialNotes(overallSchool.getInd3RTRMaterialNotes());

            overallSchoolUpdate.setInd4InfluenceToBCOFiftyStatus(overallSchool.getInd4InfluenceToBCOFiftyStatus());
            overallSchoolUpdate.setInd4InfluenceToBCOFiftyNotes(overallSchool.getInd4InfluenceToBCOFiftyNotes());

            overallSchoolUpdate.setInd5PrePrimaryBanglaSRMSeventyStatus(overallSchool.getInd5PrePrimaryBanglaSRMSeventyStatus());
            overallSchoolUpdate.setInd5PrePrimaryBanglaSRMSeventyNotes(overallSchool.getInd5PrePrimaryBanglaSRMSeventyNotes());

            overallSchoolUpdate.setInd6BanglaClassResultFortyStatus(overallSchool.getInd6BanglaClassResultFortyStatus());
            overallSchoolUpdate.setInd6BanglaClassResultFortyNotes(overallSchool.getInd6BanglaClassResultFortyNotes());

            overallSchoolUpdate.setInd7BanglaSRMStatus(overallSchool.getInd7BanglaSRMStatus());
            overallSchoolUpdate.setInd7BanglaSRMNotes(overallSchool.getInd7BanglaSRMNotes());

            overallSchoolUpdate.setInd8SMCMeetingStatus(overallSchool.getInd8SMCMeetingStatus());
            overallSchoolUpdate.setInd8SMCMeetingNotes(overallSchool.getInd8SMCMeetingNotes());

            overallSchoolUpdate.setInd9ReadingMaterialStatus(overallSchool.getInd9ReadingMaterialStatus());
            overallSchoolUpdate.setInd9ReadingMaterialNotes(overallSchool.getInd9ReadingMaterialNotes());

            overallSchoolUpdate.setInd10FollowedRtRTrainingEightyStatus(overallSchool.getInd10FollowedRtRTrainingEightyStatus());
            overallSchoolUpdate.setInd10FollowedRtRTrainingEightyNotes(overallSchool.getInd10FollowedRtRTrainingEightyNotes());

            overallSchoolUpdate.setInd11InfluenceToBCOSeventyStatus(overallSchool.getInd11InfluenceToBCOSeventyStatus());
            overallSchoolUpdate.setInd11InfluenceToBCOSeventyNotes(overallSchool.getInd11InfluenceToBCOSeventyNotes());

            overallSchoolUpdate.setInd12PrePrimaryBanglaSRMEightyStatus(overallSchool.getInd12PrePrimaryBanglaSRMEightyStatus());
            overallSchoolUpdate.setInd12PrePrimaryBanglaSRMEightyNotes(overallSchool.getInd12PrePrimaryBanglaSRMEightyNotes());

            overallSchoolUpdate.setInd13BanglaClassResultSixtyStatus(overallSchool.getInd13BanglaClassResultSixtyStatus());
            overallSchoolUpdate.setInd13BanglaClassResultSixtyNotes(overallSchool.getInd13BanglaClassResultSixtyNotes());

            overallSchoolUpdate.setInd14MeetingDiscussionStatus(overallSchool.getInd14MeetingDiscussionStatus());
            overallSchoolUpdate.setInd14MeetingDiscussionNotes(overallSchool.getInd14MeetingDiscussionNotes());

            overallSchoolUpdate.setInd15LastMonthObservationStatus(overallSchool.getInd15LastMonthObservationStatus());
            overallSchoolUpdate.setInd15LastMonthObservationNotes(overallSchool.getInd15LastMonthObservationNotes());

            overallSchoolUpdate.setInd16StudentTrackingStatus(overallSchool.getInd16StudentTrackingStatus());
            overallSchoolUpdate.setInd16StudentTrackingNotes(overallSchool.getInd16StudentTrackingNotes());

            overallSchoolUpdate.setInd17GovtOfficialVisitStatus(overallSchool.getInd17GovtOfficialVisitStatus());
            overallSchoolUpdate.setInd17GovtOfficialVisitNotes(overallSchool.getInd17GovtOfficialVisitNotes());

            overallSchoolUpdate.setInd18ParentsSMCParticipationStatus(overallSchool.getInd18ParentsSMCParticipationStatus());
            overallSchoolUpdate.setInd18ParentsSMCParticipationNotes(overallSchool.getInd18ParentsSMCParticipationNotes());


            overallSchoolUpdate.setBestPracticeInd1(overallSchool.getBestPracticeInd1());
            overallSchoolUpdate.setBestPracticeInd2(overallSchool.getBestPracticeInd2());
            overallSchoolUpdate.setBestPracticeInd3(overallSchool.getBestPracticeInd3());

            overallSchoolUpdate.setCoachingSupportInd1(overallSchool.getCoachingSupportInd1());
            overallSchoolUpdate.setCoachingSupportDetailsInd1(overallSchool.getCoachingSupportDetailsInd1());
            overallSchoolUpdate.setCoachingSupportInd2(overallSchool.getCoachingSupportInd2());
            overallSchoolUpdate.setCoachingSupportDetailsInd2(overallSchool.getCoachingSupportDetailsInd2());
            overallSchoolUpdate.setCoachingSupportInd3(overallSchool.getCoachingSupportInd3());
            overallSchoolUpdate.setCoachingSupportDetailsInd3(overallSchool.getCoachingSupportDetailsInd3());

            overallSchoolUpdate.setAgreedStatement1(overallSchool.getAgreedStatement1());
            overallSchoolUpdate.setAgreedStatement2(overallSchool.getAgreedStatement2());


            overallSchoolUpdate.setSchoolStatus(overallSchool.getSchoolStatus());

            overallSchoolUpdate.setIsActive(overallSchool.getIsActive());
            overallSchoolUpdate.setIsDeleted(overallSchool.getIsDeleted());

            overallSchoolRepo.save(overallSchoolUpdate);

            return overallSchoolUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + overallSchool.getId());
        }
    }

    //Delete OverallSchool
    public void deleteOverallSchool(long id) {
        Optional<OverallSchool> overallSchoolDB = this.overallSchoolRepo.findById(id);

        if (overallSchoolDB.isPresent()) {
            this.overallSchoolRepo.delete(overallSchoolDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
