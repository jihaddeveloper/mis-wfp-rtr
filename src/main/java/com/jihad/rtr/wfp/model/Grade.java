//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 28/02/2022
//  Description: Grade  model file


package com.jihad.rtr.wfp.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "grades")
@Data
public class Grade extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "grade_name")
	private String gradeName;
	private String gradeBnName;
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
}
