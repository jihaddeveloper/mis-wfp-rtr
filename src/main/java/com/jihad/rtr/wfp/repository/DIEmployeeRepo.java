//  Author: Mohammad Jihad Hossain
//  Create Date: 06/03/2024
//  Modify Date: 06/03/2024
//  Description: DIEmployee repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.DIEmployee;
import com.jihad.rtr.wfp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DIEmployeeRepo extends JpaRepository<DIEmployee, Long> {
}
