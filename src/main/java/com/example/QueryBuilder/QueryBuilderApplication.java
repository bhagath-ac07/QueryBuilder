package com.example.QueryBuilder;

import com.example.QueryBuilder.entity.Employee;
import com.example.QueryBuilder.repository.EmployeeRepository;
import com.example.QueryBuilder.util.QuerBuilderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class QueryBuilderApplication {



	public static void main(String[] args) {
		SpringApplication.run(QueryBuilderApplication.class, args);


	}

}



