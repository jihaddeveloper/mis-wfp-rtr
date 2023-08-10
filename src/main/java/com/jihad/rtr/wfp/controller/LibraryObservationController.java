//  Author: Mohammad Jihad Hossain
//  Create Date: 04/01/2022
//  Modify Date: 19/05/2022
//  Description: Library observation  controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.LibraryObservation;
import com.jihad.rtr.wfp.repository.LibraryObservationRepo;
import com.jihad.rtr.wfp.service.LibraryObservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class LibraryObservationController {

    @Autowired
    private LibraryObservationService libraryObservationService;

    // Create new Library-Observation
    @RequestMapping(value = "/library-observations", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<LibraryObservation> createLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
        return ResponseEntity.ok().body(this.libraryObservationService.createLibraryObservation(libraryObservation));
    }

    // Get all Library-Observations
    @RequestMapping(value = "/library-observations", method = RequestMethod.GET)
    public ResponseEntity<List<LibraryObservation>> fetchAllLibraryObservations() {
        return ResponseEntity.ok().body(libraryObservationService.getAllLibraryObservation());
    }

    // One Library-Observation with id
    @RequestMapping(value = "/library-observations/{id}", method = RequestMethod.GET)
    public ResponseEntity<LibraryObservation> getSingleLibraryObservation(@PathVariable long id) {
        return ResponseEntity.ok().body(libraryObservationService.getLibraryObservationById(id));
    }

//    // Update LibraryObservation with PUT
//    @RequestMapping(value = "/library-observations/update", method = RequestMethod.PATCH)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update LibraryObservation with PATCH
    @RequestMapping(value = "library-observations/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<LibraryObservation> updateLibraryObservation(@PathVariable long id, @RequestBody LibraryObservation libraryObservation) {
        libraryObservation.setId(id);
        return ResponseEntity.ok().body(libraryObservationService.updateLibraryObservation(libraryObservation));
    }

    //
    // Delete LibraryObservation
    @RequestMapping(value = "library-observations/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteLibraryObservation(@PathVariable long id) {
        this.libraryObservationService.deleteLibraryObservation(id);
        return HttpStatus.OK;
    }
}
