package com.bookstore.repository;

import com.bookstore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Define custom query methods here if needed
    // For example, find a customer by email
    Customer findByEmail(String email);
}
