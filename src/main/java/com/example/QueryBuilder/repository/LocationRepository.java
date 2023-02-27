package com.example.QueryBuilder.repository;

import com.example.QueryBuilder.entity.Employee;
import com.example.QueryBuilder.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LocationRepository extends JpaRepository<Location, Long> , JpaSpecificationExecutor<Location> {
}