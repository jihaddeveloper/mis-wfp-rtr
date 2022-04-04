//  Author: Mohammad Jihad Hossain
//  Create Date: 04/04/2022
//  Modify Date: 04/04/2022
//  Description: MonthlyBookCheckoutComm service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Library;
import com.jihad.rtr.wfp.model.MonthlyBookCheckoutComm;
import com.jihad.rtr.wfp.repository.LibraryRepo;
import com.jihad.rtr.wfp.repository.MonthlyBookCheckoutCommRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MonthlyBookCheckoutCommService {

    @Autowired
    private LibraryRepo libraryRepo;

    @Autowired
    private MonthlyBookCheckoutCommRepo monthlyBookCheckoutCommRepo;


    //Create new MonthlyBookCheckoutComm
    public MonthlyBookCheckoutComm createMonthlyBookCheckoutComm(MonthlyBookCheckoutComm monthlyBookCheckoutComm) {
        return this.monthlyBookCheckoutCommRepo.save(monthlyBookCheckoutComm);
    }

    //Get all MonthlyBookCheckoutComm
    public List<MonthlyBookCheckoutComm> getAllMonthlyBookCheckoutComm() {
        return this.monthlyBookCheckoutCommRepo.findAll();
    }

    //Get MonthlyBookCheckoutComm with id
    public MonthlyBookCheckoutComm getMonthlyBookCheckoutCommById(long id) {
        Optional<MonthlyBookCheckoutComm> monthlyBookCheckoutCommDB = this.monthlyBookCheckoutCommRepo.findById(id);
        if (monthlyBookCheckoutCommDB.isPresent()) {
            return monthlyBookCheckoutCommDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update MonthlyBookCheckoutComm
    public MonthlyBookCheckoutComm updateMonthlyBookCheckoutComm(MonthlyBookCheckoutComm monthlyBookCheckoutComm) {
        Optional<MonthlyBookCheckoutComm> monthlyBookCheckoutCommDB = this.monthlyBookCheckoutCommRepo.findById(monthlyBookCheckoutComm.getId());

        if (monthlyBookCheckoutCommDB.isPresent()) {
            MonthlyBookCheckoutComm monthlyBookCheckoutCommUpdate = monthlyBookCheckoutCommDB.get();

            monthlyBookCheckoutCommUpdate.setId(monthlyBookCheckoutComm.getId());
            monthlyBookCheckoutCommUpdate.setVisitNo(monthlyBookCheckoutComm.getVisitNo());
            monthlyBookCheckoutCommUpdate.setDate(monthlyBookCheckoutComm.getDate());
            monthlyBookCheckoutCommUpdate.setOffice(monthlyBookCheckoutComm.getOffice());
            monthlyBookCheckoutCommUpdate.setProject(monthlyBookCheckoutComm.getProject());
            monthlyBookCheckoutCommUpdate.setDistrict(monthlyBookCheckoutComm.getDistrict());
            monthlyBookCheckoutCommUpdate.setUpazilla(monthlyBookCheckoutComm.getUpazilla());
            monthlyBookCheckoutCommUpdate.setCommunityReadingForum(monthlyBookCheckoutComm.getCommunityReadingForum());
            monthlyBookCheckoutCommUpdate.setCommunityVolunteer(monthlyBookCheckoutComm.getCommunityVolunteer());
            monthlyBookCheckoutCommUpdate.setGender(monthlyBookCheckoutComm.getGender());
            monthlyBookCheckoutCommUpdate.setVisitor(monthlyBookCheckoutComm.getVisitor());
            monthlyBookCheckoutCommUpdate.setVisitorDesignation(monthlyBookCheckoutComm.getVisitorDesignation());
            monthlyBookCheckoutCommUpdate.setVisitorOffice(monthlyBookCheckoutComm.getVisitorOffice());
            monthlyBookCheckoutCommUpdate.setLf(monthlyBookCheckoutComm.getLf());
            monthlyBookCheckoutCommUpdate.setLpo(monthlyBookCheckoutComm.getLpo());


            this.monthlyBookCheckoutCommRepo.save(monthlyBookCheckoutCommUpdate);

            return monthlyBookCheckoutCommUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + monthlyBookCheckoutComm.getId());
        }
    }

    //Delete MonthlyBookCheckoutComm
    public void deleteMonthlyBookCheckoutComm(long id) {
        Optional<MonthlyBookCheckoutComm> monthlyBookCheckoutCommDB = this.monthlyBookCheckoutCommRepo.findById(id);

        if (monthlyBookCheckoutCommDB.isPresent()) {
            this.monthlyBookCheckoutCommRepo.delete(monthlyBookCheckoutCommDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
