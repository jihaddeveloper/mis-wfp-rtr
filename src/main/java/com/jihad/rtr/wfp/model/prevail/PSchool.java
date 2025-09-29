//  Author: Mohammad Jihad Hossain
//  Create Date: 28/09/2025
//  Modify Date: 28/09/2025
//  Description: PSchool  model file


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
@Table(name = "p_school")
@Data
public class PSchool extends BaseEntity {

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
    @Column(name = "address")
    private String address;


    @Column(name = "pp_boy")
    private int ppBoy;
    @Column(name = "pp_girl")
    private int ppGirl;
    @Column(name = "pp_total")
    private int ppTotal;
    @Column(name = "g1_boy")
    private int g1Boy;
    @Column(name = "g1_girl")
    private int g1Girl;
    @Column(name = "g1_total")
    private int g1Total;
    @Column(name = "g2_boy")
    private int g2Boy;
    @Column(name = "g2_girl")
    private int g2Girl;
    @Column(name = "g2_total")
    private int g2Total;
    @Column(name = "g3_boy")
    private int g3Boy;
    @Column(name = "g3_girl")
    private int g3Girl;
    @Column(name = "g3_total")
    private int g3Total;
    @Column(name = "g4_boy")
    private int g4Boy;
    @Column(name = "g4_girl")
    private int g4Girl;
    @Column(name = "g4_total")
    private int g4Total;
    @Column(name = "g5_boy")
    private int g5Boy;
    @Column(name = "g5_girl")
    private int g5Girl;
    @Column(name = "g5_total")
    private int g5Total;

    @Column(name = "school_total")
    private int schoolTotal;


    @Column(name = "support_year")
    private int supportYear;

    @Column(name = "is_active")
    private String isActive;
    @Column(name = "is_deleted")
    private String isDeleted;
}
