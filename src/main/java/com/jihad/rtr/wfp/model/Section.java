//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 01/03/2022
//  Description: Section  model file

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
@Table(name = "sections")
@Data
public class Section extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "section_name")
	private String sectionName;
	private long gradeId;
	private long schoolId;
	private long teacherId;
	private int girl;
	private int boy;
	private int totalStudent;
	private int specialGirl;
	private int specialBoy;
	private int totalSpecialStudent;
	private String isActive;
	private String isDeleted;
}
