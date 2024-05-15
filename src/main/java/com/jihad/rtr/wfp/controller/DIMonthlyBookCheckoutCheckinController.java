//  Author: Mohammad Jihad Hossain
//  Create Date: 15/05/2024
//  Modify Date: 15/05/2024
//  Description: DI Monthly book checkout  controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.DIBookCheckoutCheckin;
import com.jihad.rtr.wfp.model.MonthlyBookCheckout;
import com.jihad.rtr.wfp.service.DIMonthlyBookCheckoutCheckinService;
import com.jihad.rtr.wfp.service.MonthlyBookCheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class DIMonthlyBookCheckoutCheckinController {

    @Autowired
    private DIMonthlyBookCheckoutCheckinService diMonthlyBookCheckoutCheckinService;


    // Create new DI-Book-checkout
    @RequestMapping(value = "/di-book-checkouts", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<DIBookCheckoutCheckin> createBookCheckout(@RequestBody DIBookCheckoutCheckin monthlyBookCheckout) {
        return ResponseEntity.ok().body(this.diMonthlyBookCheckoutCheckinService.createBookCheckout(monthlyBookCheckout));
    }

    // Get all DI-Book-checkout
    @RequestMapping(value = "/di-book-checkouts", method = RequestMethod.GET)
    public ResponseEntity<List<DIBookCheckoutCheckin>> fetchAllBookCheckouts() {
        return ResponseEntity.ok().body(diMonthlyBookCheckoutCheckinService.getAllBookCheckout());
    }

    // One DI-Book-checkout with id
    @RequestMapping(value = "/di-book-checkouts/{id}", method = RequestMethod.GET)
    public ResponseEntity<DIBookCheckoutCheckin> getSingleBookCheckout(@PathVariable long id) {
        return ResponseEntity.ok().body(diMonthlyBookCheckoutCheckinService.getBookCheckoutById(id));
    }

//    // Update DI-Book-checkout with PUT
//    @RequestMapping(value = "/di-book-checkouts/update", method = RequestMethod.PUT)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update DI-Book-checkout with PATCH
    @RequestMapping(value = "/di-book-checkouts/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DIBookCheckoutCheckin> updateBookCheckout(@PathVariable long id, @RequestBody DIBookCheckoutCheckin monthlyBookCheckout) {
        monthlyBookCheckout.setId(id);
        return ResponseEntity.ok().body(this.diMonthlyBookCheckoutCheckinService.updateBookCheckout(monthlyBookCheckout));
    }

    // Delete DI-Book-checkout
    @RequestMapping(value = "/di-book-checkouts/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteBookCheckout(@PathVariable long id) {
        this.diMonthlyBookCheckoutCheckinService.deleteBookCheckout(id);
        return HttpStatus.OK;
    }
}
