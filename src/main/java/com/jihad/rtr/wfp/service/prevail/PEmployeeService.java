//  Author: Mohammad Jihad Hossain
//  Create Date: 28/09/2025
//  Modify Date: 28/09/2025
//  Description: PEmployeeService file

package com.jihad.rtr.wfp.service.prevail;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DIEmployee;
import com.jihad.rtr.wfp.model.prevail.PEmployee;
import com.jihad.rtr.wfp.repository.DIEmployeeRepo;
import com.jihad.rtr.wfp.repository.prevail.PEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PEmployeeService {

    @Autowired
    private PEmployeeRepo pEmployeeRepo;

    //Create new PEmployee
    public PEmployee createPEmployee(PEmployee diEmployee) {
        return pEmployeeRepo.save(diEmployee);
    }

    //Get all PEmployee
    public List<PEmployee> getAllPEmployee() {
        return pEmployeeRepo.findAll();
    }

    //Get PEmployee with id
    public PEmployee getPEmployeeById(long id) {
        Optional<PEmployee> employeeDB = pEmployeeRepo.findById(id);
        if (employeeDB.isPresent()) {
            return employeeDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update PEmployee
    public PEmployee updatePEmployee(PEmployee employee) {
        Optional<PEmployee> employeeDB = pEmployeeRepo.findById(employee.getId());

        if (employeeDB.isPresent()) {
            PEmployee employeeUpdate = employeeDB.get();
            employeeUpdate.setId(employee.getId());
            employeeUpdate.setName(employee.getName());
            employeeUpdate.setBnName(employee.getBnName());
            employeeUpdate.setGender(employee.getGender());
            employeeUpdate.setDesignation(employee.getDesignation());
            employeeUpdate.setSupervisor(employee.getSupervisor());
            employeeUpdate.setOffice(employee.getOffice());
            employeeUpdate.setEmployeeRegId(employee.getEmployeeRegId());
            employeeUpdate.setProject(employee.getProject());
            employeeUpdate.setJoinDate(employee.getJoinDate());
            employeeUpdate.setEmail(employee.getEmail());
            employeeUpdate.setPhone1(employee.getPhone1());
            employeeUpdate.setPhone2(employee.getPhone2());
            employeeUpdate.setAddressCurrent(employee.getAddressCurrent());
            employeeUpdate.setAddressPermanent(employee.getAddressPermanent());
            employeeUpdate.setIsActive(employee.getIsActive());
            employeeUpdate.setIsDeleted(employee.getIsDeleted());

            pEmployeeRepo.save(employeeUpdate);

            return employeeUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + employee.getId());
        }
    }

    //Delete PEmployee
    public void deletePEmployee(long id) {
        Optional<PEmployee> employeeDB = this.pEmployeeRepo.findById(id);

        if (employeeDB.isPresent()) {
            this.pEmployeeRepo.delete(employeeDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
