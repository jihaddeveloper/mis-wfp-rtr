//  Author: Mohammad Jihad Hossain
//  Create Date: 05/01/2026
//  Modify Date: 05/01/2026
//  Description: PPrePrimaryRepo file


package com.jihad.rtr.wfp.repository.prevail;

import com.jihad.rtr.wfp.model.prevail.PPrePrimary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PPrePrimaryRepo extends JpaRepository<PPrePrimary, Long> {
}
