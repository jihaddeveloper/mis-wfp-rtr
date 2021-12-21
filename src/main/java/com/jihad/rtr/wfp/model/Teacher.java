//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 21/12/2021
//  Description: Teacher  model file


package com.jihad.rtr.wfp.model;

import java.sql.Date;

public class Teacher {
	private long id;
	private String name;
	private String gender;
	private String designation;
	private String phone1;
	private String phone2;
	private String currentAddress;
	private String parmanentAddress;
	private long teacherTrainingId;
	private long schoolId;
	private long gradeId;
	private long sectionId;
	private String isActive;
	private String isDeleted;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;
}
