//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 21/12/2021
//  Description: Grade  model file


package com.jihad.rtr.wfp.model;

import java.sql.Date;

public class Grade {
	private long id;
	private String grade;
	private long schoolId;
	private long teacherId;
	private int girl;
	private int boy;
	private int totalStudent;
	private int specialGirl;
	private int specialBoy;
	private int totalSpecialStudent;
	private long classId;
	private String isActive;
	private String isDeleted;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;
}
