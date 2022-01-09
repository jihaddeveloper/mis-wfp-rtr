//Author: Mohammad Jihad Hossain
//Create Date: 21/11/2021
//Modify Date: 03/01/2022
//Description: LibraryIndicator  model file

package com.jihad.rtr.wfp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "library_indicators")
@Data
public class LibraryObservationIndicator extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "serial")
	private int serial;
	@Column(name = "indicator_detail")
	private String indicatorDetail;
	@Column(name = "priority")
	private String priority;
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;
}




