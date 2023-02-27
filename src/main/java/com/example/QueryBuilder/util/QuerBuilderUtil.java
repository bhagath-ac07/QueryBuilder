package com.example.QueryBuilder.util;

import com.example.QueryBuilder.entity.Department;
import com.example.QueryBuilder.entity.Employee;
import com.example.QueryBuilder.entity.Location;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

public class QuerBuilderUtil {
    public static <U> Specification<U> isLikeJoin(Specification<U> specification, String value, String ...args) {
/**
        Specification<Employee> spec = (root, cq, cb) -> {
            Join<Employee, Department> departmentJoin = root.join(Employee_.department);
            Join<Department, Location> locationJoin = departmentJoin.join(Department_.location);

            Predicate predicate = cb.equal(locationJoin.get(Location_.name), "some location name");

            return predicate;
 To use a query builder join on a @OneToMany mapped by field, you can follow these steps:

 Define your JPA entities with the appropriate mappings. For example, you can have an Employee entity with a @OneToMany mapping to a Department entity:
 java
 Copy code
 @Entity
 public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;

 @OneToMany(mappedBy = "employee")
 private List<Department> departments;

 // ...
 }

 @Entity
 public class Department {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;

 @ManyToOne
 @JoinColumn(name = "employee_id")
 private Employee employee;

 // ...
 }
 Create a Specification object to define your join query. For example, you can define a Specification to join the Employee entity with the Department entity based on the Employee's name and the Department's name:
 java
 Copy code
 public static Specification<Employee> joinDepartments(String employeeName, String departmentName) {
 return (root, query, cb) -> {
 Join<Employee, Department> departmentJoin = root.join(Employee_.departments);
 return cb.and(
 cb.equal(root.get(Employee_.name), employeeName),
 cb.equal(departmentJoin.get(Department_.name), departmentName)
 );
 };
 }
 In this example, we're using the root.join() method to join the Employee entity with the Department entity based on the Employee's departments field. We're then using the cb.equal() method to define the join condition based on the Employee's name and the Department's name.

 Use the Specification in your JPA repository method to fetch the desired results. For example, you can define a method in your EmployeeRepository interface to fetch all employees with a given name and a department with a given name:
 java
 Copy code
 public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {
 List<Employee> findAll(Specification<Employee> spec);
 }
 You can then call this method with the joinDepartments specification to fetch the desired results:

 java
 Copy code
 List<Employee> employees = employeeRepository.findAll(joinDepartments("John", "Sales"));
        };
 **/
        if (specification == null) {
            specification = Specification.where((objectRoot, cq, cb) -> {
                       // for (String key : args) {
                           // Join<Employee, Department> root = objectRoot.join("department");
                            //Join<Department, Location> locationJoin = root.join("location");

                            Predicate predicate = cb.equal(objectRoot.join("department").join("location").join("city").get("name"), "CITY 5");

                            return predicate;
                     //   }
                       // return cb.like(objectRoot.get("b"), "bbb");

                    }
            );
        }
        return specification;

    }
}
