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
            overallSchoolUpdate.setOneBanglaClassObservation(overallSchool.getOneBanglaClassObservation());
            overallSchoolUpdate.setTwoBanglaClassObservation(overallSchool.getTwoBanglaClassObservation());
            overallSchoolUpdate.setPrePrimaryClassTeacherPriority(overallSchool.getPrePrimaryClassTeacherPriority());
            overallSchoolUpdate.setOneBanglaClassTeacherPriority(overallSchool.getOneBanglaClassTeacherPriority());
            overallSchoolUpdate.setTwoBanglaClassTeacherPriority(overallSchool.getTwoBanglaClassTeacherPriority());
            overallSchoolUpdate.setClassObservationComment(overallSchool.getClassObservationComment());

            overallSchoolUpdate.setPrePrimarySRMObservation(overallSchool.getPrePrimarySRMObservation());
            overallSchoolUpdate.setOneSRMObservation(overallSchool.getOneSRMObservation());
            overallSchoolUpdate.setTwoSRMObservation(overallSchool.getTwoSRMObservation());
            overallSchoolUpdate.setPrePrimarySRMTeacherPriority(overallSchool.getPrePrimarySRMTeacherPriority());
            overallSchoolUpdate.setOneSRMTeacherPriority(overallSchool.getOneSRMTeacherPriority());
            overallSchoolUpdate.setTwoSRMTeacherPriority(overallSchool.getTwoSRMTeacherPriority());
            overallSchoolUpdate.setSrmCommentPPOneTwo(overallSchool.getSrmCommentPPOneTwo());

            overallSchoolUpdate.setThreeSRMObservation(overallSchool.getThreeSRMObservation());
            overallSchoolUpdate.setFourSRMObservation(overallSchool.getFourSRMObservation());
            overallSchoolUpdate.setFiveSRMObservation(overallSchool.getFiveSRMObservation());
            overallSchoolUpdate.setThreeSRMTeacherPriority(overallSchool.getThreeSRMTeacherPriority());
            overallSchoolUpdate.setFourSRMTeacherPriority(overallSchool.getFourSRMTeacherPriority());
            overallSchoolUpdate.setFiveSRMTeacherPriority(overallSchool.getFiveSRMTeacherPriority());
            overallSchoolUpdate.setSrmCommentThreeFourFive(overallSchool.getSrmCommentThreeFourFive());


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
