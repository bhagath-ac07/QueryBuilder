package com.example.QueryBuilder.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CITY")
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_OID")
    private Long id;
    
    @Column(name = "CITY_NAME")
    private String name;
    
    // getters and setters
}