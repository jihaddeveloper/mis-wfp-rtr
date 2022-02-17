//  Author: Mohammad Jihad Hossain
//  Create Date: 15/02/2022
//  Modify Date: 15/02/2022
//  Description: Project repository file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {
}
