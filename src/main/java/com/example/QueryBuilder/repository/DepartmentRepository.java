package com.example.QueryBuilder.repository;

import com.example.QueryBuilder.entity.Department;
import com.example.QueryBuilder.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentRepository extends JpaRepository<Department, Long> , JpaSpecificationExecutor<Department> {
}