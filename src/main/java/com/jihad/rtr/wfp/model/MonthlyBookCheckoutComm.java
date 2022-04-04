//  Author: Mohammad Jihad Hossain
//  Create Date: 04/04/2022
//  Modify Date: 04/04/2022
//  Description: MonthlyBookCheckoutComm model file

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
@Table(name = "monthly_book_checkout_comm")
@Data
public class MonthlyBookCheckoutComm extends BaseEntity {

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
    @Column(name = "community_reading_forum")
    private String communityReadingForum;
    @Column(name = "community_volunteer")
    private String communityVolunteer;
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
    @Column(name = "lpo")
    private String lpo;

    //General data

    //Community Data
    // Book checkout data
    private Integer priPrimaryBoyCom;
    private Integer priPrimaryGirlCom;
    private Integer priPrimaryTotalCom;
    private Integer priPrimaryNoBoyBCCom;
    private Integer priPrimaryNoGirlBCCom;
    private Integer priPrimaryNoTotalBCCom;
    private Integer priPrimaryNoBookBoyBCCom;
    private Integer priPrimaryNoBookGirlBCCom;
    private Integer priPrimaryNoBookTotalBCCom;
    private Integer priPrimarySpBoyCom;
    private Integer priPrimarySpGirlCom;
    private Integer priPrimarySpTotalCom;
    private Integer priPrimaryNoSpBoyBCCom;
    private Integer priPrimaryNoSpGirlBCCom;
    private Integer priPrimaryNoSpTotalBCCom;
    private Integer priPrimaryNoBookSpBoyBCCom;
    private Integer priPrimaryNoBookSpGirlBCCom;
    private Integer priPrimaryNoBookSpTotalBCCom;

    private Integer classOneBoyCom;
    private Integer classOneGirlCom;
    private Integer classOneTotalCom;
    private Integer classOneNoBoyBCCom;
    private Integer classOneNoGirlBCCom;
    private Integer classOneNoTotalBCCom;
    private Integer classOneNoBookBoyBCCom;
    private Integer classOneNoBookGirlBCCom;
    private Integer classOneNoBookTotalBCCom;
    private Integer classOneSpBoyCom;
    private Integer classOneSpGirlCom;
    private Integer classOneSpTotalCom;
    private Integer classOneNoSpBoyBCCom;
    private Integer classOneNoSpGirlBCCom;
    private Integer classOneNoSpTotalBCCom;
    private Integer classOneNoBookSpBoyBCCom;
    private Integer classOneNoBookSpGirlBCCom;
    private Integer classOneNoBookSpTotalBCCom;

    private Integer classTwoBoyCom;
    private Integer classTwoGirlCom;
    private Integer classTwoTotalCom;
    private Integer classTwoNoBoyBCCom;
    private Integer classTwoNoGirlBCCom;
    private Integer classTwoNoTotalBCCom;
    private Integer classTwoNoBookBoyBCCom;
    private Integer classTwoNoBookGirlBCCom;
    private Integer classTwoNoBookTotalBCCom;
    private Integer classTwoSpBoyCom;
    private Integer classTwoSpGirlCom;
    private Integer classTwoSpTotalCom;
    private Integer classTwoNoSpBoyBCCom;
    private Integer classTwoNoSpGirlBCCom;
    private Integer classTwoNoSpTotalBCCom;
    private Integer classTwoNoBookSpBoyBCCom;
    private Integer classTwoNoBookSpGirlBCCom;
    private Integer classTwoNoBookSpTotalBCCom;

    private Integer classThreeBoyCom;
    private Integer classThreeGirlCom;
    private Integer classThreeTotalCom;
    private Integer classThreeNoBoyBCCom;
    private Integer classThreeNoGirlBCCom;
    private Integer classThreeNoTotalBCCom;
    private Integer classThreeNoBookBoyBCCom;
    private Integer classThreeNoBookGirlBCCom;
    private Integer classThreeNoBookTotalBCCom;
    private Integer classThreeSpBoyCom;
    private Integer classThreeSpGirlCom;
    private Integer classThreeSpTotalCom;
    private Integer classThreeNoSpBoyBCCom;
    private Integer classThreeNoSpGirlBCCom;
    private Integer classThreeNoSpTotalBCCom;
    private Integer classThreeNoBookSpBoyBCCom;
    private Integer classThreeNoBookSpGirlBCCom;
    private Integer classThreeNoBookSpTotalBCCom;

    private Integer classFourBoyCom;
    private Integer classFourGirlCom;
    private Integer classFourTotalCom;
    private Integer classFourNoBoyBCCom;
    private Integer classFourNoGirlBCCom;
    private Integer classFourNoTotalBCCom;
    private Integer classFourNoBookBoyBCCom;
    private Integer classFourNoBookGirlBCCom;
    private Integer classFourNoBookTotalBCCom;
    private Integer classFourSpBoyCom;
    private Integer classFourSpGirlCom;
    private Integer classFourSpTotalCom;
    private Integer classFourNoSpBoyBCCom;
    private Integer classFourNoSpGirlBCCom;
    private Integer classFourNoSpTotalBCCom;
    private Integer classFourNoBookSpBoyBCCom;
    private Integer classFourNoBookSpGirlBCCom;
    private Integer classFourNoBookSpTotalBCCom;

