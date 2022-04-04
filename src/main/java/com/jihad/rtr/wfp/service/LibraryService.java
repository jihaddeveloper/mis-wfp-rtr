//  Author: Mohammad Jihad Hossain
//  Create Date: 04/04/2022
//  Modify Date: 04/04/2022
//  Description: Library service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Grade;
import com.jihad.rtr.wfp.model.Library;
import com.jihad.rtr.wfp.repository.GradeRepo;
import com.jihad.rtr.wfp.repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LibraryService {

    @Autowired
    private LibraryRepo libraryRepo;
    

    //Create new library
    public Library createLibrary(Library library) {
        return this.libraryRepo.save(library);
    }

    //Get all Library
    public List<Library> getAllLibrary() {
        return libraryRepo.findAll();
    }

    //Get Library with id
    public Library getLibraryById(long id) {
        Optional<Library> libraryDB = libraryRepo.findById(id);
        if (libraryDB.isPresent()) {
            return libraryDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update Library
    public Library updateLibrary(Library library) {
        Optional<Library> libraryDB = libraryRepo.findById(library.getId());

        if (libraryDB.isPresent()) {
            Library libraryUpdate = libraryDB.get();

            libraryUpdate.setId(library.getId());
            libraryUpdate.setClassName(library.getClassName());
            libraryUpdate.setDistrict(library.getDistrict());
            libraryUpdate.setUpazilla(library.getUpazilla());
            libraryUpdate.setOffice(library.getOffice());
            libraryUpdate.setProject(library.getProject());
            libraryUpdate.setSchool(library.getSchool());

            libraryUpdate.setBookNoGreen(library.getBookNoGreen());
            libraryUpdate.setBookNoRed(library.getBookNoRed());
            libraryUpdate.setBookNoOrange(library.getBookNoOrange());
            libraryUpdate.setBookNoWhite(library.getBookNoWhite());
            libraryUpdate.setBookNoBlue(library.getBookNoBlue());
            libraryUpdate.setBookNoYellow(library.getBookNoYellow());

            libraryRepo.save(libraryUpdate);

            return libraryUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + library.getId());
        }
    }

    //Delete Library
    public void deleteLibrary(long id) {
        Optional<Library> libraryDB = this.libraryRepo.findById(id);

        if (libraryDB.isPresent()) {
            this.libraryRepo.delete(libraryDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
