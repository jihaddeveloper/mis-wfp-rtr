//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 29/06/2022
//  Description: Teacher  model file

package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "teachers")
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "bn_name")
    private String bnName;
    private String project;
    @Column(name = "district")
    private String district;
    @Column(name = "upazilla")
    private String upazilla;
    @Column(name = "gender")
    private String gender;
    @Column(name = "designation")
    private String designation;
    @Column(name = "phone_1")
    private String phone1;
    @Column(name = "phone_2")
    private String phone2;
    private String currentAddress;
    private String permanentAddress;
    private String teacherTraining;
    private String school;
    private String grade;
    private String section;

    private String instruction_g1;
    private String instruction_g2;
    private String instruction_srm_preprimary;
    private String library_management_training;
    private String headteacher_training;
    private String good_governance_headteacher;
    private String school_performance_headteacher;


    private String isActive;
    private String isDeleted;
}
