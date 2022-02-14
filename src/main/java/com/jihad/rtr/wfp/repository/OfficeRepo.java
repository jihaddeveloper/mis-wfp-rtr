//  Author: Mohammad Jihad Hossain
//  Create Date: 14/02/2022
//  Modify Date: 14/02/2022
//  Description: Office repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepo extends JpaRepository<Office, Long> {
}
