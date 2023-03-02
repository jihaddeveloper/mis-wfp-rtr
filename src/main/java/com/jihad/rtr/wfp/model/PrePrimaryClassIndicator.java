//  Author: Mohammad Jihad Hossain
//  Create Date: 16/02/2023
//  Modify Date: 16/02/2023
//  Description: Preprimary class indicator  model file

package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
@Table(name = "preprimary_indicator")
public class PrePrimaryClassIndicator extends BaseEntity {
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
