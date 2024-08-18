package com.conferencemanagementsystem.service;

import java.util.List;

import com.conferencemanagementsystem.model.ConferenceRoom;

public interface ConferenceService {
	
	ConferenceRoom saveRoom(ConferenceRoom conferenceRoom);
	List<ConferenceRoom> getAllRooms();
	ConferenceRoom getRoomById(Long id);
	ConferenceRoom updateRoom(ConferenceRoom conferenceRoom,long id);
	void deleteConRoom(Long id);
	public List<ConferenceRoom> getRoomsByStatus(String status);

	
}
