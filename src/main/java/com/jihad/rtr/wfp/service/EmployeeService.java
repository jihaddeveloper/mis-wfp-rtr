//  Author: Mohammad Jihad Hossain
//  Create Date: 09/01/2022
//  Modify Date: 12/01/2022
//  Description: Employee service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.Employee;
import com.jihad.rtr.wfp.repository.DivisionRepo;
import com.jihad.rtr.wfp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    //Create new employee
    public Employee createEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    //Get all division
    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    //Get employee with id
    public Employee getEmployeeById(long id){
        Optional<Employee> employeeDB = employeeRepo.findById(id);
        if(employeeDB.isPresent()){
            return employeeDB.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }

    }

    //Update employee
    public Employee updateEmployee(Employee employee){
        Optional<Employee> employeeDB = employeeRepo.findById(employee.getId());

        if(employeeDB.isPresent()){
            Employee employeeUpdate = employeeDB.get();
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

            employeeRepo.save(employeeUpdate);

            return employeeUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : "+ employee.getId());
        }
    }

    //Delete division
    public void deleteEmployee(long id){
        Optional<Employee> employeeDB = this.employeeRepo.findById(id);

        if(employeeDB.isPresent()){
            this.employeeRepo.delete(employeeDB.get());
        }else {
            throw new ResourceNotFoundException("Record no found with id : "+ id);
        }
    }
}
