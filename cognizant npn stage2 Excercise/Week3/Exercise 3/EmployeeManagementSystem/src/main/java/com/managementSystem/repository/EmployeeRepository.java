package com.managementSystem.repository;

import com.managementSystem.entity.Department;
import com.managementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);
    List<Employee> findByDepartment(Department department);
}
