//  Author: Mohammad Jihad Hossain
//  Create Date: 11/09/2025
//  Modify Date: 11/09/2025
//  Description: PBookCheckoutService file

package com.jihad.rtr.wfp.service.prevail;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DIBookCheckoutCheckin;
import com.jihad.rtr.wfp.model.prevail.PBookCheckout;
import com.jihad.rtr.wfp.repository.DIMonthlyBookCheckoutCheckinRepo;
import com.jihad.rtr.wfp.repository.prevail.PBookCheckoutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PBookCheckoutService {

    @Autowired
    private PBookCheckoutRepo pBookCheckoutRepo;

    // Create new PBookCheckout
    public PBookCheckout createPBookCheckout(PBookCheckout pBookCheckout) {
        return pBookCheckoutRepo.save(pBookCheckout);
    }

    // Get all PBookCheckout
    public List<PBookCheckout> getAllPBookCheckout() {
        return pBookCheckoutRepo.findAll();
    }

    // Get PBookCheckout with id
    public PBookCheckout getPBookCheckoutById(long id) {
        Optional<PBookCheckout> pBookCheckoutDB = pBookCheckoutRepo.findById(id);
        if (pBookCheckoutDB.isPresent()) {
            return pBookCheckoutDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    // Update PBookCheckout
    public PBookCheckout updatePBookCheckout(PBookCheckout pBookCheckout) {
        Optional<PBookCheckout> pBookCheckoutDB = pBookCheckoutRepo.findById(pBookCheckout.getId());

        if (pBookCheckoutDB.isPresent()) {
            PBookCheckout pBookCheckoutUpdate = pBookCheckoutDB.get();


            pBookCheckoutUpdate.setId(pBookCheckout.getId());
            pBookCheckoutUpdate.setVisitNo(pBookCheckout.getVisitNo());
            pBookCheckoutUpdate.setDate(pBookCheckout.getDate());
            pBookCheckoutUpdate.setOffice(pBookCheckout.getOffice());
            pBookCheckoutUpdate.setProject(pBookCheckout.getProject());
            pBookCheckoutUpdate.setDistrict(pBookCheckout.getDistrict());
            pBookCheckoutUpdate.setUpazilla(pBookCheckout.getUpazilla());
            pBookCheckoutUpdate.setSchool(pBookCheckout.getSchool());
            pBookCheckoutUpdate.setRtrSchoolId(pBookCheckout.getRtrSchoolId());
            pBookCheckoutUpdate.setYearOfSupport(pBookCheckout.getYearOfSupport());
            pBookCheckoutUpdate.setYearOfEstablished(pBookCheckout.getYearOfEstablished());
            pBookCheckoutUpdate.setPointTeacher(pBookCheckout.getPointTeacher());
            pBookCheckoutUpdate.setVisitor(pBookCheckout.getVisitor());
            pBookCheckoutUpdate.setVisitorDesignation(pBookCheckout.getVisitorDesignation());
            pBookCheckoutUpdate.setVisitorOffice(pBookCheckout.getVisitorOffice());
            pBookCheckoutUpdate.setLf(pBookCheckout.getLf());
            pBookCheckoutUpdate.setLfName(pBookCheckout.getLfName());
            pBookCheckoutUpdate.setLpo(pBookCheckout.getLpo());
            pBookCheckoutUpdate.setLpoName(pBookCheckout.getLpoName());
            pBookCheckoutUpdate.setMonth(pBookCheckout.getMonth());
            pBookCheckoutUpdate.setYear(pBookCheckout.getYear());
            pBookCheckoutUpdate.setPhase(pBookCheckout.getPhase());

            pBookCheckoutUpdate.setNote(pBookCheckout.getNote());

            pBookCheckoutUpdate.setPriPrimaryBoy(pBookCheckout.getPriPrimaryBoy());
            pBookCheckoutUpdate.setPriPrimaryGirl(pBookCheckout.getPriPrimaryGirl());
            pBookCheckoutUpdate.setPriPrimaryTotal(pBookCheckout.getPriPrimaryTotal());
            pBookCheckoutUpdate.setPriPrimaryNoBoyBC(pBookCheckout.getPriPrimaryNoBoyBC());
            pBookCheckoutUpdate.setPriPrimaryNoGirlBC(pBookCheckout.getPriPrimaryNoGirlBC());
            pBookCheckoutUpdate.setPriPrimaryNoTotalBC(pBookCheckout.getPriPrimaryNoTotalBC());
            pBookCheckoutUpdate.setPriPrimaryNoBookBoyBC(pBookCheckout.getPriPrimaryNoBookBoyBC());
            pBookCheckoutUpdate.setPriPrimaryNoBookGirlBC(pBookCheckout.getPriPrimaryNoBookGirlBC());
            pBookCheckoutUpdate.setPriPrimaryNoBookTotalBC(pBookCheckout.getPriPrimaryNoBookTotalBC());


            pBookCheckoutUpdate.setClassOneBoy(pBookCheckout.getClassOneBoy());
            pBookCheckoutUpdate.setClassOneGirl(pBookCheckout.getClassOneGirl());
            pBookCheckoutUpdate.setClassOneTotal(pBookCheckout.getClassOneTotal());
            pBookCheckoutUpdate.setClassOneNoBoyBC(pBookCheckout.getClassOneNoBoyBC());
            pBookCheckoutUpdate.setClassOneNoGirlBC(pBookCheckout.getClassOneNoGirlBC());
            pBookCheckoutUpdate.setClassOneNoTotalBC(pBookCheckout.getClassOneNoTotalBC());
            pBookCheckoutUpdate.setClassOneNoBookBoyBC(pBookCheckout.getClassOneNoBookBoyBC());
            pBookCheckoutUpdate.setClassOneNoBookGirlBC(pBookCheckout.getClassOneNoBookGirlBC());
            pBookCheckoutUpdate.setClassOneNoBookTotalBC(pBookCheckout.getClassOneNoBookTotalBC());


            pBookCheckoutUpdate.setClassTwoBoy(pBookCheckout.getClassTwoBoy());
            pBookCheckoutUpdate.setClassTwoGirl(pBookCheckout.getClassTwoGirl());
            pBookCheckoutUpdate.setClassTwoTotal(pBookCheckout.getClassTwoTotal());
            pBookCheckoutUpdate.setClassTwoNoBoyBC(pBookCheckout.getClassTwoNoBoyBC());
            pBookCheckoutUpdate.setClassTwoNoGirlBC(pBookCheckout.getClassTwoNoGirlBC());
            pBookCheckoutUpdate.setClassTwoNoTotalBC(pBookCheckout.getClassTwoNoTotalBC());
            pBookCheckoutUpdate.setClassTwoNoBookBoyBC(pBookCheckout.getClassTwoNoBookBoyBC());
            pBookCheckoutUpdate.setClassTwoNoBookGirlBC(pBookCheckout.getClassTwoNoBookGirlBC());
            pBookCheckoutUpdate.setClassTwoNoBookTotalBC(pBookCheckout.getClassTwoNoBookTotalBC());


            pBookCheckoutUpdate.setClassThreeBoy(pBookCheckout.getClassThreeBoy());
            pBookCheckoutUpdate.setClassThreeGirl(pBookCheckout.getClassThreeGirl());
            pBookCheckoutUpdate.setClassThreeTotal(pBookCheckout.getClassThreeTotal());
            pBookCheckoutUpdate.setClassThreeNoBoyBC(pBookCheckout.getClassThreeNoBoyBC());
            pBookCheckoutUpdate.setClassThreeNoGirlBC(pBookCheckout.getClassThreeNoGirlBC());
            pBookCheckoutUpdate.setClassThreeNoTotalBC(pBookCheckout.getClassThreeNoTotalBC());
            pBookCheckoutUpdate.setClassThreeNoBookBoyBC(pBookCheckout.getClassThreeNoBookBoyBC());
            pBookCheckoutUpdate.setClassThreeNoBookGirlBC(pBookCheckout.getClassThreeNoBookGirlBC());
            pBookCheckoutUpdate.setClassThreeNoBookTotalBC(pBookCheckout.getClassThreeNoBookTotalBC());


            pBookCheckoutUpdate.setClassFourBoy(pBookCheckout.getClassFourBoy());
            pBookCheckoutUpdate.setClassFourGirl(pBookCheckout.getClassFourGirl());
            pBookCheckoutUpdate.setClassFourTotal(pBookCheckout.getClassFourTotal());
            pBookCheckoutUpdate.setClassFourNoBoyBC(pBookCheckout.getClassFourNoBoyBC());
            pBookCheckoutUpdate.setClassFourNoGirlBC(pBookCheckout.getClassFourNoGirlBC());
            pBookCheckoutUpdate.setClassFourNoTotalBC(pBookCheckout.getClassFourNoTotalBC());
            pBookCheckoutUpdate.setClassFourNoBookBoyBC(pBookCheckout.getClassFourNoBookBoyBC());
            pBookCheckoutUpdate.setClassFourNoBookGirlBC(pBookCheckout.getClassFourNoBookGirlBC());
            pBookCheckoutUpdate.setClassFourNoBookTotalBC(pBookCheckout.getClassFourNoBookTotalBC());


            pBookCheckoutUpdate.setClassFiveBoy(pBookCheckout.getClassFiveBoy());
            pBookCheckoutUpdate.setClassFiveGirl(pBookCheckout.getClassFiveGirl());
            pBookCheckoutUpdate.setClassFiveTotal(pBookCheckout.getClassFiveTotal());
            pBookCheckoutUpdate.setClassFiveNoBoyBC(pBookCheckout.getClassFiveNoBoyBC());
            pBookCheckoutUpdate.setClassFiveNoGirlBC(pBookCheckout.getClassFiveNoGirlBC());
            pBookCheckoutUpdate.setClassFiveNoTotalBC(pBookCheckout.getClassFiveNoTotalBC());
            pBookCheckoutUpdate.setClassFiveNoBookBoyBC(pBookCheckout.getClassFiveNoBookBoyBC());
            pBookCheckoutUpdate.setClassFiveNoBookGirlBC(pBookCheckout.getClassFiveNoBookGirlBC());
            pBookCheckoutUpdate.setClassFiveNoBookTotalBC(pBookCheckout.getClassFiveNoBookTotalBC());


            pBookCheckoutUpdate.setSchoolTotalNoGirl(pBookCheckout.getSchoolTotalNoGirl());
            pBookCheckoutUpdate.setSchoolTotalNoBoy(pBookCheckout.getSchoolTotalNoBoy());
            pBookCheckoutUpdate.setSchoolTotalNoStudent(pBookCheckout.getSchoolTotalNoStudent());
            pBookCheckoutUpdate.setSchoolTotalNoGirlBC(pBookCheckout.getSchoolTotalNoGirlBC());
            pBookCheckoutUpdate.setSchoolTotalNoBoyBC(pBookCheckout.getSchoolTotalNoBoyBC());
            pBookCheckoutUpdate.setSchoolTotalNoStudentBC(pBookCheckout.getSchoolTotalNoStudentBC());
            pBookCheckoutUpdate.setSchoolTotalNoBookBC(pBookCheckout.getSchoolTotalNoBookBC());
            pBookCheckoutUpdate.setSchoolTotalNoBookGirlBC(pBookCheckout.getSchoolTotalNoBookGirlBC());
            pBookCheckoutUpdate.setSchoolTotalNoBookBoyBC(pBookCheckout.getSchoolTotalNoBookBoyBC());
            pBookCheckoutUpdate.setSchoolTotalNoBookBC(pBookCheckout.getSchoolTotalNoBookBC());


            pBookCheckoutUpdate.setIsChecked(pBookCheckout.getIsChecked());
            pBookCheckoutUpdate.setIsActive(pBookCheckout.getIsActive());
            pBookCheckoutUpdate.setIsDeleted(pBookCheckout.getIsDeleted());

            this.pBookCheckoutRepo.save(pBookCheckoutUpdate);

            return pBookCheckoutUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + pBookCheckout.getId());
        }
    }

    // Delete di PBookCheckout
    public void deletePBookCheckout(long id) {
        Optional<PBookCheckout> pBookCheckoutDB = this.pBookCheckoutRepo.findById(id);

        if (pBookCheckoutDB.isPresent()) {
            this.pBookCheckoutRepo.delete(pBookCheckoutDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
