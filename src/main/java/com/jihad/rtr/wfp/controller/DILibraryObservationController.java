//  Author: Mohammad Jihad Hossain
//  Create Date: 01/07/2024
//  Modify Date: 01/07/2024
//  Description: DI Library observation  controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.DILibraryObservation;
import com.jihad.rtr.wfp.model.LibraryObservation;
import com.jihad.rtr.wfp.service.DILibraryObservationService;
import com.jihad.rtr.wfp.service.LibraryObservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class DILibraryObservationController {

    @Autowired
    private DILibraryObservationService libraryObservationService;

    // Create new  DILibraryObservation
    @RequestMapping(value = "/di-library-observation", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<DILibraryObservation> createLibraryObservation(@RequestBody DILibraryObservation libraryObservation) {
        return ResponseEntity.ok().body(this.libraryObservationService.createLibraryObservation(libraryObservation));
    }

    // Get all DILibraryObservation
    @RequestMapping(value = "/di-library-observation", method = RequestMethod.GET)
    public ResponseEntity<List<DILibraryObservation>> fetchAllLibraryObservations() {
        return ResponseEntity.ok().body(libraryObservationService.getAllLibraryObservation());
    }

    // One DILibraryObservation with id
    @RequestMapping(value = "/di-library-observation/{id}", method = RequestMethod.GET)
    public ResponseEntity<DILibraryObservation> getSingleLibraryObservation(@PathVariable long id) {
        return ResponseEntity.ok().body(libraryObservationService.getLibraryObservationById(id));
    }

//    // Update DILibraryObservation with PUT
//    @RequestMapping(value = "/library-observations/update", method = RequestMethod.PATCH)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update DILibraryObservation with PATCH
    @RequestMapping(value = "/di-library-observation/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DILibraryObservation> updateLibraryObservation(@PathVariable long id, @RequestBody DILibraryObservation libraryObservation) {
        libraryObservation.setId(id);
        return ResponseEntity.ok().body(libraryObservationService.updateLibraryObservation(libraryObservation));
    }

    //
    // Delete DILibraryObservation
    @RequestMapping(value = "/di-library-observation/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteLibraryObservation(@PathVariable long id) {
        this.libraryObservationService.deleteLibraryObservation(id);
        return HttpStatus.OK;
    }
}
