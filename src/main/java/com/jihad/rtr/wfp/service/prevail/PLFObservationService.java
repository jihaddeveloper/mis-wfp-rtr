//  Author: Mohammad Jihad Hossain
//  Create Date: 09/09/2025
//  Modify Date: 09/09/2025
//  Description: PLFObservationService file

package com.jihad.rtr.wfp.service.prevail;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DILibraryObservation;
import com.jihad.rtr.wfp.model.prevail.PLFObservation;
import com.jihad.rtr.wfp.repository.DILibraryObservationRepo;
import com.jihad.rtr.wfp.repository.prevail.PLFObservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PLFObservationService {

    @Autowired
    private PLFObservationRepo plfObservationRepo;

    // Create new PLFObservation
    public PLFObservation createPLFObservation(PLFObservation plfObservation) {
        return plfObservationRepo.save(plfObservation);
    }

    // Get all PLFObservation
    public List<PLFObservation> getAllPLFObservation() {
        return plfObservationRepo.findAll();
    }

    // Get PLFObservation with id
    public PLFObservation getPLFObservationById(long id) {
        Optional<PLFObservation> plfObservationDB = plfObservationRepo.findById(id);

        if (plfObservationDB.isPresent()) {
            return plfObservationDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);

        }

    }

    // Update PLFObservation
    public PLFObservation updatePLFObservation(PLFObservation plfObservation) {
        Optional<PLFObservation> plfObservationDB = plfObservationRepo.findById(plfObservation.getId());

        if (plfObservationDB.isPresent()) {
            PLFObservation plfObservationUpdate = plfObservationDB.get();

            plfObservationUpdate.setId(plfObservation.getId());
            plfObservationUpdate.setVisitNo(plfObservation.getVisitNo());
            plfObservationUpdate.setDate(plfObservation.getDate());
            plfObservationUpdate.setOffice(plfObservation.getOffice());
            plfObservationUpdate.setProject(plfObservation.getProject());
            plfObservationUpdate.setDistrict(plfObservation.getDistrict());
            plfObservationUpdate.setUpazilla(plfObservation.getUpazilla());

            plfObservationUpdate.setLf(plfObservation.getLf());
            plfObservationUpdate.setLfName(plfObservation.getLfName());
            plfObservationUpdate.setLpo(plfObservation.getLpo());
            plfObservationUpdate.setLpoName(plfObservation.getLpoName());
            plfObservationUpdate.setSchool(plfObservation.getSchool());
            plfObservationUpdate.setRtrSchoolId(plfObservation.getRtrSchoolId());
            plfObservationUpdate.setYearOfSupport(plfObservation.getYearOfSupport());
            plfObservationUpdate.setGrade(plfObservation.getGrade());
            plfObservationUpdate.setSection(plfObservation.getSection());
            plfObservationUpdate.setMonth(plfObservation.getMonth());
            plfObservationUpdate.setYear(plfObservation.getYear());
            plfObservationUpdate.setSchoolEntryTime(plfObservation.getSchoolEntryTime());
            plfObservationUpdate.setSchoolExitTime(plfObservation.getSchoolExitTime());

            plfObservationUpdate.setNote(plfObservation.getNote());

            plfObservationUpdate.setInd11IsCarriedAllMaterialStatus(plfObservation.getInd11IsCarriedAllMaterialStatus());
            plfObservationUpdate.setInd11IsCarriedAllMaterialNote(plfObservation.getInd11IsCarriedAllMaterialNote());
            plfObservationUpdate.setInd12IsCheckedInRightTimeStatus(plfObservation.getInd12IsCheckedInRightTimeStatus());
            plfObservationUpdate.setInd12IsCheckedInRightTimeNote(plfObservation.getInd12IsCheckedInRightTimeNote());
            plfObservationUpdate.setInd13IsObservedBanglaLibraryStatus(plfObservation.getInd13IsObservedBanglaLibraryStatus());
            plfObservationUpdate.setInd13IsObservedBanglaLibraryNote(plfObservation.getInd13IsObservedBanglaLibraryNote());
            plfObservationUpdate.setInd14FeedbackSessionWithTeacherStatus(plfObservation.getInd14FeedbackSessionWithTeacherStatus());
            plfObservationUpdate.setInd15MeetingWithHeadTeacherStatus(plfObservation.getInd15MeetingWithHeadTeacherStatus());
            plfObservationUpdate.setInd15MeetingWithHeadTeacherNote(plfObservation.getInd15MeetingWithHeadTeacherNote());
            plfObservationUpdate.setInd16FilledAllFormProperlyStatus(plfObservation.getInd16FilledAllFormProperlyStatus());
            plfObservationUpdate.setInd16FilledAllFormProperlyNote(plfObservation.getInd16FilledAllFormProperlyNote());
            plfObservationUpdate.setInd17ObservedClassSilentlyStatus(plfObservation.getInd17ObservedClassSilentlyStatus());
            plfObservationUpdate.setInd17ObservedClassSilentlyNote(plfObservation.getInd17ObservedClassSilentlyNote());
            plfObservationUpdate.setInd21LFTeacherMaintainGoodRelationshipStatus(plfObservation.getInd21LFTeacherMaintainGoodRelationshipStatus());
            plfObservationUpdate.setInd21LFTeacherMaintainGoodRelationshipNote(plfObservation.getInd21LFTeacherMaintainGoodRelationshipNote());
            plfObservationUpdate.setInd22LFDiscussGoodPracticeIndicatorStatus(plfObservation.getInd22LFDiscussGoodPracticeIndicatorStatus());
            plfObservationUpdate.setInd22LFDiscussGoodPracticeIndicatorNote(plfObservation.getInd22LFDiscussGoodPracticeIndicatorNote());
            plfObservationUpdate.setInd23LFDiscussCoachingSupportIndicatorStatus(plfObservation.getInd23LFDiscussCoachingSupportIndicatorStatus());
            plfObservationUpdate.setInd23LFDiscussCoachingSupportIndicatorNote(plfObservation.getInd23LFDiscussCoachingSupportIndicatorNote());
            plfObservationUpdate.setInd24LFDiscussLastFollowupIndicatorStatus(plfObservation.getInd24LFDiscussLastFollowupIndicatorStatus());
            plfObservationUpdate.setInd24LFDiscussLastFollowupIndicatorNote(plfObservation.getInd24LFDiscussLastFollowupIndicatorNote());
            plfObservationUpdate.setInd25LFInstructIdealLessonStatus(plfObservation.getInd25LFInstructIdealLessonStatus());
            plfObservationUpdate.setInd25LFInstructIdealLessonNote(plfObservation.getInd25LFInstructIdealLessonNote());
            plfObservationUpdate.setInd26LFObserveStudentOrGroupStatus(plfObservation.getInd26LFObserveStudentOrGroupStatus());
            plfObservationUpdate.setInd26LFObserveStudentOrGroupNote(plfObservation.getInd26LFObserveStudentOrGroupNote());
            plfObservationUpdate.setInd27LFVerifyWorkbookStatus(plfObservation.getInd27LFVerifyWorkbookStatus());
            plfObservationUpdate.setInd27LFVerifyWorkbookNote(plfObservation.getInd27LFVerifyWorkbookNote());
            plfObservationUpdate.setInd28LFTrack3StudentStatus(plfObservation.getInd28LFTrack3StudentStatus());
            plfObservationUpdate.setInd28LFTrack3StudentNote(plfObservation.getInd28LFTrack3StudentNote());
            plfObservationUpdate.setInd29LFTeacherAgreedNextPlanStatus(plfObservation.getInd29LFTeacherAgreedNextPlanStatus());
            plfObservationUpdate.setInd29LFTeacherAgreedNextPlanNote(plfObservation.getInd29LFTeacherAgreedNextPlanNote());
            plfObservationUpdate.setInd31LFIdentifyGoodImprovablePointStatus(plfObservation.getInd31LFIdentifyGoodImprovablePointStatus());
            plfObservationUpdate.setInd31LFIdentifyGoodImprovablePointNote(plfObservation.getInd31LFIdentifyGoodImprovablePointNote());
            plfObservationUpdate.setInd32LFInstructDevelopmentPlanStatus(plfObservation.getInd32LFInstructDevelopmentPlanStatus());
            plfObservationUpdate.setInd32LFInstructDevelopmentPlanNote(plfObservation.getInd32LFInstructDevelopmentPlanNote());
            plfObservationUpdate.setInd33LFDiscussAboutDevelopmentPlanStatus(plfObservation.getInd33LFDiscussAboutDevelopmentPlanStatus());
            plfObservationUpdate.setInd33LFDiscussAboutDevelopmentPlanNote(plfObservation.getInd33LFDiscussAboutDevelopmentPlanNote());
            plfObservationUpdate.setInd34LFAllowToChangeTeachingPatternStatus(plfObservation.getInd34LFAllowToChangeTeachingPatternStatus());
            plfObservationUpdate.setInd34LFAllowToChangeTeachingPatternNote(plfObservation.getInd34LFAllowToChangeTeachingPatternNote());
            plfObservationUpdate.setInd35LFAllowTeacherForDiscussionStatus(plfObservation.getInd35LFAllowTeacherForDiscussionStatus());
            plfObservationUpdate.setInd35LFAllowTeacherForDiscussionNote(plfObservation.getInd35LFAllowTeacherForDiscussionNote());

            plfObservationUpdate.setLastFollowupIndicator1(plfObservation.getLastFollowupIndicator1());
            plfObservationUpdate.setLastFollowupIndicator2(plfObservation.getLastFollowupIndicator2());
            plfObservationUpdate.setLastFollowupIndicator3(plfObservation.getLastFollowupIndicator3());

            plfObservationUpdate.setBestPracticeIndicator1(plfObservation.getBestPracticeIndicator1());
            plfObservationUpdate.setBestPracticeIndicator1Details(plfObservation.getBestPracticeIndicator1Details());
            plfObservationUpdate.setBestPracticeIndicator2(plfObservation.getBestPracticeIndicator2());
            plfObservationUpdate.setBestPracticeIndicator2Details(plfObservation.getBestPracticeIndicator2Details());
            plfObservationUpdate.setBestPracticeIndicator3(plfObservation.getBestPracticeIndicator3());
            plfObservationUpdate.setBestPracticeIndicator3Details(plfObservation.getBestPracticeIndicator3Details());

            plfObservationUpdate.setCoachingSupportIndicator1(plfObservation.getCoachingSupportIndicator1());
            plfObservationUpdate.setCoachingSupportIndicator1Details(plfObservation.getCoachingSupportIndicator1Details());
            plfObservationUpdate.setCoachingSupportIndicator2(plfObservation.getCoachingSupportIndicator2());
            plfObservationUpdate.setCoachingSupportIndicator2Details(plfObservation.getCoachingSupportIndicator2Details());

            plfObservationUpdate.setCoachingSupportLPO(plfObservation.getCoachingSupportLPO());
            plfObservationUpdate.setCoachingSupportLF(plfObservation.getCoachingSupportLF());

            plfObservationUpdate.setAgreedStatement1(plfObservation.getAgreedStatement1());
            plfObservationUpdate.setAgreedStatement2(plfObservation.getAgreedStatement2());

            plfObservationUpdate.setLfStatus(plfObservation.getLfStatus());

            plfObservationUpdate.setIsChecked(plfObservation.getIsChecked());
            plfObservationUpdate.setIsActive(plfObservation.getIsActive());
            plfObservationUpdate.setIsDeleted(plfObservation.getIsDeleted());

            plfObservationRepo.save(plfObservationUpdate);
            return plfObservationUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + plfObservation.getId());

        }

    }

    // Delete PLFObservation
    public void deletePLFObservation(long id) {
        Optional<PLFObservation> pLFObservationDb = this.plfObservationRepo.findById(id);

        if (pLFObservationDb.isPresent()) {
            this.plfObservationRepo.delete(pLFObservationDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }
}
