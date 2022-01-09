//  Author: Mohammad Jihad Hossain
//  Create Date: 04/01/2022
//  Modify Date: 04/01/2022
//  Description: Library observation  repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.LibraryObservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryObservationRepo extends JpaRepository<LibraryObservation, Long> {
}
