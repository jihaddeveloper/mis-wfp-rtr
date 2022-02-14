//  Author: Mohammad Jihad Hossain
//  Create Date: 21/11/2021
//  Modify Date: 14/02/2022
//  Description: Office  model file


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
@Table(name = "offices")
@Data
public class Office extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name ="bn_name" )
	private String bnName;
	@Column(name = "detail")
	private String detail;
	@Column(name = "address")
	private String address;
	@Column(name = "is_active")
	private String isActive;
	@Column(name = "is_deleted")
	private String isDeleted;

}
