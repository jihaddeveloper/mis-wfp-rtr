//  Author: Mohammad Jihad Hossain
//  Create Date: 17/01/2022
//  Modify Date: 17/01/2022
//  Description: Monthly book checkout  controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.LibraryObservation;
import com.jihad.rtr.wfp.model.MonthlyBookCheckout;
import com.jihad.rtr.wfp.service.LibraryObservationService;
import com.jihad.rtr.wfp.service.MonthlyBookCheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class MonthlyBookCheckoutController {

    @Autowired
    private MonthlyBookCheckoutService monthlyBookCheckoutService;
    

    // Create new Book-checkout
    @RequestMapping(value = "/book-checkouts", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<MonthlyBookCheckout> createBookCheckout(@RequestBody MonthlyBookCheckout monthlyBookCheckout) {
        return ResponseEntity.ok().body(this.monthlyBookCheckoutService.createBookCheckout(monthlyBookCheckout));
    }

    // Get all Book-checkout
    @RequestMapping(value = "/book-checkouts", method = RequestMethod.GET)
    public ResponseEntity<List<MonthlyBookCheckout>> fetchAllBookCheckouts() {
        return ResponseEntity.ok().body(monthlyBookCheckoutService.getAllBookCheckout());
    }

    // One Book-checkout with id
    @RequestMapping(value = "/book-checkouts/{id}", method = RequestMethod.GET)
    public ResponseEntity<MonthlyBookCheckout> getSingleBookCheckout(@PathVariable long id) {
        return ResponseEntity.ok().body(monthlyBookCheckoutService.getBookCheckoutById(id));
    }

//    // Update Book-checkout with PATCH
//    @RequestMapping(value = "/library-observations/update", method = RequestMethod.PATCH)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update Book-checkout with PUT
    @RequestMapping(value = "/book-checkouts/{id}", method = RequestMethod.PUT)
    public ResponseEntity<MonthlyBookCheckout> updateBookCheckout(@PathVariable long id, @RequestBody MonthlyBookCheckout monthlyBookCheckout) {
        monthlyBookCheckout.setId(id);
        return ResponseEntity.ok().body(this.monthlyBookCheckoutService.updateBookCheckout(monthlyBookCheckout));
    }

    // Delete Book-checkout
    @RequestMapping(value = "/book-checkouts/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteBookCheckout(@PathVariable long id) {
        this.monthlyBookCheckoutService.deleteBookCheckout(id);
        return HttpStatus.OK;
    }
}
