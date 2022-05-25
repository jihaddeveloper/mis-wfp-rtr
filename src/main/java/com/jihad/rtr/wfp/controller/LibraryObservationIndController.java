//  Author: Mohammad Jihad Hossain
//  Create Date: 02/03/2022
//  Modify Date: 02/03/2022
//  Description: LibraryObservationIndController controller file

package com.jihad.rtr.wfp.controller;


import com.jihad.rtr.wfp.model.Grade;
import com.jihad.rtr.wfp.model.LibraryObservationIndicator;
import com.jihad.rtr.wfp.service.GradeService;
import com.jihad.rtr.wfp.service.LibraryObservationIndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class LibraryObservationIndController {

    @Autowired
    private LibraryObservationIndService libraryObservationIndService;

    //Create new LibraryObservationIndicator
    @RequestMapping(value = "/library-observation-indicators", method = RequestMethod.POST)
    public ResponseEntity<LibraryObservationIndicator> createNewLibraryObInd(@RequestBody LibraryObservationIndicator libraryObservationIndicator) {
        return ResponseEntity.ok().body(this.libraryObservationIndService.createLibraryObservationIndicator(libraryObservationIndicator));
    }

    //Get all LibraryObservationIndicator
    @RequestMapping(value = "/library-observation-indicators", method = RequestMethod.GET)
    public ResponseEntity<List<LibraryObservationIndicator>> fetchAllLibraryObInd() {
        return ResponseEntity.ok().body(this.libraryObservationIndService.getAllLibraryObservationIndicators());
    }

    //Get LibraryObservationIndicator with id
    @RequestMapping(value = "/library-observation-indicators/{id}", method = RequestMethod.GET)
    public ResponseEntity<LibraryObservationIndicator> getLibraryObIndByID(@PathVariable long id) {
        return ResponseEntity.ok().body(this.libraryObservationIndService.getLibraryObservationIndicatorById(id));
    }

    //Update LibraryObservationIndicator
    @RequestMapping(value = "/library-observation-indicators/{id}", method = RequestMethod.PUT)
    public ResponseEntity<LibraryObservationIndicator> updateLibraryObInd(@PathVariable long id, @RequestBody LibraryObservationIndicator libraryObservationIndicator) {
        libraryObservationIndicator.setId(id);
        return ResponseEntity.ok().body(this.libraryObservationIndService.updateLibraryObservationIndicator(libraryObservationIndicator));
    }

    //Delete LibraryObservationIndicator
    @RequestMapping(value = "/library-observation-indicators/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteLibraryObInd(@PathVariable long id) {
        this.libraryObservationIndService.deleteLibraryObservationIndicator(id);
        return HttpStatus.OK;
    }
}
