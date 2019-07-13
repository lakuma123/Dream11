package com.honeywell.devicemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Device {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String name;

	@ManyToOne
	@JoinColumn
	private User owner;

	@Column
	private boolean active;

	@ManyToOne
	@JoinColumn
	private User createdBy;

	@ManyToOne
	@JoinColumn
	private User updatedBy;

	@Column
	private Date createdDate;

	@Column
	private Date updateDate;

}
