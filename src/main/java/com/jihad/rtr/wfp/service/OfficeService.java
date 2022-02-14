//  Author: Mohammad Jihad Hossain
//  Create Date: 14/02/2022
//  Modify Date: 14/02/2022
//  Description: Office service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Designation;
import com.jihad.rtr.wfp.model.Office;
import com.jihad.rtr.wfp.repository.OfficeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OfficeService {
    @Autowired
    private OfficeRepo officeRepo;

    //Create new office
    public Office createOffice(Office office){
        return officeRepo.save(office);
    }

    //Get all office
    public List<Office> getAllOffices(){
        return officeRepo.findAll();
    }

    //Get office with id
    public Office getOfficeById(long id){
        Optional<Office> officeDB = officeRepo.findById(id);
        if(officeDB.isPresent()){
            return officeDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }

    }

    //Update office
    public Office updateOffice(Office office){
        Optional<Office> officeDB = officeRepo.findById(office.getId());

        if(officeDB.isPresent()){
            Office officeUpdate = officeDB.get();
            officeUpdate.setId(office.getId());
            officeUpdate.setName(office.getName());
            officeUpdate.setBnName(office.getBnName());

            officeRepo.save(officeUpdate);

            return officeUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ office.getId());
        }
    }

    //Delete office
    public void deleteOffice(long id){
        Optional<Office> officeDB = this.officeRepo.findById(id);

        if(officeDB.isPresent()){
            this.officeRepo.delete(officeDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
