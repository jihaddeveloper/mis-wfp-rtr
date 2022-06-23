//  Author: Mohammad Jihad Hossain
//  Create Date: 17/01/2022
//  Modify Date: 29/06/2022
//  Description: Library model file

package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "library")
@Data
public class Library extends BaseEntity {
    //General data
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "office")
    private String office;
    @Column(name = "project")
    private String project;
    @Column(name = "district")
    private String district;
    @Column(name = "upazilla")
    private String upazilla;
    @Column(name = "school")
    private String school;
    @Column(name = "class_name")
    private String className;

    //Library Register Data
    private Integer titleTotal;
    private Integer bookTotal;
    private Integer titleNoGreen;
    private Integer bookNoGreen;
    private Integer titleNoRed;
    private Integer bookNoRed;
    private Integer titleNoOrange;
    private Integer bookNoOrange;
    private Integer titleNoWhite;
    private Integer bookNoWhite;
    private Integer titleNoBlue;
    private Integer bookNoBlue;
    private Integer titleNoYellow;
    private Integer bookNoYellow;
    //Library Register Data

    @Column(name = "activity")
    private String activity;
}
