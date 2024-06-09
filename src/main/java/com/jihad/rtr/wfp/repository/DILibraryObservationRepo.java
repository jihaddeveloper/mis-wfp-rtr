//  Author: Mohammad Jihad Hossain
//  Create Date: 01/07/2024
//  Modify Date: 01/07/2024
//  Description: DI Library observation  repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.DILibraryObservation;
import com.jihad.rtr.wfp.model.LibraryObservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DILibraryObservationRepo extends JpaRepository<DILibraryObservation, Long> {
}
