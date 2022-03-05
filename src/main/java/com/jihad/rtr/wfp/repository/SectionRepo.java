//  Author: Mohammad Jihad Hossain
//  Create Date: 01/03/2022
//  Modify Date: 01/03/2022
//  Description: Section repository file



package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepo extends JpaRepository<Section, Long> {
}
