//  Author: Mohammad Jihad Hossain
//  Create Date: 18/09/2024
//  Modify Date: 18/09/2024
//  Description: School Monitoring repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.SchoolMonitoring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolMonitoringRepo extends JpaRepository<SchoolMonitoring, Long> {
}
