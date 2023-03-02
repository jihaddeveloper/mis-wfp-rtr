//  Author: Mohammad Jihad Hossain
//  Create Date: 16/02/2023
//  Modify Date: 16/02/2023
//  Description: Bangla class  model file

package com.jihad.rtr.wfp.model;

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
@Table(name = "core_bangla_class")
public class CoreBanglaClass extends BaseEntity {

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
    @Column(name = "school", length = 200)
    private String school;
    @Column(name = "visitor", length = 50)
    private String visitor;
    @Column(name = "visitor_designation", length = 30)
    private String visitorDesignation;
    @Column(name = "visitor_office", length = 20)
    private String visitorOffice;
    @Column(name = "class_teacher", length = 50)
    private String classTeacher;
    @Column(name = "teacher_gender", length = 20)
    private String teacherGender;
    @Column(name = "is_trained", length = 20)
    private String isTrained;
    @Column(name = "grade", length = 20)
    private String grade;
    @Column(name = "section", length = 20)
    private String section;
    @Column(name = "class_start_time", length = 20)
    private String classStartTime;
    @Column(name = "class_end_time", length = 20)
    private String classEndTime;
    @Column(name = "content_name", length = 200)
    private String contentName;
    @Column(name = "period_day", length = 20)
    private String periodDay;
    @Column(name = "total_admitted_student")
    private int totalAdmittedStudent;
    @Column(name = "total_admitted_girl")
    private int totalAdmittedGirl;
    @Column(name = "total_admitted_boy")
    private int totalAdmittedBoy;
    @Column(name = "total_present_student")
    private int totalPresentStudent;
    @Column(name = "total_present_girl")
    private int totalPresentGirl;
    @Column(name = "total_present_boy")
    private int totalPresentBoy;

    @Column(name = "note", length = 150)
    private String note;

    @Column(name = "last_followup_topic1", length = 600)
    private String lastFollowupTopic1;
    @Column(name = "last_followup_topic2", length = 600)
    private String lastFollowupTopic2;
    @Column(name = "last_followup_topic3", length = 600)
    private String lastFollowupTopic3;

    @Column(name = "ind1_1_followed_teacher_manual_status", length = 10)
    private String ind11FollowedTeacherManualStatus;
    @Column(name = "ind1_1_followed_teacher_manual_notes", length = 100)
    private String ind11FollowedTeacherManualNotes;

    @Column(name = "ind1_2_followed_iweyou_do_status", length = 10)
    private String ind12FollowedIWeYouDoStatus;
    @Column(name = "ind1_2_followed_iweyou_do_notes", length = 100)
    private String ind12FollowedIWeYouDoNotes;

    @Column(name = "ind1_3_allowed_open_reading_status", length = 10)
    private String ind13AllowedOpenReadingStatus;
    @Column(name = "ind1_3_allowed_open_reading_notes", length = 100)
    private String ind13AllowedOpenReadingNotes;

    @Column(name = "ind1_4_teaching_continuity_status", length = 10)
    private String ind14TeachingContinuityStatus;
    @Column(name = "ind1_4_teaching_continuity_notes", length = 100)
    private String ind14TeachingContinuityNotes;

    @Column(name = "ind1_5_workbook_using_instruction_status", length = 10)
    private String ind15WorkbookUsingInstructionStatus;
    @Column(name = "ind1_5_workbook_using_instruction_notes", length = 100)
    private String ind15WorkbookUsingInstructionNotes;

    @Column(name = "ind1_6_step_continuity_status", length = 10)
    private String ind16StepContinuityStatus;
    @Column(name = "ind1_6_step_continuity_notes", length = 100)
    private String ind16StepContinuityNotes;

    @Column(name = "ind2_1_followed_all_step_intime_status", length = 10)
    private String ind21FollowedAllStepIntimeStatus;
    @Column(name = "ind2_1_followed_all_step_intime_notes", length = 100)
    private String ind21FollowedAllStepIntimeNotes;

