//  Author: Mohammad Jihad Hossain
//  Create Date: 25/03/2024
//  Modify Date: 25/03/2024
//  Description: DISchool service file

package com.jihad.rtr.wfp.service;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DISchool;
import com.jihad.rtr.wfp.model.School;
import com.jihad.rtr.wfp.repository.DISchoolRepo;
import com.jihad.rtr.wfp.repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DISchoolService {

    @Autowired
    private DISchoolRepo diSchoolRepo;

    //Create new DISchool
    public DISchool createDISchool(DISchool diSchool) {
        return diSchoolRepo.save(diSchool);
    }

    //Get all DISchool
    public List<DISchool> getAllDISchool() {
        return diSchoolRepo.findAll();
    }

    //Get DISchool with id
    public DISchool getDISchoolById(long id) {
        Optional<DISchool> diSchoolDB = diSchoolRepo.findById(id);
        if (diSchoolDB.isPresent()) {
            return diSchoolDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update diSchool
    public DISchool updateDISchool(DISchool diSchool) {
        Optional<DISchool> diSchoolDB = this.diSchoolRepo.findById(diSchool.getId());

        if (diSchoolDB.isPresent()) {
            DISchool diSchoolUpdate = diSchoolDB.get();
            diSchoolUpdate.setId(diSchool.getId());
            diSchoolUpdate.setName(diSchool.getName());
            diSchoolUpdate.setBnName(diSchool.getBnName());
            diSchoolUpdate.setUpazilla(diSchool.getUpazilla());
            diSchoolUpdate.setDistrict(diSchool.getDistrict());
            diSchoolUpdate.setHeadTeacher(diSchool.getHeadTeacher());
            diSchoolUpdate.setLf(diSchool.getLf());
            diSchoolUpdate.setLfName(diSchool.getLfName());
            diSchoolUpdate.setLpo(diSchool.getLpo());
            diSchoolUpdate.setLpoName(diSchool.getLpoName());
            diSchoolUpdate.setEmisId(diSchool.getEmisId());
            diSchoolUpdate.setGpsData(diSchool.getGpsData());
            diSchoolUpdate.setGsdId(diSchool.getGsdId());
            diSchoolUpdate.setAddress(diSchool.getAddress());

            diSchoolUpdate.setAdmittedBoyG1(diSchool.getAdmittedBoyG1());
            diSchoolUpdate.setAdmittedGirlG1(diSchool.getAdmittedGirlG1());
            diSchoolUpdate.setAdmittedTotalG1(diSchool.getAdmittedTotalG1());
            diSchoolUpdate.setAdmittedBoyG2(diSchool.getAdmittedBoyG2());
            diSchoolUpdate.setAdmittedGirlG2(diSchool.getAdmittedGirlG2());
            diSchoolUpdate.setAdmittedTotalG2(diSchool.getAdmittedTotalG2());
            diSchoolUpdate.setAdmittedTotal(diSchool.getAdmittedTotal());
            diSchoolUpdate.setSupportYear(diSchool.getSupportYear());


            diSchoolUpdate.setIsActive(diSchool.getIsActive());
            diSchoolUpdate.setIsDeleted(diSchool.getIsDeleted());

            this.diSchoolRepo.save(diSchoolUpdate);

            return diSchoolUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + diSchool.getId());
        }
    }

    //Delete DISchool
    public void deleteDISchool(long id) {
        Optional<DISchool> diSchoolDB = this.diSchoolRepo.findById(id);

        if (diSchoolDB.isPresent()) {
            this.diSchoolRepo.delete(diSchoolDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}