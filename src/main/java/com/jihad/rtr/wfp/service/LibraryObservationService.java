//  Author: Mohammad Jihad Hossain
//  Create Date: 09/01/2022
//  Modify Date: 09/01/2022
//  Description: Library observation service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.LibraryObservation;
import com.jihad.rtr.wfp.repository.LibraryObservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LibraryObservationService {

    @Autowired
    private LibraryObservationRepo libraryObservationRepo;

    // Create new Library observation
    public LibraryObservation createLibraryObservation(LibraryObservation libraryObservation) {
        return libraryObservationRepo.save(libraryObservation);
    }

    //Get all Library observation
    public List<LibraryObservation> getAllLibraryObservation() {
        return libraryObservationRepo.findAll();
    }

    //Get Library observation with id
    public LibraryObservation getLibraryObservationById(long id) {
        Optional<LibraryObservation> libraryObservationDB = libraryObservationRepo.findById(id);

        if (libraryObservationDB.isPresent()) {
            return libraryObservationDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);

        }

    }

    //Update Library observation
    public LibraryObservation updateLibraryObservation(LibraryObservation libraryObservation) {
        Optional<LibraryObservation> libraryObservationDB = libraryObservationRepo.findById(libraryObservation.getId());

        if (libraryObservationDB.isPresent()) {
            LibraryObservation libraryObservationUpdate = libraryObservationDB.get();
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

            libraryObservationUpdate.setNote(libraryObservation.getNote());


            libraryObservationUpdate.setLastFollowupIndicator1(libraryObservation.getLastFollowupIndicator1());
            libraryObservationUpdate.setLastFollowupIndicator2(libraryObservation.getLastFollowupIndicator2());
            libraryObservationUpdate.setLastFollowupIndicator3(libraryObservation.getLastFollowupIndicator3());

            libraryObservationUpdate.setInd1IsTrainedAllTeacher(libraryObservation.getInd1IsTrainedAllTeacher());
            libraryObservationUpdate.setInd11IsTrainedSRMTeacherIncharge(libraryObservation.getInd11IsTrainedSRMTeacherIncharge());
            libraryObservationUpdate.setInd12IsTrainedHeadTeacher(libraryObservation.getInd12IsTrainedHeadTeacher());
            libraryObservationUpdate.setInd2ClassroomSuitableSRM(libraryObservation.getInd2ClassroomSuitableSRM());
            libraryObservationUpdate.setInd21ClassroomDoorWindowLock(libraryObservation.getInd21ClassroomDoorWindowLock());
            libraryObservationUpdate.setInd22ClassroomSafeClean(libraryObservation.getInd22ClassroomSafeClean());
            libraryObservationUpdate.setInd3BookselfUseable(libraryObservation.getInd3BookselfUseable());
            libraryObservationUpdate.setInd31BookselfAccessible(libraryObservation.getInd31BookselfAccessible());
            libraryObservationUpdate.setInd32BookselfEnvironmentProtected(libraryObservation.getInd32BookselfEnvironmentProtected());
            libraryObservationUpdate.setInd33BookselfTableCondition(libraryObservation.getInd33BookselfTableCondition());
            libraryObservationUpdate.setInd4BookRegisterUpdated(libraryObservation.getInd4BookRegisterUpdated());
            libraryObservationUpdate.setInd5BookselfOrganized(libraryObservation.getInd5BookselfOrganized());
            libraryObservationUpdate.setInd51BookselfBookOrganizedOpen(libraryObservation.getInd51BookselfBookOrganizedOpen());
            libraryObservationUpdate.setInd52BookselfBookLevelViewable(libraryObservation.getInd52BookselfBookLevelViewable());
            libraryObservationUpdate.setInd53BookselfBookAccessible(libraryObservation.getInd53BookselfBookAccessible());
            libraryObservationUpdate.setInd6PrintRichDisplayed(libraryObservation.getInd6PrintRichDisplayed());
            libraryObservationUpdate.setInd7BookCheckoutFunctional(libraryObservation.getInd7BookCheckoutFunctional());
            libraryObservationUpdate.setInd71BookCheckoutProcedureDisplayed(libraryObservation.getInd71BookCheckoutProcedureDisplayed());
            libraryObservationUpdate.setInd72BookCheckoutRegisterUsable(libraryObservation.getInd72BookCheckoutRegisterUsable());
            libraryObservationUpdate.setInd73BookCheckoutRegisterUpdated(libraryObservation.getInd73BookCheckoutRegisterUpdated());
            libraryObservationUpdate.setInd74BookCheckoutPendingBooklist(libraryObservation.getInd74BookCheckoutPendingBooklist());
            libraryObservationUpdate.setInd8SRMClassRoutine(libraryObservation.getInd8SRMClassRoutine());
            libraryObservationUpdate.setInd81SRMClassWeekly(libraryObservation.getInd81SRMClassWeekly());
            libraryObservationUpdate.setInd82DailyBookCheckoutOpportunity(libraryObservation.getInd82DailyBookCheckoutOpportunity());
            libraryObservationUpdate.setInd9SRMRegisterUpdated(libraryObservation.getInd9SRMRegisterUpdated());
            libraryObservationUpdate.setInd10ParentsMeeting(libraryObservation.getInd10ParentsMeeting());
            libraryObservationUpdate.setInd11ReadFestival(libraryObservation.getInd11ReadFestival());
            libraryObservationUpdate.setInd12SustainabilityPlan(libraryObservation.getInd12SustainabilityPlan());
            libraryObservationUpdate.setInd121CollectivePlan(libraryObservation.getInd121CollectivePlan());
            libraryObservationUpdate.setInd122ResponsibilityPlan(libraryObservation.getInd122ResponsibilityPlan());

            libraryObservationUpdate.setBestPracticeIndicator1(libraryObservation.getBestPracticeIndicator1());
            libraryObservationUpdate.setBestPracticeIndicator2(libraryObservation.getBestPracticeIndicator2());
            libraryObservationUpdate.setBestPracticeIndicator3(libraryObservation.getBestPracticeIndicator3());

            libraryObservationUpdate.setCoachingSupportIndicator1(libraryObservation.getCoachingSupportIndicator1());
            libraryObservationUpdate.setCoachingSupportIndicator1Details(libraryObservation.getCoachingSupportIndicator1Details());
            libraryObservationUpdate.setCoachingSupportIndicator2(libraryObservation.getCoachingSupportIndicator2());
            libraryObservationUpdate.setCoachingSupportIndicator2Details(libraryObservation.getCoachingSupportIndicator2Details());

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

    //Delete Library observation
    public void deleteLibraryObservation(long id) {
        Optional<LibraryObservation> libraryObservationDb = this.libraryObservationRepo.findById(id);

        if (libraryObservationDb.isPresent()) {
            this.libraryObservationRepo.delete(libraryObservationDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }
}
