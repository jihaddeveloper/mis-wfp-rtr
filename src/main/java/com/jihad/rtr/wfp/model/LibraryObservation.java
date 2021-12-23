//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 23/12/2021
//  Description: Library observation  model file

package com.jihad.rtr.wfp.model;

import java.sql.Date;
import java.time.LocalDate;

public class LibraryObservation {

	private long id;
	private long visit_no;
	private Date date;
	private long offficeId;
	private long projectId;
	private long districtId;
	private long upazilaId;
	private long visitorId;
	private long visitorDesignationId;
	private long visitorOfficeId;
	private long lfId;
	private long lpoId;
	private long schoolId;
	private long lastFollowupIndicator1;
	private long lastFollowupIndicator2;
	private long lastFollowupIndicator3;
	private String ind1IsTrainedAllTeacher;
	private String ind11IsTrainedSRMTeacherIncharge;
	private String ind12IsTrainedHeadteacher;
	private String ind2ClassroomSuitableSRM;
	private String ind21ClassroomDoorWindowLock;
	private String ind22ClassroomSafeClean;
	private String ind3BookselfUseable;
	private String ind31BookselfAccessable;
	private String ind32BookselfEnvironmentProtected;
	private String ind33BookselfTableCondition;
	private String ind4BookRegisterUpdated;
	private String ind5BookselfOrganized;
	private String ind51BookselfBookOrganizedOpen;
	private String ind52BookselfBookLevelViewable;
	private String ind53BookselfBookAccessible;
	private String ind6PrintRichDisplayed;
	private String ind7BookCheckoutFunctional;
	private String ind71BookCheckoutProcedureDisplayed;
	private String ind72BookCheckoutRegisterUsable;
	private String ind73BookCheckoutRegisterUpdated;
	private String ind74BookCheckoutPendingBooklist;
	private String ind8SRMClassRoutine;
	private String ind81SRMClassWeekly;
	private String ind82DailyBookCheckoutOpportunity;
	private String ind9SRMRegisterUpdated;
	private String ind10ParentsMeeting;
	private String ind11ReadFestival;
	private String ind12SustainabilityPlan;
	private String ind121CollectivePlan;
	private String ind122ResponsibilityPlan;
	private long bestPracticeIndicator1;
	private String bestPracticeIndicator1Details;
	private long bestPracticeIndicator2;
	private String bestPracticeIndicator2Details;
	private long bestPracticeIndicator3;
	private String bestPracticeIndicator3Details;
	private long coachingSupportIndicator1;
	private String coachingSupportIndicator1Details;
	private long coachingSupportIndicator2;
	private String coachingSupportIndicator2Details;
	private String agreedStatement1;
	private String agreedStatement2;
	private String isActive;
	private String isDeleted;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;

}
