package com.example.demo.Repositories;

import com.example.demo.Models.CarsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarsModel,Long> {
}
