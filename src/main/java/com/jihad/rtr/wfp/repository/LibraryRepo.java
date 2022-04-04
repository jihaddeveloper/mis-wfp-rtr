//  Author: Mohammad Jihad Hossain
//  Create Date: 04/04/2022
//  Modify Date: 04/04/2022
//  Description: Library repo file


package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Division;
import com.jihad.rtr.wfp.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Long> {
}
