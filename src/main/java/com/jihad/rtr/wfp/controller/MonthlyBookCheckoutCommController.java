//  Author: Mohammad Jihad Hossain
//  Create Date: 09/01/2022
//  Modify Date: 12/01/2022
//  Description: Division controller file


package com.jihad.rtr.wfp.controller;


import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.MonthlyBookCheckoutComm;
import com.jihad.rtr.wfp.service.DivisionService;
import com.jihad.rtr.wfp.service.MonthlyBookCheckoutCommService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class MonthlyBookCheckoutCommController {

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private MonthlyBookCheckoutCommService monthlyBookCheckoutCommService;

    //Create new MonthlyBookCheckoutComm
    @RequestMapping(value = "/book-checkout-community", method = RequestMethod.POST)
    public ResponseEntity<MonthlyBookCheckoutComm> createBookCheckoutComm(@RequestBody MonthlyBookCheckoutComm monthlyBookCheckoutComm) {
        return ResponseEntity.ok().body(this.monthlyBookCheckoutCommService.createMonthlyBookCheckoutComm(monthlyBookCheckoutComm));
    }

    //Get all MonthlyBookCheckoutComm
    @RequestMapping(value = "/book-checkout-community", method = RequestMethod.GET)
    public ResponseEntity<List<MonthlyBookCheckoutComm>> fetchAllBookCheckoutComm() {
        return ResponseEntity.ok().body(this.monthlyBookCheckoutCommService.getAllMonthlyBookCheckoutComm());
    }

    //One MonthlyBookCheckoutComm with id
    @RequestMapping(value = "/book-checkout-community/{id}", method = RequestMethod.GET)
    public ResponseEntity<MonthlyBookCheckoutComm> getSingleBookCheckoutComm(@PathVariable long id) {
        return ResponseEntity.ok().body(this.monthlyBookCheckoutCommService.getMonthlyBookCheckoutCommById(id));
    }

    //Update MonthlyBookCheckoutComm
    @RequestMapping(value = "/book-checkout-community/{id}", method = RequestMethod.PUT)
    public ResponseEntity<MonthlyBookCheckoutComm> updateBookCheckoutComm(@PathVariable long id, @RequestBody MonthlyBookCheckoutComm monthlyBookCheckoutComm) {
        monthlyBookCheckoutComm.setId(id);
        return ResponseEntity.ok().body(this.monthlyBookCheckoutCommService.updateMonthlyBookCheckoutComm(monthlyBookCheckoutComm));
    }

    //Delete MonthlyBookCheckoutComm
    @RequestMapping(value = "/book-checkout-community/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteBookCheckoutComm(@PathVariable long id) {
        this.monthlyBookCheckoutCommService.deleteMonthlyBookCheckoutComm(id);
        return HttpStatus.OK;
    }
}
