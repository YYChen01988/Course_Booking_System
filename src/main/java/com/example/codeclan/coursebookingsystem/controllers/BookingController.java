package com.example.codeclan.coursebookingsystem.controllers;

import com.example.codeclan.coursebookingsystem.models.Booking;
import com.example.codeclan.coursebookingsystem.repositories.bookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getBookingsForDate(@PathVariable String date){
        return bookingRepository.getBookingsForDate(date);
    }
}
