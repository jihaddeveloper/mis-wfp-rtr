//  Author: Mohammad Jihad Hossain
//  Create Date: 17/01/2022
//  Modify Date: 17/01/2022
//  Description: Monthly book checkout service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.MonthlyBookCheckout;
import com.jihad.rtr.wfp.repository.MonthlyBookCheckoutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MonthlyBookCheckoutService {

    @Autowired
    private MonthlyBookCheckoutRepo monthlyBookCheckoutRepo;

    //Create new monthly-book-checkout
    public MonthlyBookCheckout createBookCheckout(MonthlyBookCheckout monthlyBookCheckout) {
        return monthlyBookCheckoutRepo.save(monthlyBookCheckout);
    }

    //Get all monthly-book-checkout
    public List<MonthlyBookCheckout> getAllBookCheckout() {
        return monthlyBookCheckoutRepo.findAll();
    }

    //Get monthly-book-checkout with id
    public MonthlyBookCheckout getBookCheckoutById(long id) {
        Optional<MonthlyBookCheckout> bookCheckoutDB = monthlyBookCheckoutRepo.findById(id);
        if (bookCheckoutDB.isPresent()) {
            return bookCheckoutDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update monthly-book-checkout
    public MonthlyBookCheckout updateBookCheckout(MonthlyBookCheckout monthlyBookCheckout) {
        Optional<MonthlyBookCheckout> bookCheckoutDB = monthlyBookCheckoutRepo.findById(monthlyBookCheckout.getId());

        if (bookCheckoutDB.isPresent()) {
            MonthlyBookCheckout bookCheckoutUpdate = bookCheckoutDB.get();


            bookCheckoutUpdate.setId(monthlyBookCheckout.getId());
            bookCheckoutUpdate.setVisitNo(monthlyBookCheckout.getVisitNo());
            bookCheckoutUpdate.setDate(monthlyBookCheckout.getDate());
            bookCheckoutUpdate.setOffice(monthlyBookCheckout.getOffice());
            bookCheckoutUpdate.setProject(monthlyBookCheckout.getProject());
            bookCheckoutUpdate.setDistrict(monthlyBookCheckout.getDistrict());
            bookCheckoutUpdate.setUpazilla(monthlyBookCheckout.getUpazilla());
            bookCheckoutUpdate.setSchool(monthlyBookCheckout.getSchool());
            bookCheckoutUpdate.setHeadTeacher(monthlyBookCheckout.getHeadTeacher());
            bookCheckoutUpdate.setGender(monthlyBookCheckout.getGender());
            bookCheckoutUpdate.setVisitor(monthlyBookCheckout.getVisitor());
            bookCheckoutUpdate.setVisitorDesignation(monthlyBookCheckout.getVisitorDesignation());
            bookCheckoutUpdate.setVisitorOffice(monthlyBookCheckout.getVisitorOffice());
            bookCheckoutUpdate.setLf(monthlyBookCheckout.getLf());
            bookCheckoutUpdate.setLfName(monthlyBookCheckout.getLfName());
            bookCheckoutUpdate.setLpo(monthlyBookCheckout.getLpo());
            bookCheckoutUpdate.setLpoName(monthlyBookCheckout.getLpoName());
            bookCheckoutUpdate.setMonth(monthlyBookCheckout.getMonth());
            bookCheckoutUpdate.setYear(monthlyBookCheckout.getYear());
            bookCheckoutUpdate.setNote(monthlyBookCheckout.getNote());


            bookCheckoutUpdate.setPriPrimaryBoy(monthlyBookCheckout.getPriPrimaryBoy());
            bookCheckoutUpdate.setPriPrimaryGirl(monthlyBookCheckout.getPriPrimaryGirl());
            bookCheckoutUpdate.setPriPrimaryTotal(monthlyBookCheckout.getPriPrimaryTotal());
            bookCheckoutUpdate.setPriPrimaryNoBoyBC(monthlyBookCheckout.getPriPrimaryNoBoyBC());
            bookCheckoutUpdate.setPriPrimaryNoGirlBC(monthlyBookCheckout.getPriPrimaryNoGirlBC());
            bookCheckoutUpdate.setPriPrimaryNoTotalBC(monthlyBookCheckout.getPriPrimaryNoTotalBC());
            bookCheckoutUpdate.setPriPrimaryNoBookBoyBC(monthlyBookCheckout.getPriPrimaryNoBookBoyBC());
            bookCheckoutUpdate.setPriPrimaryNoBookGirlBC(monthlyBookCheckout.getPriPrimaryNoBookGirlBC());
            bookCheckoutUpdate.setPriPrimaryNoBookTotalBC(monthlyBookCheckout.getPriPrimaryNoBookTotalBC());
            bookCheckoutUpdate.setPriPrimarySpBoy(monthlyBookCheckout.getPriPrimarySpBoy());
            bookCheckoutUpdate.setPriPrimarySpGirl(monthlyBookCheckout.getPriPrimarySpGirl());
            bookCheckoutUpdate.setPriPrimarySpTotal(monthlyBookCheckout.getPriPrimarySpTotal());
            bookCheckoutUpdate.setPriPrimaryNoSpBoyBC(monthlyBookCheckout.getPriPrimaryNoSpBoyBC());
            bookCheckoutUpdate.setPriPrimaryNoSpGirlBC(monthlyBookCheckout.getPriPrimaryNoSpGirlBC());
            bookCheckoutUpdate.setPriPrimaryNoSpTotalBC(monthlyBookCheckout.getPriPrimaryNoSpTotalBC());
            bookCheckoutUpdate.setPriPrimaryNoBookSpBoyBC(monthlyBookCheckout.getPriPrimaryNoBookSpBoyBC());
            bookCheckoutUpdate.setPriPrimaryNoBookSpGirlBC(monthlyBookCheckout.getPriPrimaryNoBookSpGirlBC());
            bookCheckoutUpdate.setPriPrimaryNoBookSpTotalBC(monthlyBookCheckout.getPriPrimaryNoBookSpTotalBC());

            bookCheckoutUpdate.setClassOneBoy(monthlyBookCheckout.getClassOneBoy());
            bookCheckoutUpdate.setClassOneGirl(monthlyBookCheckout.getClassOneGirl());
            bookCheckoutUpdate.setClassOneTotal(monthlyBookCheckout.getClassOneTotal());
            bookCheckoutUpdate.setClassOneNoBoyBC(monthlyBookCheckout.getClassOneNoBoyBC());
            bookCheckoutUpdate.setClassOneNoGirlBC(monthlyBookCheckout.getClassOneNoGirlBC());
            bookCheckoutUpdate.setClassOneNoTotalBC(monthlyBookCheckout.getClassOneNoTotalBC());
            bookCheckoutUpdate.setClassOneNoBookBoyBC(monthlyBookCheckout.getClassOneNoBookBoyBC());
            bookCheckoutUpdate.setClassOneNoBookGirlBC(monthlyBookCheckout.getClassOneNoBookGirlBC());
            bookCheckoutUpdate.setClassOneNoBookTotalBC(monthlyBookCheckout.getClassOneNoBookTotalBC());
            bookCheckoutUpdate.setClassOneSpBoy(monthlyBookCheckout.getClassOneSpBoy());
            bookCheckoutUpdate.setClassOneSpGirl(monthlyBookCheckout.getClassOneSpGirl());
            bookCheckoutUpdate.setClassOneSpTotal(monthlyBookCheckout.getClassOneSpTotal());
            bookCheckoutUpdate.setClassOneNoSpBoyBC(monthlyBookCheckout.getClassOneNoSpBoyBC());
            bookCheckoutUpdate.setClassOneNoSpGirlBC(monthlyBookCheckout.getClassOneNoSpGirlBC());
            bookCheckoutUpdate.setClassOneNoSpTotalBC(monthlyBookCheckout.getClassOneNoSpTotalBC());
            bookCheckoutUpdate.setClassOneNoBookSpBoyBC(monthlyBookCheckout.getClassOneNoBookSpBoyBC());
            bookCheckoutUpdate.setClassOneNoBookSpGirlBC(monthlyBookCheckout.getClassOneNoBookSpGirlBC());
            bookCheckoutUpdate.setClassOneNoBookSpTotalBC(monthlyBookCheckout.getClassOneNoBookSpTotalBC());

            bookCheckoutUpdate.setClassTwoBoy(monthlyBookCheckout.getClassTwoBoy());
            bookCheckoutUpdate.setClassTwoGirl(monthlyBookCheckout.getClassTwoGirl());
            bookCheckoutUpdate.setClassTwoTotal(monthlyBookCheckout.getClassTwoTotal());
            bookCheckoutUpdate.setClassTwoNoBoyBC(monthlyBookCheckout.getClassTwoNoBoyBC());
            bookCheckoutUpdate.setClassTwoNoGirlBC(monthlyBookCheckout.getClassTwoNoGirlBC());
            bookCheckoutUpdate.setClassTwoNoTotalBC(monthlyBookCheckout.getClassTwoNoTotalBC());
            bookCheckoutUpdate.setClassTwoNoBookBoyBC(monthlyBookCheckout.getClassTwoNoBookBoyBC());
            bookCheckoutUpdate.setClassTwoNoBookGirlBC(monthlyBookCheckout.getClassTwoNoBookGirlBC());
            bookCheckoutUpdate.setClassTwoNoBookTotalBC(monthlyBookCheckout.getClassTwoNoBookTotalBC());
            bookCheckoutUpdate.setClassTwoSpBoy(monthlyBookCheckout.getClassTwoSpBoy());
            bookCheckoutUpdate.setClassTwoSpGirl(monthlyBookCheckout.getClassTwoSpGirl());
            bookCheckoutUpdate.setClassTwoSpTotal(monthlyBookCheckout.getClassTwoSpTotal());
            bookCheckoutUpdate.setClassTwoNoSpBoyBC(monthlyBookCheckout.getClassTwoNoSpBoyBC());
            bookCheckoutUpdate.setClassTwoNoSpGirlBC(monthlyBookCheckout.getClassTwoNoSpGirlBC());
            bookCheckoutUpdate.setClassTwoNoSpTotalBC(monthlyBookCheckout.getClassTwoNoSpTotalBC());
            bookCheckoutUpdate.setClassTwoNoBookSpBoyBC(monthlyBookCheckout.getClassTwoNoBookSpBoyBC());
            bookCheckoutUpdate.setClassTwoNoBookSpGirlBC(monthlyBookCheckout.getClassTwoNoBookSpGirlBC());
            bookCheckoutUpdate.setClassTwoNoBookSpTotalBC(monthlyBookCheckout.getClassTwoNoBookSpTotalBC());

            bookCheckoutUpdate.setClassThreeBoy(monthlyBookCheckout.getClassThreeBoy());
            bookCheckoutUpdate.setClassThreeGirl(monthlyBookCheckout.getClassThreeGirl());
            bookCheckoutUpdate.setClassThreeTotal(monthlyBookCheckout.getClassThreeTotal());
            bookCheckoutUpdate.setClassThreeNoBoyBC(monthlyBookCheckout.getClassThreeNoBoyBC());
            bookCheckoutUpdate.setClassThreeNoGirlBC(monthlyBookCheckout.getClassThreeNoGirlBC());
            bookCheckoutUpdate.setClassThreeNoTotalBC(monthlyBookCheckout.getClassThreeNoTotalBC());
            bookCheckoutUpdate.setClassThreeNoBookBoyBC(monthlyBookCheckout.getClassThreeNoBookBoyBC());
            bookCheckoutUpdate.setClassThreeNoBookGirlBC(monthlyBookCheckout.getClassThreeNoBookGirlBC());
            bookCheckoutUpdate.setClassThreeNoBookTotalBC(monthlyBookCheckout.getClassThreeNoBookTotalBC());
            bookCheckoutUpdate.setClassThreeSpBoy(monthlyBookCheckout.getClassThreeSpBoy());
            bookCheckoutUpdate.setClassThreeSpGirl(monthlyBookCheckout.getClassThreeSpGirl());
            bookCheckoutUpdate.setClassThreeSpTotal(monthlyBookCheckout.getClassThreeSpTotal());
            bookCheckoutUpdate.setClassThreeNoSpBoyBC(monthlyBookCheckout.getClassThreeNoSpBoyBC());
            bookCheckoutUpdate.setClassThreeNoSpGirlBC(monthlyBookCheckout.getClassThreeNoSpGirlBC());
            bookCheckoutUpdate.setClassThreeNoSpTotalBC(monthlyBookCheckout.getClassThreeNoSpTotalBC());
            bookCheckoutUpdate.setClassThreeNoBookSpBoyBC(monthlyBookCheckout.getClassThreeNoBookSpBoyBC());
            bookCheckoutUpdate.setClassThreeNoBookSpGirlBC(monthlyBookCheckout.getClassThreeNoBookSpGirlBC());
            bookCheckoutUpdate.setClassThreeNoBookSpTotalBC(monthlyBookCheckout.getClassThreeNoBookSpTotalBC());

            bookCheckoutUpdate.setClassFourBoy(monthlyBookCheckout.getClassFourBoy());
            bookCheckoutUpdate.setClassFourGirl(monthlyBookCheckout.getClassFourGirl());
            bookCheckoutUpdate.setClassFourTotal(monthlyBookCheckout.getClassFourTotal());
            bookCheckoutUpdate.setClassFourNoBoyBC(monthlyBookCheckout.getClassFourNoBoyBC());
            bookCheckoutUpdate.setClassFourNoGirlBC(monthlyBookCheckout.getClassFourNoGirlBC());
            bookCheckoutUpdate.setClassFourNoTotalBC(monthlyBookCheckout.getClassFourNoTotalBC());
            bookCheckoutUpdate.setClassFourNoBookBoyBC(monthlyBookCheckout.getClassFourNoBookBoyBC());
            bookCheckoutUpdate.setClassFourNoBookGirlBC(monthlyBookCheckout.getClassFourNoBookGirlBC());
            bookCheckoutUpdate.setClassFourNoBookTotalBC(monthlyBookCheckout.getClassFourNoBookTotalBC());
            bookCheckoutUpdate.setClassFourSpBoy(monthlyBookCheckout.getClassFourSpBoy());
            bookCheckoutUpdate.setClassFourSpGirl(monthlyBookCheckout.getClassFourSpGirl());
            bookCheckoutUpdate.setClassFourSpTotal(monthlyBookCheckout.getClassFourSpTotal());
            bookCheckoutUpdate.setClassFourNoSpBoyBC(monthlyBookCheckout.getClassFourNoSpBoyBC());
            bookCheckoutUpdate.setClassFourNoSpGirlBC(monthlyBookCheckout.getClassFourNoSpGirlBC());
            bookCheckoutUpdate.setClassFourNoSpTotalBC(monthlyBookCheckout.getClassFourNoSpTotalBC());
            bookCheckoutUpdate.setClassFourNoBookSpBoyBC(monthlyBookCheckout.getClassFourNoBookSpBoyBC());
            bookCheckoutUpdate.setClassFourNoBookSpGirlBC(monthlyBookCheckout.getClassFourNoBookSpGirlBC());
            bookCheckoutUpdate.setClassFourNoBookSpTotalBC(monthlyBookCheckout.getClassFourNoBookSpTotalBC());

            bookCheckoutUpdate.setClassFiveBoy(monthlyBookCheckout.getClassFiveBoy());
            bookCheckoutUpdate.setClassFiveGirl(monthlyBookCheckout.getClassFiveGirl());
            bookCheckoutUpdate.setClassFiveTotal(monthlyBookCheckout.getClassFiveTotal());
            bookCheckoutUpdate.setClassFiveNoBoyBC(monthlyBookCheckout.getClassFiveNoBoyBC());
            bookCheckoutUpdate.setClassFiveNoGirlBC(monthlyBookCheckout.getClassFiveNoGirlBC());
            bookCheckoutUpdate.setClassFiveNoTotalBC(monthlyBookCheckout.getClassFiveNoTotalBC());
            bookCheckoutUpdate.setClassFiveNoBookBoyBC(monthlyBookCheckout.getClassFiveNoBookBoyBC());
            bookCheckoutUpdate.setClassFiveNoBookGirlBC(monthlyBookCheckout.getClassFiveNoBookGirlBC());
            bookCheckoutUpdate.setClassFiveNoBookTotalBC(monthlyBookCheckout.getClassFiveNoBookTotalBC());
            bookCheckoutUpdate.setClassFiveSpBoy(monthlyBookCheckout.getClassFiveSpBoy());
            bookCheckoutUpdate.setClassFiveSpGirl(monthlyBookCheckout.getClassFiveSpGirl());
            bookCheckoutUpdate.setClassFiveSpTotal(monthlyBookCheckout.getClassFiveSpTotal());
            bookCheckoutUpdate.setClassFiveNoSpBoyBC(monthlyBookCheckout.getClassFiveNoSpBoyBC());
            bookCheckoutUpdate.setClassFiveNoSpGirlBC(monthlyBookCheckout.getClassFiveNoSpGirlBC());
            bookCheckoutUpdate.setClassFiveNoSpTotalBC(monthlyBookCheckout.getClassFiveNoSpTotalBC());
            bookCheckoutUpdate.setClassFiveNoBookSpBoyBC(monthlyBookCheckout.getClassFiveNoBookSpBoyBC());
            bookCheckoutUpdate.setClassFiveNoBookSpGirlBC(monthlyBookCheckout.getClassFiveNoBookSpGirlBC());
            bookCheckoutUpdate.setClassFiveNoBookSpTotalBC(monthlyBookCheckout.getClassFiveNoBookSpTotalBC());

            bookCheckoutUpdate.setPriPrimaryNoBoyBCIn(monthlyBookCheckout.getPriPrimaryNoBoyBCIn());
            bookCheckoutUpdate.setPriPrimaryNoGirlBCIn(monthlyBookCheckout.getPriPrimaryNoGirlBCIn());
            bookCheckoutUpdate.setPriPrimaryNoTotalBCIn(monthlyBookCheckout.getPriPrimaryNoTotalBCIn());
            bookCheckoutUpdate.setPriPrimaryNoBookBoyBCIn(monthlyBookCheckout.getPriPrimaryNoBookBoyBCIn());
            bookCheckoutUpdate.setPriPrimaryNoBookGirlBCIn(monthlyBookCheckout.getPriPrimaryNoBookGirlBCIn());
            bookCheckoutUpdate.setPriPrimaryNoBookTotalBCIn(monthlyBookCheckout.getPriPrimaryNoBookTotalBCIn());
            bookCheckoutUpdate.setPriPrimaryNoSpBoyBCIn(monthlyBookCheckout.getPriPrimaryNoSpBoyBCIn());
            bookCheckoutUpdate.setPriPrimaryNoSpGirlBCIn(monthlyBookCheckout.getPriPrimaryNoSpGirlBCIn());
            bookCheckoutUpdate.setPriPrimaryNoSpTotalBCIn(monthlyBookCheckout.getPriPrimaryNoSpTotalBCIn());
            bookCheckoutUpdate.setPriPrimaryNoBookSpBoyBCIn(monthlyBookCheckout.getPriPrimaryNoBookSpBoyBCIn());
            bookCheckoutUpdate.setPriPrimaryNoBookSpGirlBCIn(monthlyBookCheckout.getPriPrimaryNoBookSpGirlBCIn());
            bookCheckoutUpdate.setPriPrimaryNoBookSpTotalBCIn(monthlyBookCheckout.getPriPrimaryNoBookSpTotalBCIn());

            bookCheckoutUpdate.setClassOneNoBoyBCIn(monthlyBookCheckout.getClassOneNoBoyBCIn());
            bookCheckoutUpdate.setClassOneNoGirlBCIn(monthlyBookCheckout.getClassOneNoGirlBCIn());
            bookCheckoutUpdate.setClassOneNoTotalBCIn(monthlyBookCheckout.getClassOneNoTotalBCIn());
            bookCheckoutUpdate.setClassOneNoBookBoyBCIn(monthlyBookCheckout.getClassOneNoBookBoyBCIn());
            bookCheckoutUpdate.setClassOneNoBookGirlBCIn(monthlyBookCheckout.getClassOneNoBookGirlBCIn());
            bookCheckoutUpdate.setClassOneNoBookTotalBCIn(monthlyBookCheckout.getClassOneNoBookTotalBCIn());
            bookCheckoutUpdate.setClassOneNoSpBoyBCIn(monthlyBookCheckout.getClassOneNoSpBoyBCIn());
            bookCheckoutUpdate.setClassOneNoSpGirlBCIn(monthlyBookCheckout.getClassOneNoSpGirlBCIn());
            bookCheckoutUpdate.setClassOneNoSpTotalBCIn(monthlyBookCheckout.getClassOneNoSpTotalBCIn());
            bookCheckoutUpdate.setClassOneNoBookSpBoyBCIn(monthlyBookCheckout.getClassOneNoBookSpBoyBCIn());
            bookCheckoutUpdate.setClassOneNoBookSpGirlBCIn(monthlyBookCheckout.getClassOneNoBookSpGirlBCIn());
            bookCheckoutUpdate.setClassOneNoBookSpTotalBCIn(monthlyBookCheckout.getClassOneNoBookSpTotalBCIn());

            bookCheckoutUpdate.setClassTwoNoBoyBCIn(monthlyBookCheckout.getClassTwoNoBoyBCIn());
            bookCheckoutUpdate.setClassTwoNoGirlBCIn(monthlyBookCheckout.getClassTwoNoGirlBCIn());
            bookCheckoutUpdate.setClassTwoNoTotalBCIn(monthlyBookCheckout.getClassTwoNoTotalBCIn());
            bookCheckoutUpdate.setClassTwoNoBookBoyBCIn(monthlyBookCheckout.getClassTwoNoBookBoyBCIn());
            bookCheckoutUpdate.setClassTwoNoBookGirlBCIn(monthlyBookCheckout.getClassTwoNoBookGirlBCIn());
            bookCheckoutUpdate.setClassTwoNoBookTotalBCIn(monthlyBookCheckout.getClassTwoNoBookTotalBCIn());
            bookCheckoutUpdate.setClassTwoNoSpBoyBCIn(monthlyBookCheckout.getClassTwoNoSpBoyBCIn());
            bookCheckoutUpdate.setClassTwoNoSpGirlBCIn(monthlyBookCheckout.getClassTwoNoSpGirlBCIn());
            bookCheckoutUpdate.setClassTwoNoSpTotalBCIn(monthlyBookCheckout.getClassTwoNoSpTotalBCIn());
            bookCheckoutUpdate.setClassTwoNoBookSpBoyBCIn(monthlyBookCheckout.getClassTwoNoBookSpBoyBCIn());
            bookCheckoutUpdate.setClassTwoNoBookSpGirlBCIn(monthlyBookCheckout.getClassTwoNoBookSpGirlBCIn());
            bookCheckoutUpdate.setClassTwoNoBookSpTotalBCIn(monthlyBookCheckout.getClassTwoNoBookSpTotalBCIn());

            bookCheckoutUpdate.setClassThreeNoBoyBCIn(monthlyBookCheckout.getClassThreeNoBoyBCIn());
            bookCheckoutUpdate.setClassThreeNoGirlBCIn(monthlyBookCheckout.getClassThreeNoGirlBCIn());
            bookCheckoutUpdate.setClassThreeNoTotalBCIn(monthlyBookCheckout.getClassThreeNoTotalBCIn());
            bookCheckoutUpdate.setClassThreeNoBookBoyBCIn(monthlyBookCheckout.getClassThreeNoBookBoyBCIn());
            bookCheckoutUpdate.setClassThreeNoBookGirlBCIn(monthlyBookCheckout.getClassThreeNoBookGirlBCIn());
            bookCheckoutUpdate.setClassThreeNoBookTotalBCIn(monthlyBookCheckout.getClassThreeNoBookTotalBCIn());
            bookCheckoutUpdate.setClassThreeNoSpBoyBCIn(monthlyBookCheckout.getClassThreeNoSpBoyBCIn());
            bookCheckoutUpdate.setClassThreeNoSpGirlBCIn(monthlyBookCheckout.getClassThreeNoSpGirlBCIn());
            bookCheckoutUpdate.setClassThreeNoSpTotalBCIn(monthlyBookCheckout.getClassThreeNoSpTotalBCIn());
            bookCheckoutUpdate.setClassThreeNoBookSpBoyBCIn(monthlyBookCheckout.getClassThreeNoBookSpBoyBCIn());
            bookCheckoutUpdate.setClassThreeNoBookSpGirlBCIn(monthlyBookCheckout.getClassThreeNoBookSpGirlBCIn());
            bookCheckoutUpdate.setClassThreeNoBookSpTotalBCIn(monthlyBookCheckout.getClassThreeNoBookSpTotalBCIn());

            bookCheckoutUpdate.setClassFourNoBoyBCIn(monthlyBookCheckout.getClassFourNoBoyBCIn());
            bookCheckoutUpdate.setClassFourNoGirlBCIn(monthlyBookCheckout.getClassFourNoGirlBCIn());
            bookCheckoutUpdate.setClassFourNoTotalBCIn(monthlyBookCheckout.getClassFourNoTotalBCIn());
            bookCheckoutUpdate.setClassFourNoBookBoyBCIn(monthlyBookCheckout.getClassFourNoBookBoyBCIn());
            bookCheckoutUpdate.setClassFourNoBookGirlBCIn(monthlyBookCheckout.getClassFourNoBookGirlBCIn());
            bookCheckoutUpdate.setClassFourNoBookTotalBCIn(monthlyBookCheckout.getClassFourNoBookTotalBCIn());
            bookCheckoutUpdate.setClassFourNoSpBoyBCIn(monthlyBookCheckout.getClassFourNoSpBoyBCIn());
            bookCheckoutUpdate.setClassFourNoSpGirlBCIn(monthlyBookCheckout.getClassFourNoSpGirlBCIn());
            bookCheckoutUpdate.setClassFourNoSpTotalBCIn(monthlyBookCheckout.getClassFourNoSpTotalBCIn());
            bookCheckoutUpdate.setClassFourNoBookSpBoyBCIn(monthlyBookCheckout.getClassFourNoBookSpBoyBCIn());
            bookCheckoutUpdate.setClassFourNoBookSpGirlBCIn(monthlyBookCheckout.getClassFourNoBookSpGirlBCIn());
            bookCheckoutUpdate.setClassFourNoBookSpTotalBCIn(monthlyBookCheckout.getClassFourNoBookSpTotalBCIn());

            bookCheckoutUpdate.setClassFiveNoBoyBCIn(monthlyBookCheckout.getClassFiveNoBoyBCIn());
            bookCheckoutUpdate.setClassFiveNoGirlBCIn(monthlyBookCheckout.getClassFiveNoGirlBCIn());
            bookCheckoutUpdate.setClassFiveNoTotalBCIn(monthlyBookCheckout.getClassFiveNoTotalBCIn());
            bookCheckoutUpdate.setClassFiveNoBookBoyBCIn(monthlyBookCheckout.getClassFiveNoBookBoyBCIn());
            bookCheckoutUpdate.setClassFiveNoBookGirlBCIn(monthlyBookCheckout.getClassFiveNoBookGirlBCIn());
            bookCheckoutUpdate.setClassFiveNoBookTotalBCIn(monthlyBookCheckout.getClassFiveNoBookTotalBCIn());
            bookCheckoutUpdate.setClassFiveNoSpBoyBCIn(monthlyBookCheckout.getClassFiveNoSpBoyBCIn());
            bookCheckoutUpdate.setClassFiveNoSpGirlBCIn(monthlyBookCheckout.getClassFiveNoSpGirlBCIn());
            bookCheckoutUpdate.setClassFiveNoSpTotalBCIn(monthlyBookCheckout.getClassFiveNoSpTotalBCIn());
            bookCheckoutUpdate.setClassFiveNoBookSpBoyBCIn(monthlyBookCheckout.getClassFiveNoBookSpBoyBCIn());
            bookCheckoutUpdate.setClassFiveNoBookSpGirlBCIn(monthlyBookCheckout.getClassFiveNoBookSpGirlBCIn());
            bookCheckoutUpdate.setClassFiveNoBookSpTotalBCIn(monthlyBookCheckout.getClassFiveNoBookSpTotalBCIn());

            bookCheckoutUpdate.setSchoolTotalNoGirl(monthlyBookCheckout.getSchoolTotalNoGirl());
            bookCheckoutUpdate.setSchoolTotalNoBoy(monthlyBookCheckout.getSchoolTotalNoBoy());
            bookCheckoutUpdate.setSchoolTotalNoStudent(monthlyBookCheckout.getSchoolTotalNoStudent());
            bookCheckoutUpdate.setSchoolTotalNoGirlBC(monthlyBookCheckout.getSchoolTotalNoGirlBC());
            bookCheckoutUpdate.setSchoolTotalNoBoyBC(monthlyBookCheckout.getSchoolTotalNoBoyBC());
            bookCheckoutUpdate.setSchoolTotalNoStudentBC(monthlyBookCheckout.getSchoolTotalNoStudentBC());
            bookCheckoutUpdate.setSchoolTotalNoBookBC(monthlyBookCheckout.getSchoolTotalNoBookBC());
            bookCheckoutUpdate.setSchoolTotalNoStudentBCIn(monthlyBookCheckout.getSchoolTotalNoStudentBCIn());
            bookCheckoutUpdate.setSchoolTotalNoBookBCIn(monthlyBookCheckout.getSchoolTotalNoBookBCIn());

            bookCheckoutUpdate.setSchoolTotalNoSpStudent(monthlyBookCheckout.getSchoolTotalNoSpStudent());
            bookCheckoutUpdate.setSchoolTotalNoSpStudentBC(monthlyBookCheckout.getSchoolTotalNoSpStudentBC());
            bookCheckoutUpdate.setSchoolTotalNoSpBookBC(monthlyBookCheckout.getSchoolTotalNoSpBookBC());
            bookCheckoutUpdate.setSchoolTotalNoSpStudentBCIn(monthlyBookCheckout.getSchoolTotalNoSpStudentBCIn());
            bookCheckoutUpdate.setSchoolTotalNoSpBookBCIn(monthlyBookCheckout.getSchoolTotalNoSpBookBCIn());


            bookCheckoutUpdate.setIsActive(monthlyBookCheckout.getIsActive());
            bookCheckoutUpdate.setIsDeleted(monthlyBookCheckout.getIsDeleted());

            this.monthlyBookCheckoutRepo.save(bookCheckoutUpdate);

            return bookCheckoutUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + monthlyBookCheckout.getId());
        }
    }

    //Delete monthly-book-checkout
    public void deleteBookCheckout(long id) {
        Optional<MonthlyBookCheckout> bookCheckoutDB = this.monthlyBookCheckoutRepo.findById(id);

        if (bookCheckoutDB.isPresent()) {
            this.monthlyBookCheckoutRepo.delete(bookCheckoutDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
