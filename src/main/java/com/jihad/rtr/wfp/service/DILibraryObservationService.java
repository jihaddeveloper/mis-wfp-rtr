//  Author: Mohammad Jihad Hossain
//  Create Date: 01/07/2024
//  Modify Date: 01/07/2024
//  Description: DI Library observation service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DILibraryObservation;
import com.jihad.rtr.wfp.model.LibraryObservation;
import com.jihad.rtr.wfp.repository.DILibraryObservationRepo;
import com.jihad.rtr.wfp.repository.LibraryObservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DILibraryObservationService {

    @Autowired
    private DILibraryObservationRepo libraryObservationRepo;

    // Create new DI Library observation
    public DILibraryObservation createLibraryObservation(DILibraryObservation libraryObservation) {
        return libraryObservationRepo.save(libraryObservation);
    }

    //Get all DI Library observation
    public List<DILibraryObservation> getAllLibraryObservation() {
        return libraryObservationRepo.findAll();
    }

    //Get DI Library observation with id
    public DILibraryObservation getLibraryObservationById(long id) {
        Optional<DILibraryObservation> libraryObservationDB = libraryObservationRepo.findById(id);

        if (libraryObservationDB.isPresent()) {
            return libraryObservationDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);

        }

    }

    //Update DI Library observation
    public DILibraryObservation updateLibraryObservation(DILibraryObservation libraryObservation) {
        Optional<DILibraryObservation> libraryObservationDB = libraryObservationRepo.findById(libraryObservation.getId());

        if (libraryObservationDB.isPresent()) {
            DILibraryObservation libraryObservationUpdate = libraryObservationDB.get();

            libraryObservationUpdate.setId(libraryObservation.getId());
            libraryObservationUpdate.setVisitNo(libraryObservation.getVisitNo());
            libraryObservationUpdate.setDate(libraryObservation.getDate());
            libraryObservationUpdate.setOffice(libraryObservation.getOffice());
            libraryObservationUpdate.setProject(libraryObservation.getProject());
            libraryObservationUpdate.setDistrict(libraryObservation.getDistrict());
            libraryObservationUpdate.setUpazilla(libraryObservation.getUpazilla());
            libraryObservationUpdate.setVisitor(libraryObservation.getVisitor());
            libraryObservationUpdate.setVisitorDesignation(libraryObservation.getVisitorDesignation());
            libraryObservationUpdate.setVisitorOffice(libraryObservation.getVisitorOffice());
            libraryObservationUpdate.setLf(libraryObservation.getLf());
            libraryObservationUpdate.setLfName(libraryObservation.getLfName());
            libraryObservationUpdate.setLpo(libraryObservation.getLpo());
            libraryObservationUpdate.setLpoName(libraryObservation.getLpoName());
            libraryObservationUpdate.setSchool(libraryObservation.getSchool());
            libraryObservationUpdate.setMonth(libraryObservation.getMonth());
            libraryObservationUpdate.setYear(libraryObservation.getYear());
            libraryObservationUpdate.setRtrSchoolId(libraryObservation.getRtrSchoolId());
            libraryObservationUpdate.setYearOfSupport(libraryObservation.getYearOfSupport());

            libraryObservationUpdate.setPhase(libraryObservation.getPhase());
            libraryObservationUpdate.setPointTeacher(libraryObservation.getPointTeacher());


            libraryObservationUpdate.setNote(libraryObservation.getNote());


            libraryObservationUpdate.setLastFollowupIndicator1(libraryObservation.getLastFollowupIndicator1());
            libraryObservationUpdate.setLastFollowupIndicator2(libraryObservation.getLastFollowupIndicator2());
            libraryObservationUpdate.setLastFollowupIndicator3(libraryObservation.getLastFollowupIndicator3());

            libraryObservationUpdate.setInd1IsTrainedOneTeacher(libraryObservation.getInd1IsTrainedOneTeacher());
            libraryObservationUpdate.setInd11IsPointTeacherIncharge(libraryObservation.getInd11IsPointTeacherIncharge());
            libraryObservationUpdate.setInd12IsTrainedLibraryManagementReadingHour(libraryObservation.getInd12IsTrainedLibraryManagementReadingHour());
            libraryObservationUpdate.setInd2HeadTeacherTrainedLibraryManagementReadingHour(libraryObservation.getInd2HeadTeacherTrainedLibraryManagementReadingHour());
            libraryObservationUpdate.setInd3ClassroomSuitableLibraryActivity(libraryObservation.getInd3ClassroomSuitableLibraryActivity());
            libraryObservationUpdate.setInd31ClassroomDoorWindowOkay(libraryObservation.getInd31ClassroomDoorWindowOkay());
            libraryObservationUpdate.setInd32ClassroomDoorWindowLock(libraryObservation.getInd32ClassroomDoorWindowLock());
            libraryObservationUpdate.setInd33ClassroomSafeFromRainWater(libraryObservation.getInd33ClassroomSafeFromRainWater());
            libraryObservationUpdate.setInd34ClassroomSafeClean(libraryObservation.getInd34ClassroomSafeClean());
            libraryObservationUpdate.setInd4LibraryFurnitureOkay(libraryObservation.getInd4LibraryFurnitureOkay());
            libraryObservationUpdate.setInd41BookshelfUsable(libraryObservation.getInd41BookshelfUsable());
            libraryObservationUpdate.setInd42BookshelfProtectedSunRain(libraryObservation.getInd42BookshelfProtectedSunRain());
            libraryObservationUpdate.setInd43BookshelfPortableSafeForStudent(libraryObservation.getInd43BookshelfPortableSafeForStudent());
            libraryObservationUpdate.setInd44BookshelfReadingSpace(libraryObservation.getInd44BookshelfReadingSpace());
            libraryObservationUpdate.setInd45BookshelfFurnitureGoodCondition(libraryObservation.getInd45BookshelfFurnitureGoodCondition());
            libraryObservationUpdate.setInd5BookRegisterUpdated(libraryObservation.getInd5BookRegisterUpdated());
            libraryObservationUpdate.setInd6BookshelfOrganized(libraryObservation.getInd6BookshelfOrganized());
            libraryObservationUpdate.setInd61BookshelfBookOrganizedByGrade(libraryObservation.getInd61BookshelfBookOrganizedByGrade());
            libraryObservationUpdate.setInd62BookshelfRtRBookLabelViewable(libraryObservation.getInd62BookshelfRtRBookLabelViewable());
            libraryObservationUpdate.setInd63BookshelfNonRtRBookLabelViewable(libraryObservation.getInd63BookshelfNonRtRBookLabelViewable());
            libraryObservationUpdate.setInd64BookOrganizedByLabel(libraryObservation.getInd64BookOrganizedByLabel());
            libraryObservationUpdate.setInd65BookAccessible(libraryObservation.getInd65BookAccessible());
            libraryObservationUpdate.setInd66BookCoverViewable(libraryObservation.getInd66BookCoverViewable());
            libraryObservationUpdate.setInd7PrintRichItemDisplayed(libraryObservation.getInd7PrintRichItemDisplayed());
            libraryObservationUpdate.setInd71ChartPosterDisplayed(libraryObservation.getInd71ChartPosterDisplayed());
            libraryObservationUpdate.setInd72ChartPosterCompatible(libraryObservation.getInd72ChartPosterCompatible());
            libraryObservationUpdate.setInd8BookCheckoutFunctional(libraryObservation.getInd8BookCheckoutFunctional());
            libraryObservationUpdate.setInd81BookCheckoutProcedureDisplayed(libraryObservation.getInd81BookCheckoutProcedureDisplayed());
            libraryObservationUpdate.setInd82BookCheckoutRegisterUsable(libraryObservation.getInd82BookCheckoutRegisterUsable());
            libraryObservationUpdate.setInd83BookCheckoutRegisterUpdated(libraryObservation.getInd83BookCheckoutRegisterUpdated());
            libraryObservationUpdate.setInd84BookCheckoutPendingBookList(libraryObservation.getInd84BookCheckoutPendingBookList());
            libraryObservationUpdate.setInd85BookCheckoutDataCollection(libraryObservation.getInd85BookCheckoutDataCollection());
            libraryObservationUpdate.setInd86BookCheckoutByLeast5Student(libraryObservation.getInd86BookCheckoutByLeast5Student());

            libraryObservationUpdate.setInd9ReadingHourActivityFunctional(libraryObservation.getInd9ReadingHourActivityFunctional());
            libraryObservationUpdate.setInd91ReadingHourActivityWeekly(libraryObservation.getInd91ReadingHourActivityWeekly());
            libraryObservationUpdate.setInd92ReadingHourActivityRoutineHanged(libraryObservation.getInd92ReadingHourActivityRoutineHanged());
            libraryObservationUpdate.setInd93BookCheckoutOpportunity(libraryObservation.getInd93BookCheckoutOpportunity());
            libraryObservationUpdate.setInd94BookCheckoutNoticeHanged(libraryObservation.getInd94BookCheckoutNoticeHanged());
            libraryObservationUpdate.setInd10TrainedLibraryObservationReadingHour(libraryObservation.getInd10TrainedLibraryObservationReadingHour());
            libraryObservationUpdate.setInd11TeacherPerformReadingHourActivity(libraryObservation.getInd11TeacherPerformReadingHourActivity());
            libraryObservationUpdate.setInd111ReadingHourRegisterUpdated(libraryObservation.getInd111ReadingHourRegisterUpdated());
            libraryObservationUpdate.setInd112ReadingActivityListedRegister(libraryObservation.getInd112ReadingActivityListedRegister());
            libraryObservationUpdate.setInd12SchoolCommitteeDecisionAboutLibrary(libraryObservation.getInd12SchoolCommitteeDecisionAboutLibrary());
            libraryObservationUpdate.setInd121SchoolHasCommitteeAboutLibrary(libraryObservation.getInd121SchoolHasCommitteeAboutLibrary());
            libraryObservationUpdate.setInd122SchoolCommitteeMeetingAboutLibrary(libraryObservation.getInd122SchoolCommitteeMeetingAboutLibrary());
            libraryObservationUpdate.setInd13ParentMeetingAboutLibrary(libraryObservation.getInd13ParentMeetingAboutLibrary());
            libraryObservationUpdate.setInd14ReadPlayFestival(libraryObservation.getInd14ReadPlayFestival());
            libraryObservationUpdate.setInd141SchoolArrangeReadFestival(libraryObservation.getInd141SchoolArrangeReadFestival());
            libraryObservationUpdate.setInd142ParentPublicEngageReadFestival(libraryObservation.getInd142ParentPublicEngageReadFestival());
            libraryObservationUpdate.setInd15SustainabilityPlanByCommittee(libraryObservation.getInd15SustainabilityPlanByCommittee());
            libraryObservationUpdate.setInd151ParentPublicHeadTeacherCombinedPlan(libraryObservation.getInd151ParentPublicHeadTeacherCombinedPlan());
            libraryObservationUpdate.setInd152ParentPublicResponsibility(libraryObservation.getInd152ParentPublicResponsibility());


            libraryObservationUpdate.setBestPracticeIndicator1(libraryObservation.getBestPracticeIndicator1());
            libraryObservationUpdate.setBestPracticeIndicator2(libraryObservation.getBestPracticeIndicator2());
            libraryObservationUpdate.setBestPracticeIndicator3(libraryObservation.getBestPracticeIndicator3());

            libraryObservationUpdate.setCoachingSupportIndicator1(libraryObservation.getCoachingSupportIndicator1());
            libraryObservationUpdate.setCoachingSupportIndicator1Details(libraryObservation.getCoachingSupportIndicator1Details());
            libraryObservationUpdate.setCoachingSupportIndicator2(libraryObservation.getCoachingSupportIndicator2());
            libraryObservationUpdate.setCoachingSupportIndicator2Details(libraryObservation.getCoachingSupportIndicator2Details());
            libraryObservationUpdate.setCoachingSupportIndicator3(libraryObservation.getCoachingSupportIndicator3());
            libraryObservationUpdate.setCoachingSupportIndicator3Details(libraryObservation.getCoachingSupportIndicator3Details());

            libraryObservationUpdate.setAgreedStatement1(libraryObservation.getAgreedStatement1());
            libraryObservationUpdate.setAgreedStatement2(libraryObservation.getAgreedStatement2());

            libraryObservationUpdate.setLibraryStatus(libraryObservation.getLibraryStatus());

            libraryObservationUpdate.setIsActive(libraryObservation.getIsActive());
            libraryObservationUpdate.setIsDeleted(libraryObservation.getIsDeleted());

            libraryObservationRepo.save(libraryObservationUpdate);
            return libraryObservationUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + libraryObservation.getId());

        }

    }

    //Delete DI Library observation
    public void deleteLibraryObservation(long id) {
        Optional<DILibraryObservation> libraryObservationDb = this.libraryObservationRepo.findById(id);

        if (libraryObservationDb.isPresent()) {
            this.libraryObservationRepo.delete(libraryObservationDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }
}
