//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 24/11/2022
//  Description: SRM Indicator repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.SRMIndicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SRMIndicatorRepo extends JpaRepository<SRMIndicator, Long> {
}
