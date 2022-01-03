//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 03/01/2022
//  Description: Upzila  model file

package com.jihad.rtr.wfp.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.boot.context.properties.bind.Name;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "upazilas")
@Data
public class Upazila extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name", unique = true)
	private String name;
	@Column(name = "bn_name")
	private String bnName;
	@Column(name = "lat")
	private  String lat;
	@Column(name = "lon")
	private String lon;
	@Column(name = "url")
	private String url;
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;

	
	@ManyToOne
	@JoinColumn(name = "district_id")
    private District district;

	@OneToMany(mappedBy = "upazila", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Union> unions;
}
