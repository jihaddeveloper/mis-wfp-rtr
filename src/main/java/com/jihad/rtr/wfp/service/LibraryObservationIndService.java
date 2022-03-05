//  Author: Mohammad Jihad Hossain
//  Create Date: 01/03/2022
//  Modify Date: 01/03/2022
//  Description: LibraryObservationInd service file


package com.jihad.rtr.wfp.service;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.LibraryObservationIndicator;
import com.jihad.rtr.wfp.model.Teacher;
import com.jihad.rtr.wfp.repository.LibraryObservationIndRepo;
import com.jihad.rtr.wfp.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LibraryObservationIndService {

    @Autowired
    private LibraryObservationIndRepo libraryObservationIndRepo;

    //Create new libraryObservationIndicator
    public LibraryObservationIndicator createLibraryObservationIndicator(LibraryObservationIndicator libraryObservationIndicator){
        return this.libraryObservationIndRepo.save(libraryObservationIndicator);
    }

    //Get all libraryObservationIndicator
    public List<LibraryObservationIndicator> getAllLibraryObservationIndicators(){
        return this.libraryObservationIndRepo.findAll();
    }

    //Get libraryObservationIndicator with id
    public LibraryObservationIndicator getLibraryObservationIndicatorById(long id){
        Optional<LibraryObservationIndicator> libraryObservationIndicatorDB = this.libraryObservationIndRepo.findById(id);
        if(libraryObservationIndicatorDB.isPresent()){
            return libraryObservationIndicatorDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }

    }

    //Update libraryObservationIndicator
    public LibraryObservationIndicator updateLibraryObservationIndicator(LibraryObservationIndicator libraryObservationIndicator){
        Optional<LibraryObservationIndicator> libraryObservationIndicatorDB = this.libraryObservationIndRepo.findById(libraryObservationIndicator.getId());

        if(libraryObservationIndicatorDB.isPresent()){
            LibraryObservationIndicator libraryObservationIndicator1 = libraryObservationIndicatorDB.get();
            libraryObservationIndicator1.setId(libraryObservationIndicator.getId());
            libraryObservationIndicator1.setSerial(libraryObservationIndicator.getSerial());
            libraryObservationIndicator1.setIndicatorDetail(libraryObservationIndicator.getIndicatorDetail());
            libraryObservationIndicator1.setPriority(libraryObservationIndicator.getPriority());

            libraryObservationIndRepo.save(libraryObservationIndicator1);

            return libraryObservationIndicator1;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ libraryObservationIndicator.getId());
        }
    }

    //Delete libraryObservationIndicator
    public void deleteLibraryObservationIndicator(long id){
        Optional<LibraryObservationIndicator> libraryObservationIndicatorDB = this.libraryObservationIndRepo.findById(id);

        if(libraryObservationIndicatorDB.isPresent()){
            this.libraryObservationIndRepo.delete(libraryObservationIndicatorDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
