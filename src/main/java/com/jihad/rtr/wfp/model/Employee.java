//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 21/12/2021
//  Description: Employee  model file

package com.jihad.rtr.wfp.model;

import java.sql.Date;

public class Employee {
	
	private long id;
	private String employeeRegId;
	private String name;
	private String gender;
	private long designationId;
	private long supervisorId;
	private long OfficeId;
	private Date joinDate;
	private String email;
	private String phone1;
	private String phone2;
	private String addressCurrent;
	private String addressPermanent;
	private String isActive;
	private String isDeleted;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;

}
