//  Author: Mohammad Jihad Hossain
//  Create Date: 15/02/2024
//  Modify Date: 16/02/2024
//  Description: DITeacher repository file


package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.DITeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DITeacherRepo extends JpaRepository<DITeacher, Long> {
}
