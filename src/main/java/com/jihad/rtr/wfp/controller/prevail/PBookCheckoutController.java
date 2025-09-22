//  Author: Mohammad Jihad Hossain
//  Create Date: 11/09/2025
//  Modify Date: 11/09/2025
//  Description: pBookCheckoutController file

package com.jihad.rtr.wfp.controller.prevail;


import com.jihad.rtr.wfp.model.prevail.PBookCheckout;
import com.jihad.rtr.wfp.service.prevail.PBookCheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PBookCheckoutController {

    @Autowired
    private PBookCheckoutService pBookCheckoutService;


    // Create new PBookCheckout
    @RequestMapping(value = "/p-book-checkout", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<PBookCheckout> createBookCheckout(@RequestBody PBookCheckout pBookCheckout) {
        return ResponseEntity.ok().body(this.pBookCheckoutService.createPBookCheckout(pBookCheckout));
    }

    // Get all PBookCheckout
    @RequestMapping(value = "/p-book-checkout", method = RequestMethod.GET)
    public ResponseEntity<List<PBookCheckout>> fetchAllPBookCheckout() {
        return ResponseEntity.ok().body(this.pBookCheckoutService.getAllPBookCheckout());
    }

    // One PBookCheckout with id
    @RequestMapping(value = "/p-book-checkout/{id}", method = RequestMethod.GET)
    public ResponseEntity<PBookCheckout> getSingleBookCheckout(@PathVariable long id) {
        return ResponseEntity.ok().body(this.pBookCheckoutService.getPBookCheckoutById(id));
    }

//    // Update PBookCheckout with PUT
//    @RequestMapping(value = "/di-book-checkouts/update", method = RequestMethod.PUT)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update PBookCheckout with PATCH
    @RequestMapping(value = "/p-book-checkout/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PBookCheckout> updatePBookCheckout(@PathVariable long id, @RequestBody PBookCheckout pBookCheckout) {
        pBookCheckout.setId(id);
        return ResponseEntity.ok().body(this.pBookCheckoutService.updatePBookCheckout(pBookCheckout));
    }

    // Delete PBookCheckout
    @RequestMapping(value = "/p-book-checkout/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePBookCheckout(@PathVariable long id) {
        this.pBookCheckoutService.deletePBookCheckout(id);
        return HttpStatus.OK;
    }
}
