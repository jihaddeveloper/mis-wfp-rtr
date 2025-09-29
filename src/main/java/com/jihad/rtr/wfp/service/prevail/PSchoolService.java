//  Author: Mohammad Jihad Hossain
//  Create Date: 28/09/2025
//  Modify Date: 28/09/2025
//  Description: PSchoolService file

package com.jihad.rtr.wfp.service.prevail;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DISchool;
import com.jihad.rtr.wfp.model.prevail.PSchool;
import com.jihad.rtr.wfp.repository.DISchoolRepo;
import com.jihad.rtr.wfp.repository.prevail.PSchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PSchoolService {

    @Autowired
    private PSchoolRepo pSchoolRepo;

    //Create new PSchool
    public PSchool createPSchool(PSchool diSchool) {
        return pSchoolRepo.save(diSchool);
    }

    //Get all PSchool
    public List<PSchool> getAllPSchool() {
        return pSchoolRepo.findAll();
    }

    //Get PSchool with id
    public PSchool getPSchoolById(long id) {
        Optional<PSchool> diSchoolDB = pSchoolRepo.findById(id);
        if (diSchoolDB.isPresent()) {
            return diSchoolDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update diSchool
    public PSchool updatePSchool(PSchool diSchool) {
        Optional<PSchool> diSchoolDB = this.pSchoolRepo.findById(diSchool.getId());

        if (diSchoolDB.isPresent()) {
            PSchool diSchoolUpdate = diSchoolDB.get();
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


            diSchoolUpdate.setPpBoy(diSchool.getPpBoy());
            diSchoolUpdate.setPpGirl(diSchool.getPpGirl());
            diSchoolUpdate.setPpTotal(diSchool.getPpTotal());
            diSchoolUpdate.setG1Boy(diSchool.getG1Boy());
            diSchoolUpdate.setG1Girl(diSchool.getG1Girl());
            diSchoolUpdate.setG1Total(diSchool.getG1Total());
            diSchoolUpdate.setG2Boy(diSchool.getG2Boy());
            diSchoolUpdate.setG2Girl(diSchool.getG2Girl());
            diSchoolUpdate.setG2Total(diSchool.getG2Total());
            diSchoolUpdate.setG3Boy(diSchool.getG3Boy());
            diSchoolUpdate.setG3Girl(diSchool.getG3Girl());
            diSchoolUpdate.setG3Total(diSchool.getG3Total());
            diSchoolUpdate.setG4Boy(diSchool.getG4Boy());
            diSchoolUpdate.setG4Girl(diSchool.getG4Girl());
            diSchoolUpdate.setG4Total(diSchool.getG4Total());
            diSchoolUpdate.setG5Boy(diSchool.getG5Boy());
            diSchoolUpdate.setG5Girl(diSchool.getG5Girl());
            diSchoolUpdate.setG5Total(diSchool.getG5Total());

            diSchoolUpdate.setSchoolTotal(diSchool.getSchoolTotal());

            diSchoolUpdate.setSupportYear(diSchool.getSupportYear());


            diSchoolUpdate.setIsActive(diSchool.getIsActive());
            diSchoolUpdate.setIsDeleted(diSchool.getIsDeleted());

            this.pSchoolRepo.save(diSchoolUpdate);

            return diSchoolUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + diSchool.getId());
        }
    }

    //Delete PSchool
    public void deletePSchool(long id) {
        Optional<PSchool> diSchoolDB = this.pSchoolRepo.findById(id);

        if (diSchoolDB.isPresent()) {
            this.pSchoolRepo.delete(diSchoolDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
