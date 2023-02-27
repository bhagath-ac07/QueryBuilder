package com.example.QueryBuilder.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_OID")
    private Long id;
    
    @Column(name = "EMPLOYEE_NAME")
    private String name;
    
    @Column(name = "EMPLOYEE_EMAIL")
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_OID")
    private Department department;
    
    // getters and setters
}






