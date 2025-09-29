//  Author: Mohammad Jihad Hossain
//  Create Date: 28/09/2025
//  Modify Date: 28/09/2025
//  Description: PEmployee  model file


package com.jihad.rtr.wfp.model.prevail;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jihad.rtr.wfp.model.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "p_employees")
@Data
public class PEmployee extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "employee_reg_id")
    private String employeeRegId;
    @Column(name = "name")
    private String name;
    @Column(name = "bn_name")
    private String bnName;
    @Column(name = "gender")
    private String gender;
    private String designation;
    private String supervisor;
    private String office;
    private String project;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "join_date")
    private Date joinDate;

    @Column(name = "email")
    private String email;
    @Column(name = "phone1")
    private String phone1;
    @Column(name = "phone2")
    private String phone2;
    @Column(name = "address_current")
    private String addressCurrent;
    @Column(name = "address_permanent")
    private String addressPermanent;
    @Column(name = "is_active")
    private String isActive;
    @Column(name = "is_deleted")
    private String isDeleted;
}
