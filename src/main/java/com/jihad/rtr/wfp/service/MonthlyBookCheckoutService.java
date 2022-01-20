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
    public MonthlyBookCheckout createBookCheckout(MonthlyBookCheckout monthlyBookCheckout){
        return monthlyBookCheckoutRepo.save(monthlyBookCheckout);
    }

    //Get all monthly-book-checkout
    public List<MonthlyBookCheckout> getAllBookCheckout(){
        return monthlyBookCheckoutRepo.findAll();
    }

    //Get monthly-book-checkout with id
    public MonthlyBookCheckout getBookCheckoutById(long id){
        Optional<MonthlyBookCheckout> bookCheckoutDB = monthlyBookCheckoutRepo.findById(id);
        if(bookCheckoutDB.isPresent()){
            return bookCheckoutDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }

    }

    //Update monthly-book-checkout
    public MonthlyBookCheckout updateBookCheckout(MonthlyBookCheckout monthlyBookCheckout){
        Optional<MonthlyBookCheckout> bookCheckoutDB = monthlyBookCheckoutRepo.findById(monthlyBookCheckout.getId());

        if(bookCheckoutDB.isPresent()){
            MonthlyBookCheckout bookCheckoutUpdate = bookCheckoutDB.get();
            bookCheckoutUpdate.setId(monthlyBookCheckout.getId());
            bookCheckoutUpdate.setDate(monthlyBookCheckout.getDate());

            this.monthlyBookCheckoutRepo.save(bookCheckoutUpdate);

            return bookCheckoutUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ monthlyBookCheckout.getId());
        }
    }

    //Delete monthly-book-checkout
    public void deleteBookCheckout(long id){
        Optional<MonthlyBookCheckout> bookCheckoutDB = this.monthlyBookCheckoutRepo.findById(id);

        if(bookCheckoutDB.isPresent()){
            this.monthlyBookCheckoutRepo.delete(bookCheckoutDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
