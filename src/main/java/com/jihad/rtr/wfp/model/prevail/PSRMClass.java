//  Author: Mohammad Jihad Hossain
//  Create Date: 02/03/2026
//  Modify Date: 02/03/2026
//  Description: Prevail SRM class  model file


package com.jihad.rtr.wfp.model.prevail;

import com.jihad.rtr.wfp.model.BaseEntity;
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
@Table(name = "p_srm_class")
public class PSRMClass extends BaseEntity {

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
    @Column(name = "office", length = 30)
    private String office;
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
    @Column(name = "school", length = 200)
    private String school;
    @Column(name = "phase", length = 25)
    private String phase;
    @Column(name = "rtr_school_id", length = 50)
    private String rtrSchoolId;
    @Column(name = "year_of_support", length = 10)
    private String yearOfSupport;
    @Column(name = "year_of_establish", length = 10)
    private String yearOfEstablish;
    @Column(name = "point_teacher", length = 50)
    private String pointTeacher;
    @Column(name = "visitor", length = 50)
    private String visitor;
    @Column(name = "visitor_designation", length = 30)
    private String visitorDesignation;


    @Column(name = "total_admitted_student")
    private int totalAdmittedStudent;
    @Column(name = "total_present_student")
    private int totalPresentStudent;


    @Column(name = "note", length = 150)
    private String note;

    @Column(name = "last_followup_topic1", length = 800)
    private String lastFollowupTopic1;
    @Column(name = "last_followup_topic2", length = 800)
    private String lastFollowupTopic2;
    @Column(name = "last_followup_topic3", length = 800)
    private String lastFollowupTopic3;
    @Column(name = "last_followup_topic4", length = 800)
    private String lastFollowupTopic4;


    @Column(name = "type_of_reading_part_a", length = 50)
    private String typeOfReadingPartA;


    @Column(name = "part_a_ind11_teacher_helped_student_to_seat_status", length = 10)
    private String partAInd11TeacherHelpedStudentToSeatStatus;
    @Column(name = "part_a_ind11_teacher_helped_student_to_seat_note", length = 100)
    private String partAInd11TeacherHelpedStudentToSeatNote;

    @Column(name = "part_a_ind12_teacher_showed_a_book_detail_status", length = 10)
    private String partAInd12TeacherShowedABookDetailStatus;
    @Column(name = "part_a_ind12_teacher_showed_a_book_detail_note", length = 100)
    private String partAInd12TeacherShowedABookDetailNote;

    @Column(name = "part_a_ind13_teacher_teaches_word_with_meaning_status", length = 10)
    private String partAInd13TeacherTeachesWordWithMeaningStatus;
    @Column(name = "part_a_ind13_teacher_teaches_word_with_meaning_note", length = 100)
    private String partAInd13TeacherTeachesWordWithMeaningNote;

    @Column(name = "part_a_ind21_teacher_inspire_to_participate_status", length = 10)
    private String partAInd21TeacherInspireToParticipateStatus;
    @Column(name = "part_a_ind21_teacher_inspire_to_participate_note", length = 100)
    private String partAInd21TeacherInspireToParticipateNote;

    @Column(name = "part_a_ind22_teacher_showed_picture_text_status", length = 10)
    private String partAInd22TeacherShowedPictureTextStatus;
    @Column(name = "part_a_ind22_teacher_showed_picture_text_note", length = 100)
    private String partAInd22TeacherShowedPictureTextNote;

    @Column(name = "part_a_ind23_teacher_teaches_by_action_status", length = 10)
    private String partAInd23TeacherTeachesByActionStatus;
    @Column(name = "part_a_ind23_teacher_teaches_by_action_note", length = 100)
    private String partAInd23TeacherTeachesByActionNote;

    @Column(name = "part_a_ind24_teacher_asked_next_step_status", length = 10)
    private String partAInd24TeacherAskedNextStepStatus;
    @Column(name = "part_a_ind24_teacher_asked_next_step_note", length = 100)
    private String partAInd24TeacherAskedNextStepNote;

    @Column(name = "part_a_ind25_teacher_selected_book_as_level_status", length = 10)
    private String partAInd25TeacherSelectedBookAsLevelStatus;
    @Column(name = "part_a_ind25_teacher_selected_book_as_level_note", length = 100)
    private String partAInd25TeacherSelectedBookAsLevelNote;

    @Column(name = "part_a_ind26_teacher_asked_to_participate_in_reading_status", length = 10)
    private String partAInd26TeacherAskedToParticipateInReadingStatus;
    @Column(name = "part_a_ind26_teacher_asked_to_participate_in_reading_note", length = 100)
    private String partAInd26TeacherAskedToParticipateInReadingNote;

    @Column(name = "part_a_ind31_teacher_allow_to_bco_status", length = 10)
    private String partAInd31TeacherAllowToBCOStatus;
    @Column(name = "part_a_ind31_teacher_allow_to_bco_note", length = 100)
    private String partAInd31TeacherAllowToBCONote;

    @Column(name = "part_a_ind32_teacher_asked_question_for_assessment_status", length = 10)
    private String partAInd32TeacherAskedQuestionForAssessmentStatus;
    @Column(name = "part_a_ind32_teacher_asked_question_for_assessment_note", length = 100)
    private String partAInd32TeacherAskedQuestionForAssessmentNote;

