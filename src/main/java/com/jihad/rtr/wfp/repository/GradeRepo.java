//  Author: Mohammad Jihad Hossain
//  Create Date: 01/03/2022
//  Modify Date: 01/03/2022
//  Description: Grade repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepo extends JpaRepository<Grade, Long> {
}
