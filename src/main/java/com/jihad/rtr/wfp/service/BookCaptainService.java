//  Author: Mohammad Jihad Hossain
//  Create Date: 13/09/2022
//  Modify Date: 13/09/2022
//  Description: BookCaptain service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BookCaptain;
import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.repository.BookCaptainRepo;
import com.jihad.rtr.wfp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookCaptainService {

    @Autowired
    private BookCaptainRepo bookCaptainRepo;
    @Autowired
    private EmployeeRepo employeeRepo;

    //Create new BookCaptain
    public BookCaptain createBookCaptain(BookCaptain bookCaptain) {
        return bookCaptainRepo.save(bookCaptain);
    }

    //Get all BookCaptain
    public List<BookCaptain> getAllBookCaptain() {
        return bookCaptainRepo.findAll();
    }

    //Get BookCaptain with id
    public BookCaptain getBookCaptainById(long id) {
        Optional<BookCaptain> bookCaptainDB = bookCaptainRepo.findById(id);
        if (bookCaptainDB.isPresent()) {
            return bookCaptainDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update BookCaptain
    public BookCaptain updateBookCaptain(BookCaptain bookCaptain) {
        Optional<BookCaptain> bookCaptainDB = bookCaptainRepo.findById(bookCaptain.getId());

        if (bookCaptainDB.isPresent()) {
            BookCaptain bookCaptainUpdate = bookCaptainDB.get();
            bookCaptainUpdate.setId(bookCaptain.getId());
            bookCaptainUpdate.setName(bookCaptain.getName());
            bookCaptainUpdate.setGender(bookCaptain.getGender());


            bookCaptainUpdate.setProject(bookCaptain.getProject());
            bookCaptainUpdate.setGrade(bookCaptain.getGrade());
            bookCaptainUpdate.setSection(bookCaptain.getSection());
            bookCaptainUpdate.setSchool(bookCaptain.getSchool());
            bookCaptainUpdate.setDistrict(bookCaptain.getDistrict());
            bookCaptainUpdate.setUpazilla(bookCaptain.getUpazilla());
            bookCaptainUpdate.setYear(bookCaptain.getYear());


            bookCaptainRepo.save(bookCaptainUpdate);

            return bookCaptainUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + bookCaptain.getId());
        }
    }

    //Delete BookCaptain
    public void deleteBookCaptain(long id) {
        Optional<BookCaptain> bookCaptainDB = this.bookCaptainRepo.findById(id);

        if (bookCaptainDB.isPresent()) {
            this.bookCaptainRepo.delete(bookCaptainDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
