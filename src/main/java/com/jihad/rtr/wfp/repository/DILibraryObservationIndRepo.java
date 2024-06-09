//  Author: Mohammad Jihad Hossain
//  Create Date: 01/07/2024
//  Modify Date: 01/07/2024
//  Description: DILibraryObservationIndicator repo file


package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.DILibraryObservationIndicator;
import com.jihad.rtr.wfp.model.LibraryObservationIndicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DILibraryObservationIndRepo extends JpaRepository<DILibraryObservationIndicator, Long> {
}