    @Column(name = "ind2_2_correct_pronunciation_status", length = 10)
    private String ind22CorrectPronunciationStatus;
    @Column(name = "ind2_2_correct_pronunciation_notes", length = 100)
    private String ind22CorrectPronunciationNotes;

    @Column(name = "ind2_3_teaching_and_practice_status", length = 10)
    private String ind23TeachingAndPracticeStatus;
    @Column(name = "ind2_3_teaching_and_practice_notes", length = 100)
    private String ind23TeachingAndPracticeNotes;

    @Column(name = "ind2_4_fluent_reading_status", length = 10)
    private String ind24FluentReadingStatus;
    @Column(name = "ind2_4_fluent_reading_notes", length = 100)
    private String ind24FluentReadingNotes;

    @Column(name = "ind2_5_multiple_reading_practice_status", length = 10)
    private String ind25MultipleReadingPracticeStatus;
    @Column(name = "ind2_5_multiple_reading_practice_notes", length = 100)
    private String ind25MultipleReadingPracticeNotes;

    @Column(name = "ind2_6_followed_instruction_to_writing_status", length = 10)
    private String ind26FollowedInstructionToWritingStatus;
    @Column(name = "ind2_6_followed_instruction_to_writing_notes", length = 100)
    private String ind26FollowedInstructionToWritingNotes;

    @Column(name = "ind3_1_asked_question_status", length = 10)
    private String ind31AskedQuestionStatus;
    @Column(name = "ind3_1_asked_question_notes", length = 100)
    private String ind31AskedQuestionNotes;

    @Column(name = "ind3_2_vocabulary_word_using_status", length = 10)
    private String ind32VocabularyWordUsingStatus;
    @Column(name = "ind3_2_vocabulary_word_using_notes", length = 100)
    private String ind32VocabularyWordUsingNotes;

    @Column(name = "ind3_3_checked_spelling_status", length = 10)
    private String ind33CheckedSpellingStatus;
    @Column(name = "ind3_3_checked_spelling_notes", length = 100)
    private String ind33CheckedSpellingNotes;

    @Column(name = "ind3_4_weyou_participation_check_status", length = 10)
    private String ind34WeYouParticipationCheckStatus;
    @Column(name = "ind3_4_weyou_participation_check_notes", length = 100)
    private String ind34WeYouParticipationCheckNotes;
    @Column(name = "best_practice_ind1", length = 600)
    private String bestPracticeInd1;
    @Column(name = "best_practice_ind2", length = 600)
    private String bestPracticeInd2;
    @Column(name = "best_practice_ind3", length = 600)
    private String bestPracticeInd3;

    @Column(name = "coaching_support_ind1", length = 600)
    private String coachingSupportInd1;
    @Column(name = "coaching_support_ind2", length = 600)
    private String coachingSupportInd2;
    @Column(name = "coaching_support_teacher", length = 400)
    private String coachingSupportTeacher;
    @Column(name = "coaching_support_lf", length = 400)
    private String coachingSupportLF;

    @Column(name = "agreed_statement1", length = 400)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 400)
    private String agreedStatement2;

    @Column(name = "question1", length = 200)
    private String question1;

    @Column(name = "student1", length = 50)
    private String student1;
    @Column(name = "student2", length = 50)
    private String student2;
    @Column(name = "student3", length = 50)
    private String student3;
    @Column(name = "student4", length = 50)
    private String student4;
    @Column(name = "student5", length = 50)
    private String student5;
    private int noRightFor1;
    private int noWrongFor1;
    private int totalFor1;
    private int noRightFor2;
    private int noWrongFor2;
    private int totalFor2;
    private int noRightFor3;
    private int noWrongFor3;
    private int totalFor3;
    private int noRightFor4;
    private int noWrongFor4;
    private int totalFor4;
    private int noRightFor5;
    private int noWrongFor5;
    private int totalFor5;

    @Column(name = "teacher_status", length = 30)
    private String teacherStatus;

    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;
}
