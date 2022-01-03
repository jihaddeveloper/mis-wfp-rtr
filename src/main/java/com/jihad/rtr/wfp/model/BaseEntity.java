//  Author: Mohammad Jihad Hossain
//  Create Date: 02/01/2021
//  Modify Date: 02/01/2021
//  Description: BaseEntity  model file

package com.jihad.rtr.wfp.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @CreatedDate
    @Column(name = "create_date")
    private Date createDate;

    @LastModifiedDate
    @Column(name = "update_date")
    private Date updateDate;
}
