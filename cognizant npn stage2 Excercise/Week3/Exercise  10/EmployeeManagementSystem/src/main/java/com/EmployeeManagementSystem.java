package com.managementSystem.EmployeeManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystem.class, args);
    }
}
