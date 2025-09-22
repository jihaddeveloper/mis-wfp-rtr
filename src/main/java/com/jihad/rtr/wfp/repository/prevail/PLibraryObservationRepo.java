//  Author: Mohammad Jihad Hossain
//  Create Date: 09/09/2025
//  Modify Date: 09/09/2025
//  Description: PLibraryObservationRepo file

package com.jihad.rtr.wfp.repository.prevail;


import com.jihad.rtr.wfp.model.prevail.PLibraryObservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PLibraryObservationRepo extends JpaRepository<PLibraryObservation, Long> {
}
