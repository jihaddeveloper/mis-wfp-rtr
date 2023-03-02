//  Author: Mohammad Jihad Hossain
//  Create Date: 22/02/2023
//  Modify Date: 22/02/2023
//  Description: PreprimaryIndicatorRepo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.BanglaIndicator;
import com.jihad.rtr.wfp.model.PrePrimaryClassIndicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreprimaryIndicatorRepo extends JpaRepository<PrePrimaryClassIndicator, Long> {
}

