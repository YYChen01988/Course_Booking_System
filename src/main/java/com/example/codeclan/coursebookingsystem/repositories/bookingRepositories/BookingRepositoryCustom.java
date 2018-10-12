package com.example.codeclan.coursebookingsystem.repositories.bookingRepositories;

import com.example.codeclan.coursebookingsystem.models.Booking;

import java.util.Date;
import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> getBookingsForDate(String date);
}
