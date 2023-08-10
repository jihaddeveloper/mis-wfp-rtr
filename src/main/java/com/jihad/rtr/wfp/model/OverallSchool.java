//  Author: Mohammad Jihad Hossain
//  Create Date: 29/11/2022
//  Modify Date: 08/01/2023
//  Description: Overall School observation  model file

package com.jihad.rtr.wfp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
@Table(name = "overallschool_observations")
public class OverallSchool extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "date")
    private Date date;
    @Column(name = "month", length = 20)
    private String month;
    @Column(name = "year", length = 20)
    private String year;
    @Column(name = "district", length = 30)
    private String district;
    @Column(name = "upazilla", length = 30)
    private String upazilla;
    @Column(name = "field_office", length = 30)
    private String fieldOffice;
    @Column(name = "project", length = 50)
    private String project;
    @Column(name = "visit_no")
    private int visitNo;
    @Column(name = "lf", length = 20)
    private String lf;
    @Column(name = "lf_name", length = 50)
    private String lfName;
    @Column(name = "lpo", length = 20)
    private String lpo;
    @Column(name = "lpo_name", length = 50)
    private String lpoName;
    @Column(name = "school", length = 100)
    private String school;
    @Column(name = "visitor", length = 50)
    private String visitor;
    @Column(name = "visitor_designation", length = 30)
    private String visitorDesignation;
    @Column(name = "visitor_office", length = 20)
    private String visitorOffice;
    @Column(name = "head_teacher", length = 50)
    private String headTeacher;
    @Column(name = "teacher_gender", length = 20)
    private String teacherGender;

    @Column(name = "note", length = 200)
    private String note;


    @Column(name = "last_followup_topic1", length = 800)
    private String lastFollowupTopic1;
    @Column(name = "last_followup_topic2", length = 800)
    private String lastFollowupTopic2;
    @Column(name = "last_followup_topic3", length = 800)
    private String lastFollowupTopic3;

    @Column(name = "preprimary_class_observation", length = 10)
    private String prePrimaryClassObservation;
    @Column(name = "one_bangla_class_observation", length = 10)
    private String oneBanglaClassObservation;
    @Column(name = "two_bangla_class_observation", length = 10)
    private String twoBanglaClassObservation;
    @Column(name = "prePrimaryClassTeacherPriority", length = 10)
    private String prePrimaryClassTeacherPriority;
    @Column(name = "one_banglaclass_teacher_priority", length = 10)
    private String oneBanglaClassTeacherPriority;
    @Column(name = "two_banglaclass_teacher_priority", length = 10)
    private String twoBanglaClassTeacherPriority;
    @Column(name = "class_observation_comment", length = 200)
    private String classObservationComment;

    @Column(name = "preprimary_srm_observation", length = 10)
    private String prePrimarySRMObservation;
    @Column(name = "one_srm_observation", length = 10)
    private String oneSRMObservation;
    @Column(name = "two_srm_observation", length = 10)
    private String twoSRMObservation;
    @Column(name = "preprimary_srm_teacher_priority", length = 10)
    private String prePrimarySRMTeacherPriority;
    @Column(name = "one_srm_teacher_priority", length = 10)
    private String oneSRMTeacherPriority;
    @Column(name = "two_srm_teacher_priority", length = 10)
    private String twoSRMTeacherPriority;
    @Column(name = "srm_comment_pp_one_two", length = 200)
    private String srmCommentPPOneTwo;

    @Column(name = "three_srm_observation", length = 10)
    private String threeSRMObservation;
    @Column(name = "four_srm_observation", length = 10)
    private String fourSRMObservation;
    @Column(name = "five_srm_observation", length = 10)
    private String fiveSRMObservation;
    @Column(name = "three_srm_teacher_priority", length = 10)
    private String threeSRMTeacherPriority;
    @Column(name = "four_srm_teacher_priority", length = 10)
    private String fourSRMTeacherPriority;
    @Column(name = "five_srm_teacher_priority", length = 10)
    private String fiveSRMTeacherPriority;
    @Column(name = "srm_comment_three_four_five", length = 200)
    private String srmCommentThreeFourFive;

    @Column(name = "other", length = 200)
    private String other;

    @Column(name = "ind1_all_teacher_trained_status", length = 10)
    private String ind1AllTeacherTrainedStatus;
    @Column(name = "ind1_all_teacher_trained_notes", length = 150)
    private String ind1AllTeacherTrainedNotes;

    @Column(name = "ind2_followed_rtr_training_sixty_status", length = 10)
    private String ind2FollowedRTRTrainingSixtyStatus;
    @Column(name = "ind2_followed_rtr_training_sixty_notes", length = 150)
    private String ind2FollowedRTRTrainingSixtyNotes;

    @Column(name = "ind3_rtr_material_status", length = 10)
    private String ind3RTRMaterialStatus;
    @Column(name = "ind3_rtr_material_notes", length = 150)
    private String ind3RTRMaterialNotes;

    @Column(name = "ind4_influence_to_bco_fifty_status", length = 10)
    private String ind4InfluenceToBCOFiftyStatus;
    @Column(name = "ind4_influence_to_bco_fifty_notes", length = 150)
    private String ind4InfluenceToBCOFiftyNotes;

    @Column(name = "ind5_preprimary_bangla_srm_seventy_status", length = 10)
    private String ind5PrePrimaryBanglaSRMSeventyStatus;
    @Column(name = "ind5_preprimary_bangla_srm_seventy_notes", length = 150)
    private String ind5PrePrimaryBanglaSRMSeventyNotes;

    @Column(name = "ind6_banglaclass_result_forty_status", length = 10)
    private String ind6BanglaClassResultFortyStatus;
    @Column(name = "ind6_banglaclass_result_forty_notes", length = 150)
    private String ind6BanglaClassResultFortyNotes;

    @Column(name = "ind7_bangla_srm_status", length = 10)
    private String ind7BanglaSRMStatus;
    @Column(name = "ind7_bangla_srm_notes", length = 150)
    private String ind7BanglaSRMNotes;

    @Column(name = "ind8_smc_meeting_status", length = 10)
    private String ind8SMCMeetingStatus;
    @Column(name = "ind8_smc_meeting_notes", length = 150)
    private String ind8SMCMeetingNotes;

    @Column(name = "ind9_reading_material_status", length = 10)
    private String ind9ReadingMaterialStatus;
    @Column(name = "ind9_reading_material_notes", length = 150)
    private String ind9ReadingMaterialNotes;

    @Column(name = "ind10_followed_rtr_training_eighty_status", length = 10)
    private String ind10FollowedRtRTrainingEightyStatus;
    @Column(name = "ind10_followed_rtr_training_eighty_notes", length = 150)
    private String ind10FollowedRtRTrainingEightyNotes;

    @Column(name = "ind11_influence_to_bco_seventy_status", length = 10)
    private String ind11InfluenceToBCOSeventyStatus;
    @Column(name = "ind11_influence_to_bco_seventy_notes", length = 150)
    private String ind11InfluenceToBCOSeventyNotes;

    @Column(name = "ind12_preprimary_bangla_srm_eighty_status", length = 10)
    private String ind12PrePrimaryBanglaSRMEightyStatus;
    @Column(name = "ind12_preprimary_bangla_srm_eighty_notes", length = 150)
    private String ind12PrePrimaryBanglaSRMEightyNotes;

    @Column(name = "ind13_banglaclass_result_sixty_status", length = 10)
    private String ind13BanglaClassResultSixtyStatus;
    @Column(name = "ind13_banglaclass_result_sixty_notes", length = 150)
    private String ind13BanglaClassResultSixtyNotes;

    @Column(name = "ind14_meeting_discussion_status", length = 10)
    private String ind14MeetingDiscussionStatus;
    @Column(name = "ind14_meeting_discussion_notes", length = 150)
    private String ind14MeetingDiscussionNotes;

    @Column(name = "ind15_last_month_observation_status", length = 10)
    private String ind15LastMonthObservationStatus;
    @Column(name = "ind15_last_month_observation_notes", length = 150)
    private String ind15LastMonthObservationNotes;

    @Column(name = "ind16_student_tracking_status", length = 10)
    private String ind16StudentTrackingStatus;
    @Column(name = "ind16_student_tracking_notes", length = 150)
    private String ind16StudentTrackingNotes;

    @Column(name = "ind17_govt_official_visit_status", length = 10)
    private String ind17GovtOfficialVisitStatus;
    @Column(name = "ind17_govt_official_visit_notes", length = 150)
    private String ind17GovtOfficialVisitNotes;

    @Column(name = "ind18_parents_smc_participation_status", length = 10)
    private String ind18ParentsSMCParticipationStatus;
    @Column(name = "ind18_parents_smc_participation_notes", length = 150)
    private String ind18ParentsSMCParticipationNotes;


    @Column(name = "best_practice_ind1", length = 800)
    private String bestPracticeInd1;
    @Column(name = "best_practice_ind2", length = 800)
    private String bestPracticeInd2;
    @Column(name = "best_practice_ind3", length = 800)
    private String bestPracticeInd3;

    @Column(name = "coaching_support_ind1", length = 800)
    private String coachingSupportInd1;
    @Column(name = "coaching_support_ind2", length = 800)
    private String coachingSupportInd2;
    @Column(name = "coaching_support_ind3", length = 800)
    private String coachingSupportInd3;

    @Column(name = "coaching_support_details_ind1", length = 500)
    private String coachingSupportDetailsInd1;
    @Column(name = "coaching_support_details_ind2", length = 500)
    private String coachingSupportDetailsInd2;
    @Column(name = "coaching_support_details_ind3", length = 500)
    private String coachingSupportDetailsInd3;

    @Column(name = "agreed_statement1", length = 800)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 800)
    private String agreedStatement2;


    @Column(name = "school_status", length = 20)
    private String schoolStatus;

    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;

}
