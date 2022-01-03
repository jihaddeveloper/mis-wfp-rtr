//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 02/01/2022
//  Description: Project  model file


package com.jihad.rtr.wfp.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "projects")
@Data
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "project_detail")
	private String projectDetail;
	@Column(name = "donor")
	private String donor;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;

}
