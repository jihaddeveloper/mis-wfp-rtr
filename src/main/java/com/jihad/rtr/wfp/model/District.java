//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 03/01/2022
//  Description: District  model file

package com.jihad.rtr.wfp.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "districts")
@Data
public class District extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name", unique = true)
	private String name;
	@Column(name = "bn_name")
	private String bn_name;
	@Column(name = "lat")
	private String lat;
	@Column(name = "lon")
	private String lon;
	@Column(name = "url")
	private String url;
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;


}
