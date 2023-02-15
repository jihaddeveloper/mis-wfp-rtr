//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 05/01/2023
//  Description: Bangla class  model file

package com.jihad.rtr.wfp.model;

import lombok.*;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
@Table(name = "bangla_class")
public class BanglaClass extends BaseEntity {

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

    @Column(name = "ind1_phonemic_awareness_status", length = 10)
    private String ind1PhonemicAwarenessStatus;
    @Column(name = "ind1_phonemic_awareness_notes", length = 100)
    private String ind1PhonemicAwarenessNotes;

    @Column(name = "ind2_letter_identification_status", length = 10)
    private String ind2LetterIdentificationStatus;
    @Column(name = "ind2_letter_identification_notes", length = 100)
    private String ind2LetterIdentificationNotes;

    @Column(name = "ind3_vocabulary_identification_status", length = 10)
    private String ind3VocabularyIdentificationStatus;
    @Column(name = "ind3_vocabulary_identification_notes", length = 100)
    private String ind3VocabularyIdentificationNotes;

    @Column(name = "ind4_fluency_identification_status", length = 10)
    private String ind4FluencyIdentificationStatus;
    @Column(name = "ind4_fluency_identification_notes", length = 100)
    private String ind4FluencyIdentificationNotes;

    @Column(name = "ind5_comprehension_status", length = 10)
    private String ind5ComprehensionStatus;
    @Column(name = "ind5_comprehension_notes", length = 100)
    private String ind5ComprehensionNotes;

    @Column(name = "ind6_writing_activities_status", length = 10)
    private String ind6WritingActivitiesStatus;
    @Column(name = "ind6_writing_activities_notes", length = 100)
    private String ind6WritingActivitiesNotes;

    @Column(name = "ind7_i_do_we_do_you_do_status", length = 10)
    private String ind7IDoWeDoYouDoStatus;
    @Column(name = "ind7_i_do_we_do_you_do_notes", length = 100)
    private String ind7IDoWeDoYouDoNotes;

    @Column(name = "ind8GroupWorkStatus", length = 10)
    private String ind8GroupWorkStatus;
    @Column(name = "ind8GroupWorkNotes", length = 100)
    private String ind8GroupWorkNotes;

    @Column(name = "ind9_time_on_task_status", length = 10)
    private String ind9TimeOnTaskStatus;
    @Column(name = "ind9_time_on_task_notes", length = 100)
    private String ind9TimeOnTaskNotes;

    @Column(name = "ind10_use_teaching_aid_status", length = 10)
    private String ind10UseTeachingAidStatus;
    @Column(name = "ind10_use_teaching_aid_notes", length = 100)
    private String ind10UseTeachingAidNotes;

    @Column(name = "ind11_continuity_of_lessons_status", length = 10)
    private String ind11ContinuityOfLessonsStatus;
    @Column(name = "ind11_continuity_of_lessons_notes", length = 100)
    private String ind11ContinuityOfLessonsNotes;

    @Column(name = "ind12_assessment_status", length = 10)
    private String ind12AssessmentStatus;
    @Column(name = "ind12_assessment_notes", length = 100)
    private String ind12AssessmentNotes;


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
    @Column(name = "coaching_support_details_ind1", length = 200)
    private String coachingSupportDetailsInd1;
    @Column(name = "coaching_support_details_ind2", length = 200)
    private String coachingSupportDetailsInd2;

    @Column(name = "agreed_statement1", length = 200)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 200)
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
