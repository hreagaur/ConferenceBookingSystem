package com.conferencemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.conferencemanagementsystem.model.ConferenceRoom;
public interface ConferenceRepository extends JpaRepository<ConferenceRoom, Long> {

	List<ConferenceRoom> findByConferenceStatus(String status);

	



	
}
