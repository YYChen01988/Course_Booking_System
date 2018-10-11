package com.example.codeclan.coursebookingsystem.controllers;

import com.example.codeclan.coursebookingsystem.models.Customer;
import com.example.codeclan.coursebookingsystem.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/course/{id}")
    public List<Customer> getCustomersOnCourse(@PathVariable Long id){
        return customerRepository.getCustomersOnCourse(id);
    }
}
