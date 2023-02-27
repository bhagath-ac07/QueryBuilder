package com.example.QueryBuilder.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTMENT_OID")
    private Long id;

    @Column(name = "DEPARTMENT_NAME")
    private String name;

    @Column(name = "DEPARTMENT_EMAIL")
    private String email;

    @ManyToOne
    @JoinColumn(name = "LOCATION_OID")
    private Location location;



    // getters and setters
}
