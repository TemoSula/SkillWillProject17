package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class CarsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "realeaseyear")
    private int releaseYear;
}
