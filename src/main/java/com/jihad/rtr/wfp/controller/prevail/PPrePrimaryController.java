//  Author: Mohammad Jihad Hossain
//  Create Date: 05/01/2026
//  Modify Date: 05/01/2026
//  Description: PPrePrimaryController file

package com.jihad.rtr.wfp.controller.prevail;

import com.jihad.rtr.wfp.model.prevail.PPrePrimary;
import com.jihad.rtr.wfp.model.prevail.PPrePrimary;
import com.jihad.rtr.wfp.service.prevail.PPrePrimaryService;
import com.jihad.rtr.wfp.service.prevail.PPrePrimaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PPrePrimaryController {

    @Autowired
    private PPrePrimaryService pPrePrimaryService;


    // Create new PPrePrimary
    @RequestMapping(value = "/p-preprimary", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<PPrePrimary> createPPrePrimary(@RequestBody PPrePrimary pPrePrimary) {
        return ResponseEntity.ok().body(this.pPrePrimaryService.createPPrePrimary(pPrePrimary));
    }

    // Get all PPrePrimary
    @RequestMapping(value = "/p-preprimary", method = RequestMethod.GET)
    public ResponseEntity<List<PPrePrimary>> fetchAllPPrePrimary() {
        return ResponseEntity.ok().body(this.pPrePrimaryService.getAllPPrePrimary());
    }

    // One PPrePrimary with id
    @RequestMapping(value = "/p-preprimary/{id}", method = RequestMethod.GET)
    public ResponseEntity<PPrePrimary> getSinglePPrePrimary(@PathVariable long id) {
        return ResponseEntity.ok().body(this.pPrePrimaryService.getPPrePrimaryById(id));
    }

//    // Update PPrePrimary with PUT
//    @RequestMapping(value = "/di-book-checkouts/update", method = RequestMethod.PUT)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update PPrePrimary with PATCH
    @RequestMapping(value = "/p-preprimary/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PPrePrimary> updatePPrePrimary(@PathVariable long id, @RequestBody PPrePrimary pPrePrimary) {
        pPrePrimary.setId(id);
        return ResponseEntity.ok().body(this.pPrePrimaryService.updatePPrePrimary(pPrePrimary));
    }

    // Delete PPrePrimary
    @RequestMapping(value = "/p-preprimary/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePPrePrimary(@PathVariable long id) {
        this.pPrePrimaryService.deletePPrePrimary(id);
        return HttpStatus.OK;
    }
}
