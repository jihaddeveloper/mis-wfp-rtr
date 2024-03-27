// Author: Mohammad Jihad Hossain
//  Create Date: 26/02/2024
//  Modify Date: 26/02/2024
//  Description: DI BanglaIndicatorRepo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.DIBanglaIndicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DIBanglaIndicatorRepo extends JpaRepository<DIBanglaIndicator, Long> {
}
