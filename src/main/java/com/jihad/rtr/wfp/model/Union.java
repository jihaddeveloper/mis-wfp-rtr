//  Author: Mohammad Jihad Hossain
//  Create Date: 02/01/2022
//  Modify Date: 03/01/2022
//  Description: Union  model file


package com.jihad.rtr.wfp.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "unions")
@Data
public class Union extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name",unique = true)
    private String name;
    @Column(name = "bn_name")
    private String bnName;
    @Column(name = "lat")
    private  String lat;
    @Column(name = "lon")
    private String lon;
    @Column(name = "url")
    private String url;
    @Column(name = "is_active")
    private String isActive;
    @Column(name = "is_deleted")
    private String isDeleted;

    @ManyToOne
    @JoinColumn(name = "upazila_id")
    private Upazila upazila;
}
