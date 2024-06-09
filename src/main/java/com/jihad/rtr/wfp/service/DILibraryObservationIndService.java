//  Author: Mohammad Jihad Hossain
//  Create Date: 01/07/2024
//  Modify Date: 01/07/2024
//  Description: DILibraryObservationInd service file


package com.jihad.rtr.wfp.service;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DILibraryObservationIndicator;
import com.jihad.rtr.wfp.model.LibraryObservationIndicator;
import com.jihad.rtr.wfp.repository.DILibraryObservationIndRepo;
import com.jihad.rtr.wfp.repository.LibraryObservationIndRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DILibraryObservationIndService {

    @Autowired
    private DILibraryObservationIndRepo libraryObservationIndRepo;

    //Create new DILibraryObservationIndicator
    public DILibraryObservationIndicator createLibraryObservationIndicator(DILibraryObservationIndicator libraryObservationIndicator) {
        return this.libraryObservationIndRepo.save(libraryObservationIndicator);
    }

    //Get all DILibraryObservationIndicator
    public List<DILibraryObservationIndicator> getAllLibraryObservationIndicators() {
        return this.libraryObservationIndRepo.findAll();
    }

    //Get DILibraryObservationIndicator with id
    public DILibraryObservationIndicator getLibraryObservationIndicatorById(long id) {
        Optional<DILibraryObservationIndicator> libraryObservationIndicatorDB = this.libraryObservationIndRepo.findById(id);
        if (libraryObservationIndicatorDB.isPresent()) {
            return libraryObservationIndicatorDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update DILibraryObservationIndicator
    public DILibraryObservationIndicator updateLibraryObservationIndicator(DILibraryObservationIndicator libraryObservationIndicator) {
        Optional<DILibraryObservationIndicator> libraryObservationIndicatorDB = this.libraryObservationIndRepo.findById(libraryObservationIndicator.getId());

        if (libraryObservationIndicatorDB.isPresent()) {
            DILibraryObservationIndicator libraryObservationIndicator1 = libraryObservationIndicatorDB.get();
            libraryObservationIndicator1.setId(libraryObservationIndicator.getId());
            libraryObservationIndicator1.setSerial(libraryObservationIndicator.getSerial());
            libraryObservationIndicator1.setIndicatorDetail(libraryObservationIndicator.getIndicatorDetail());
            libraryObservationIndicator1.setPriority(libraryObservationIndicator.getPriority());

            libraryObservationIndRepo.save(libraryObservationIndicator1);

            return libraryObservationIndicator1;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + libraryObservationIndicator.getId());
        }
    }

    //Delete DILibraryObservationIndicator
    public void deleteLibraryObservationIndicator(long id) {
        Optional<DILibraryObservationIndicator> libraryObservationIndicatorDB = this.libraryObservationIndRepo.findById(id);

        if (libraryObservationIndicatorDB.isPresent()) {
            this.libraryObservationIndRepo.delete(libraryObservationIndicatorDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
