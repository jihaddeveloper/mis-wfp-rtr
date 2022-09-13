//  Author: Mohammad Jihad Hossain
//  Create Date: 13/09/2022
//  Modify Date: 13/09/2022
//  Description: BookCaptain repo file

package com.jihad.rtr.wfp.repository;

import com.jihad.rtr.wfp.model.BookCaptain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCaptainRepo extends JpaRepository<BookCaptain, Long> {
}
