//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 24/11/2022
//  Description: SRM Indicator  model file


package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "srm_indicators")
@Data
public class SRMIndicator extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "serial", length = 10)
    private String serial;
    @Column(name = "indicator_detail", length = 300)
    private String indicatorDetail;
    @Column(name = "indicator_detail_eng", length = 300)
    private String indicatorDetailEng;
    @Column(name = "priority", length = 10)
    private String priority;
    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;
}
