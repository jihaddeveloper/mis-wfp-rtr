//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 12/01/2022
//  Description: Employee  model file

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
@Table(name = "employees")
@Data
public class Employee extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "employee_reg_id")
	private String employeeRegId;
	@Column(name = "name")
	private String name;
	@Column(name = "bn_name")
	private String bnName;
	@Column(name = "gender")
	private String gender;
	private long designation;
	private long supervisor;
	private long office;
	private long project;
	@Column(name = "join_date")
	private Date joinDate;
	@Column(name = "email")
	private String email;
	@Column(name = "phone1")
	private String phone1;
	@Column(name = "phone2")
	private String phone2;
	@Column(name = "address_current")
	private String addressCurrent;
	@Column(name = "address_permanent")
	private String addressPermanent;
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;
}
