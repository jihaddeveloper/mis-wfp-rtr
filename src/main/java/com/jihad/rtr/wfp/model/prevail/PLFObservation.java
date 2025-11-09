//  Author: Mohammad Jihad Hossain
//  Create Date: 08/09/2025
//  Modify Date: 08/09/2025
//  Description: PLFObservation  model file

package com.jihad.rtr.wfp.model.prevail;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jihad.rtr.wfp.model.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
@Table(name = "p_lf_observation")
public class PLFObservation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "visit_no")
    private long visitNo;
    @Column(name = "date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;
    @Column(name = "office", length = 50)
    private String office;
    @Column(name = "project", length = 50)
    private String project;
    @Column(name = "district", length = 50)
    private String district;
    @Column(name = "upazilla", length = 50)
    private String upazilla;
    @Column(name = "lf", length = 50)
    private String lf;
    @Column(name = "lf_name", length = 50)
    private String lfName;
    @Column(name = "lpo", length = 50)
    private String lpo;
    @Column(name = "lpo_name", length = 50)
    private String lpoName;
    @Column(name = "school", length = 50)
    private String school;
    @Column(name = "rtr_school_id", length = 50)
    private String rtrSchoolId;
    @Column(name = "year_of_support", length = 10)
    private String yearOfSupport;
    @Column(name = "grade", length = 20)
    private String grade;
    @Column(name = "section", length = 20)
    private String section;
    @Column(name = "month", length = 50)
    private String month;
    @Column(name = "year", length = 50)
    private String year;
    @Column(name = "school_entry_time", length = 50)
    private String schoolEntryTime;
    @Column(name = "school_exit_time", length = 50)
    private String schoolExitTime;

    @Column(name = "visitor", length = 50)
    private String visitor;
    @Column(name = "visitor_designation", length = 30)
    private String visitorDesignation;

    @Column(name = "note", length = 250)
    private String note;

    @Column(name = "ind11_is_carried_all_material_status", length = 20)
    private String ind11IsCarriedAllMaterialStatus;
    @Column(name = "ind11_is_carried_all_material_note", length = 250)
    private String ind11IsCarriedAllMaterialNote;

    @Column(name = "ind12_is_checked_in_right_time_status", length = 20)
    private String ind12IsCheckedInRightTimeStatus;
    @Column(name = "ind12_is_checked_in_right_time_note", length = 250)
    private String ind12IsCheckedInRightTimeNote;

    @Column(name = "ind13_is_observed_bangla_library_status", length = 20)
    private String ind13IsObservedBanglaLibraryStatus;
    @Column(name = "ind13_is_observed_bangla_library_note", length = 250)
    private String ind13IsObservedBanglaLibraryNote;

    @Column(name = "ind14_feedback_session_with_teacher_status", length = 20)
    private String ind14FeedbackSessionWithTeacherStatus;
    @Column(name = "ind14_feedback_session_with_teacher_note", length = 250)
    private String ind14FeedbackSessionWithTeacherNote;

    @Column(name = "ind15_meeting_with_head_teacher_status", length = 20)
    private String ind15MeetingWithHeadTeacherStatus;
    @Column(name = "ind15_meeting_with_head_teacher_note", length = 250)
    private String ind15MeetingWithHeadTeacherNote;

    @Column(name = "ind16_filled_all_form_properly_status", length = 20)
    private String ind16FilledAllFormProperlyStatus;
    @Column(name = "ind16_filled_all_form_properly_note", length = 250)
    private String ind16FilledAllFormProperlyNote;

    @Column(name = "ind17_observed_class_silently_status", length = 20)
    private String ind17ObservedClassSilentlyStatus;
    @Column(name = "ind17_observed_class_silently_note", length = 250)
    private String ind17ObservedClassSilentlyNote;

    @Column(name = "ind21_lf_teacher_maintain_good_relationship_status", length = 20)
    private String ind21LFTeacherMaintainGoodRelationshipStatus;
    @Column(name = "ind21_lf_teacher_maintain_good_relationship_note", length = 250)
    private String ind21LFTeacherMaintainGoodRelationshipNote;

    @Column(name = "ind22_lf_discuss_good_practice_indicator_status", length = 20)
    private String ind22LFDiscussGoodPracticeIndicatorStatus;
    @Column(name = "ind22_lf_discuss_good_practice_indicator_note", length = 250)
    private String ind22LFDiscussGoodPracticeIndicatorNote;

    @Column(name = "ind23_lf_discuss_coaching_support_indicator_status", length = 20)
    private String ind23LFDiscussCoachingSupportIndicatorStatus;
    @Column(name = "ind23_lf_discuss_coaching_support_indicator_note", length = 250)
    private String ind23LFDiscussCoachingSupportIndicatorNote;

    @Column(name = "ind24_lf_discuss_last_followup_indicator_status", length = 20)
    private String ind24LFDiscussLastFollowupIndicatorStatus;
    @Column(name = "ind24_lf_discuss_last_followup_indicator_note", length = 250)
    private String ind24LFDiscussLastFollowupIndicatorNote;

    @Column(name = "ind25_lf_instruct_ideal_lesson_status", length = 20)
    private String ind25LFInstructIdealLessonStatus;
    @Column(name = "ind25_lf_instruct_ideal_lesson_note", length = 250)
    private String ind25LFInstructIdealLessonNote;

    @Column(name = "ind26_lf_observe_student_or_group_status", length = 20)
    private String ind26LFObserveStudentOrGroupStatus;
    @Column(name = "ind26_lf_observe_student_or_group_note", length = 250)
    private String ind26LFObserveStudentOrGroupNote;

    @Column(name = "ind27_lf_verify_workbook_status", length = 20)
    private String ind27LFVerifyWorkbookStatus;
    @Column(name = "ind27_lf_verify_workbook_note", length = 250)
    private String ind27LFVerifyWorkbookNote;

    @Column(name = "ind28_lf_track_3_student_status", length = 20)
    private String ind28LFTrack3StudentStatus;
    @Column(name = "ind28_lf_track_3_student_note", length = 250)
    private String ind28LFTrack3StudentNote;

    @Column(name = "ind29_lf_teacher_agreed_next_plan_status", length = 20)
    private String ind29LFTeacherAgreedNextPlanStatus;
    @Column(name = "ind29_lf_teacher_agreed_next_plan_note", length = 250)
    private String ind29LFTeacherAgreedNextPlanNote;

    @Column(name = "ind31_lf_identify_good_improvable_point_status", length = 20)
    private String ind31LFIdentifyGoodImprovablePointStatus;
    @Column(name = "ind31_lf_identify_good_improvable_point_note", length = 250)
    private String ind31LFIdentifyGoodImprovablePointNote;

    @Column(name = "ind32_lf_instruct_development_plan_status", length = 20)
    private String ind32LFInstructDevelopmentPlanStatus;
    @Column(name = "ind32_lf_instruct_development_plan_note", length = 250)
    private String ind32LFInstructDevelopmentPlanNote;

    @Column(name = "ind33_lf_discuss_about_development_plan_status", length = 20)
    private String ind33LFDiscussAboutDevelopmentPlanStatus;
    @Column(name = "ind33_lf_discuss_about_development_plan_note", length = 250)
    private String ind33LFDiscussAboutDevelopmentPlanNote;

    @Column(name = "ind34_lf_allow_to_change_teaching_pattern_status", length = 20)
    private String ind34LFAllowToChangeTeachingPatternStatus;
    @Column(name = "ind34_lf_allow_to_change_teaching_pattern_note", length = 250)
    private String ind34LFAllowToChangeTeachingPatternNote;

    @Column(name = "ind35_lf_allow_teacher_for_discussion_status", length = 20)
    private String ind35LFAllowTeacherForDiscussionStatus;
    @Column(name = "ind35_lf_allow_teacher_for_discussion_note", length = 250)
    private String ind35LFAllowTeacherForDiscussionNote;

    @Column(name = "best_practice_indicator1", length = 600)
    private String bestPracticeIndicator1;
    @Column(name = "best_practice_indicator1_details", length = 250)
    private String bestPracticeIndicator1Details;
    @Column(name = "best_practice_indicator2", length = 600)
    private String bestPracticeIndicator2;
    @Column(name = "best_practice_indicator2_details", length = 250)
    private String bestPracticeIndicator2Details;


    @Column(name = "last_followup_indicator1", length = 600)
    private String lastFollowupIndicator1;
    @Column(name = "last_followup_indicator2", length = 600)
    private String lastFollowupIndicator2;



    @Column(name = "coaching_support_indicator1", length = 600)
    private String coachingSupportIndicator1;
    @Column(name = "coaching_support_indicator1_details", length = 250)
    private String coachingSupportIndicator1Details;
    @Column(name = "coaching_support_indicator2", length = 600)
    private String coachingSupportIndicator2;
    @Column(name = "coaching_support_indicator2_details", length = 250)
    private String coachingSupportIndicator2Details;


    @Column(name = "coaching_support_lf", length = 250)
    private String coachingSupportLF;
    @Column(name = "coaching_support_lpo", length = 250)
    private String coachingSupportLPO;



    @Column(name = "agreed_statement1", length = 600)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 600)
    private String agreedStatement2;

    @Column(name = "lf_status", length = 20)
    private String lfStatus;

    @Column(name = "is_checked", length = 10)
    private String isChecked;
    @Column(name = "is_active", length = 20)
    private String isActive;
    @Column(name = "is_deleted", length = 20)
    private String isDeleted;

}
