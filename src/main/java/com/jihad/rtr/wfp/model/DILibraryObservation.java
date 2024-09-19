//  Author: Mohammad Jihad Hossain
//  Create Date: 09/06/2024
//  Modify Date: 09/06/2024
//  Description: DI Library observation  model file


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
@Table(name = "di_library_observation")
public class DILibraryObservation {

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

    @Column(name = "phase", length = 50)
    private String phase;

    @Column(name = "rtr_school_id", length = 50)
    private String rtrSchoolId;
    @Column(name = "year_of_support", length = 10)
    private String yearOfSupport;


    @Column(name = "note", length = 300)
    private String note;


    @Column(name = "last_followup_indicator1", length = 800)
    private String lastFollowupIndicator1;
    @Column(name = "last_followup_indicator2", length = 800)
    private String lastFollowupIndicator2;
    @Column(name = "last_followup_indicator3", length = 800)
    private String lastFollowupIndicator3;


    @Column(name = "ind1_is_trained_one_teacher", length = 20)
    private String ind1IsTrainedOneTeacher;
    @Column(name = "ind11_is_point_teacher_incharge", length = 20)
    private String ind11IsPointTeacherIncharge;
    @Column(name = "ind12_is_trained_library_management_reading_hour", length = 20)
    private String ind12IsTrainedLibraryManagementReadingHour;

    @Column(name = "ind2_headteacher_trained_library_management_reading_hour", length = 20)
    private String ind2HeadTeacherTrainedLibraryManagementReadingHour;

    @Column(name = "ind3_classroom_suitable_library_activity", length = 20)
    private String ind3ClassroomSuitableLibraryActivity;
    @Column(name = "ind31_classroom_door_window_okay", length = 20)
    private String ind31ClassroomDoorWindowOkay;
    @Column(name = "ind32_classroom_door_window_lock", length = 20)
    private String ind32ClassroomDoorWindowLock;
    @Column(name = "ind33_classroom_safe_from_rain_water", length = 20)
    private String ind33ClassroomSafeFromRainWater;
    @Column(name = "ind34_classroom_safe_clean", length = 20)
    private String ind34ClassroomSafeClean;

    @Column(name = "ind4LibraryFurnitureOkay", length = 20)
    private String ind4LibraryFurnitureOkay;
    @Column(name = "ind41_bookshelf_usable", length = 20)
    private String ind41BookshelfUsable;
    @Column(name = "ind42_bookshelf_protected_sun_rain", length = 20)
    private String ind42BookshelfProtectedSunRain;
    @Column(name = "ind43_bookshelf_portable_safe_for_student", length = 20)
    private String ind43BookshelfPortableSafeForStudent;
    @Column(name = "ind44_bookshelf_reading_space", length = 20)
    private String ind44BookshelfReadingSpace;
    @Column(name = "ind45_bookshelf_furniture_good_condition", length = 20)
    private String ind45BookshelfFurnitureGoodCondition;

    @Column(name = "ind5_book_register_updated", length = 20)
    private String ind5BookRegisterUpdated;


    @Column(name = "ind6_bookshelf_organized", length = 20)
    private String ind6BookshelfOrganized;
    @Column(name = "ind61_bookshelf_book_organized_by_grade", length = 20)
    private String ind61BookshelfBookOrganizedByGrade;
    @Column(name = "ind62_bookshelf_rtr_book_label_viewable", length = 20)
    private String ind62BookshelfRtRBookLabelViewable;
    @Column(name = "ind63_bookshelf_non_rtr_book_label_viewable", length = 20)
    private String ind63BookshelfNonRtRBookLabelViewable;
    @Column(name = "ind64_book_organized_by_label", length = 20)
    private String ind64BookOrganizedByLabel;
    @Column(name = "ind65_book_accessible", length = 20)
    private String ind65BookAccessible;
    @Column(name = "ind66_book_cover_viewable", length = 20)
    private String ind66BookCoverViewable;


