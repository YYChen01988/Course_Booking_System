package com.example.codeclan.coursebookingsystem.repositories.customerRepositories;

import com.example.codeclan.coursebookingsystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getCustomersOnCourse(Long courseId);
}
