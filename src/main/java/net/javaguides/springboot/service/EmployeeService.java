package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {			// defines the method in EmployeeService which is implemented in the EmployeeServiceImpl class.
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
}
