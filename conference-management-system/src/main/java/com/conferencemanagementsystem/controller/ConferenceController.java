package com.conferencemanagementsystem.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conferencemanagementsystem.model.ConferenceRoom;
import com.conferencemanagementsystem.service.ConferenceService;

@RestController
@RequestMapping("/api/room")
public class ConferenceController {
	
	private final ConferenceService conferenceService;
	
	public ConferenceController(ConferenceService conferenceService) {
		this.conferenceService = conferenceService;
	}

	// Create room
	@PostMapping("/create")
	public ResponseEntity<ConferenceRoom> saveRoom(@RequestBody ConferenceRoom conferenceRoom) {
		return new ResponseEntity<>(conferenceService.saveRoom(conferenceRoom), HttpStatus.CREATED);
	}
	
	// Get all rooms
	@GetMapping("/getall")
	public List<ConferenceRoom> getAllRooms() {
		return conferenceService.getAllRooms();
	}
	
	//get by id
	@GetMapping("{id}")
	public ResponseEntity<ConferenceRoom> getRoomById(@PathVariable("id") Long id) {
		ConferenceRoom room = conferenceService.getRoomById(id);
		return new ResponseEntity<ConferenceRoom>(room, HttpStatus.OK);
	}
	
	//update
	 @PutMapping("update/{id}")
	    public ResponseEntity<ConferenceRoom> updateRoom(@PathVariable Long id, @RequestBody ConferenceRoom conferenceRoom) {
	        ConferenceRoom updatedRoom = conferenceService.updateRoom(conferenceRoom, id);
	        return new ResponseEntity<ConferenceRoom>(updatedRoom, HttpStatus.OK);
	    }
	 
	 //delete
	 @DeleteMapping("delete/{id}")
	    public ResponseEntity<String> deleteRoom(@PathVariable Long id) {
	       conferenceService.deleteConRoom(id);
	        return new ResponseEntity<String>("Deleted from the Database whose id = "+id ,HttpStatus.OK);
	 }
	 
	// Get rooms by status
	 @GetMapping("/status/{status}")
	 public List<ConferenceRoom> getRoomsByStatus(@PathVariable("status") String status) {
	     return conferenceService.getRoomsByStatus(status);
	 }


	
}
