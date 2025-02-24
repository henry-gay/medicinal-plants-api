package com.github.henry_gay.medicinal_plants_api.repository;

import com.github.henry_gay.medicinal_plants_api.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {}
