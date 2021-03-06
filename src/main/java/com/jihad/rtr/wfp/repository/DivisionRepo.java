//  Author: Mohammad Jihad Hossain
//  Create Date: 09/01/2022
//  Modify Date: 12/01/2022
//  Description: Division repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepo extends JpaRepository<Division, Long> {

}
