package com.conferencemanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conferencemanagementsystem.model.Booking;
import com.conferencemanagementsystem.repository.BookingRepository;
import com.conferencemanagementsystem.service.BookingService;

@Service
public class BookingImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public Booking updateBooking(Booking booking, Long id) {
        Booking existingBooking = getBookingById(id);
        if (existingBooking!= null) {
            existingBooking.setStart(booking.getStart());
            existingBooking.setEnd(booking.getEnd());
            existingBooking.setUser(booking.getUser());
            existingBooking.setConferenceRoom(booking.getConferenceRoom());
            return bookingRepository.save(existingBooking);
        } else {
            return null;
        }
    }
}
