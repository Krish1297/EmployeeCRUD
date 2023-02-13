package com.Employee.EmployeeCRUD.Repository;

import com.Employee.EmployeeCRUD.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByName(String name);
}
