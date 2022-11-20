//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 20/11/2022
//  Description: Bangla Indicator service file

package com.jihad.rtr.wfp.service;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.repository.BanglaClassRepo;
import com.jihad.rtr.wfp.repository.BanglaIndicatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BanglaIndicatorService {


    @Autowired
    private BanglaIndicatorRepo banglaIndicatorRepo;

    //Create new BanglaIndicator
    public BanglaIndicator createBanglaIndicator(BanglaIndicator banglaIndicator) {
        return banglaIndicatorRepo.save(banglaIndicator);
    }

    //Get all BanglaIndicator
    public List<BanglaIndicator> getAllBanglaIndicator() {
        return banglaIndicatorRepo.findAll();
    }

    //Get BanglaIndicator with id
    public BanglaIndicator getBanglaIndicatorById(long id) {
        Optional<BanglaIndicator> banglaIndicatorDB = banglaIndicatorRepo.findById(id);
        if (banglaIndicatorDB.isPresent()) {
            return banglaIndicatorDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update BanglaIndicator
    public BanglaIndicator updateBanglaIndicator(BanglaIndicator banglaIndicator) {
        Optional<BanglaIndicator> banglaIndicatorDB = banglaIndicatorRepo.findById(banglaIndicator.getId());

        if (banglaIndicatorDB.isPresent()) {
            BanglaIndicator banglaIndicatorUpdate = banglaIndicatorDB.get();
            banglaIndicatorUpdate.setId(banglaIndicator.getId());
            banglaIndicatorUpdate.setSerial(banglaIndicator.getSerial());
            banglaIndicatorUpdate.setIndicatorDetail(banglaIndicator.getIndicatorDetail());
            banglaIndicatorUpdate.setIndicatorDetailEng(banglaIndicator.getIndicatorDetailEng());
            banglaIndicatorUpdate.setPriority(banglaIndicator.getPriority());
            banglaIndicatorUpdate.setIsActive(banglaIndicator.getIsActive());
            banglaIndicatorUpdate.setIsDeleted(banglaIndicator.getIsDeleted());

            banglaIndicatorRepo.save(banglaIndicatorUpdate);

            return banglaIndicatorUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + banglaIndicator.getId());
        }
    }

    //Delete BanglaIndicator
    public void deleteBanglaIndicator(long id) {
        Optional<BanglaIndicator> banglaIndicatorDB = this.banglaIndicatorRepo.findById(id);

        if (banglaIndicatorDB.isPresent()) {
            this.banglaIndicatorRepo.delete(banglaIndicatorDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
