//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 15/02/2022
//  Description: Project  model file


package com.jihad.rtr.wfp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "projects")
@Data
public class Project extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "bn_name")
	private String bnName;
	@Column(name = "project_detail")
	private String projectDetail;
	@Column(name = "donor")
	private String donor;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private Date startDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;

}
