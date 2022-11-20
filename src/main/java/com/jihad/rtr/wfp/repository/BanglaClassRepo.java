//  Author: Mohammad Jihad Hossain
//  Create Date: 10/11/2022
//  Modify Date: 10/11/2022
//  Description: Bangla Class repo file


package com.jihad.rtr.wfp.repository;


import com.jihad.rtr.wfp.model.BanglaClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanglaClassRepo extends JpaRepository<BanglaClass, Long> {
}
