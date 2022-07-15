package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

// SimpleJpaRepository implementation class internally provides @Repository annotation, we don't need to @ again.
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
