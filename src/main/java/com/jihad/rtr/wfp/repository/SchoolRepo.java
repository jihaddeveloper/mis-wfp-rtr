//  Author: Mohammad Jihad Hossain
//  Create Date: 13/01/2021
//  Modify Date: 13/01/2022
//  Description: School repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long> {
}
