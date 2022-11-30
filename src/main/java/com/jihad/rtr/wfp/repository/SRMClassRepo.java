//  Author: Mohammad Jihad Hossain
//  Create Date: 10/11/2022
//  Modify Date: 29/11/2022
//  Description: SRM Class repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.SRMClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SRMClassRepo extends JpaRepository<SRMClass, Long> {
}
