//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 02/01/2021
//  Description: Content  model file


package com.jihad.rtr.wfp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

public class Content {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String description;
	private long gradeId;
	private String isActive;
	private String isDeleted;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;
}
