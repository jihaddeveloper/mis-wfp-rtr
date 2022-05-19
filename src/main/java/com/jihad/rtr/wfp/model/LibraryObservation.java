//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 19/05/2022
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
@Table(name = "library_observations")
@Data
public class LibraryObservation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "visit_no")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long visitNo;
    @Column(name = "date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;


    @Column(name = "office")
    private String office;
    @Column(name = "project")
    private String project;
    @Column(name = "district")
    private String district;
    @Column(name = "upazilla")
    private String upazilla;
    @Column(name = "visitor")
    private String visitor;
    @Column(name = "visitor_designation")
    private String visitorDesignation;
    @Column(name = "visitor_office")
    private String visitorOffice;
    @Column(name = "lf")
    private String lf;
    @Column(name = "lpo")
    private String lpo;
    @Column(name = "school")
    private String school;

    @Column(name = "last_followup_indicator1")
    private String lastFollowupIndicator1;
    @Column(name = "last_followup_indicator2")
    private String lastFollowupIndicator2;
    @Column(name = "last_followup_indicator3")
    private String lastFollowupIndicator3;

    @Column(name = "ind1_is_trained_all_teacher")
    private String ind1IsTrainedAllTeacher;
    @Column(name = "ind1_1_is_trained_srm_teacher_incharge")
    private String ind11IsTrainedSRMTeacherIncharge;
    @Column(name = "ind1_2_is_trained_head_teacher")
    private String ind12IsTrainedHeadTeacher;

    @Column(name = "ind2_classroom_suitable_srm")
    private String ind2ClassroomSuitableSRM;
    @Column(name = "ind2_1_classroom_door_window_lock")
    private String ind21ClassroomDoorWindowLock;
    @Column(name = "ind2_2_classroom_safe_clean")
    private String ind22ClassroomSafeClean;

    @Column(name = "ind3_bookself_useable")
    private String ind3BookselfUseable;
    @Column(name = "ind3_1_bookself_accessible")
    private String ind31BookselfAccessible;
    @Column(name = "ind3_2_bookself_environment_protected")
    private String ind32BookselfEnvironmentProtected;
    @Column(name = "ind3_3_bookself_table_condition")
    private String ind33BookselfTableCondition;

    @Column(name = "ind4_book_register_updated")
    private String ind4BookRegisterUpdated;

    @Column(name = "ind5_bookself_organized")
    private String ind5BookselfOrganized;
    @Column(name = "ind5_1_bookself_book_organized_open")
    private String ind51BookselfBookOrganizedOpen;
    @Column(name = "ind5_2_bookself_book_level_viewable")
    private String ind52BookselfBookLevelViewable;
    @Column(name = "ind5_3_bookself_book_accessible")
    private String ind53BookselfBookAccessible;

    @Column(name = "ind6_printrich_displayed")
    private String ind6PrintRichDisplayed;

    @Column(name = "ind7_book_checkout_functional")
    private String ind7BookCheckoutFunctional;
    @Column(name = "ind7_1_book_checkout_procedure_displayed")
    private String ind71BookCheckoutProcedureDisplayed;
    @Column(name = "ind7_2_book_checkout_register_usable")
    private String ind72BookCheckoutRegisterUsable;
    @Column(name = "ind7_3_book_checkout_register_updated")
    private String ind73BookCheckoutRegisterUpdated;
    @Column(name = "ind7_4_book_checkout_pending_booklist")
    private String ind74BookCheckoutPendingBooklist;

    @Column(name = "ind8_srm_class_routine")
    private String ind8SRMClassRoutine;
    @Column(name = "ind8_1_srm_class_weekly")
    private String ind81SRMClassWeekly;
    @Column(name = "ind8_2_daily_book_checkout_opportunity")
    private String ind82DailyBookCheckoutOpportunity;

    @Column(name = "ind9_srm_register_updated")
    private String ind9SRMRegisterUpdated;

    @Column(name = "ind10_parents_meeting")
    private String ind10ParentsMeeting;

    @Column(name = "ind11_read_festival")
    private String ind11ReadFestival;

    @Column(name = "ind12_sustainability_plan")
    private String ind12SustainabilityPlan;
    @Column(name = "ind12_1_collective_plan")
    private String ind121CollectivePlan;
    @Column(name = "ind12_2_responsibility_plan")
    private String ind122ResponsibilityPlan;


    @Column(name = "best_practice_indicator1")
    private String bestPracticeIndicator1;
    @Column(name = "best_practice_indicator1_details")
    private String bestPracticeIndicator1Details;
    @Column(name = "best_practice_indicator2")
    private String bestPracticeIndicator2;
    @Column(name = "best_practice_indicator2_details")
    private String bestPracticeIndicator2Details;
    @Column(name = "best_practice_indicator3")
    private String bestPracticeIndicator3;
    @Column(name = "best_practice_indicator3_details")
    private String bestPracticeIndicator3Details;


    @Column(name = "coaching_support_indicator1")
    private String coachingSupportIndicator1;
    @Column(name = "coaching_support_indicator1_details")
    private String coachingSupportIndicator1Details;
    @Column(name = "coaching_support_indicator2")
    private String coachingSupportIndicator2;
    @Column(name = "coaching_support_indicator2_details")
    private String coachingSupportIndicator2Details;
    @Column(name = "agreed_statement1")
    private String agreedStatement1;
    @Column(name = "agreed_statement2")
    private String agreedStatement2;

    @Column(name = "library_status")
    private String libraryStatus;

    @Column(name = "is_active")
    private String isActive;
    @Column(name = "is_deleted")
    private String isDeleted;

}
