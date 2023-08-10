//  Author: Mohammad Jihad Hossain
//  Create Date: 16/02/2023
//  Modify Date: 16/02/2023
//  Description: Preprimary class  model file

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
@Table(name = "preprimary_class")
public class PrePrimaryClass extends BaseEntity {

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
    @Column(name = "content_name_1", length = 200)
    private String contentName1;
    @Column(name = "content_name_2", length = 200)
    private String contentName2;
    @Column(name = "content_name_3", length = 200)
    private String contentName3;
    @Column(name = "period_month", length = 20)
    private String periodMonth;
    @Column(name = "period_week", length = 20)
    private String periodWeek;
    @Column(name = "period_day", length = 20)
    private String periodDay;

    @Column(name = "total_present_student")
    private int totalPresentStudent;
    @Column(name = "total_present_girl")
    private int totalPresentGirl;
    @Column(name = "total_present_boy")
    private int totalPresentBoy;
    @Column(name = "total_present_special")
    private int totalPresentSpecial;

    @Column(name = "note", length = 150)
    private String note;

    @Column(name = "last_followup_topic1", length = 800)
    private String lastFollowupTopic1;
    @Column(name = "last_followup_topic2", length = 800)
    private String lastFollowupTopic2;
    @Column(name = "last_followup_topic3", length = 800)
    private String lastFollowupTopic3;

    @Column(name = "ind1_1_using_bigbook_status", length = 10)
    private String ind11UsingBigbookStatus;
    @Column(name = "ind1_1_using_bigbook_notes", length = 100)
    private String ind11UsingBigbookNotes;

    @Column(name = "ind1_2_picture_discussion_status", length = 10)
    private String ind12PictureDiscussionStatus;
    @Column(name = "ind1_2_picture_discussion_notes", length = 100)
    private String ind12PictureDiscussionNotes;

    @Column(name = "ind1_3_followed_instruction_status", length = 10)
    private String ind13FollowedInstructionStatus;
    @Column(name = "ind1_3_followed_instruction_notes", length = 100)
    private String ind13FollowedInstructionNotes;

    @Column(name = "ind2_1_using_talking_chart_status", length = 10)
    private String ind21UsingTalkingChartStatus;
    @Column(name = "ind2_1_using_talking_chart_notes", length = 100)
    private String ind21UsingTalkingChartNotes;

    @Column(name = "ind2_2_using_picture_element_status", length = 10)
    private String ind22UsingPictureElementStatus;
    @Column(name = "ind2_2_using_picture_element_notes", length = 100)
    private String ind22UsingPictureElementNotes;

    @Column(name = "ind2_3_followed_instruction_step_status", length = 10)
    private String ind23FollowedInstructionStepStatus;
    @Column(name = "ind2_3_followed_instruction_step_notes", length = 100)
    private String ind23FollowedInstructionStepNotes;

    @Column(name = "ind3_1_language_game_status", length = 10)
    private String ind31LanguageGameStatus;
    @Column(name = "ind3_1_language_game_notes", length = 100)
    private String ind31LanguageGameNotes;

    @Column(name = "ind3_2_language_game_iweyou_status", length = 10)
    private String ind32LanguageGameIWeYouStatus;
    @Column(name = "ind3_2_language_game_iweyou_notes", length = 100)
    private String ind32LanguageGameIWeYouNotes;

    @Column(name = "ind3_3_language_game_extra_status", length = 10)
    private String ind33LanguageGameExtraStatus;
    @Column(name = "ind3_3_language_game_extra_notes", length = 100)
    private String ind33LanguageGameExtraNotes;


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
    @Column(name = "coaching_support_details_ind1", length = 400)
    private String coachingSupportDetailsInd1;
    @Column(name = "coaching_support_details_ind2", length = 400)
    private String coachingSupportDetailsInd2;

    @Column(name = "agreed_statement1", length = 800)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 800)
    private String agreedStatement2;


    @Column(name = "teacher_status", length = 30)
    private String teacherStatus;

    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;
}
