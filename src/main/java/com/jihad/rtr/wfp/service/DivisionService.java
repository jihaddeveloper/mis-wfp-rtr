//  Author: Mohammad Jihad Hossain
//  Create Date: 09/01/2022
//  Modify Date: 09/01/2022
//  Description: Division service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.repository.DivisionRepo;
import com.jihad.rtr.wfp.repository.LibraryObservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DivisionService {

    @Autowired
    private DivisionRepo divisionRepo;

    //Create new division
    public Division createDivision(Division division){
        return divisionRepo.save(division);
    }

    //Get all divisions
    public List<Division> getAllDivision(){
        return divisionRepo.findAll();
    }

    //Get division with id
    public Division getDivisionById(long id){
        Optional<Division> divisionDB = divisionRepo.findById(id);
    if(divisionDB.isPresent()){
        return divisionDB.get();
    }else {
        throw new ResourceNotFoundException("Record not found with id : "+ id);
    }

    }

    //Update division
    public Division updateDivision(Division division){
        Optional<Division> divisionDB = divisionRepo.findById(division.getId());

        if(divisionDB.isPresent()){
            Division divisionUpdate = divisionDB.get();

            divisionUpdate.setId(division.getId());
            divisionUpdate.setName(division.getName());
            divisionUpdate.setBnName(division.getBnName());
            divisionUpdate.setLat(division.getLat());
            divisionUpdate.setLon(division.getLon());
            divisionUpdate.setUrl(division.getUrl());
            divisionUpdate.setIsActive(division.getIsActive());
            divisionUpdate.setIsDeleted(division.getIsDeleted());
            divisionUpdate.setCreateDate(division.getCreateDate());
            divisionUpdate.setUpdateDate(division.getUpdateDate());

            divisionRepo.save(divisionUpdate);

            return divisionUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ division.getId());
        }
    }

    //Delete division
    public void deleteDivision(long id){
        Optional<Division> divisionDB = this.divisionRepo.findById(id);

        if(divisionDB.isPresent()){
            this.divisionRepo.delete(divisionDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
