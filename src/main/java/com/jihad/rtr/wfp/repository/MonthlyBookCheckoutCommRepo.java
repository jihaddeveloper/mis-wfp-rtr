//  Author: Mohammad Jihad Hossain
//  Create Date: 04/04/2022
//  Modify Date: 04/04/2022
//  Description: MonthlyBookCheckoutComm Repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Library;
import com.jihad.rtr.wfp.model.MonthlyBookCheckoutComm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyBookCheckoutCommRepo extends JpaRepository<MonthlyBookCheckoutComm, Long> {
}
