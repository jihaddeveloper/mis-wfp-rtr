//  Author: Mohammad Jihad Hossain
//  Create Date: 03/03/2026
//  Modify Date: 03/03/2026
//  Description: PSRMClassRepo file


package com.jihad.rtr.wfp.repository.prevail;

import com.jihad.rtr.wfp.model.prevail.PLibraryObservation;
import com.jihad.rtr.wfp.model.prevail.PSRMClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PSRMClassRepo extends JpaRepository<PSRMClass, Long> {
}
