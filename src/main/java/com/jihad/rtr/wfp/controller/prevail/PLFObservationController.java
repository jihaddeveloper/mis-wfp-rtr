//  Author: Mohammad Jihad Hossain
//  Create Date: 11/09/2025
//  Modify Date: 11/09/2025
//  Description: PLFObservationController file

package com.jihad.rtr.wfp.controller.prevail;


import com.jihad.rtr.wfp.model.prevail.PBanglaClass;
import com.jihad.rtr.wfp.model.prevail.PLFObservation;
import com.jihad.rtr.wfp.service.prevail.PBanglaClassService;
import com.jihad.rtr.wfp.service.prevail.PLFObservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PLFObservationController {

    @Autowired
    private PLFObservationService plfObservationService;


    // Create new PLFObservation
    @RequestMapping(value = "/p-lf-observation", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<PLFObservation> createPLFObservation(@RequestBody PLFObservation plfObservation) {
        return ResponseEntity.ok().body(this.plfObservationService.createPLFObservation(plfObservation));
    }

    // Get all PLFObservation
    @RequestMapping(value = "/p-lf-observation", method = RequestMethod.GET)
    public ResponseEntity<List<PLFObservation>> fetchAllPLFObservation() {
        return ResponseEntity.ok().body(this.plfObservationService.getAllPLFObservation());
    }

    // One PLFObservation with id
    @RequestMapping(value = "/p-lf-observation/{id}", method = RequestMethod.GET)
    public ResponseEntity<PLFObservation> getSinglePLFObservation(@PathVariable long id) {
        return ResponseEntity.ok().body(this.plfObservationService.getPLFObservationById(id));
    }

//    // Update PLFObservation with PUT
//    @RequestMapping(value = "/di-book-checkouts/update", method = RequestMethod.PUT)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update PLFObservation with PATCH
    @RequestMapping(value = "/p-lf-observation/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PLFObservation> updatePLFObservation(@PathVariable long id, @RequestBody PLFObservation plfObservation) {
        plfObservation.setId(id);
        return ResponseEntity.ok().body(this.plfObservationService.updatePLFObservation(plfObservation));
    }

    // Delete PLFObservation
    @RequestMapping(value = "/p-lf-observation/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePLFObservation(@PathVariable long id) {
        this.plfObservationService.deletePLFObservation(id);
        return HttpStatus.OK;
    }
}
