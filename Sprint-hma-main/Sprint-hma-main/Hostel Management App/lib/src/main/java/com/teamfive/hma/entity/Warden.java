package com.teamfive.hma.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Warden {
	@Id
	long wId;
	long userId;
	String WardenName;
	String login;
	// long hostelId;
}
