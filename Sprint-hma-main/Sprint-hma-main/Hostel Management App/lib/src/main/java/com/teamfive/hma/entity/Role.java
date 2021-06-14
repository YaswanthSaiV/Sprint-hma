package com.teamfive.hma.entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	long rId;
	
	String roleName;
	String roleDescription;
	
	public Role() {}

	
	
}
