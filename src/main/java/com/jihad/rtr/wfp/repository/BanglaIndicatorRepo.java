//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 20/11/2022
//  Description: Bangla Indicator repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.BanglaClass;
import com.jihad.rtr.wfp.model.BanglaIndicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanglaIndicatorRepo extends JpaRepository<BanglaIndicator, Long> {
}
