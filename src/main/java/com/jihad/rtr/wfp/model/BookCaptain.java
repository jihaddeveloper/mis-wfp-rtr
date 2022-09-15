//  Author: Mohammad Jihad Hossain
//  Create Date: 13/09/2022
//  Modify Date: 13/09/2022
//  Description: BookCaptain  model file

package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "book_captain")
@Data
public class BookCaptain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String gender;
    private String grade;
    private String section;
    private String school;
    private String district;
    private String upazilla;
    private String project;
    private String year;
}
