//  Author: Mohammad Jihad Hossain
//  Create Date: 04/01/2026
//  Modify Date: 04/01/2026
//  Description: PPrePrimary  model file


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
@Table(name = "p_pre_primary")
public class PPrePrimary extends BaseEntity {

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
    @Column(name = "classTeacher", length = 70)
    private String classTeacher;
    @Column(name = "visitor", length = 50)
    private String visitor;
    @Column(name = "visitor_designation", length = 30)
    private String visitorDesignation;

    @Column(name = "lesson_no", length = 50)
    private String lessonNo;
    @Column(name = "lesson_name", length = 50)
    private String lessonName;
    @Column(name = "story_name", length = 50)
    private String storyName;
    @Column(name = "picture_name", length = 50)
    private String pictureName;
    @Column(name = "card_name", length = 50)
    private String cardName;
    @Column(name = "game_name", length = 50)
    private String gameName;

    @Column(name = "class_start_time", length = 30)
    private String classStartTime;
    @Column(name = "class_end_time", length = 30)
    private String classEndTime;

    @Column(name = "total_present_student", length = 10)
    private int totalPresentStudent;
    @Column(name = "total_present_girl", length = 10)
    private int totalPresentGirl;
    @Column(name = "total_present_boy", length = 10)
    private int totalPresentBoy;
    @Column(name = "total_present_special", length = 10)
    private int totalPresentSpecial;

    @Column(name = "note", length = 250)
    private String note;

    @Column(name = "last_followup_indicator1", length = 600)
    private String lastFollowupIndicator1;
    @Column(name = "last_followup_indicator2", length = 600)
    private String lastFollowupIndicator2;
    @Column(name = "last_followup_indicator3", length = 600)
    private String lastFollowupIndicator3;

    @Column(name = "ind11_used_rtr_material_status", length = 20)
    private String ind11UsedRtRMaterialStatus;
    @Column(name = "ind11_used_rtr_material_note", length = 250)
    private String ind11UsedRtRMaterialNote;

    @Column(name = "ind12_plan_wise_teaching_status", length = 20)
    private String ind12PlanWiseTeachingStatus;
    @Column(name = "ind12_plan_wise_teaching_note", length = 250)
    private String ind12PlanWiseTeachingNote;

    @Column(name = "ind13_followed_iweu_do_status", length = 20)
    private String ind13FollowedIWeUDoStatus;
    @Column(name = "ind13_followed_iweu_do_note", length = 250)
    private String ind13FollowedIWeUDoNote;

    @Column(name = "ind14_used_standard_language_allow_practic_status", length = 20)
    private String ind14UsedStandardLanguageAllowPracticeStatus;
    @Column(name = "ind14_used_standard_language_allow_practic_note", length = 250)
    private String ind14UsedStandardLanguageAllowPracticeNote;

    @Column(name = "ind21_used_rtr_reading_material_status", length = 20)
    private String ind21UsedRtRReadingMaterialStatus;
    @Column(name = "ind21_used_rtr_reading_material_note", length = 250)
    private String ind21UsedRtRReadingMaterialNote;

    @Column(name = "ind22_followed_plan_continuity_status", length = 20)
    private String ind22FollowedPlanContinuityStatus;
    @Column(name = "ind22_followed_plan_continuity_note", length = 250)
    private String ind22FollowedPlanContinuityNote;

    @Column(name = "ind23_asked_related_question_status", length = 20)
    private String ind23AskedRelatedQuestionStatus;
    @Column(name = "ind23_asked_related_question_note", length = 250)
    private String ind23AskedRelatedQuestionNote;

    @Column(name = "ind24_showed_picture_allowed_speaking_status", length = 20)
    private String ind24ShowedPictureAllowedSpeakingStatus;
    @Column(name = "ind24_showed_picture_allowed_speaking_note", length = 250)
    private String ind24ShowedPictureAllowedSpeakingNote;

    @Column(name = "ind31_used_reading_material_for_assesment_status", length = 20)
    private String ind31UsedReadingMaterialForAssessmentStatus;
    @Column(name = "ind31_used_reading_material_for_assesment_note", length = 250)
    private String ind31UsedReadingMaterialForAssessmentNote;

    @Column(name = "ind32_followed_teaching_plan_status", length = 20)
    private String ind32FollowedTeachingPlanStatus;
    @Column(name = "ind32_followed_teaching_plan_note", length = 250)
    private String ind32FollowedTeachingPlanNote;

    @Column(name = "ind33_assessment_on_5_student_status", length = 20)
    private String ind33AssessmentOn5StudentStatus;
    @Column(name = "ind33_assessment_on_5_student_note", length = 250)
    private String ind33AssessmentOn5StudentNote;

    @Column(name = "ind34_allowed_5_student_story_telling_status", length = 20)
    private String ind34Allowed5StudentStoryTellingStatus;
    @Column(name = "ind34_allowed_5_student_story_telling_note", length = 250)
    private String ind34Allowed5StudentStoryTellingNote;


    @Column(name = "best_practice_indicator1", length = 600)
    private String bestPracticeIndicator1;
    @Column(name = "best_practice_indicator2", length = 600)
    private String bestPracticeIndicator2;
    @Column(name = "best_practice_indicator3", length = 600)
    private String bestPracticeIndicator3;


    @Column(name = "coaching_support_indicator1", length = 600)
    private String coachingSupportIndicator1;
    @Column(name = "coaching_support_indicator2", length = 600)
    private String coachingSupportIndicator2;
    @Column(name = "coaching_support_indicator3", length = 600)
    private String coachingSupportIndicator3;


    @Column(name = "agreed_statement1", length = 300)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 300)
    private String agreedStatement2;

    @Column(name = "teacher_status", length = 20)
    private String teacherStatus;

    @Column(name = "is_checked", length = 10)
    private String isChecked;
    @Column(name = "is_active", length = 20)
    private String isActive;
    @Column(name = "is_deleted", length = 20)
    private String isDeleted;
}
