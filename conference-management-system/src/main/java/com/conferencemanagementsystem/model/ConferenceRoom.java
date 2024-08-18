package com.conferencemanagementsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ConferenceRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long conferenceRoomId;
	
	@Column(name="conference_name")
	private String conferenceName;
	
	@Column(name = "conference_status", columnDefinition = "varchar(20) default 'available'")
	private String conferenceStatus;

	public String getConferenceStatus() {
		return conferenceStatus;
	}

	public void setConferenceStatus(String conferenceStatus) {
		this.conferenceStatus = conferenceStatus;
	}

	public long getConferenceRoomId() {
		return conferenceRoomId;
	}

	public void setConferenceRoomId(long conferenceRoomId) {
		this.conferenceRoomId = conferenceRoomId;
	}

	public String getConferenceName() {
		return conferenceName;
	}

	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}
}
