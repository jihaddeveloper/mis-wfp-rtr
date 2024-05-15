//  Author: Mohammad Jihad Hossain
//  Create Date: 15/05/2024
//  Modify Date: 15/05/2024
//  Description: DI Monthly book checkout checkin repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.DIBookCheckoutCheckin;
import com.jihad.rtr.wfp.model.MonthlyBookCheckout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DIMonthlyBookCheckoutCheckinRepo extends JpaRepository<DIBookCheckoutCheckin, Long> {
}
