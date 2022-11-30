//  Author: Mohammad Jihad Hossain
//  Create Date: 29/11/2022
//  Modify Date: 29/11/2022
//  Description: SRM class  model file

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
@Table(name = "srm_class")
public class SRMClass extends BaseEntity {

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
    @Column(name = "class_start_time")
    private String classStartTime;
    @Column(name = "class_end_time")
    private String classEndTime;
    @Column(name = "content_name")
    private String contentName;
    @Column(name = "period_day")
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

    @Column(name = "last_followup_topic1", length = 250)
    private String lastFollowupTopic1;
    @Column(name = "last_followup_topic2", length = 250)
    private String lastFollowupTopic2;
    @Column(name = "last_followup_topic3", length = 250)
    private String lastFollowupTopic3;

    @Column(name = "type_of_reading", length = 50)
    private String typeOfReading;

    @Column(name = "time_of_reading", length = 50)
    private String timeOfReading;

    @Column(name = "ind1_friendly_communication_status", length = 10)
    private String ind1FriendlyCommunicationStatus;
    @Column(name = "ind1_friendly_communication_notes", length = 100)
    private String ind1FriendlyCommunicationNotes;

    @Column(name = "ind2_srm_inspiring_status", length = 10)
    private String ind2SRMInspiringStatus;
    @Column(name = "ind2_srm_inspiring_notes", length = 100)
    private String ind2SRMInspiringNotes;

    @Column(name = "ind3_srm_instruction_status", length = 10)
    private String ind3SRMInstructionStatus;
    @Column(name = "ind3_srm_instruction_notes", length = 100)
    private String ind3SRMInstructionNotes;

    @Column(name = "ind4_book_showing_status", length = 10)
    private String ind4BookShowingStatus;
    @Column(name = "ind4_book_showing_notes", length = 100)
    private String ind4BookShowingNotes;

    @Column(name = "ind5_word_teaching_status", length = 10)
    private String ind5WordTeachingStatus;
    @Column(name = "ind5_word_teaching_notes", length = 100)
    private String ind5WordTeachingNotes;

    @Column(name = "ind6_story_reading_status", length = 10)
    private String ind6StoryReadingStatus;
    @Column(name = "ind6_story_reading_notes", length = 100)
    private String ind6StoryReadingNotes;

    @Column(name = "ind7_story_suitable_status", length = 10)
    private String ind7StorySuitableStatus;
    @Column(name = "ind7_story_suitable_Notes", length = 100)
    private String ind7StorySuitableNotes;

    @Column(name = "ind8_story_reading_combination_status", length = 10)
    private String ind8StoryReadingCombinationStatus;
    @Column(name = "ind8_story_reading_combination_notes", length = 100)
    private String ind8StoryReadingCombinationNotes;

    @Column(name = "ind9_all_student_engagement_status", length = 10)
    private String ind9AllStudentEngagementStatus;
    @Column(name = "ind9_all_student_engagement_notes", length = 100)
    private String ind9AllStudentEngagementNotes;

    @Column(name = "ind10_inclusive_assessment_status", length = 10)
    private String ind10InclusiveAssessmentStatus;
    @Column(name = "ind10_inclusive_assessment_notes", length = 100)
    private String ind10InclusiveAssessmentNotes;

    @Column(name = "ind11_asking_for_bco_status", length = 10)
    private String ind11AskingForBCOStatus;
    @Column(name = "ind11_asking_for_bco_notes", length = 100)
    private String ind11AskingForBCONotes;


    @Column(name = "best_practice_ind1", length = 250)
    private String bestPracticeInd1;
    @Column(name = "best_practice_ind2", length = 250)
    private String bestPracticeInd2;
    @Column(name = "best_practice_ind3", length = 250)
    private String bestPracticeInd3;

    @Column(name = "coaching_support_ind1", length = 250)
    private String coachingSupportInd1;
    @Column(name = "coaching_support_ind2", length = 250)
    private String coachingSupportInd2;
    @Column(name = "coaching_support_details_ind1", length = 100)
    private String coachingSupportDetailsInd1;
    @Column(name = "coaching_support_details_ind2", length = 100)
    private String coachingSupportDetailsInd2;

    @Column(name = "agreed_statement1", length = 100)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 100)
    private String agreedStatement2;


    @Column(name = "teacher_status", length = 30)
    private String teacherStatus;

    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;
}
