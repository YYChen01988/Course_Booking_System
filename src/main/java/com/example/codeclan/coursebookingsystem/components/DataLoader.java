package com.example.codeclan.coursebookingsystem.components;

import com.example.codeclan.coursebookingsystem.models.Booking;
import com.example.codeclan.coursebookingsystem.models.Course;
import com.example.codeclan.coursebookingsystem.models.Customer;
import com.example.codeclan.coursebookingsystem.repositories.bookingRepositories.BookingRepository;
import com.example.codeclan.coursebookingsystem.repositories.courseRepositories.CourseRepository;
import com.example.codeclan.coursebookingsystem.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Course python = new Course("Intro To Python", "Glasgow", 5);
        courseRepository.save(python);
        Course cSharp = new Course("Intro To C#", "Glasgow", 5);
        courseRepository.save(cSharp);

        Customer customer1 = new Customer("Louise", "Edinburgh", 50);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Alan", "Aberdeen", 80);
        customerRepository.save(customer2);


        Booking booking1 = new Booking("11-10-18", python, customer1);
        Booking booking2 = new Booking("11-10-18", python, customer2);
        Booking booking3 = new Booking("11-10-18", cSharp, customer1);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);


    }
}
