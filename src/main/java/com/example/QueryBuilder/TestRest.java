package com.example.QueryBuilder;

import com.example.QueryBuilder.entity.Employee;
import com.example.QueryBuilder.repository.EmployeeRepository;
import com.example.QueryBuilder.util.QuerBuilderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
    @Autowired
    @Lazy
    EmployeeRepository employeeRepository;

    @GetMapping("/get")
    public  void test(){
        Specification<Employee> specification = null;
        specification = QuerBuilderUtil.isLikeJoin(specification, null, null);
        employeeRepository.findAll(specification).stream().forEach(employee -> {
            System.out.println(employee.getDepartment());
        });
    }
}
