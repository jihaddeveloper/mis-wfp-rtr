//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 21/11/2021
//  Description: Upzila  model file

package com.jihad.rtr.wfp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.boot.context.properties.bind.Name;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "upazila")
@Data
public class Upazila {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String isActive;
	private String isDeleted;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;
	
	@ManyToOne
    private District district;
}
