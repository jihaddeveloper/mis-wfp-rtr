//  Author: Mohammad Jihad Hossain
//  Create Date: 06/03/2024
//  Modify Date: 06/03/2024
//  Description: DIEmployee service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.DIEmployee;
import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.repository.DIEmployeeRepo;
import com.jihad.rtr.wfp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DIEmployeeService {

    @Autowired
    private DIEmployeeRepo diEmployeeRepo;

    //Create new DIEmployee
    public DIEmployee createDIEmployee(DIEmployee diEmployee) {
        return diEmployeeRepo.save(diEmployee);
    }

    //Get all DIEmployee
    public List<DIEmployee> getAllDIEmployee() {
        return diEmployeeRepo.findAll();
    }

    //Get DIEmployee with id
    public DIEmployee getDIEmployeeById(long id) {
        Optional<DIEmployee> employeeDB = diEmployeeRepo.findById(id);
        if (employeeDB.isPresent()) {
            return employeeDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update DIEmployee
    public DIEmployee updateDIEmployee(DIEmployee employee) {
        Optional<DIEmployee> employeeDB = diEmployeeRepo.findById(employee.getId());

        if (employeeDB.isPresent()) {
            DIEmployee employeeUpdate = employeeDB.get();
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

            diEmployeeRepo.save(employeeUpdate);

            return employeeUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + employee.getId());
        }
    }

    //Delete DIEmployee
    public void deleteDIEmployee(long id) {
        Optional<DIEmployee> employeeDB = this.diEmployeeRepo.findById(id);

        if (employeeDB.isPresent()) {
            this.diEmployeeRepo.delete(employeeDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
