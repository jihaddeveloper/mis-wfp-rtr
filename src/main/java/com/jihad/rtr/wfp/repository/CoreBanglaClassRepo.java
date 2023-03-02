//  Author: Mohammad Jihad Hossain
//  Create Date: 22/02/2023
//  Modify Date: 22/02/2023
//  Description: PreprimaryIndicatorRepo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.CoreBanglaClass;
import com.jihad.rtr.wfp.model.CoreBanglaIndicator;
import com.jihad.rtr.wfp.model.PrePrimaryClassIndicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreBanglaClassRepo extends JpaRepository<CoreBanglaClass, Long> {
}
