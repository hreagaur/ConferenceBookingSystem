package com.conferencemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conferencemanagementsystem.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
