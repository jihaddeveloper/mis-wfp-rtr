//  Author: Mohammad Jihad Hossain
//  Create Date: 28/07/2022
//  Modify Date: 28/07/2022
//  Description: Student repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
