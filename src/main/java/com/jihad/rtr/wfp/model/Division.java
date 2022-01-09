//  Author: Mohammad Jihad Hossain
//  Create Date: 02/01/2021
//  Modify Date: 03/01/2022
//  Description: Division  model file

package com.jihad.rtr.wfp.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "divisions")
@Data
public class Division extends BaseEntity {
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

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<District> districts;
}
