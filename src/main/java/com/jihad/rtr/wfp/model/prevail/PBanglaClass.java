//  Author: Mohammad Jihad Hossain
//  Create Date: 07/09/2025
//  Modify Date: 07/09/2025
//  Description: PBanglaClass class  model file


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
@Table(name = "p_bangla_class")
public class PBanglaClass extends BaseEntity {

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
    @Column(name = "rtr_school_id", length = 50)
    private String rtrSchoolId;
    @Column(name = "year_of_support", length = 10)
    private String yearOfSupport;
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
    @Column(name = "total_present_student")
    private int totalPresentStudent;


    @Column(name = "note", length = 500)
    private String note;

    @Column(name = "last_followup_topic1", length = 800)
    private String lastFollowupTopic1;
    @Column(name = "last_followup_topic2", length = 800)
    private String lastFollowupTopic2;
    @Column(name = "last_followup_topic3", length = 800)
    private String lastFollowupTopic3;

    @Column(name = "ind11_teacher_followed_teacher_guide_in_class_status", length = 10)
    private String ind11TeacherFollowedTeacherGuideInClassStatus;
    @Column(name = "ind11_teacher_followed_teacher_guide_in_class_note", length = 200)
    private String ind11TeacherFollowedTeacherGuideInClassNote;

    @Column(name = "ind12_followed_i_do_we_do_you_do_status", length = 10)
    private String ind12FollowedIDoWeDoYouDoStatus;
    @Column(name = "ind12_followed_i_do_we_do_you_do_note", length = 200)
    private String ind12FollowedIDoWeDoYouDoNote;

    @Column(name = "ind13_followed_continuityOfLessonStatus", length = 10)
    private String ind13FollowedContinuityOfLessonStatus;
    @Column(name = "ind13_followed_continuity_of_lesson_note", length = 200)
    private String ind13FollowedContinuityOfLessonNote;

    @Column(name = "ind14_implemented_all_task_in_time_status", length = 10)
    private String ind14ImplementedAllTaskInTimeStatus;
    @Column(name = "ind14_implemented_all_task_in_time_note", length = 200)
    private String ind14ImplementedAllTaskInTimeNote;

    @Column(name = "ind15_instructed_to_use_workbook_status", length = 10)
    private String ind15InstructedToUseWorkbookStatus;
    @Column(name = "ind15_instructed_to_use_workbook_note", length = 200)
    private String ind15InstructedToUseWorkbookNote;

    @Column(name = "ind16_independent_reading_opportunity_status", length = 10)
    private String ind16IndependentReadingOpportunityStatus;
    @Column(name = "ind16_independent_reading_opportunity_note", length = 200)
    private String ind16IndependentReadingOpportunityNote;

    @Column(name = "ind21_correctly_pronounced_status", length = 10)
    private String ind21CorrectlyPronouncedStatus;
    @Column(name = "ind21_correctly_pronounced_note", length = 200)
    private String ind21CorrectlyPronouncedNote;

    @Column(name = "ind22_taught_correctly_allow_practice_status", length = 10)
    private String ind22TaughtCorrectlyAllowPracticeStatus;
    @Column(name = "ind22_taught_correctly_allow_practice_note", length = 200)
    private String ind22TaughtCorrectlyAllowPracticeNote;

    @Column(name = "ind23_demonstrates_fluent_reading_status", length = 10)
    private String ind23DemonstratesFluentReadingStatus;
    @Column(name = "ind23_demonstrates_fluent_reading_note", length = 200)
    private String ind23DemonstratesFluentReadingNote;

    @Column(name = "ind24_allow_read_individually_pair_groups_status", length = 10)
    private String ind24AllowReadIndividuallyPairGroupsStatus;
    @Column(name = "ind24_allow_read_individually_pair_groups_note", length = 200)
    private String ind24AllowReadIndividuallyPairGroupsNote;

    @Column(name = "ind25_follows_instructions_in_writing_status", length = 10)
    private String ind25FollowsInstructionsInWritingStatus;
    @Column(name = "ind25_follows_instructions_in_writing_note", length = 200)
    private String ind25FollowsInstructionsInWritingNote;

    @Column(name = "ind31_asked_helpful_questions_status", length = 10)
    private String ind31AskedHelpfulQuestionsStatus;
    @Column(name = "ind31_asked_helpful_questions_note", length = 200)
    private String ind31AskedHelpfulQuestionsNote;

    @Column(name = "ind32_taught_vocabulary_new_sentence_status", length = 10)
    private String ind32TaughtVocabularyNewSentenceStatus;
    @Column(name = "ind32_taught_vocabulary_new_sentence_note", length = 200)
    private String ind32TaughtVocabularyNewSentenceNote;

    @Column(name = "ind33_check_writing_spelling_punctuation_status", length = 10)
    private String ind33CheckWritingSpellingPunctuationStatus;
    @Column(name = "ind33_check_writing_spelling_punctuation_note", length = 200)
    private String ind33CheckWritingSpellingPunctuationNote;

    @Column(name = "ind34_checked_we_do_you_do_status", length = 10)
    private String ind34CheckedWeDoYouDoStatus;
    @Column(name = "ind34_checked_we_do_you_do_note", length = 200)
    private String ind34CheckedWeDoYouDoNote;


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

    @Column(name = "coaching_support_teacher", length = 500)
    private String coachingSupportTeacher;
    @Column(name = "coaching_support_lf", length = 500)
    private String coachingSupportLF;

    @Column(name = "agreed_statement1", length = 400)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 400)
    private String agreedStatement2;

    @Column(name = "question1", length = 300)
    private String question1;

    @Column(name = "student1", length = 50)
    private String student1;
    @Column(name = "student2", length = 50)
    private String student2;
    @Column(name = "student3", length = 50)
    private String student3;

    private int noRightFor1;
    private int noWrongFor1;
    private int totalFor1;
    private int noRightFor2;
    private int noWrongFor2;
    private int totalFor2;
    private int noRightFor3;
    private int noWrongFor3;
    private int totalFor3;


    @Column(name = "teacher_status", length = 30)
    private String teacherStatus;

    @Column(name = "is_checked", length = 10)
    private String isChecked;
    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;

}
