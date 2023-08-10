//  Author: Mohammad Jihad Hossain
//  Create Date: 29/11/2022
//  Modify Date: 05/01/2023
//  Description: Library observation  model file

package com.jihad.rtr.wfp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "library_observations")
public class LibraryObservation extends BaseEntity {

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
    @Column(name = "visitor", length = 50)
    private String visitor;
    @Column(name = "visitor_designation", length = 50)
    private String visitorDesignation;
    @Column(name = "visitor_office", length = 50)
    private String visitorOffice;
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
    @Column(name = "month", length = 50)
    private String month;
    @Column(name = "year", length = 50)
    private String year;

    @Column(name = "note", length = 150)
    private String note;


    @Column(name = "last_followup_indicator1", length = 600)
    private String lastFollowupIndicator1;
    @Column(name = "last_followup_indicator2", length = 600)
    private String lastFollowupIndicator2;
    @Column(name = "last_followup_indicator3", length = 600)
    private String lastFollowupIndicator3;

    @Column(name = "ind1_is_trained_all_teacher", length = 20)
    private String ind1IsTrainedAllTeacher;
    @Column(name = "ind1_1_is_trained_srm_teacher_incharge", length = 20)
    private String ind11IsTrainedSRMTeacherIncharge;
    @Column(name = "ind1_2_is_trained_head_teacher", length = 20)
    private String ind12IsTrainedHeadTeacher;

    @Column(name = "ind2_classroom_suitable_srm", length = 20)
    private String ind2ClassroomSuitableSRM;
    @Column(name = "ind2_1_classroom_door_window_lock", length = 20)
    private String ind21ClassroomDoorWindowLock;
    @Column(name = "ind2_2_classroom_safe_clean", length = 20)
    private String ind22ClassroomSafeClean;

    @Column(name = "ind3_bookself_useable", length = 20)
    private String ind3BookselfUseable;
    @Column(name = "ind3_1_bookself_accessible", length = 20)
    private String ind31BookselfAccessible;
    @Column(name = "ind3_2_bookself_environment_protected", length = 20)
    private String ind32BookselfEnvironmentProtected;
    @Column(name = "ind3_3_bookself_table_condition", length = 20)
    private String ind33BookselfTableCondition;

    @Column(name = "ind4_book_register_updated", length = 20)
    private String ind4BookRegisterUpdated;

    @Column(name = "ind5_bookself_organized", length = 20)
    private String ind5BookselfOrganized;
    @Column(name = "ind5_1_bookself_book_organized_open", length = 20)
    private String ind51BookselfBookOrganizedOpen;
    @Column(name = "ind5_2_bookself_book_level_viewable", length = 20)
    private String ind52BookselfBookLevelViewable;
    @Column(name = "ind5_3_bookself_book_accessible", length = 20)
    private String ind53BookselfBookAccessible;

    @Column(name = "ind6_printrich_displayed", length = 20)
    private String ind6PrintRichDisplayed;

    @Column(name = "ind7_book_checkout_functional", length = 20)
    private String ind7BookCheckoutFunctional;
    @Column(name = "ind7_1_book_checkout_procedure_displayed", length = 20)
    private String ind71BookCheckoutProcedureDisplayed;
    @Column(name = "ind7_2_book_checkout_register_usable", length = 20)
    private String ind72BookCheckoutRegisterUsable;
    @Column(name = "ind7_3_book_checkout_register_updated", length = 20)
    private String ind73BookCheckoutRegisterUpdated;
    @Column(name = "ind7_4_book_checkout_pending_booklist", length = 20)
    private String ind74BookCheckoutPendingBooklist;

    @Column(name = "ind8_srm_class_routine", length = 20)
    private String ind8SRMClassRoutine;
    @Column(name = "ind8_1_srm_class_weekly", length = 20)
    private String ind81SRMClassWeekly;
    @Column(name = "ind8_2_daily_book_checkout_opportunity", length = 20)
    private String ind82DailyBookCheckoutOpportunity;

    @Column(name = "ind9_srm_register_updated", length = 20)
    private String ind9SRMRegisterUpdated;

    @Column(name = "ind10_parents_meeting", length = 20)
    private String ind10ParentsMeeting;

    @Column(name = "ind11_read_festival", length = 20)
    private String ind11ReadFestival;

    @Column(name = "ind12_sustainability_plan", length = 20)
    private String ind12SustainabilityPlan;
    @Column(name = "ind12_1_collective_plan", length = 20)
    private String ind121CollectivePlan;
    @Column(name = "ind12_2_responsibility_plan", length = 20)
    private String ind122ResponsibilityPlan;


    @Column(name = "best_practice_indicator1", length = 800)
    private String bestPracticeIndicator1;
    @Column(name = "best_practice_indicator1_details", length = 500)
    private String bestPracticeIndicator1Details;
    @Column(name = "best_practice_indicator2", length = 800)
    private String bestPracticeIndicator2;
    @Column(name = "best_practice_indicator2_details", length = 500)
    private String bestPracticeIndicator2Details;
    @Column(name = "best_practice_indicator3", length = 800)
    private String bestPracticeIndicator3;
    @Column(name = "best_practice_indicator3_details", length = 500)
    private String bestPracticeIndicator3Details;


    @Column(name = "coaching_support_indicator1", length = 800)
    private String coachingSupportIndicator1;
    @Column(name = "coaching_support_indicator1_details", length = 500)
    private String coachingSupportIndicator1Details;
    @Column(name = "coaching_support_indicator2", length = 800)
    private String coachingSupportIndicator2;
    @Column(name = "coaching_support_indicator2_details", length = 500)
    private String coachingSupportIndicator2Details;
    @Column(name = "agreed_statement1", length = 800)
    private String agreedStatement1;
    @Column(name = "agreed_statement2", length = 800)
    private String agreedStatement2;

    @Column(name = "library_status", length = 20)
    private String libraryStatus;

    @Column(name = "is_active", length = 20)
    private String isActive;
    @Column(name = "is_deleted", length = 20)
    private String isDeleted;

}
