package com.alex.employeemanager.repo;

import com.alex.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(long id);//class and primary key type - AUTO GENERATED query (naming)

    Optional<Employee> findEmployeeById(Long id);//auto generated
}
