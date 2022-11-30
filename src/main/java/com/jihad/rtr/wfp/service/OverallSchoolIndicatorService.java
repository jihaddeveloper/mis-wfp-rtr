//  Author: Mohammad Jihad Hossain
//  Create Date: 29/11/2022
//  Modify Date: 29/11/2022
//  Description: OverallSchool Indicator service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.OverallSchoolIndicator;
import com.jihad.rtr.wfp.repository.BanglaIndicatorRepo;
import com.jihad.rtr.wfp.repository.OverallSchoolIndicatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OverallSchoolIndicatorService {


    @Autowired
    private OverallSchoolIndicatorRepo overallSchoolIndicatorRepo;

    //Create new OverallSchoolIndicator
    public OverallSchoolIndicator createOverallSchoolIndicator(OverallSchoolIndicator overallSchoolIndicator) {
        return overallSchoolIndicatorRepo.save(overallSchoolIndicator);
    }

    //Get all OverallSchoolIndicator
    public List<OverallSchoolIndicator> getAllOverallSchoolIndicator() {
        return overallSchoolIndicatorRepo.findAll();
    }

    //Get OverallSchoolIndicator with id
    public OverallSchoolIndicator getOverallSchoolIndicatorById(long id) {
        Optional<OverallSchoolIndicator> overallSchoolIndicatorDB = overallSchoolIndicatorRepo.findById(id);
        if (overallSchoolIndicatorDB.isPresent()) {
            return overallSchoolIndicatorDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update OverallSchoolIndicator
    public OverallSchoolIndicator updateOverallSchoolIndicator(OverallSchoolIndicator overallSchoolIndicator) {
        Optional<OverallSchoolIndicator> overallSchoolIndicatorDB = overallSchoolIndicatorRepo.findById(overallSchoolIndicator.getId());

        if (overallSchoolIndicatorDB.isPresent()) {
            OverallSchoolIndicator overallSchoolIndicatorUpdate = overallSchoolIndicatorDB.get();
            overallSchoolIndicatorUpdate.setId(overallSchoolIndicator.getId());
            overallSchoolIndicatorUpdate.setSerial(overallSchoolIndicator.getSerial());
            overallSchoolIndicatorUpdate.setIndicatorDetail(overallSchoolIndicator.getIndicatorDetail());
            overallSchoolIndicatorUpdate.setIndicatorDetailEng(overallSchoolIndicator.getIndicatorDetailEng());
            overallSchoolIndicatorUpdate.setPriority(overallSchoolIndicator.getPriority());
            overallSchoolIndicatorUpdate.setIsActive(overallSchoolIndicator.getIsActive());
            overallSchoolIndicatorUpdate.setIsDeleted(overallSchoolIndicator.getIsDeleted());

            overallSchoolIndicatorRepo.save(overallSchoolIndicatorUpdate);

            return overallSchoolIndicatorUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + overallSchoolIndicator.getId());
        }
    }

    //Delete OverallSchoolIndicator
    public void deleteOverallSchoolIndicator(long id) {
        Optional<OverallSchoolIndicator> overallSchoolIndicatorDB = this.overallSchoolIndicatorRepo.findById(id);

        if (overallSchoolIndicatorDB.isPresent()) {
            this.overallSchoolIndicatorRepo.delete(overallSchoolIndicatorDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
