package com.teamfive.hma.entity;

import javax.persistence.Entity;

@Entity
public class Room {
	long roomId;
	String roomNo;//Clarification
	long hostelId;
	String roomDescription;
}
