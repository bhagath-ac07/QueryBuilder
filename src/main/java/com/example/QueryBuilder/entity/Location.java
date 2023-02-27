package com.example.QueryBuilder.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "LOCATION")
public class Location {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOCATION_OID")
    private Long id;
    
    @Column(name = "LOCATION_NAME")
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "CITY_OID")
    private City city;
    
    // getters and setters
}