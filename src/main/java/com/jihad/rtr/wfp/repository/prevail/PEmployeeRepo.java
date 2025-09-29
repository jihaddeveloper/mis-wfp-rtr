//  Author: Mohammad Jihad Hossain
//  Create Date: 28/09/2025
//  Modify Date: 28/09/2025
//  Description: PEmployeeRepo file

package com.jihad.rtr.wfp.repository.prevail;

import com.jihad.rtr.wfp.model.prevail.PBanglaClass;
import com.jihad.rtr.wfp.model.prevail.PEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PEmployeeRepo extends JpaRepository<PEmployee, Long> {
}
