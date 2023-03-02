//  Author: Mohammad Jihad Hossain
//  Create Date: 26/02/2023
//  Modify Date: 26/02/2023
//  Description: PreprimaryIndicatorService file


package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.PrePrimaryClassIndicator;
import com.jihad.rtr.wfp.repository.BanglaIndicatorRepo;
import com.jihad.rtr.wfp.repository.PreprimaryIndicatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PreprimaryIndicatorService {

    @Autowired
    private PreprimaryIndicatorRepo preprimaryIndicatorRepo;

    //Create new PrePrimaryClassIndicator
    public PrePrimaryClassIndicator createPrePrimaryClassIndicator(PrePrimaryClassIndicator prePrimaryClassIndicator) {
        return preprimaryIndicatorRepo.save(prePrimaryClassIndicator);
    }

    //Get all PrePrimaryClassIndicator
    public List<PrePrimaryClassIndicator> getAllPrePrimaryClassIndicator() {
        return preprimaryIndicatorRepo.findAll();
    }

    //Get PrePrimaryClassIndicator with id
    public PrePrimaryClassIndicator getPrePrimaryClassIndicatorById(long id) {
        Optional<PrePrimaryClassIndicator> prePrimaryClassIndicatorDB = preprimaryIndicatorRepo.findById(id);
        if (prePrimaryClassIndicatorDB.isPresent()) {
            return prePrimaryClassIndicatorDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update PrePrimaryClassIndicator
    public PrePrimaryClassIndicator updatePrePrimaryClassIndicator(PrePrimaryClassIndicator prePrimaryClassIndicator) {
        Optional<PrePrimaryClassIndicator> prePrimaryClassIndicatorDB = preprimaryIndicatorRepo.findById(prePrimaryClassIndicator.getId());

        if (prePrimaryClassIndicatorDB.isPresent()) {
            PrePrimaryClassIndicator prePrimaryClassIndicatorUpdate = prePrimaryClassIndicatorDB.get();
            prePrimaryClassIndicatorUpdate.setId(prePrimaryClassIndicator.getId());
            prePrimaryClassIndicatorUpdate.setSerial(prePrimaryClassIndicator.getSerial());
            prePrimaryClassIndicatorUpdate.setIndicatorDetail(prePrimaryClassIndicator.getIndicatorDetail());
            prePrimaryClassIndicatorUpdate.setIndicatorDetailEng(prePrimaryClassIndicator.getIndicatorDetailEng());
            prePrimaryClassIndicatorUpdate.setPriority(prePrimaryClassIndicator.getPriority());
            prePrimaryClassIndicatorUpdate.setIsActive(prePrimaryClassIndicator.getIsActive());
            prePrimaryClassIndicatorUpdate.setIsDeleted(prePrimaryClassIndicator.getIsDeleted());

            preprimaryIndicatorRepo.save(prePrimaryClassIndicatorUpdate);

            return prePrimaryClassIndicatorUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + prePrimaryClassIndicator.getId());
        }
    }

    //Delete PrePrimaryClassIndicator
    public void deletePrePrimaryClassIndicator(long id) {
        Optional<PrePrimaryClassIndicator> prePrimaryClassIndicatorDB = this.preprimaryIndicatorRepo.findById(id);

        if (prePrimaryClassIndicatorDB.isPresent()) {
            this.preprimaryIndicatorRepo.delete(prePrimaryClassIndicatorDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