    @Column(name = "ind7_print_rich_item_displayed", length = 20)
    private String ind7PrintRichItemDisplayed;
    @Column(name = "ind71_chart_poster_displayed", length = 20)
    private String ind71ChartPosterDisplayed;
    @Column(name = "ind72_chart_poster_compatible", length = 20)
    private String ind72ChartPosterCompatible;


    @Column(name = "ind8_book_checkout_functional", length = 20)
    private String ind8BookCheckoutFunctional;
    @Column(name = "ind81_book_checkout_procedure_displayed", length = 20)
    private String ind81BookCheckoutProcedureDisplayed;
    @Column(name = "ind82_book_checkout_register_usable", length = 20)
    private String ind82BookCheckoutRegisterUsable;
    @Column(name = "ind83_book_checkout_register_updated", length = 20)
    private String ind83BookCheckoutRegisterUpdated;
    @Column(name = "ind84_book_checkout_pending_book_list", length = 20)
    private String ind84BookCheckoutPendingBookList;
    @Column(name = "ind85_book_checkout_data_collection", length = 20)
    private String ind85BookCheckoutDataCollection;
    @Column(name = "ind86_book_checkout_by_least_5_student", length = 20)
    private String ind86BookCheckoutByLeast5Student;

    @Column(name = "ind9_reading_hour_activity_functional", length = 20)
    private String ind9ReadingHourActivityFunctional;
    @Column(name = "ind91_reading_hour_activity_weekly", length = 20)
    private String ind91ReadingHourActivityWeekly;
    @Column(name = "ind92_reading_hour_activity_routine_hanged", length = 20)
    private String ind92ReadingHourActivityRoutineHanged;
    @Column(name = "ind93_book_checkout_opportunity", length = 20)
    private String ind93BookCheckoutOpportunity;
    @Column(name = "ind94_book_checkout_notice_hanged", length = 20)
    private String ind94BookCheckoutNoticeHanged;

    @Column(name = "ind10_trained_library_observation_reading_hour", length = 20)
    private String ind10TrainedLibraryObservationReadingHour;

    @Column(name = "ind11_teacher_perform_reading_hour_activity", length = 20)
    private String ind11TeacherPerformReadingHourActivity;
    @Column(name = "ind111_reading_hour_register_updated", length = 20)
    private String ind111ReadingHourRegisterUpdated;
    @Column(name = "ind112_reading_activity_listed_register", length = 20)
    private String ind112ReadingActivityListedRegister;

    @Column(name = "ind12_school_committee_decision_about_library", length = 20)
    private String ind12SchoolCommitteeDecisionAboutLibrary;
    @Column(name = "ind121_school_has_committee_about_library", length = 20)
    private String ind121SchoolHasCommitteeAboutLibrary;
    @Column(name = "ind122_school_committee_meeting_about_library", length = 20)
    private String ind122SchoolCommitteeMeetingAboutLibrary;

    @Column(name = "ind13ParentMeetingAboutLibrary", length = 20)
    private String ind13ParentMeetingAboutLibrary;

    @Column(name = "ind14_read_play_festival", length = 20)
    private String ind14ReadPlayFestival;
    @Column(name = "ind141_school_arrange_read_festival", length = 20)
    private String ind141SchoolArrangeReadFestival;
    @Column(name = "ind142_parent_public_engage_read_festival", length = 20)
    private String ind142ParentPublicEngageReadFestival;

    @Column(name = "ind15_sustainability_plan_by_committee", length = 20)
    private String ind15SustainabilityPlanByCommittee;
    @Column(name = "ind151_parent_public_headteacher_combined_plan", length = 20)
    private String ind151ParentPublicHeadTeacherCombinedPlan;
    @Column(name = "ind152_parent_public_responsibility", length = 20)
    private String ind152ParentPublicResponsibility;


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
    @Column(name = "coaching_support_indicator3", length = 800)
    private String coachingSupportIndicator3;
    @Column(name = "coaching_support_indicator3_details", length = 500)
    private String coachingSupportIndicator3Details;


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
