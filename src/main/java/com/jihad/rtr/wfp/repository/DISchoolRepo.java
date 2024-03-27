//  Author: Mohammad Jihad Hossain
//  Create Date: 13/01/2024
//  Modify Date: 13/01/2024
//  Description: DISchool repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.DISchool;
import com.jihad.rtr.wfp.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DISchoolRepo extends JpaRepository<DISchool, Long> {
}
