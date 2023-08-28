//  Author: Mohammad Jihad Hossain
//  Create Date: 13/01/2022
//  Modify Date: 13/01/2022
//  Description: School service file

package com.jihad.rtr.wfp.service;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.School;
import com.jihad.rtr.wfp.repository.DivisionRepo;
import com.jihad.rtr.wfp.repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SchoolService {

    @Autowired
    private SchoolRepo schoolRepo;

    //Create new school
    public School createSchool(School school) {
        return schoolRepo.save(school);
    }

    //Get all school
    public List<School> getAllSchool() {
        return schoolRepo.findAll();
    }

    //Get school with id
    public School getSchoolById(long id) {
        Optional<School> schoolDB = schoolRepo.findById(id);
        if (schoolDB.isPresent()) {
            return schoolDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update school
    public School updateSchool(School school) {
        Optional<School> schoolDB = this.schoolRepo.findById(school.getId());

        if (schoolDB.isPresent()) {
            School schoolUpdate = schoolDB.get();
            schoolUpdate.setId(school.getId());
            schoolUpdate.setName(school.getName());
            schoolUpdate.setBnName(school.getBnName());
            schoolUpdate.setUpazilla(school.getUpazilla());
            schoolUpdate.setDistrict(school.getDistrict());
            schoolUpdate.setHeadTeacher(school.getHeadTeacher());
            schoolUpdate.setLf(school.getLf());
            schoolUpdate.setLfName(school.getLfName());
            schoolUpdate.setLpo(school.getLpo());
            schoolUpdate.setLpoName(school.getLpoName());
            schoolUpdate.setEmisId(school.getEmisId());
            schoolUpdate.setGpsData(school.getGpsData());
            schoolUpdate.setGsdId(school.getGsdId());
            schoolUpdate.setAddress(school.getAddress());
            schoolUpdate.setIsActive(school.getIsActive());
            schoolUpdate.setIsDeleted(school.getIsDeleted());

            this.schoolRepo.save(schoolUpdate);

            return schoolUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + school.getId());
        }
    }

    //Delete school
    public void deleteSchool(long id) {
        Optional<School> schoolDB = this.schoolRepo.findById(id);

        if (schoolDB.isPresent()) {
            this.schoolRepo.delete(schoolDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}