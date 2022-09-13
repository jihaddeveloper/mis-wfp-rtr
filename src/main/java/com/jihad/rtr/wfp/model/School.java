//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 13/01/2022
//  Description: School  model file

package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "schools")
@Data
public class School extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "bn_name")
    private String bnName;
    private String upazilla;
    private String district;
    private String headTeacher;
    private String lf;
    private String lfName;
    private String lpo;
    private String lpoName;
    @Column(name = "gps_data")
    private String gpsData;
    @Column(name = "emis_id")
    private String emisId;
    @Column(name = "gsd_id")
    private String gsdId;
    private String address;
    @Column(name = "is_active")
    private String isActive;
    @Column(name = "is_deleted")
    private String isDeleted;
}
