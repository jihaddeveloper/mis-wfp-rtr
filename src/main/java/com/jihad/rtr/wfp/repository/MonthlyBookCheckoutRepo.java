//  Author: Mohammad Jihad Hossain
//  Create Date: 17/01/2022
//  Modify Date: 17/01/2022
//  Description: Monthly book checkout repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.MonthlyBookCheckout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyBookCheckoutRepo extends JpaRepository<MonthlyBookCheckout, Long> {
}
