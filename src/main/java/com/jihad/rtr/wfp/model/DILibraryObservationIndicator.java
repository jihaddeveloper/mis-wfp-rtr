//Author: Mohammad Jihad Hossain
//Create Date: 02/07/2024
//Modify Date: 02/07/2024
//Description: DILibraryIndicator  model file


package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "di_library_observation_indicator")
@Data
public class DILibraryObservationIndicator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "serial")
    private String serial;
    @Column(name = "indicator_detail")
    private String indicatorDetail;
    @Column(name = "priority")
    private String priority;
    @Column(name = "is_active")
    private String isActive;
    @Column(name = "is_deleted")
    private String isDeleted;
}
