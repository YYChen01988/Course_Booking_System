package com.example.codeclan.coursebookingsystem.repositories.bookingRepositories;

import com.example.codeclan.coursebookingsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
