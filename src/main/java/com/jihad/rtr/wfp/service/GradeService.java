//  Author: Mohammad Jihad Hossain
//  Create Date: 01/03/2022
//  Modify Date: 01/03/2022
//  Description: Grade service file


package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.Grade;
import com.jihad.rtr.wfp.repository.DivisionRepo;
import com.jihad.rtr.wfp.repository.GradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GradeService {

    @Autowired
    private GradeRepo gradeRepo;

    //Create new grade
    public Grade createGrade(Grade grade){
        return this.gradeRepo.save(grade);
    }

    //Get all grades
    public List<Grade> getAllGrade(){
        return gradeRepo.findAll();
    }

    //Get grade with id
    public Grade getGradeById(long id){
        Optional<Grade> gradeDB = gradeRepo.findById(id);
        if(gradeDB.isPresent()){
            return gradeDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }

    }

    //Update grade
    public Grade updateGrade(Grade grade){
        Optional<Grade> gradeDB = gradeRepo.findById(grade.getId());

        if(gradeDB.isPresent()){
            Grade gradeUpdate = gradeDB.get();
            gradeUpdate.setId(grade.getId());
            gradeUpdate.setGradeName(grade.getGradeName());
            gradeUpdate.setGradeBnName(grade.getGradeBnName());
            gradeUpdate.setBoy(grade.getBoy());
            gradeUpdate.setGirl(grade.getGirl());
            gradeUpdate.setClassId(grade.getClassId());

            gradeRepo.save(gradeUpdate);

            return gradeUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ grade.getId());
        }
    }

    //Delete grade
    public void deleteGrade(long id){
        Optional<Grade> gradeDB = this.gradeRepo.findById(id);

        if(gradeDB.isPresent()){
            this.gradeRepo.delete(gradeDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
