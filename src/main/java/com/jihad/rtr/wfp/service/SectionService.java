//  Author: Mohammad Jihad Hossain
//  Create Date: 01/03/2022
//  Modify Date: 01/03/2022
//  Description: Section service file

package com.jihad.rtr.wfp.service;


import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Section;
import com.jihad.rtr.wfp.model.Teacher;
import com.jihad.rtr.wfp.repository.SectionRepo;
import com.jihad.rtr.wfp.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SectionService {

    @Autowired
    private SectionRepo sectionRepo;

    //Create new section
    public Section createSection(Section section){
        return this.sectionRepo.save(section);
    }

    //Get all section
    public List<Section> getAllSections(){
        return this.sectionRepo.findAll();
    }

    //Get section with id
    public Section getSectionById(long id){
        Optional<Section> sectionDB = this.sectionRepo.findById(id);
        if(sectionDB.isPresent()){
            return sectionDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }

    }

    //Update section
    public Section updateSection(Section section){
        Optional<Section> sectionDB = this.sectionRepo.findById(section.getId());

        if(sectionDB.isPresent()){
            Section sectionUpdate = sectionDB.get();
            sectionUpdate.setId(section.getId());
            sectionUpdate.setSectionName(section.getSectionName());
            sectionUpdate.setBoy(section.getBoy());

            this.sectionRepo.save(sectionUpdate);

            return sectionUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ section.getId());
        }
    }

    //Delete section
    public void deleteSection(long id){
        Optional<Section> sectionDB = this.sectionRepo.findById(id);

        if(sectionDB.isPresent()){
            this.sectionRepo.delete(sectionDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
