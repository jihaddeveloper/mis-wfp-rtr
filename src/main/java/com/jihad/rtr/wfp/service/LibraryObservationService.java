//  Author: Mohammad Jihad Hossain
//  Create Date: 09/01/2022
//  Modify Date: 09/01/2022
//  Description: Library observation service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.LibraryObservation;
import com.jihad.rtr.wfp.repository.LibraryObservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LibraryObservationService {

    @Autowired
    private LibraryObservationRepo libraryObservationRepo;

    // Create new Library observation
    public LibraryObservation createLibraryObservation(LibraryObservation libraryObservation) {
        return libraryObservationRepo.save(libraryObservation);
    }

    //Get all Library observation
    public List<LibraryObservation> getAllLibraryObservation() {
        return libraryObservationRepo.findAll();
    }

    //Get Library observation with id
    public LibraryObservation getLibraryObservationById(long id) {
        Optional<LibraryObservation> libraryObservationDB = libraryObservationRepo.findById(id);

        if(libraryObservationDB.isPresent()){
            return libraryObservationDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + id);

        }

    }

    //Update Library observation
    public LibraryObservation updateLibraryObservation(LibraryObservation libraryObservation) {
        Optional<LibraryObservation> libraryObservationDB = libraryObservationRepo.findById(libraryObservation.getId());

        if(libraryObservationDB.isPresent()){
           LibraryObservation libraryObservationUpdate = libraryObservationDB.get();
           libraryObservationUpdate.setId(libraryObservation.getId());
           libraryObservationUpdate.setDistrict(libraryObservation.getDistrict());
           libraryObservationRepo.save(libraryObservationUpdate);
           return libraryObservationUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + libraryObservation.getId());

        }

    }

    //Delete Library observation
    public void deleteLibraryObservation(long id) {
        Optional <LibraryObservation> libraryObservationDb = this.libraryObservationRepo.findById(id);

        if (libraryObservationDb.isPresent()) {
            this.libraryObservationRepo.delete(libraryObservationDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }
}
