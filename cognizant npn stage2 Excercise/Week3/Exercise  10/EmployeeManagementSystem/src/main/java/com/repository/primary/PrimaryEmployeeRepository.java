package com.repository.primary;

import com.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryEmployeeRepository extends JpaRepository<Employee, Long> {
}