//  Author: Mohammad Jihad Hossain
//  Create Date: 20/03/2024
//  Modify Date: 20/03/2024
//  Description: DI Bangla Indicator service file

package com.jihad.rtr.wfp.service;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.DIBanglaIndicator;
import com.jihad.rtr.wfp.repository.BanglaIndicatorRepo;
import com.jihad.rtr.wfp.repository.DIBanglaIndicatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DIBanglaIndicatorService {

    @Autowired
    private DIBanglaIndicatorRepo diBanglaIndicatorRepo;

    //Create new DIBanglaIndicator
    public DIBanglaIndicator createDIBanglaIndicator(DIBanglaIndicator diBanglaIndicator) {
        return diBanglaIndicatorRepo.save(diBanglaIndicator);
    }

    //Get all DIBanglaIndicator
    public List<DIBanglaIndicator> getAllDIBanglaIndicator() {
        return diBanglaIndicatorRepo.findAll();
    }

    //Get DIBanglaIndicator with id
    public DIBanglaIndicator getDIBanglaIndicatorById(long id) {
        Optional<DIBanglaIndicator> banglaIndicatorDB = diBanglaIndicatorRepo.findById(id);
        if (banglaIndicatorDB.isPresent()) {
            return banglaIndicatorDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update BanglaIndicator
    public DIBanglaIndicator updateDIBanglaIndicator(DIBanglaIndicator diBanglaIndicator) {
        Optional<DIBanglaIndicator> dibanglaIndicatorDB = diBanglaIndicatorRepo.findById(diBanglaIndicator.getId());

        if (dibanglaIndicatorDB.isPresent()) {
            DIBanglaIndicator dibanglaIndicatorUpdate = dibanglaIndicatorDB.get();
            dibanglaIndicatorUpdate.setId(diBanglaIndicator.getId());
            dibanglaIndicatorUpdate.setSerial(diBanglaIndicator.getSerial());
            dibanglaIndicatorUpdate.setIndicatorDetail(diBanglaIndicator.getIndicatorDetail());
            dibanglaIndicatorUpdate.setIndicatorDetailEng(diBanglaIndicator.getIndicatorDetailEng());
            dibanglaIndicatorUpdate.setPriority(diBanglaIndicator.getPriority());
            dibanglaIndicatorUpdate.setIsActive(diBanglaIndicator.getIsActive());
            dibanglaIndicatorUpdate.setIsDeleted(diBanglaIndicator.getIsDeleted());

            diBanglaIndicatorRepo.save(dibanglaIndicatorUpdate);

            return dibanglaIndicatorUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + diBanglaIndicator.getId());
        }
    }

    //Delete DIBanglaIndicator
    public void deleteDIBanglaIndicator(long id) {
        Optional<DIBanglaIndicator> dibanglaIndicatorDB = this.diBanglaIndicatorRepo.findById(id);

        if (dibanglaIndicatorDB.isPresent()) {
            this.diBanglaIndicatorRepo.delete(dibanglaIndicatorDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