    @Column(name = "part_a_ind33_teacher_participate_student_to_srm_status", length = 10)
    private String partAInd33TeacherParticipateStudentToSRMStatus;
    @Column(name = "part_a_ind33_teacher_participate_student_to_srm_note", length = 100)
    private String partAInd33TeacherParticipateStudentToSRMNote;

    @Column(name = "part_a_ind34_teacher_congratulated_student_status", length = 10)
    private String partAInd34TeacherCongratulatedStudentStatus;
    @Column(name = "part_a_ind34_teacher_congratulated_student_note", length = 100)
    private String partAInd34TeacherCongratulatedStudentNote;


    @Column(name = "best_practice_indicator1_part_a", length = 800)
    private String bestPracticeIndicator1PartA;
    @Column(name = "best_practice_indicator2_part_a", length = 800)
    private String bestPracticeIndicator2PartA;


    @Column(name = "coaching_support_indicator1_part_a", length = 800)
    private String coachingSupportIndicator1PartA;
    @Column(name = "coaching_support_indicator2_part_a", length = 800)
    private String coachingSupportIndicator2PartA;

    @Column(name = "agreed_statement_teacher_part_a", length = 300)
    private String agreedStatementTeacherPartA;
    @Column(name = "agreed_statement_lf_part_a", length = 300)
    private String agreedStatementLFPartA;


    @Column(name = "time_of_reading_part_b", length = 50)
    private String typeOfReadingPartB;


    @Column(name = "part_b_ind11_teacher_helped_student_to_seat_status", length = 10)
    private String partBInd11TeacherHelpedStudentToSeatStatus;
    @Column(name = "part_b_ind11_teacher_helped_student_to_seat_note", length = 100)
    private String partBInd11TeacherHelpedStudentToSeatNote;

    @Column(name = "part_b_ind12_teacher_instruct_srm_status", length = 10)
    private String partBInd12TeacherInstructSRMStatus;
    @Column(name = "part_b_ind12_teacher_instruct_srm_note", length = 100)
    private String partBInd12TeacherInstructSRMNote;

    @Column(name = "part_b_ind13_teacher_checked_book_level_status", length = 10)
    private String partBInd13TeacherCheckedBookLevelStatus;
    @Column(name = "part_b_ind13_teacher_checked_book_level_note", length = 100)
    private String partBInd13TeacherCheckedBookLevelNote;

    @Column(name = "part_b_ind21_teacher_listen_and_ask_question_status", length = 10)
    private String partBInd21TeacherListenAndAskQuestionStatus;
    @Column(name = "part_b_ind21_teacher_listen_and_ask_question_note", length = 100)
    private String partBInd21TeacherListenAndAskQuestionNote;

    @Column(name = "part_b_ind22_teacher_checked_student_participation_status", length = 10)
    private String partBInd22TeacherCheckedStudentParticipationStatus;
    @Column(name = "part_b_ind22_teacher_checked_student_participation_note", length = 100)
    private String partBInd22TeacherCheckedStudentParticipationNote;

    @Column(name = "part_b_ind31_teacher_helped_student_to_share_status", length = 10)
    private String partBInd31TeacherHelpedStudentToShareStatus;
    @Column(name = "part_b_ind31_teacher_helped_student_to_share_note", length = 100)
    private String partBInd31TeacherHelpedStudentToShareNote;

    @Column(name = "part_b_ind32_teacher_inspired_student_effort_status", length = 10)
    private String partBInd32TeacherInspiredStudentEffortStatus;
    @Column(name = "part_b_ind32_teacher_inspired_student_effort_note", length = 100)
    private String partBInd32TeacherInspiredStudentEffortNote;

    @Column(name = "part_b_ind33_teacher_inspired_student_for_srm_status", length = 10)
    private String partBInd33TeacherInspiredStudentForSRMStatus;
    @Column(name = "part_b_ind33_teacher_inspired_student_for_srm_note", length = 100)
    private String partBInd33TeacherInspiredStudentForSRMNote;

    @Column(name = "part_b_ind34_teacher_allowed_student_to_bco_status", length = 10)
    private String partBInd34TeacherAllowedStudentToBCOStatus;
    @Column(name = "part_b_ind34_teacher_allowed_student_to_bco_note", length = 100)
    private String partBInd34TeacherAllowedStudentToBCONote;


    @Column(name = "best_practice_indicator1_part_b", length = 800)
    private String bestPracticeIndicator1PartB;
    @Column(name = "best_practice_indicator2_part_b", length = 800)
    private String bestPracticeIndicator2PartB;

    @Column(name = "coaching_support_indicator1_part_b", length = 800)
    private String coachingSupportIndicator1PartB;
    @Column(name = "coaching_support_indicator2_part_b", length = 800)
    private String coachingSupportIndicator2PartB;

    @Column(name = "agreed_statement_teacher_part_b", length = 300)
    private String agreedStatementTeacherPartB;
    @Column(name = "agreed_statement_lf_part_b", length = 300)
    private String agreedStatementLFPartB;

    @Column(name = "teacher_status", length = 30)
    private String teacherStatus;


    @Column(name = "is_checked", length = 10)
    private String isChecked;
    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;
}
