//  Author: Mohammad Jihad Hossain
//  Create Date: 26/02/2023
//  Modify Date: 26/02/2023
//  Description: PreprimaryClassRepo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.PrePrimaryClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreprimaryClassRepo extends JpaRepository<PrePrimaryClass, Long> {
}
