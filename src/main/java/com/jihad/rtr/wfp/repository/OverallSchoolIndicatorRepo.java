//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 29/11/2022
//  Description: OverallSchool Indicator repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.OverallSchool;
import com.jihad.rtr.wfp.model.OverallSchoolIndicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverallSchoolIndicatorRepo extends JpaRepository<OverallSchoolIndicator, Long> {
}
