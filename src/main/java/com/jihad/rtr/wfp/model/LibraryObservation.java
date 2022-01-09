//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 05/01/2022
//  Description: Library observation  model file

package com.jihad.rtr.wfp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "library_observations")
@Data
public class LibraryObservation extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "visit_no")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
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
	@Column(name = "upazila")
	private String upazila;
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
	@Column(name = "ind1_2_is_trained_headteacher")
	private String ind12IsTrainedHeadteacher;

	@Column(name="ind2_classroom_suitable_srm")
	private String ind2ClassroomSuitableSRM;
	@Column(name = "ind2_1_classroom_door_window_lock")
	private String ind21ClassroomDoorWindowLock;
	@Column(name = "ind2_2_classroom_safe_clean")
	private String ind22ClassroomSafeClean;

	@Column(name = "ind3_bookself_useable")
	private String ind3BookselfUseable;
	@Column(name = "ind3_1_bookself_accessable")
	private String ind31BookselfAccessable;
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
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;

	//Constructor
	public LibraryObservation(){};
	public LibraryObservation(long id, long visitNo, Date date, String office, String project, String district, String upazila, String visitor, String visitorDesignation, String visitorOffice, String lf, String lpo, String school, String lastFollowupIndicator1, String lastFollowupIndicator2, String lastFollowupIndicator3, String ind1IsTrainedAllTeacher, String ind11IsTrainedSRMTeacherIncharge, String ind12IsTrainedHeadteacher, String ind2ClassroomSuitableSRM, String ind21ClassroomDoorWindowLock, String ind22ClassroomSafeClean, String ind3BookselfUseable, String ind31BookselfAccessable, String ind32BookselfEnvironmentProtected, String ind33BookselfTableCondition, String ind4BookRegisterUpdated, String ind5BookselfOrganized, String ind51BookselfBookOrganizedOpen, String ind52BookselfBookLevelViewable, String ind53BookselfBookAccessible, String ind6PrintRichDisplayed, String ind7BookCheckoutFunctional, String ind71BookCheckoutProcedureDisplayed, String ind72BookCheckoutRegisterUsable, String ind73BookCheckoutRegisterUpdated, String ind74BookCheckoutPendingBooklist, String ind8SRMClassRoutine, String ind81SRMClassWeekly, String ind82DailyBookCheckoutOpportunity, String ind9SRMRegisterUpdated, String ind10ParentsMeeting, String ind11ReadFestival, String ind12SustainabilityPlan, String ind121CollectivePlan, String ind122ResponsibilityPlan, String bestPracticeIndicator1, String bestPracticeIndicator1Details, String bestPracticeIndicator2, String bestPracticeIndicator2Details, String bestPracticeIndicator3, String bestPracticeIndicator3Details, String coachingSupportIndicator1, String coachingSupportIndicator1Details, String coachingSupportIndicator2, String coachingSupportIndicator2Details, String agreedStatement1, String agreedStatement2, String isActive, String isDeleted) {
		this.id = id;
		this.visitNo = visitNo;
		this.date = date;
		this.office = office;
		this.project = project;
		this.district = district;
		this.upazila = upazila;
		this.visitor = visitor;
		this.visitorDesignation = visitorDesignation;
		this.visitorOffice = visitorOffice;
		this.lf = lf;
		this.lpo = lpo;
		this.school = school;
		this.lastFollowupIndicator1 = lastFollowupIndicator1;
		this.lastFollowupIndicator2 = lastFollowupIndicator2;
		this.lastFollowupIndicator3 = lastFollowupIndicator3;
		this.ind1IsTrainedAllTeacher = ind1IsTrainedAllTeacher;
		this.ind11IsTrainedSRMTeacherIncharge = ind11IsTrainedSRMTeacherIncharge;
		this.ind12IsTrainedHeadteacher = ind12IsTrainedHeadteacher;
		this.ind2ClassroomSuitableSRM = ind2ClassroomSuitableSRM;
		this.ind21ClassroomDoorWindowLock = ind21ClassroomDoorWindowLock;
		this.ind22ClassroomSafeClean = ind22ClassroomSafeClean;
		this.ind3BookselfUseable = ind3BookselfUseable;
		this.ind31BookselfAccessable = ind31BookselfAccessable;
		this.ind32BookselfEnvironmentProtected = ind32BookselfEnvironmentProtected;
		this.ind33BookselfTableCondition = ind33BookselfTableCondition;
		this.ind4BookRegisterUpdated = ind4BookRegisterUpdated;
		this.ind5BookselfOrganized = ind5BookselfOrganized;
		this.ind51BookselfBookOrganizedOpen = ind51BookselfBookOrganizedOpen;
		this.ind52BookselfBookLevelViewable = ind52BookselfBookLevelViewable;
		this.ind53BookselfBookAccessible = ind53BookselfBookAccessible;
		this.ind6PrintRichDisplayed = ind6PrintRichDisplayed;
		this.ind7BookCheckoutFunctional = ind7BookCheckoutFunctional;
		this.ind71BookCheckoutProcedureDisplayed = ind71BookCheckoutProcedureDisplayed;
		this.ind72BookCheckoutRegisterUsable = ind72BookCheckoutRegisterUsable;
		this.ind73BookCheckoutRegisterUpdated = ind73BookCheckoutRegisterUpdated;
		this.ind74BookCheckoutPendingBooklist = ind74BookCheckoutPendingBooklist;
		this.ind8SRMClassRoutine = ind8SRMClassRoutine;
		this.ind81SRMClassWeekly = ind81SRMClassWeekly;
		this.ind82DailyBookCheckoutOpportunity = ind82DailyBookCheckoutOpportunity;
		this.ind9SRMRegisterUpdated = ind9SRMRegisterUpdated;
		this.ind10ParentsMeeting = ind10ParentsMeeting;
		this.ind11ReadFestival = ind11ReadFestival;
		this.ind12SustainabilityPlan = ind12SustainabilityPlan;
		this.ind121CollectivePlan = ind121CollectivePlan;
		this.ind122ResponsibilityPlan = ind122ResponsibilityPlan;
		this.bestPracticeIndicator1 = bestPracticeIndicator1;
		this.bestPracticeIndicator1Details = bestPracticeIndicator1Details;
		this.bestPracticeIndicator2 = bestPracticeIndicator2;
		this.bestPracticeIndicator2Details = bestPracticeIndicator2Details;
		this.bestPracticeIndicator3 = bestPracticeIndicator3;
		this.bestPracticeIndicator3Details = bestPracticeIndicator3Details;
		this.coachingSupportIndicator1 = coachingSupportIndicator1;
		this.coachingSupportIndicator1Details = coachingSupportIndicator1Details;
		this.coachingSupportIndicator2 = coachingSupportIndicator2;
		this.coachingSupportIndicator2Details = coachingSupportIndicator2Details;
		this.agreedStatement1 = agreedStatement1;
		this.agreedStatement2 = agreedStatement2;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}

	//Getter and Setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getVisitNo() {
		return visitNo;
	}

	public void setVisitNo(long visitNo) {
		this.visitNo = visitNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getUpazila() {
		return upazila;
	}

	public void setUpazila(String upazila) {
		this.upazila = upazila;
	}

	public String getVisitor() {
		return visitor;
	}

	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}

	public String getVisitorDesignation() {
		return visitorDesignation;
	}

	public void setVisitorDesignation(String visitorDesignation) {
		this.visitorDesignation = visitorDesignation;
	}

	public String getVisitorOffice() {
		return visitorOffice;
	}

	public void setVisitorOffice(String visitorOffice) {
		this.visitorOffice = visitorOffice;
	}

	public String getLf() {
		return lf;
	}

	public void setLf(String lf) {
		this.lf = lf;
	}

	public String getLpo() {
		return lpo;
	}

	public void setLpo(String lpo) {
		this.lpo = lpo;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getLastFollowupIndicator1() {
		return lastFollowupIndicator1;
	}

	public void setLastFollowupIndicator1(String lastFollowupIndicator1) {
		this.lastFollowupIndicator1 = lastFollowupIndicator1;
	}

	public String getLastFollowupIndicator2() {
		return lastFollowupIndicator2;
	}

	public void setLastFollowupIndicator2(String lastFollowupIndicator2) {
		this.lastFollowupIndicator2 = lastFollowupIndicator2;
	}

	public String getLastFollowupIndicator3() {
		return lastFollowupIndicator3;
	}

	public void setLastFollowupIndicator3(String lastFollowupIndicator3) {
		this.lastFollowupIndicator3 = lastFollowupIndicator3;
	}

	public String getInd1IsTrainedAllTeacher() {
		return ind1IsTrainedAllTeacher;
	}

	public void setInd1IsTrainedAllTeacher(String ind1IsTrainedAllTeacher) {
		this.ind1IsTrainedAllTeacher = ind1IsTrainedAllTeacher;
	}

	public String getInd11IsTrainedSRMTeacherIncharge() {
		return ind11IsTrainedSRMTeacherIncharge;
	}

	public void setInd11IsTrainedSRMTeacherIncharge(String ind11IsTrainedSRMTeacherIncharge) {
		this.ind11IsTrainedSRMTeacherIncharge = ind11IsTrainedSRMTeacherIncharge;
	}

	public String getInd12IsTrainedHeadteacher() {
		return ind12IsTrainedHeadteacher;
	}

	public void setInd12IsTrainedHeadteacher(String ind12IsTrainedHeadteacher) {
		this.ind12IsTrainedHeadteacher = ind12IsTrainedHeadteacher;
	}

	public String getInd2ClassroomSuitableSRM() {
		return ind2ClassroomSuitableSRM;
	}

	public void setInd2ClassroomSuitableSRM(String ind2ClassroomSuitableSRM) {
		this.ind2ClassroomSuitableSRM = ind2ClassroomSuitableSRM;
	}

	public String getInd21ClassroomDoorWindowLock() {
		return ind21ClassroomDoorWindowLock;
	}

	public void setInd21ClassroomDoorWindowLock(String ind21ClassroomDoorWindowLock) {
		this.ind21ClassroomDoorWindowLock = ind21ClassroomDoorWindowLock;
	}

	public String getInd22ClassroomSafeClean() {
		return ind22ClassroomSafeClean;
	}

	public void setInd22ClassroomSafeClean(String ind22ClassroomSafeClean) {
		this.ind22ClassroomSafeClean = ind22ClassroomSafeClean;
	}

	public String getInd3BookselfUseable() {
		return ind3BookselfUseable;
	}

	public void setInd3BookselfUseable(String ind3BookselfUseable) {
		this.ind3BookselfUseable = ind3BookselfUseable;
	}

	public String getInd31BookselfAccessable() {
		return ind31BookselfAccessable;
	}

	public void setInd31BookselfAccessable(String ind31BookselfAccessable) {
		this.ind31BookselfAccessable = ind31BookselfAccessable;
	}

	public String getInd32BookselfEnvironmentProtected() {
		return ind32BookselfEnvironmentProtected;
	}

	public void setInd32BookselfEnvironmentProtected(String ind32BookselfEnvironmentProtected) {
		this.ind32BookselfEnvironmentProtected = ind32BookselfEnvironmentProtected;
	}

	public String getInd33BookselfTableCondition() {
		return ind33BookselfTableCondition;
	}

	public void setInd33BookselfTableCondition(String ind33BookselfTableCondition) {
		this.ind33BookselfTableCondition = ind33BookselfTableCondition;
	}

	public String getInd4BookRegisterUpdated() {
		return ind4BookRegisterUpdated;
	}

	public void setInd4BookRegisterUpdated(String ind4BookRegisterUpdated) {
		this.ind4BookRegisterUpdated = ind4BookRegisterUpdated;
	}

	public String getInd5BookselfOrganized() {
		return ind5BookselfOrganized;
	}

	public void setInd5BookselfOrganized(String ind5BookselfOrganized) {
		this.ind5BookselfOrganized = ind5BookselfOrganized;
	}

	public String getInd51BookselfBookOrganizedOpen() {
		return ind51BookselfBookOrganizedOpen;
	}

	public void setInd51BookselfBookOrganizedOpen(String ind51BookselfBookOrganizedOpen) {
		this.ind51BookselfBookOrganizedOpen = ind51BookselfBookOrganizedOpen;
	}

	public String getInd52BookselfBookLevelViewable() {
		return ind52BookselfBookLevelViewable;
	}

	public void setInd52BookselfBookLevelViewable(String ind52BookselfBookLevelViewable) {
		this.ind52BookselfBookLevelViewable = ind52BookselfBookLevelViewable;
	}

	public String getInd53BookselfBookAccessible() {
		return ind53BookselfBookAccessible;
	}

	public void setInd53BookselfBookAccessible(String ind53BookselfBookAccessible) {
		this.ind53BookselfBookAccessible = ind53BookselfBookAccessible;
	}

	public String getInd6PrintRichDisplayed() {
		return ind6PrintRichDisplayed;
	}

	public void setInd6PrintRichDisplayed(String ind6PrintRichDisplayed) {
		this.ind6PrintRichDisplayed = ind6PrintRichDisplayed;
	}

	public String getInd7BookCheckoutFunctional() {
		return ind7BookCheckoutFunctional;
	}

	public void setInd7BookCheckoutFunctional(String ind7BookCheckoutFunctional) {
		this.ind7BookCheckoutFunctional = ind7BookCheckoutFunctional;
	}

	public String getInd71BookCheckoutProcedureDisplayed() {
		return ind71BookCheckoutProcedureDisplayed;
	}

	public void setInd71BookCheckoutProcedureDisplayed(String ind71BookCheckoutProcedureDisplayed) {
		this.ind71BookCheckoutProcedureDisplayed = ind71BookCheckoutProcedureDisplayed;
	}

	public String getInd72BookCheckoutRegisterUsable() {
		return ind72BookCheckoutRegisterUsable;
	}

	public void setInd72BookCheckoutRegisterUsable(String ind72BookCheckoutRegisterUsable) {
		this.ind72BookCheckoutRegisterUsable = ind72BookCheckoutRegisterUsable;
	}

	public String getInd73BookCheckoutRegisterUpdated() {
		return ind73BookCheckoutRegisterUpdated;
	}

	public void setInd73BookCheckoutRegisterUpdated(String ind73BookCheckoutRegisterUpdated) {
		this.ind73BookCheckoutRegisterUpdated = ind73BookCheckoutRegisterUpdated;
	}

	public String getInd74BookCheckoutPendingBooklist() {
		return ind74BookCheckoutPendingBooklist;
	}

	public void setInd74BookCheckoutPendingBooklist(String ind74BookCheckoutPendingBooklist) {
		this.ind74BookCheckoutPendingBooklist = ind74BookCheckoutPendingBooklist;
	}

	public String getInd8SRMClassRoutine() {
		return ind8SRMClassRoutine;
	}

	public void setInd8SRMClassRoutine(String ind8SRMClassRoutine) {
		this.ind8SRMClassRoutine = ind8SRMClassRoutine;
	}

	public String getInd81SRMClassWeekly() {
		return ind81SRMClassWeekly;
	}

	public void setInd81SRMClassWeekly(String ind81SRMClassWeekly) {
		this.ind81SRMClassWeekly = ind81SRMClassWeekly;
	}

	public String getInd82DailyBookCheckoutOpportunity() {
		return ind82DailyBookCheckoutOpportunity;
	}

	public void setInd82DailyBookCheckoutOpportunity(String ind82DailyBookCheckoutOpportunity) {
		this.ind82DailyBookCheckoutOpportunity = ind82DailyBookCheckoutOpportunity;
	}

	public String getInd9SRMRegisterUpdated() {
		return ind9SRMRegisterUpdated;
	}

	public void setInd9SRMRegisterUpdated(String ind9SRMRegisterUpdated) {
		this.ind9SRMRegisterUpdated = ind9SRMRegisterUpdated;
	}

	public String getInd10ParentsMeeting() {
		return ind10ParentsMeeting;
	}

	public void setInd10ParentsMeeting(String ind10ParentsMeeting) {
		this.ind10ParentsMeeting = ind10ParentsMeeting;
	}

	public String getInd11ReadFestival() {
		return ind11ReadFestival;
	}

	public void setInd11ReadFestival(String ind11ReadFestival) {
		this.ind11ReadFestival = ind11ReadFestival;
	}

	public String getInd12SustainabilityPlan() {
		return ind12SustainabilityPlan;
	}

	public void setInd12SustainabilityPlan(String ind12SustainabilityPlan) {
		this.ind12SustainabilityPlan = ind12SustainabilityPlan;
	}

	public String getInd121CollectivePlan() {
		return ind121CollectivePlan;
	}

	public void setInd121CollectivePlan(String ind121CollectivePlan) {
		this.ind121CollectivePlan = ind121CollectivePlan;
	}

	public String getInd122ResponsibilityPlan() {
		return ind122ResponsibilityPlan;
	}

	public void setInd122ResponsibilityPlan(String ind122ResponsibilityPlan) {
		this.ind122ResponsibilityPlan = ind122ResponsibilityPlan;
	}

	public String getBestPracticeIndicator1() {
		return bestPracticeIndicator1;
	}

	public void setBestPracticeIndicator1(String bestPracticeIndicator1) {
		this.bestPracticeIndicator1 = bestPracticeIndicator1;
	}

	public String getBestPracticeIndicator1Details() {
		return bestPracticeIndicator1Details;
	}

	public void setBestPracticeIndicator1Details(String bestPracticeIndicator1Details) {
		this.bestPracticeIndicator1Details = bestPracticeIndicator1Details;
	}

	public String getBestPracticeIndicator2() {
		return bestPracticeIndicator2;
	}

	public void setBestPracticeIndicator2(String bestPracticeIndicator2) {
		this.bestPracticeIndicator2 = bestPracticeIndicator2;
	}

	public String getBestPracticeIndicator2Details() {
		return bestPracticeIndicator2Details;
	}

	public void setBestPracticeIndicator2Details(String bestPracticeIndicator2Details) {
		this.bestPracticeIndicator2Details = bestPracticeIndicator2Details;
	}

	public String getBestPracticeIndicator3() {
		return bestPracticeIndicator3;
	}

	public void setBestPracticeIndicator3(String bestPracticeIndicator3) {
		this.bestPracticeIndicator3 = bestPracticeIndicator3;
	}

	public String getBestPracticeIndicator3Details() {
		return bestPracticeIndicator3Details;
	}

	public void setBestPracticeIndicator3Details(String bestPracticeIndicator3Details) {
		this.bestPracticeIndicator3Details = bestPracticeIndicator3Details;
	}

	public String getCoachingSupportIndicator1() {
		return coachingSupportIndicator1;
	}

	public void setCoachingSupportIndicator1(String coachingSupportIndicator1) {
		this.coachingSupportIndicator1 = coachingSupportIndicator1;
	}

	public String getCoachingSupportIndicator1Details() {
		return coachingSupportIndicator1Details;
	}

	public void setCoachingSupportIndicator1Details(String coachingSupportIndicator1Details) {
		this.coachingSupportIndicator1Details = coachingSupportIndicator1Details;
	}

	public String getCoachingSupportIndicator2() {
		return coachingSupportIndicator2;
	}

	public void setCoachingSupportIndicator2(String coachingSupportIndicator2) {
		this.coachingSupportIndicator2 = coachingSupportIndicator2;
	}

	public String getCoachingSupportIndicator2Details() {
		return coachingSupportIndicator2Details;
	}

	public void setCoachingSupportIndicator2Details(String coachingSupportIndicator2Details) {
		this.coachingSupportIndicator2Details = coachingSupportIndicator2Details;
	}

	public String getAgreedStatement1() {
		return agreedStatement1;
	}

	public void setAgreedStatement1(String agreedStatement1) {
		this.agreedStatement1 = agreedStatement1;
	}

	public String getAgreedStatement2() {
		return agreedStatement2;
	}

	public void setAgreedStatement2(String agreedStatement2) {
		this.agreedStatement2 = agreedStatement2;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}
}
