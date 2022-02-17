//  Author: Mohammad Jihad Hossain
//  Create Date: 15/02/2022
//  Modify Date: 16/02/2022
//  Description: Teacher repository file


package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {
}
