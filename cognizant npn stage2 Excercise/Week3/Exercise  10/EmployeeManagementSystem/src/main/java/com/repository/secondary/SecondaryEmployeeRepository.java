package com.repository.secondary;

import com.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondaryEmployeeRepository extends JpaRepository<Employee, Long> {
}
