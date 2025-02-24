package com.github.henry_gay.medicinal_plants_api.service;

import com.github.henry_gay.medicinal_plants_api.model.Plant;
import com.github.henry_gay.medicinal_plants_api.repository.PlantRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlantService {
    private final PlantRepository plantRepository;

    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }
}
