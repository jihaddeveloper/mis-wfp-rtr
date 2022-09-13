//  Author: Mohammad Jihad Hossain
//  Create Date: 13/09/2022
//  Modify Date: 13/09/2022
//  Description: BookCaptain controller file

package com.jihad.rtr.wfp.controller;

import com.jihad.rtr.wfp.model.BookCaptain;
import com.jihad.rtr.wfp.model.School;
import com.jihad.rtr.wfp.service.BookCaptainService;
import com.jihad.rtr.wfp.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/", produces = "application/json")
public class BookCaptainController {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private BookCaptainService bookCaptainService;

    //Create new BookCaptain
    @RequestMapping(value = "/book-captain", method = RequestMethod.POST)
    public ResponseEntity<BookCaptain> createBookCaptain(@RequestBody BookCaptain bookCaptain) {
        return ResponseEntity.ok().body(this.bookCaptainService.createBookCaptain(bookCaptain));
    }

    //Get all BookCaptain
    @RequestMapping(value = "/book-captain", method = RequestMethod.GET)
    public ResponseEntity<List<BookCaptain>> fetchAllBookCaptain() {
        return ResponseEntity.ok().body(this.bookCaptainService.getAllBookCaptain());
    }

    //One BookCaptain with id
    @RequestMapping(value = "/book-captain/{id}", method = RequestMethod.GET)
    public ResponseEntity<BookCaptain> getBookCaptain(@PathVariable long id) {
        return ResponseEntity.ok().body(this.bookCaptainService.getBookCaptainById(id));
    }

    //Update BookCaptain
    @RequestMapping(value = "/book-captain/{id}", method = RequestMethod.PUT)
    public ResponseEntity<BookCaptain> updateBookCaptain(@PathVariable long id, @RequestBody BookCaptain bookCaptain) {
        bookCaptain.setId(id);
        return ResponseEntity.ok().body(this.bookCaptainService.updateBookCaptain(bookCaptain));
    }

    //Delete BookCaptain
    @RequestMapping(value = "/book-captain/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteBookCaptain(@PathVariable long id) {
        this.bookCaptainService.deleteBookCaptain(id);
        return HttpStatus.OK;
    }
}