    private Integer classFiveBoyCom;
    private Integer classFiveGirlCom;
    private Integer classFiveTotalCom;
    private Integer classFiveNoBoyBCCom;
    private Integer classFiveNoGirlBCCom;
    private Integer classFiveNoTotalBCCom;
    private Integer classFiveNoBookBoyBCCom;
    private Integer classFiveNoBookGirlBCCom;
    private Integer classFiveNoBookTotalBCCom;
    private Integer classFiveSpBoyCom;
    private Integer classFiveSpGirlCom;
    private Integer classFiveSpTotalCom;
    private Integer classFiveNoSpBoyBCCom;
    private Integer classFiveNoSpGirlBCCom;
    private Integer classFiveNoSpTotalBCCom;
    private Integer classFiveNoBookSpBoyBCCom;
    private Integer classFiveNoBookSpGirlBCCom;
    private Integer classFiveNoBookSpTotalBCCom;
    // Book checkout data

    // Book check-in data
    private Integer priPrimaryNoBoyBCInCom;
    private Integer priPrimaryNoGirlBCInCom;
    private Integer priPrimaryNoTotalBCInCom;
    private Integer priPrimaryNoBookBoyBCInCom;
    private Integer priPrimaryNoBookGirlBCInCom;
    private Integer priPrimaryNoBookTotalBCInCom;
    private Integer priPrimaryNoSpBoyBCInCom;
    private Integer priPrimaryNoSpGirlBCInCom;
    private Integer priPrimaryNoSpTotalBCInCom;
    private Integer priPrimaryNoBookSpBoyBCInCom;
    private Integer priPrimaryNoBookSpGirlBCInCom;
    private Integer priPrimaryNoBookSpTotalBCInCom;


    private Integer classOneNoBoyBCInCom;
    private Integer classOneNoGirlBCInCom;
    private Integer classOneNoTotalBCInCom;
    private Integer classOneNoBookBoyBCInCom;
    private Integer classOneNoBookGirlBCInCom;
    private Integer classOneNoBookTotalBCInCom;
    private Integer classOneNoSpBoyBCInCom;
    private Integer classOneNoSpGirlBCInCom;
    private Integer classOneNoSpTotalBCInCom;
    private Integer classOneNoBookSpBoyBCInCom;
    private Integer classOneNoBookSpGirlBCInCom;
    private Integer classOneNoBookSpTotalBCInCom;


    private Integer classTwoNoBoyBCInCom;
    private Integer classTwoNoGirlBCInCom;
    private Integer classTwoNoTotalBCInCom;
    private Integer classTwoNoBookBoyBCInCom;
    private Integer classTwoNoBookGirlBCInCom;
    private Integer classTwoNoBookTotalBCInCom;
    private Integer classTwoNoSpBoyBCInCom;
    private Integer classTwoNoSpGirlBCInCom;
    private Integer classTwoNoSpTotalBCInCom;
    private Integer classTwoNoBookSpBoyBCInCom;
    private Integer classTwoNoBookSpGirlBCInCom;
    private Integer classTwoNoBookSpTotalBCInCom;


    private Integer classThreeNoBoyBCInCom;
    private Integer classThreeNoGirlBCInCom;
    private Integer classThreeNoTotalBCInCom;
    private Integer classThreeNoBookBoyBCInCom;
    private Integer classThreeNoBookGirlBCInCom;
    private Integer classThreeNoBookTotalBCInCom;
    private Integer classThreeNoSpBoyBCInCom;
    private Integer classThreeNoSpGirlBCInCom;
    private Integer classThreeNoSpTotalBCInCom;
    private Integer classThreeNoBookSpBoyBCInCom;
    private Integer classThreeNoBookSpGirlBCInCom;
    private Integer classThreeNoBookSpTotalBCInCom;


    private Integer classFourNoBoyBCInCom;
    private Integer classFourNoGirlBCInCom;
    private Integer classFourNoTotalBCInCom;
    private Integer classFourNoBookBoyBCInCom;
    private Integer classFourNoBookGirlBCInCom;
    private Integer classFourNoBookTotalBCInCom;
    private Integer classFourNoSpBoyBCInCom;
    private Integer classFourNoSpGirlBCInCom;
    private Integer classFourNoSpTotalBCInCom;
    private Integer classFourNoBookSpBoyBCInCom;
    private Integer classFourNoBookSpGirlBCInCom;
    private Integer classFourNoBookSpTotalBCInCom;


    private Integer classFiveNoBoyBCInCom;
    private Integer classFiveNoGirlBCInCom;
    private Integer classFiveNoTotalBCInCom;
    private Integer classFiveNoBookBoyBCInCom;
    private Integer classFiveNoBookGirlBCInCom;
    private Integer classFiveNoBookTotalBCInCom;
    private Integer classFiveNoSpBoyBCInCom;
    private Integer classFiveNoSpGirlBCInCom;
    private Integer classFiveNoSpTotalBCInCom;
    private Integer classFiveNoBookSpBoyBCInCom;
    private Integer classFiveNoBookSpGirlBCInCom;
    private Integer classFiveNoBookSpTotalBCInCom;
    // Book check-in data

    //Total data
    //Total data

    //Community Data
}
