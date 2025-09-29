//  Author: Mohammad Jihad Hossain
//  Create Date: 28/09/2025
//  Modify Date: 28/09/2025
//  Description: PTeacher  model file


package com.jihad.rtr.wfp.model.prevail;

import com.jihad.rtr.wfp.model.BaseEntity;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "p_teacher")
@Data
public class PTeacher extends BaseEntity {

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
    @Column(name = "school_id")
    private String schoolId;
    @Column(name = "school_name")
    private String schoolName;

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


    @Column(name = "grade_pprimary")
    private String gradePPrimary;
    @Column(name = "grade_g1")
    private String gradeG1;
    @Column(name = "grade_g2")
    private String gradeG2;
    @Column(name = "grade_g3")
    private String gradeG3;
    @Column(name = "grade_g4")
    private String gradeG4;
    @Column(name = "grade_g5")
    private String gradeG5;



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
