//  Author: Mohammad Jihad Hossain
//  Create Date: 22/02/2023
//  Modify Date: 22/02/2023
//  Description: PreprimaryIndicatorRepo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.DIBanglaClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DIBanglaClassRepo extends JpaRepository<DIBanglaClass, Long> {
}
