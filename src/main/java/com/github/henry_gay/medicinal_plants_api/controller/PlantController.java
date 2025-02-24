package com.github.henry_gay.medicinal_plants_api.controller;

import com.github.henry_gay.medicinal_plants_api.model.Plant;
import com.github.henry_gay.medicinal_plants_api.service.PlantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/plants")
public class PlantController {
    private final PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping
    public List<Plant> getAllPlants() {
        return plantService.getAllPlants();
    }
}