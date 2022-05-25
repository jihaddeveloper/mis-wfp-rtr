//  Author: Mohammad Jihad Hossain
//  Create Date: 04/04/2022
//  Modify Date: 04/04/2022
//  Description: Library controller file


package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.Library;
import com.jihad.rtr.wfp.service.DivisionService;
import com.jihad.rtr.wfp.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class LibraryController {

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private LibraryService libraryService;

    //Create new Library
    @RequestMapping(value = "/library", method = RequestMethod.POST)
    public ResponseEntity<Library> createLibrary(@RequestBody Library library) {
        return ResponseEntity.ok().body(this.libraryService.createLibrary(library));
    }

    //Get all Library
    @RequestMapping(value = "/library", method = RequestMethod.GET)
    public ResponseEntity<List<Library>> fetchAllLibrary() {
        return ResponseEntity.ok().body(this.libraryService.getAllLibrary());
    }

    //One Library with id
    @RequestMapping(value = "/library/{id}", method = RequestMethod.GET)
    public ResponseEntity<Library> getSingleLibrary(@PathVariable long id) {
        return ResponseEntity.ok().body(this.libraryService.getLibraryById(id));
    }

    //Update Library
    @RequestMapping(value = "/library/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Library> updateLibrary(@PathVariable long id, @RequestBody Library library) {
        library.setId(id);
        return ResponseEntity.ok().body(this.libraryService.updateLibrary(library));
    }

    //Delete Library
    @RequestMapping(value = "/library/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteLibrary(@PathVariable long id) {
        this.libraryService.deleteLibrary(id);
        return HttpStatus.OK;
    }
}
