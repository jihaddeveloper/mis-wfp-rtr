//  Author: Mohammad Jihad Hossain
//  Create Date: 17/01/2022
//  Modify Date: 17/01/2022
//  Description: District  model file

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
@Table(name = "monthly_book_checkout")
@Data
public class MonthlyBookCheckout extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "visit_no")
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
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
    @Column(name = "upazila")
    private String upazila;
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
    @Column(name = "lpo")
    private String lpo;

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

}
