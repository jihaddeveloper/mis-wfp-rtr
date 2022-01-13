//  Author: Mohammad Jihad Hossain
//  Create Date: 12/01/2021
//  Modify Date: 12/01/2022
//  Description: Employee repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
