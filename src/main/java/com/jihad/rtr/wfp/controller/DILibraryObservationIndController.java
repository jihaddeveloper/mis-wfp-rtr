//  Author: Mohammad Jihad Hossain
//  Create Date: 01/07/2024
//  Modify Date: 01/07/2024
//  Description: DILibraryObservationIndController controller file

package com.jihad.rtr.wfp.controller;


import com.jihad.rtr.wfp.model.DILibraryObservationIndicator;
import com.jihad.rtr.wfp.model.LibraryObservationIndicator;
import com.jihad.rtr.wfp.service.DILibraryObservationIndService;
import com.jihad.rtr.wfp.service.LibraryObservationIndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class DILibraryObservationIndController {

    @Autowired
    private DILibraryObservationIndService libraryObservationIndService;

    //Create new DILibraryObservationIndicator
    @RequestMapping(value = "/di-library-observation-indicator", method = RequestMethod.POST)
    public ResponseEntity<DILibraryObservationIndicator> createNewLibraryObInd(@RequestBody DILibraryObservationIndicator libraryObservationIndicator) {
        return ResponseEntity.ok().body(this.libraryObservationIndService.createLibraryObservationIndicator(libraryObservationIndicator));
    }

    //Get all DILibraryObservationIndicator
    @RequestMapping(value = "/di-library-observation-indicator", method = RequestMethod.GET)
    public ResponseEntity<List<DILibraryObservationIndicator>> fetchAllLibraryObInd() {
        return ResponseEntity.ok().body(this.libraryObservationIndService.getAllLibraryObservationIndicators());
    }

    //Get LibraryObservationIndicator with id
    @RequestMapping(value = "/di-library-observation-indicator/{id}", method = RequestMethod.GET)
    public ResponseEntity<DILibraryObservationIndicator> getLibraryObIndByID(@PathVariable long id) {
        return ResponseEntity.ok().body(this.libraryObservationIndService.getLibraryObservationIndicatorById(id));
    }

    //Update LibraryObservationIndicator
    @RequestMapping(value = "/di-library-observation-indicator/{id}", method = RequestMethod.PUT)
    public ResponseEntity<DILibraryObservationIndicator> updateLibraryObInd(@PathVariable long id, @RequestBody DILibraryObservationIndicator libraryObservationIndicator) {
        libraryObservationIndicator.setId(id);
        return ResponseEntity.ok().body(this.libraryObservationIndService.updateLibraryObservationIndicator(libraryObservationIndicator));
    }

    //Delete LibraryObservationIndicator
    @RequestMapping(value = "/di-library-observation-indicator/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteLibraryObInd(@PathVariable long id) {
        this.libraryObservationIndService.deleteLibraryObservationIndicator(id);
        return HttpStatus.OK;
    }
}
