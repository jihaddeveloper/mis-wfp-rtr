//  Author: Mohammad Jihad Hossain
//  Create Date: 18/09/2024
//  Modify Date: 18/09/2024
//  Description: School Monitoring model file

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
@Table(name = "school_monitoring")
public class SchoolMonitoring extends BaseEntity {

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

    @Column(name = "note", length = 300)
    private String note;

    @Column(name = "ind11_lf_arrival_time_status", length = 10)
    private String ind11LFArrivalTimeStatus;
    @Column(name = "ind11_lf_arrival_time_notes", length = 200)
    private String ind11LFArrivalTimeNotes;

    @Column(name = "ind12_challan_document_status", length = 10)
    private String ind12ChallanDocumentStatus;
    @Column(name = "ind12_challan_document_notes", length = 200)
    private String ind12ChallanDocumentNotes;

    @Column(name = "ind13_visitor_register_status", length = 10)
    private String ind13VisitorRegisterStatus;
    @Column(name = "ind13_visitor_register_notes", length = 200)
    private String ind13VisitorRegisterNotes;

    @Column(name = "ind14_related_document_status", length = 10)
    private String ind14RelatedDocumentStatus;
    @Column(name = "ind14_related_document_notes", length = 200)
    private String ind14RelatedDocumentNotes;

    @Column(name = "ind21_workbook_provided_status", length = 10)
    private String ind21WorkbookProvidedStatus;
    @Column(name = "ind21_workbook_provided_notes", length = 200)
    private String ind21WorkbookProvidedNotes;

    @Column(name = "ind22_instruction_material_status", length = 10)
    private String ind22InstructionMaterialStatus;
    @Column(name = "ind22_instruction_material_notes", length = 200)
    private String ind22InstructionMaterialNotes;

    @Column(name = "ind23_other_material_status", length = 10)
    private String ind23OtherMaterialStatus;
    @Column(name = "ind23_other_material_notes", length = 200)
    private String ind23OtherMaterialNotes;

    @Column(name = "ind24_class_on_time_status", length = 10)
    private String ind24ClassOnTimeStatus;
    @Column(name = "ind24_class_on_time_notes", length = 200)
    private String ind24ClassOnTimeNotes;

    @Column(name = "ind25_teacher_is_trained_status", length = 10)
    private String ind25TeacherIsTrainedStatus;
    @Column(name = "ind25_teacher_is_trained_notes", length = 200)
    private String ind25TeacherIsTrainedNotes;

    @Column(name = "ind26_followed_rtr_instruction_status", length = 10)
    private String ind26FollowedRtRInstructionStatus;
    @Column(name = "ind26_followed_rtr_instruction_notes", length = 200)
    private String ind26FollowedRtRInstructionNotes;

    @Column(name = "ind27_student_tracking_document_status", length = 10)
    private String ind27StudentTrackingDocumentStatus;
    @Column(name = "ind27_student_tracking_document_notes", length = 200)
    private String ind27StudentTrackingDocumentNotes;

    @Column(name = "ind31_one_teacher_reading_training_status", length = 10)
    private String ind31OneTeacherReadingTrainingStatus;
    @Column(name = "ind31_one_teacher_reading_training_notes", length = 200)
    private String ind31OneTeacherReadingTrainingNotes;

    @Column(name = "ind32_srm_mentioned_routine_status", length = 10)
    private String ind32SRMMentionedRoutineStatus;
    @Column(name = "ind32_srm_mentioned_routine_notes", length = 200)
    private String ind32SRMMentionedRoutineNotes;

    @Column(name = "ind33_teacher_conduct_reading_activity_status", length = 10)
    private String ind33TeacherConductReadingActivityStatus;
    @Column(name = "ind33_teacher_conduct_reading_activity_notes", length = 200)
    private String ind33TeacherConductReadingActivityNotes;

    @Column(name = "ind34_bookshelf_condition_good_status", length = 10)
    private String ind34BookshelfConditionGoodStatus;
    @Column(name = "ind34_bookshelf_condition_good_notes", length = 200)
    private String ind34BookshelfConditionGoodNotes;

    @Column(name = "ind35_rtr_story_available_register_updated_status", length = 10)
    private String ind35RtRStoryAvailableRegisterUpdatedStatus;
    @Column(name = "ind35_rtr_story_available_register_updated_notes", length = 200)
    private String ind35RtRStoryAvailableRegisterUpdatedNotes;

    @Column(name = "ind36_books_displaying_status", length = 10)
    private String ind36BooksDisplayingStatus;
    @Column(name = "ind36_books_displaying_notes", length = 200)
    private String ind36BooksDisplayingNotes;

    @Column(name = "ind37_library_poster_available_status", length = 10)
    private String ind37LibraryPosterAvailableStatus;
    @Column(name = "ind37_library_poster_available_notes", length = 200)
    private String ind37LibraryPosterAvailableNotes;

    @Column(name = "ind38_bco_register_available_consistent_status", length = 10)
    private String ind38BCORegisterAvailableConsistentStatus;
    @Column(name = "ind38_bco_register_available_consistent_notes", length = 200)
    private String ind38BCORegisterAvailableConsistentNotes;

    @Column(name = "ind39_reading_activity_register_status", length = 10)
    private String ind39ReadingActivityRegisterStatus;
    @Column(name = "ind39_reading_activity_register_notes", length = 200)
    private String ind39ReadingActivityRegisterNotes;

    @Column(name = "ind310_book_captain_selected_status", length = 10)
    private String ind310BookCaptainSelectedStatus;
    @Column(name = "ind310_book_captain_selected_notes", length = 200)
    private String ind310BookCaptainSelectedNotes;


    @Column(name = "ind41_teacher_interaction_status", length = 10)
    private String ind41TeacherInteractionStatus;
    @Column(name = "ind41_teacherI_interaction_notes", length = 200)
    private String ind41TeacherInteractionNotes;

    @Column(name = "ind42_discussion_points", length = 1000)
    private String ind42DiscussionPoints;

    @Column(name = "school_status", length = 20)
    private String schoolStatus;

    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;
}
