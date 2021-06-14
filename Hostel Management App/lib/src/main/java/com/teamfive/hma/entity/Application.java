package com.teamfive.hma.entity;

import javax.persistence.Entity;

@Entity
public class Application {
	long appId;
	long userId;
	String applicantName;
	long hostelId;
	String hostelName;
	String applicantQualification;
	String applicantAddress;
	String applicantDescription;
}
