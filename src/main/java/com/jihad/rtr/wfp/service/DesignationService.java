//  Author: Mohammad Jihad Hossain
//  Create Date: 14/02/2022
//  Modify Date: 14/02/2022
//  Description: Designation service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Designation;
import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.repository.DesignationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DesignationService {

    @Autowired
    private DesignationRepo designationRepo;

    //Create new designation
    public Designation createDesignation(Designation designation){
        return designationRepo.save(designation);
    }

    //Get all designation
    public List<Designation> getAllDesignations(){
        return designationRepo.findAll();
    }

    //Get designation with id
    public Designation getDesignationById(long id){
        Optional<Designation> designationDB = designationRepo.findById(id);
        if(designationDB.isPresent()){
            return designationDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }

    }

    //Update designation
    public Designation updateDesignation(Designation designation){
        Optional<Designation> designationDB = designationRepo.findById(designation.getId());

        if(designationDB.isPresent()){
            Designation designationUpdate = designationDB.get();

            designationUpdate.setId(designation.getId());
            designationUpdate.setName(designation.getName());
            designationUpdate.setBnName(designation.getBnName());
            designationUpdate.setIsActive(designation.getIsActive());
            designationUpdate.setIsDeleted(designation.getIsDeleted());
            designationUpdate.setCreateDate(designation.getCreateDate());
            designationUpdate.setUpdateDate(designation.getUpdateDate());

            designationRepo.save(designationUpdate);

            return designationUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ designation.getId());
        }
    }

    //Delete designation
    public void deleteDesignation(long id){
        Optional<Designation> designationDB = this.designationRepo.findById(id);

        if(designationDB.isPresent()){
            this.designationRepo.delete(designationDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
