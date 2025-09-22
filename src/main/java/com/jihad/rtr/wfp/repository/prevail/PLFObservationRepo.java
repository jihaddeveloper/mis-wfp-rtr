//  Author: Mohammad Jihad Hossain
//  Create Date: 09/09/2025
//  Modify Date: 09/09/2025
//  Description: PLFObservationRepo file

package com.jihad.rtr.wfp.repository.prevail;

import com.jihad.rtr.wfp.model.prevail.PLFObservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PLFObservationRepo extends JpaRepository<PLFObservation, Long> {
}
