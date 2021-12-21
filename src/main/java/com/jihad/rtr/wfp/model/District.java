//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 21/12/2021
//  Description: District  model file

package com.jihad.rtr.wfp.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "district")
@Data
public class District {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true)
	private String name;
	private String isActive;
	private String isDeleted;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;
	
	@OneToMany
	@JoinColumn(name = "district_id")
    private List<Upazila> upazilas = new ArrayList<>();
}
