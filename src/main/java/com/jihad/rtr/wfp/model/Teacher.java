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
public class Teacher extends BaseEntity {
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
    @Column(name = "current_address")
    private String currentAddress;
    @Column(name = "permanent_address")
    private String permanentAddress;
    @Column(name = "school")
    private String school;
    @Column(name = "grade")
    private String grade;
    @Column(name = "section")
    private String section;
    @Column(name = "teacher_training")
    private String teacherTraining;

    // Training
    @Column(name = "instruction_preprimary")
    private String instructionPreprimary;
    @Column(name = "instruction_g1")
    private String instructionG1;
    @Column(name = "instruction_g2")
    private String instructionG2;
    @Column(name = "library_management_srm")
    private String libraryManagementSRM;
    @Column(name = "headteacher_training")
    private String headteacherTraining;
    @Column(name = "good_governance_headteacher")
    private String goodGovernanceHeadteacher;
    @Column(name = "school_performance_headteacher")
    private String schoolPerformanceHeadteacher;


    @Column(name = "training_year")
    private String trainingYear;
    @Column(name = "activity")
    private String activity;


    // new entity


    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;

}
