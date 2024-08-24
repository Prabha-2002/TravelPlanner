package com.prabha.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String climaticCondition;
    

    // Default constructor
    public Location() {
        super();
    }

    // Parameterized constructor
    public Location(Long id, String name, String climaticCondition) {
        this.id = id;
        this.name = name;
        this.climaticCondition = climaticCondition;
    }

    @Override
    public String toString() {
        return "Location [id=" + id + ", name=" + name + ", climaticCondition=" + climaticCondition + "]";
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimaticCondition() {
        return climaticCondition;
    }

    public void setClimaticCondition(String climaticCondition) {
        this.climaticCondition = climaticCondition;
    }
}
