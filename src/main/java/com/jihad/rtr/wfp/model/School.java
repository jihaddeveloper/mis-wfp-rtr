//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 02/01/2022
//  Description: School  model file

package com.jihad.rtr.wfp.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "schools")
@Data
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	private long upazila;
	private long district;
	private long headTeacher;
	private long literacyFacilitator;
	private long literacyProgramOfficer;
	@Column(name = "gps_data")
	private String gpsData;
	@Column(name = "emis_id")
	private String emisId;
	@Column(name = "gsd_id")
	private String gsdId;
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;
}
