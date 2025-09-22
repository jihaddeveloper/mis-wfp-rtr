//  Author: Mohammad Jihad Hossain
//  Create Date: 15/05/2024
//  Modify Date: 15/05/2024
//  Description: DI MonthlyBookCheckout model file

package com.jihad.rtr.wfp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "di_book_checkout")
@Data
public class DIBookCheckoutCheckin extends BaseEntity {


    //General data
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "visit_no")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long visitNo;
    @Column(name = "date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;


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
    @Column(name = "head_teacher")
    private String headTeacher;
    @Column(name = "gender")
    private String gender;
    @Column(name = "visitor")
    private String visitor;
    @Column(name = "visitor_designation")
    private String visitorDesignation;
    @Column(name = "visitor_office")
    private String visitorOffice;
    @Column(name = "lf")
    private String lf;
    private String lfName;
    @Column(name = "lpo")
    private String lpo;
    private String lpoName;
    @Column(name = "month")
    private String month;
    @Column(name = "year")
    private String year;

    @Column(name = "rtr_school_id", length = 50)
    private String rtrSchoolId;
    @Column(name = "year_of_support", length = 10)
    private String yearOfSupport;

    @Column(name = "note", length = 150)
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
    private Integer priPrimarySpBoy;
    private Integer priPrimarySpGirl;
    private Integer priPrimarySpTotal;
    private Integer priPrimaryNoSpBoyBC;
    private Integer priPrimaryNoSpGirlBC;
    private Integer priPrimaryNoSpTotalBC;
    private Integer priPrimaryNoBookSpBoyBC;
    private Integer priPrimaryNoBookSpGirlBC;
    private Integer priPrimaryNoBookSpTotalBC;

    private Integer classOneBoy;
    private Integer classOneGirl;
    private Integer classOneTotal;
    private Integer classOneNoBoyBC;
    private Integer classOneNoGirlBC;
    private Integer classOneNoTotalBC;
    private Integer classOneNoBookBoyBC;
    private Integer classOneNoBookGirlBC;
    private Integer classOneNoBookTotalBC;
    private Integer classOneSpBoy;
    private Integer classOneSpGirl;
    private Integer classOneSpTotal;
    private Integer classOneNoSpBoyBC;
    private Integer classOneNoSpGirlBC;
    private Integer classOneNoSpTotalBC;
    private Integer classOneNoBookSpBoyBC;
    private Integer classOneNoBookSpGirlBC;
    private Integer classOneNoBookSpTotalBC;

    private Integer classTwoBoy;
    private Integer classTwoGirl;
    private Integer classTwoTotal;
    private Integer classTwoNoBoyBC;
    private Integer classTwoNoGirlBC;
    private Integer classTwoNoTotalBC;
    private Integer classTwoNoBookBoyBC;
    private Integer classTwoNoBookGirlBC;
    private Integer classTwoNoBookTotalBC;
    private Integer classTwoSpBoy;
    private Integer classTwoSpGirl;
    private Integer classTwoSpTotal;
    private Integer classTwoNoSpBoyBC;
    private Integer classTwoNoSpGirlBC;
    private Integer classTwoNoSpTotalBC;
    private Integer classTwoNoBookSpBoyBC;
    private Integer classTwoNoBookSpGirlBC;
    private Integer classTwoNoBookSpTotalBC;

    private Integer classThreeBoy;
    private Integer classThreeGirl;
    private Integer classThreeTotal;
    private Integer classThreeNoBoyBC;
    private Integer classThreeNoGirlBC;
    private Integer classThreeNoTotalBC;
    private Integer classThreeNoBookBoyBC;
    private Integer classThreeNoBookGirlBC;
    private Integer classThreeNoBookTotalBC;
    private Integer classThreeSpBoy;
    private Integer classThreeSpGirl;
    private Integer classThreeSpTotal;
    private Integer classThreeNoSpBoyBC;
    private Integer classThreeNoSpGirlBC;
    private Integer classThreeNoSpTotalBC;
    private Integer classThreeNoBookSpBoyBC;
    private Integer classThreeNoBookSpGirlBC;
    private Integer classThreeNoBookSpTotalBC;

    private Integer classFourBoy;
    private Integer classFourGirl;
    private Integer classFourTotal;
    private Integer classFourNoBoyBC;
    private Integer classFourNoGirlBC;
    private Integer classFourNoTotalBC;
    private Integer classFourNoBookBoyBC;
    private Integer classFourNoBookGirlBC;
    private Integer classFourNoBookTotalBC;
    private Integer classFourSpBoy;
    private Integer classFourSpGirl;
    private Integer classFourSpTotal;
    private Integer classFourNoSpBoyBC;
    private Integer classFourNoSpGirlBC;
    private Integer classFourNoSpTotalBC;
    private Integer classFourNoBookSpBoyBC;
    private Integer classFourNoBookSpGirlBC;
    private Integer classFourNoBookSpTotalBC;

    private Integer classFiveBoy;
    private Integer classFiveGirl;
    private Integer classFiveTotal;
    private Integer classFiveNoBoyBC;
    private Integer classFiveNoGirlBC;
    private Integer classFiveNoTotalBC;
    private Integer classFiveNoBookBoyBC;
    private Integer classFiveNoBookGirlBC;
    private Integer classFiveNoBookTotalBC;
    private Integer classFiveSpBoy;
    private Integer classFiveSpGirl;
    private Integer classFiveSpTotal;
    private Integer classFiveNoSpBoyBC;
    private Integer classFiveNoSpGirlBC;
    private Integer classFiveNoSpTotalBC;
    private Integer classFiveNoBookSpBoyBC;
    private Integer classFiveNoBookSpGirlBC;
    private Integer classFiveNoBookSpTotalBC;
    // Book checkout data

    // Book check-in data
    private Integer priPrimaryNoBoyBCIn;
    private Integer priPrimaryNoGirlBCIn;
    private Integer priPrimaryNoTotalBCIn;
    private Integer priPrimaryNoBookBoyBCIn;
    private Integer priPrimaryNoBookGirlBCIn;
    private Integer priPrimaryNoBookTotalBCIn;
    private Integer priPrimaryNoSpBoyBCIn;
    private Integer priPrimaryNoSpGirlBCIn;
    private Integer priPrimaryNoSpTotalBCIn;
    private Integer priPrimaryNoBookSpBoyBCIn;
    private Integer priPrimaryNoBookSpGirlBCIn;
    private Integer priPrimaryNoBookSpTotalBCIn;


    private Integer classOneNoBoyBCIn;
    private Integer classOneNoGirlBCIn;
    private Integer classOneNoTotalBCIn;
    private Integer classOneNoBookBoyBCIn;
    private Integer classOneNoBookGirlBCIn;
    private Integer classOneNoBookTotalBCIn;
    private Integer classOneNoSpBoyBCIn;
    private Integer classOneNoSpGirlBCIn;
    private Integer classOneNoSpTotalBCIn;
    private Integer classOneNoBookSpBoyBCIn;
    private Integer classOneNoBookSpGirlBCIn;
    private Integer classOneNoBookSpTotalBCIn;


    private Integer classTwoNoBoyBCIn;
    private Integer classTwoNoGirlBCIn;
    private Integer classTwoNoTotalBCIn;
    private Integer classTwoNoBookBoyBCIn;
    private Integer classTwoNoBookGirlBCIn;
    private Integer classTwoNoBookTotalBCIn;
    private Integer classTwoNoSpBoyBCIn;
    private Integer classTwoNoSpGirlBCIn;
    private Integer classTwoNoSpTotalBCIn;
    private Integer classTwoNoBookSpBoyBCIn;
    private Integer classTwoNoBookSpGirlBCIn;
    private Integer classTwoNoBookSpTotalBCIn;


    private Integer classThreeNoBoyBCIn;
    private Integer classThreeNoGirlBCIn;
    private Integer classThreeNoTotalBCIn;
    private Integer classThreeNoBookBoyBCIn;
    private Integer classThreeNoBookGirlBCIn;
    private Integer classThreeNoBookTotalBCIn;
    private Integer classThreeNoSpBoyBCIn;
    private Integer classThreeNoSpGirlBCIn;
    private Integer classThreeNoSpTotalBCIn;
    private Integer classThreeNoBookSpBoyBCIn;
    private Integer classThreeNoBookSpGirlBCIn;
    private Integer classThreeNoBookSpTotalBCIn;


    private Integer classFourNoBoyBCIn;
    private Integer classFourNoGirlBCIn;
    private Integer classFourNoTotalBCIn;
    private Integer classFourNoBookBoyBCIn;
    private Integer classFourNoBookGirlBCIn;
    private Integer classFourNoBookTotalBCIn;
    private Integer classFourNoSpBoyBCIn;
    private Integer classFourNoSpGirlBCIn;
    private Integer classFourNoSpTotalBCIn;
    private Integer classFourNoBookSpBoyBCIn;
    private Integer classFourNoBookSpGirlBCIn;
    private Integer classFourNoBookSpTotalBCIn;


    private Integer classFiveNoBoyBCIn;
    private Integer classFiveNoGirlBCIn;
    private Integer classFiveNoTotalBCIn;
    private Integer classFiveNoBookBoyBCIn;
    private Integer classFiveNoBookGirlBCIn;
    private Integer classFiveNoBookTotalBCIn;
    private Integer classFiveNoSpBoyBCIn;
    private Integer classFiveNoSpGirlBCIn;
    private Integer classFiveNoSpTotalBCIn;
    private Integer classFiveNoBookSpBoyBCIn;
    private Integer classFiveNoBookSpGirlBCIn;
    private Integer classFiveNoBookSpTotalBCIn;
    // Book check-in data

    //Total data
    private Integer schoolTotalNoGirl;
    private Integer schoolTotalNoBoy;
    private Integer schoolTotalNoStudent;
    private Integer schoolTotalNoGirlBC;
    private Integer schoolTotalNoBoyBC;
    private Integer schoolTotalNoStudentBC;
    private Integer schoolTotalNoBookBC;
    private Integer schoolTotalNoStudentBCIn;
    private Integer schoolTotalNoBookBCIn;

    private Integer schoolTotalNoSpStudent;
    private Integer schoolTotalNoSpStudentBC;
    private Integer schoolTotalNoSpBookBC;
    private Integer schoolTotalNoSpStudentBCIn;
    private Integer schoolTotalNoSpBookBCIn;
    //Total data

    @Column(name = "is_checked", length = 10)
    private String isChecked;
    @Column(name = "is_active", length = 10)
    private String isActive;
    @Column(name = "is_deleted", length = 10)
    private String isDeleted;
}
