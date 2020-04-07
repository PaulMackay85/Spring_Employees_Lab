package com.codeclan.example.employees.repositories;

import com.codeclan.example.employees.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
