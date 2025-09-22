//  Author: Mohammad Jihad Hossain
//  Create Date: 11/09/2025
//  Modify Date: 11/09/2025
//  Description: PLibraryObservationController file

package com.jihad.rtr.wfp.controller.prevail;


import com.jihad.rtr.wfp.model.prevail.PLFObservation;
import com.jihad.rtr.wfp.model.prevail.PLibraryObservation;
import com.jihad.rtr.wfp.service.prevail.PLFObservationService;
import com.jihad.rtr.wfp.service.prevail.PLibraryObservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PLibraryObservationController {

    @Autowired
    private PLibraryObservationService pLibraryObservationService;


    // Create new PLibraryObservation
    @RequestMapping(value = "/p-library-observation", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<PLibraryObservation> createPLibraryObservation(@RequestBody PLibraryObservation pLibraryObservation) {
        return ResponseEntity.ok().body(this.pLibraryObservationService.createPLibraryObservation(pLibraryObservation));
    }

    // Get all PLibraryObservation
    @RequestMapping(value = "/p-library-observation", method = RequestMethod.GET)
    public ResponseEntity<List<PLibraryObservation>> fetchAllPLibraryObservation() {
        return ResponseEntity.ok().body(this.pLibraryObservationService.getAllPLibraryObservation());
    }

    // One PLibraryObservation with id
    @RequestMapping(value = "/p-library-observation/{id}", method = RequestMethod.GET)
    public ResponseEntity<PLibraryObservation> getSinglePLibraryObservation(@PathVariable long id) {
        return ResponseEntity.ok().body(this.pLibraryObservationService.getPLibraryObservationById(id));
    }

//    // Update PLibraryObservation with PUT
//    @RequestMapping(value = "/di-book-checkouts/update", method = RequestMethod.PUT)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update PLibraryObservation with PATCH
    @RequestMapping(value = "/p-library-observation/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PLibraryObservation> updatePLibraryObservation(@PathVariable long id, @RequestBody PLibraryObservation plfObservation) {
        plfObservation.setId(id);
        return ResponseEntity.ok().body(this.pLibraryObservationService.updatePLibraryObservation(plfObservation));
    }

    // Delete PLibraryObservation
    @RequestMapping(value = "/p-library-observation/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePLibraryObservation(@PathVariable long id) {
        this.pLibraryObservationService.deletePLibraryObservation(id);
        return HttpStatus.OK;
    }
}
