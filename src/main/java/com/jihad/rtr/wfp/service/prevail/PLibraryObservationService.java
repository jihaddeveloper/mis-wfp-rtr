//  Author: Mohammad Jihad Hossain
//  Create Date: 10/09/2025
//  Modify Date: 10/09/2025
//  Description: PLibraryObservationService file

package com.jihad.rtr.wfp.service.prevail;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.prevail.PLibraryObservation;
import com.jihad.rtr.wfp.repository.prevail.PLibraryObservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PLibraryObservationService {

    @Autowired
    private PLibraryObservationRepo pLibraryObservationRepo;

    // Create new PLibraryObservation
    public PLibraryObservation createPLibraryObservation(PLibraryObservation pLibraryObservation) {
        return pLibraryObservationRepo.save(pLibraryObservation);
    }

    // Get all PLibraryObservation
    public List<PLibraryObservation> getAllPLibraryObservation() {
        return pLibraryObservationRepo.findAll();
    }

    // Get PLibraryObservation with id
    public PLibraryObservation getPLibraryObservationById(long id) {
        Optional<PLibraryObservation> pLibraryObservationDB = pLibraryObservationRepo.findById(id);

        if (pLibraryObservationDB.isPresent()) {
            return pLibraryObservationDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);

        }

    }

    // Update PLibraryObservation
    public PLibraryObservation updatePLibraryObservation(PLibraryObservation pLibraryObservation) {
        Optional<PLibraryObservation> pLibraryObservationDB = pLibraryObservationRepo.findById(pLibraryObservation.getId());

        if (pLibraryObservationDB.isPresent()) {
            PLibraryObservation pLibraryObservationUpdate = pLibraryObservationDB.get();

            pLibraryObservationUpdate.setId(pLibraryObservation.getId());
            pLibraryObservationUpdate.setVisitNo(pLibraryObservation.getVisitNo());
            pLibraryObservationUpdate.setDate(pLibraryObservation.getDate());
            pLibraryObservationUpdate.setOffice(pLibraryObservation.getOffice());
            pLibraryObservationUpdate.setProject(pLibraryObservation.getProject());
            pLibraryObservationUpdate.setDistrict(pLibraryObservation.getDistrict());
            pLibraryObservationUpdate.setUpazilla(pLibraryObservation.getUpazilla());
            pLibraryObservationUpdate.setVisitor(pLibraryObservation.getVisitor());
            pLibraryObservationUpdate.setVisitorDesignation(pLibraryObservation.getVisitorDesignation());
            pLibraryObservationUpdate.setVisitorOffice(pLibraryObservation.getVisitorOffice());
            pLibraryObservationUpdate.setLf(pLibraryObservation.getLf());
            pLibraryObservationUpdate.setLfName(pLibraryObservation.getLfName());
            pLibraryObservationUpdate.setLpo(pLibraryObservation.getLpo());
            pLibraryObservationUpdate.setLpoName(pLibraryObservation.getLpoName());
            pLibraryObservationUpdate.setSchool(pLibraryObservation.getSchool());
            pLibraryObservationUpdate.setMonth(pLibraryObservation.getMonth());
            pLibraryObservationUpdate.setYear(pLibraryObservation.getYear());
            pLibraryObservationUpdate.setRtrSchoolId(pLibraryObservation.getRtrSchoolId());
            pLibraryObservationUpdate.setYearOfSupport(pLibraryObservation.getYearOfSupport());
            pLibraryObservationUpdate.setPointTeacher(pLibraryObservation.getPointTeacher());
            pLibraryObservationUpdate.setYearOfEstablished(pLibraryObservation.getYearOfEstablished());
            pLibraryObservationUpdate.setPhase(pLibraryObservation.getPhase());
            pLibraryObservationUpdate.setPointTeacher(pLibraryObservation.getPointTeacher());

            pLibraryObservationUpdate.setNote(pLibraryObservation.getNote());

            pLibraryObservationUpdate.setLastFollowupIndicator1(pLibraryObservation.getLastFollowupIndicator1());
            pLibraryObservationUpdate.setLastFollowupIndicator2(pLibraryObservation.getLastFollowupIndicator2());
            pLibraryObservationUpdate.setLastFollowupIndicator3(pLibraryObservation.getLastFollowupIndicator3());

            pLibraryObservationUpdate.setInd1IsTrainedOneTeacher(pLibraryObservation.getInd1IsTrainedOneTeacher());
            pLibraryObservationUpdate.setInd11IsPointTeacherIncharge(pLibraryObservation.getInd11IsPointTeacherIncharge());
            pLibraryObservationUpdate.setInd12IsTrainedLibraryManagementReadingHour(pLibraryObservation.getInd12IsTrainedLibraryManagementReadingHour());

            pLibraryObservationUpdate.setInd2HeadTeacherTrainedLibraryManagementReadingHour(pLibraryObservation.getInd2HeadTeacherTrainedLibraryManagementReadingHour());

            pLibraryObservationUpdate.setInd3ClassroomSuitableLibraryActivity(pLibraryObservation.getInd3ClassroomSuitableLibraryActivity());
            pLibraryObservationUpdate.setInd31ClassroomDoorWindowOkay(pLibraryObservation.getInd31ClassroomDoorWindowOkay());
            pLibraryObservationUpdate.setInd32ClassroomDoorWindowLock(pLibraryObservation.getInd32ClassroomDoorWindowLock());
            pLibraryObservationUpdate.setInd33ClassroomSafeFromRainWater(pLibraryObservation.getInd33ClassroomSafeFromRainWater());
            pLibraryObservationUpdate.setInd34ClassroomSafeClean(pLibraryObservation.getInd34ClassroomSafeClean());

            pLibraryObservationUpdate.setInd4LibraryFurnitureOkay(pLibraryObservation.getInd4LibraryFurnitureOkay());
            pLibraryObservationUpdate.setInd41BookshelfUsable(pLibraryObservation.getInd41BookshelfUsable());
            pLibraryObservationUpdate.setInd42BookshelfProtectedSunRain(pLibraryObservation.getInd42BookshelfProtectedSunRain());
            pLibraryObservationUpdate.setInd43BookshelfPortableSafeForStudent(pLibraryObservation.getInd43BookshelfPortableSafeForStudent());
            pLibraryObservationUpdate.setInd44BookshelfReadingSpace(pLibraryObservation.getInd44BookshelfReadingSpace());
            pLibraryObservationUpdate.setInd45BookshelfFurnitureGoodCondition(pLibraryObservation.getInd45BookshelfFurnitureGoodCondition());

            pLibraryObservationUpdate.setInd5BookRegisterUpdated(pLibraryObservation.getInd5BookRegisterUpdated());

            pLibraryObservationUpdate.setInd6BookshelfOrganized(pLibraryObservation.getInd6BookshelfOrganized());
            pLibraryObservationUpdate.setInd61BookshelfBookOrganizedByGrade(pLibraryObservation.getInd61BookshelfBookOrganizedByGrade());
            pLibraryObservationUpdate.setInd62BookshelfRtRBookLabelViewable(pLibraryObservation.getInd62BookshelfRtRBookLabelViewable());
            pLibraryObservationUpdate.setInd63BookshelfNonRtRBookLabelViewable(pLibraryObservation.getInd63BookshelfNonRtRBookLabelViewable());
            pLibraryObservationUpdate.setInd64BookOrganizedByLabel(pLibraryObservation.getInd64BookOrganizedByLabel());
            pLibraryObservationUpdate.setInd65BookAccessible(pLibraryObservation.getInd65BookAccessible());
            pLibraryObservationUpdate.setInd66BookCoverViewable(pLibraryObservation.getInd66BookCoverViewable());

            pLibraryObservationUpdate.setInd7PrintRichItemDisplayed(pLibraryObservation.getInd7PrintRichItemDisplayed());
            pLibraryObservationUpdate.setInd71ChartPosterDisplayed(pLibraryObservation.getInd71ChartPosterDisplayed());
            pLibraryObservationUpdate.setInd72ChartPosterCompatible(pLibraryObservation.getInd72ChartPosterCompatible());

            pLibraryObservationUpdate.setInd8BookCheckoutFunctional(pLibraryObservation.getInd8BookCheckoutFunctional());
            pLibraryObservationUpdate.setInd81BookCheckoutProcedureDisplayed(pLibraryObservation.getInd81BookCheckoutProcedureDisplayed());
            pLibraryObservationUpdate.setInd82BookCheckoutRegisterUsable(pLibraryObservation.getInd82BookCheckoutRegisterUsable());
            pLibraryObservationUpdate.setInd83BookCheckoutRegisterUpdated(pLibraryObservation.getInd83BookCheckoutRegisterUpdated());
            pLibraryObservationUpdate.setInd84BookCheckoutPendingBookList(pLibraryObservation.getInd84BookCheckoutPendingBookList());
            pLibraryObservationUpdate.setInd85BookCheckoutDataCollection(pLibraryObservation.getInd85BookCheckoutDataCollection());
            pLibraryObservationUpdate.setInd86BookCheckoutByLeast5Student(pLibraryObservation.getInd86BookCheckoutByLeast5Student());

            pLibraryObservationUpdate.setInd9ReadingHourActivityFunctional(pLibraryObservation.getInd9ReadingHourActivityFunctional());
            pLibraryObservationUpdate.setInd91ReadingHourActivityWeekly(pLibraryObservation.getInd91ReadingHourActivityWeekly());
            pLibraryObservationUpdate.setInd92ReadingHourActivityRoutineHanged(pLibraryObservation.getInd92ReadingHourActivityRoutineHanged());
            pLibraryObservationUpdate.setInd93BookCheckoutOpportunity(pLibraryObservation.getInd93BookCheckoutOpportunity());
            pLibraryObservationUpdate.setInd94BookCheckoutNoticeHanged(pLibraryObservation.getInd94BookCheckoutNoticeHanged());

            pLibraryObservationUpdate.setInd10TrainedLibraryObservationReadingHour(pLibraryObservation.getInd10TrainedLibraryObservationReadingHour());

            pLibraryObservationUpdate.setInd11TeacherPerformReadingHourActivity(pLibraryObservation.getInd11TeacherPerformReadingHourActivity());
            pLibraryObservationUpdate.setInd111ReadingHourRegisterUpdated(pLibraryObservation.getInd111ReadingHourRegisterUpdated());
            pLibraryObservationUpdate.setInd112ReadingActivityListedRegister(pLibraryObservation.getInd112ReadingActivityListedRegister());

            pLibraryObservationUpdate.setInd12SchoolCommitteeDecisionAboutLibrary(pLibraryObservation.getInd12SchoolCommitteeDecisionAboutLibrary());
            pLibraryObservationUpdate.setInd121SchoolHasCommitteeAboutLibrary(pLibraryObservation.getInd121SchoolHasCommitteeAboutLibrary());
            pLibraryObservationUpdate.setInd122SchoolCommitteeMeetingAboutLibrary(pLibraryObservation.getInd122SchoolCommitteeMeetingAboutLibrary());

            pLibraryObservationUpdate.setInd13ParentMeetingAboutLibrary(pLibraryObservation.getInd13ParentMeetingAboutLibrary());

            pLibraryObservationUpdate.setInd14ReadPlayFestival(pLibraryObservation.getInd14ReadPlayFestival());
            pLibraryObservationUpdate.setInd141SchoolArrangeReadFestival(pLibraryObservation.getInd141SchoolArrangeReadFestival());
            pLibraryObservationUpdate.setInd142ParentPublicEngageReadFestival(pLibraryObservation.getInd142ParentPublicEngageReadFestival());

            pLibraryObservationUpdate.setInd15SustainabilityPlanByCommittee(pLibraryObservation.getInd15SustainabilityPlanByCommittee());
            pLibraryObservationUpdate.setInd151ParentPublicHeadTeacherCombinedPlan(pLibraryObservation.getInd151ParentPublicHeadTeacherCombinedPlan());
            pLibraryObservationUpdate.setInd152ParentPublicResponsibility(pLibraryObservation.getInd152ParentPublicResponsibility());


            pLibraryObservationUpdate.setBestPracticeIndicator1(pLibraryObservation.getBestPracticeIndicator1());
            pLibraryObservationUpdate.setBestPracticeIndicator2(pLibraryObservation.getBestPracticeIndicator2());
            pLibraryObservationUpdate.setBestPracticeIndicator3(pLibraryObservation.getBestPracticeIndicator3());

            pLibraryObservationUpdate.setCoachingSupportIndicator1(pLibraryObservation.getCoachingSupportIndicator1());
            pLibraryObservationUpdate.setCoachingSupportIndicator1Details(pLibraryObservation.getCoachingSupportIndicator1Details());
            pLibraryObservationUpdate.setCoachingSupportIndicator2(pLibraryObservation.getCoachingSupportIndicator2());
            pLibraryObservationUpdate.setCoachingSupportIndicator2Details(pLibraryObservation.getCoachingSupportIndicator2Details());
            pLibraryObservationUpdate.setCoachingSupportIndicator3(pLibraryObservation.getCoachingSupportIndicator3());
            pLibraryObservationUpdate.setCoachingSupportIndicator3Details(pLibraryObservation.getCoachingSupportIndicator3Details());

            pLibraryObservationUpdate.setAgreedStatement1(pLibraryObservation.getAgreedStatement1());
            pLibraryObservationUpdate.setAgreedStatement2(pLibraryObservation.getAgreedStatement2());

            pLibraryObservationUpdate.setLibraryStatus(pLibraryObservation.getLibraryStatus());

            pLibraryObservationUpdate.setIsChecked(pLibraryObservation.getIsChecked());
            pLibraryObservationUpdate.setIsActive(pLibraryObservation.getIsActive());
            pLibraryObservationUpdate.setIsDeleted(pLibraryObservation.getIsDeleted());

            pLibraryObservationRepo.save(pLibraryObservationUpdate);
            return pLibraryObservationUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + pLibraryObservation.getId());

        }

    }

    // Delete PLibraryObservation
    public void deletePLibraryObservation(long id) {
        Optional<PLibraryObservation> pLibraryObservationDb = this.pLibraryObservationRepo.findById(id);

        if (pLibraryObservationDb.isPresent()) {
            this.pLibraryObservationRepo.delete(pLibraryObservationDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }
}
