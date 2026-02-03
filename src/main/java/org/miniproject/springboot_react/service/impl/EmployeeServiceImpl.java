package org.miniproject.springboot_react.service.impl;

import org.miniproject.springboot_react.dto.EmployeeDto;
import org.miniproject.springboot_react.entity.Employee;
import lombok.AllArgsConstructor;
import org.miniproject.springboot_react.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;
import org.miniproject.springboot_react.repository.EmployeeRepository;
import org.miniproject.springboot_react.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee saved = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(saved);
    }
}
