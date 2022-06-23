//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 29/06/2022
//  Description: Student  model file


package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "students")
@Data
public class Student extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String gender;
    private String roll;
    private String mother;
    private String father;
    private String phone;
    private String dateOfBirth;
    private String address;
    private String specialChild;
    private String schoolId;
    private String gradeId;
    private String sectionId;
    private String isActive;
    private String isDeleted;
    private Date createDate;
    private Date updateDate;
    private Date deleteDate;

}
