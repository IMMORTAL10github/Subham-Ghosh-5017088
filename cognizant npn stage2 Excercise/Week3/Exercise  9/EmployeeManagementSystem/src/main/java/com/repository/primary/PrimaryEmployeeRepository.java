package com.repository.primary;

import librarymanagement.employeemanagementsystem_9.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryEmployeeRepository extends JpaRepository<Employee, Long> {
}
