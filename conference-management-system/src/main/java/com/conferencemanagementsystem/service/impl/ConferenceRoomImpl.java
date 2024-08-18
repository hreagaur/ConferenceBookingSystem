package com.conferencemanagementsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.conferencemanagementsystem.model.ConferenceRoom;
import com.conferencemanagementsystem.repository.ConferenceRepository;
import com.conferencemanagementsystem.service.ConferenceService;

@Service
public class ConferenceRoomImpl implements ConferenceService {
	@Autowired
	private ConferenceRepository conferenceRepository;
	

	public ConferenceRoomImpl(ConferenceRepository conferenceRepository) {
		super();
		this.conferenceRepository = conferenceRepository;
	}


	@Override
	public ConferenceRoom saveRoom(ConferenceRoom conferenceRoom) {
		return conferenceRepository.save(conferenceRoom);
	}


	@Override
	public List<ConferenceRoom> getAllRooms() {
		return conferenceRepository.findAll();
	}


	@Override
	public ConferenceRoom getRoomById(Long id) {
		// Find the conference room by ID
		return conferenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conference room not found for id: " + id));
		
	}


	@Override
	public ConferenceRoom updateRoom(ConferenceRoom conferenceRoom, long id) {
	    // Find the existing conference room by ID
	    ConferenceRoom existingRoom = conferenceRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Conference room not found for id: " + id));

	    // Update the name of the existing room
	    existingRoom.setConferenceName(conferenceRoom.getConferenceName());

	    // Save the updated room back to the database
	    return conferenceRepository.save(existingRoom);
	}


	@Override
    public void deleteConRoom(Long id) {
        ConferenceRoom existingRoom = conferenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conference room not found for id: " + id));
        conferenceRepository.delete(existingRoom);
        }


	@Override
	public List<ConferenceRoom> getRoomsByStatus(String status) {
		return conferenceRepository.findByConferenceStatus(status);
	}


	
	



}
