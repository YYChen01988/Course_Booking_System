package com.example.codeclan.coursebookingsystem.repositories.customerRepositories;

import com.example.codeclan.coursebookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
