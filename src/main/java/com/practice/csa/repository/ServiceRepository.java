package com.practice.csa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.csa.entity.CarService;

public interface ServiceRepository  extends JpaRepository<CarService, Integer> {

}
