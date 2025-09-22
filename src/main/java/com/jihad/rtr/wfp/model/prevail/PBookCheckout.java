//  Author: Mohammad Jihad Hossain
//  Create Date: 07/09/2025
//  Modify Date: 07/09/2025
//  Description: PBookCheckout class  model file

package com.jihad.rtr.wfp.model.prevail;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jihad.rtr.wfp.model.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
@Table(name = "p_book_checkout")
public class PBookCheckout extends BaseEntity {
    //General data
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "visit_no")
    private long visitNo;
    @Column(name = "date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;
    @Column(name = "office", length = 50)
    private String office;
    @Column(name = "project", length = 50)
    private String project;
    @Column(name = "district", length = 50)
    private String district;
    @Column(name = "upazilla", length = 50)
    private String upazilla;
    @Column(name = "visitor", length = 50)
    private String visitor;
    @Column(name = "visitor_designation", length = 50)
    private String visitorDesignation;
    @Column(name = "visitor_office", length = 50)
    private String visitorOffice;
    @Column(name = "lf", length = 50)
    private String lf;
    @Column(name = "lf_name", length = 50)
    private String lfName;
    @Column(name = "lpo", length = 50)
    private String lpo;
    @Column(name = "lpo_name", length = 50)
    private String lpoName;
    @Column(name = "school", length = 50)
    private String school;
    @Column(name = "rtr_school_id", length = 50)
    private String rtrSchoolId;
    @Column(name = "year_of_support", length = 10)
    private String yearOfSupport;
    @Column(name = "point_teacher", length = 100)
    private String pointTeacher;
    @Column(name = "year_of_established", length = 20)
    private String yearOfEstablished;
    @Column(name = "month", length = 50)
    private String month;
    @Column(name = "year", length = 50)
    private String year;
    @Column(name = "phase", length = 50)
    private String phase;


    @Column(name = "note", length = 300)
    private String note;

    //General data


    // Book checkout data
    private Integer priPrimaryBoy;
    private Integer priPrimaryGirl;
    private Integer priPrimaryTotal;
    private Integer priPrimaryNoBoyBC;
    private Integer priPrimaryNoGirlBC;
    private Integer priPrimaryNoTotalBC;
    private Integer priPrimaryNoBookBoyBC;
    private Integer priPrimaryNoBookGirlBC;
    private Integer priPrimaryNoBookTotalBC;


    private Integer classOneBoy;
    private Integer classOneGirl;
    private Integer classOneTotal;
    private Integer classOneNoBoyBC;
    private Integer classOneNoGirlBC;
    private Integer classOneNoTotalBC;
    private Integer classOneNoBookBoyBC;
    private Integer classOneNoBookGirlBC;
    private Integer classOneNoBookTotalBC;


    private Integer classTwoBoy;
    private Integer classTwoGirl;
    private Integer classTwoTotal;
    private Integer classTwoNoBoyBC;
    private Integer classTwoNoGirlBC;
    private Integer classTwoNoTotalBC;
    private Integer classTwoNoBookBoyBC;
    private Integer classTwoNoBookGirlBC;
    private Integer classTwoNoBookTotalBC;


    private Integer classThreeBoy;
    private Integer classThreeGirl;
    private Integer classThreeTotal;
    private Integer classThreeNoBoyBC;
    private Integer classThreeNoGirlBC;
    private Integer classThreeNoTotalBC;
    private Integer classThreeNoBookBoyBC;
    private Integer classThreeNoBookGirlBC;
    private Integer classThreeNoBookTotalBC;


    private Integer classFourBoy;
    private Integer classFourGirl;
    private Integer classFourTotal;
    private Integer classFourNoBoyBC;
    private Integer classFourNoGirlBC;
    private Integer classFourNoTotalBC;
    private Integer classFourNoBookBoyBC;
    private Integer classFourNoBookGirlBC;
    private Integer classFourNoBookTotalBC;


    private Integer classFiveBoy;
    private Integer classFiveGirl;
    private Integer classFiveTotal;
    private Integer classFiveNoBoyBC;
    private Integer classFiveNoGirlBC;
    private Integer classFiveNoTotalBC;
    private Integer classFiveNoBookBoyBC;
    private Integer classFiveNoBookGirlBC;
    private Integer classFiveNoBookTotalBC;

    // Book checkout data


    //Total data
    private Integer schoolTotalNoGirl;
    private Integer schoolTotalNoBoy;
    private Integer schoolTotalNoStudent;
    private Integer schoolTotalNoGirlBC;
    private Integer schoolTotalNoBoyBC;
    private Integer schoolTotalNoStudentBC;
    private Integer schoolTotalNoBookGirlBC;
    private Integer schoolTotalNoBookBoyBC;
    private Integer schoolTotalNoBookBC;


    //Total data

    @Column(name = "is_checked", length = 10)
    private String isChecked;
    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;
}
