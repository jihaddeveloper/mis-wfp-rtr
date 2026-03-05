//  Author: Mohammad Jihad Hossain
//  Create Date: 05/03/2026
//  Modify Date: 05/03/2026
//  Description: PSRMClass Controller file


package com.jihad.rtr.wfp.controller.prevail;

import com.jihad.rtr.wfp.model.prevail.PSRMClass;
import com.jihad.rtr.wfp.model.prevail.PSRMClass;
import com.jihad.rtr.wfp.service.prevail.PSRMClassService;
import com.jihad.rtr.wfp.service.prevail.PSRMClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class PSRMClassController {

    @Autowired
    private PSRMClassService psrmClassService;

    // Create new PSRMClass
    @RequestMapping(value = "/p-srm-class", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<PSRMClass> createPSRMClass(@RequestBody PSRMClass psrmClass) {
        return ResponseEntity.ok().body(this.psrmClassService.createPSRMClass(psrmClass));
    }

    // Get all PSRMClass
    @RequestMapping(value = "/p-srm-class", method = RequestMethod.GET)
    public ResponseEntity<List<PSRMClass>> fetchAllPSRMClass() {
        return ResponseEntity.ok().body(this.psrmClassService.getAllPSRMClass());
    }

    // One PSRMClass with id
    @RequestMapping(value = "/p-srm-class/{id}", method = RequestMethod.GET)
    public ResponseEntity<PSRMClass> getSinglePSRMClass(@PathVariable long id) {
        return ResponseEntity.ok().body(this.psrmClassService.getPSRMClassById(id));
    }

//    // Update PSRMClass with PUT
//    @RequestMapping(value = "/di-book-checkouts/update", method = RequestMethod.PUT)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update PSRMClass with PATCH
    @RequestMapping(value = "/p-srm-class/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PSRMClass> updatePSRMClass(@PathVariable long id, @RequestBody PSRMClass psrmClass) {
        psrmClass.setId(id);
        return ResponseEntity.ok().body(this.psrmClassService.updatePSRMClass(psrmClass));
    }

    // Delete PSRMClass
    @RequestMapping(value = "/p-srm-class/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePSRMClass(@PathVariable long id) {
        this.psrmClassService.deletePSRMClass(id);
        return HttpStatus.OK;
    }
}
