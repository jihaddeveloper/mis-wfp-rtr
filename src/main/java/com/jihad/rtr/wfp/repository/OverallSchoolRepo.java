//  Author: Mohammad Jihad Hossain
//  Create Date: 20/11/2022
//  Modify Date: 08/01/2023
//  Description: OverallSchool repo file

package com.jihad.rtr.wfp.repository;


import com.jihad.rtr.wfp.model.OverallSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverallSchoolRepo extends JpaRepository<OverallSchool, Long> {
}
