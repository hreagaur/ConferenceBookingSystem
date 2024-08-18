package com.conferencemanagementsystem.service;

import java.util.List;

import com.conferencemanagementsystem.model.Booking;

public interface BookingService {

    Booking saveBooking(Booking booking);

    List<Booking> getAllBookings();

    Booking getBookingById(Long id);

    void deleteBooking(Long id);
    
    Booking updateBooking(Booking booking, Long id);

}

