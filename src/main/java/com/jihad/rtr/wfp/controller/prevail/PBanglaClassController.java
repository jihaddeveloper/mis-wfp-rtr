//  Author: Mohammad Jihad Hossain
//  Create Date: 11/09/2025
//  Modify Date: 11/09/2025
//  Description: PBanglaClassController file

package com.jihad.rtr.wfp.controller.prevail;

import com.jihad.rtr.wfp.model.prevail.PBanglaClass;
import com.jihad.rtr.wfp.service.prevail.PBanglaClassService;
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
public class PBanglaClassController {

    @Autowired
    private PBanglaClassService pBanglaClassService;


    // Create new PBanglaClass
    @RequestMapping(value = "/p-bangla-class", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<PBanglaClass> createPBanglaClass(@RequestBody PBanglaClass pBanglaClass) {
        return ResponseEntity.ok().body(this.pBanglaClassService.createPBanglaClass(pBanglaClass));
    }

    // Get all PBanglaClass
    @RequestMapping(value = "/p-bangla-class", method = RequestMethod.GET)
    public ResponseEntity<List<PBanglaClass>> fetchAllPBanglaClass() {
        return ResponseEntity.ok().body(this.pBanglaClassService.getAllPBanglaClass());
    }

    // One PBanglaClass with id
    @RequestMapping(value = "/p-bangla-class/{id}", method = RequestMethod.GET)
    public ResponseEntity<PBanglaClass> getSinglePBanglaClass(@PathVariable long id) {
        return ResponseEntity.ok().body(this.pBanglaClassService.getPBanglaClassById(id));
    }

//    // Update PBanglaClass with PUT
//    @RequestMapping(value = "/di-book-checkouts/update", method = RequestMethod.PUT)
//    public LibraryObservation updateLibraryObservation(@RequestBody LibraryObservation libraryObservation) {
//        return libraryObservationRepo.save( libraryObservation);
//    }

    // Update PBanglaClass with PATCH
    @RequestMapping(value = "/p-bangla-class/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PBanglaClass> updatePBanglaClass(@PathVariable long id, @RequestBody PBanglaClass pBanglaClass) {
        pBanglaClass.setId(id);
        return ResponseEntity.ok().body(this.pBanglaClassService.updatePBanglaClass(pBanglaClass));
    }

    // Delete PBanglaClass
    @RequestMapping(value = "/p-bangla-class/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePBanglaClass(@PathVariable long id) {
        this.pBanglaClassService.deletePBanglaClass(id);
        return HttpStatus.OK;
    }
}
