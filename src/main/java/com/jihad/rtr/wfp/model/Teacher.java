//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 21/12/2021
//  Description: Teacher  model file


package com.jihad.rtr.wfp.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "teachers")
@Data
public class Teacher extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String gender;
	private String designation;
	private String phone1;
	private String phone2;
	private String currentAddress;
	private String parmanentAddress;
	private long teacherTraining;
	private long school;
	private long grade;
	private long section;
	private String isActive;
	private String isDeleted;
}
