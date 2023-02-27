package com.example.QueryBuilder.repository;

import com.example.QueryBuilder.entity.City;
import com.example.QueryBuilder.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CityRepository extends JpaRepository<City, Long>,  JpaSpecificationExecutor<City> {
}




