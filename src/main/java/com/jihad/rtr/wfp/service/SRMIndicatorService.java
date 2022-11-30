//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 24/11/2022
//  Description: SRM Indicator service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.SRMIndicator;
import com.jihad.rtr.wfp.repository.BanglaIndicatorRepo;
import com.jihad.rtr.wfp.repository.SRMIndicatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SRMIndicatorService {

    @Autowired
    private SRMIndicatorRepo srmIndicatorRepo;

    //Create new SRMIndicator
    public SRMIndicator createSRMIndicator(SRMIndicator srmIndicator) {
        return srmIndicatorRepo.save(srmIndicator);
    }

    //Get all SRMIndicator
    public List<SRMIndicator> getAllSRMIndicator() {
        return srmIndicatorRepo.findAll();
    }

    //Get SRMIndicator with id
    public SRMIndicator getSRMIndicatorById(long id) {
        Optional<SRMIndicator> srmIndicatorDB = srmIndicatorRepo.findById(id);
        if (srmIndicatorDB.isPresent()) {
            return srmIndicatorDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update SRMIndicator
    public SRMIndicator updateSRMIndicator(SRMIndicator srmIndicator) {
        Optional<SRMIndicator> srmIndicatorDB = srmIndicatorRepo.findById(srmIndicator.getId());

        if (srmIndicatorDB.isPresent()) {
            SRMIndicator srmIndicatorUpdate = srmIndicatorDB.get();
            srmIndicatorUpdate.setId(srmIndicator.getId());
            srmIndicatorUpdate.setSerial(srmIndicator.getSerial());
            srmIndicatorUpdate.setIndicatorDetail(srmIndicator.getIndicatorDetail());
            srmIndicatorUpdate.setIndicatorDetailEng(srmIndicator.getIndicatorDetailEng());
            srmIndicatorUpdate.setPriority(srmIndicator.getPriority());
            srmIndicatorUpdate.setIsActive(srmIndicator.getIsActive());
            srmIndicatorUpdate.setIsDeleted(srmIndicator.getIsDeleted());

            srmIndicatorRepo.save(srmIndicatorUpdate);

            return srmIndicatorUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + srmIndicator.getId());
        }
    }

    //Delete SRMIndicator
    public void deleteSRMIndicator(long id) {
        Optional<SRMIndicator> srmIndicatorDB = this.srmIndicatorRepo.findById(id);

        if (srmIndicatorDB.isPresent()) {
            this.srmIndicatorRepo.delete(srmIndicatorDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
