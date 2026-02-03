package org.miniproject.springboot_react.repository;

import org.miniproject.springboot_react.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
