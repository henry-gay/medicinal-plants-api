package com.github.henry_gay.medicinal_plants_api.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commonName;
    private String scientificName;
    private String description;
    private String habitatCultivation;

    @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlantPart> plantParts;

    @ManyToMany
    @JoinTable(
            name = "plant_constituent",
            joinColumns = @JoinColumn(name = "plant_id"),
            inverseJoinColumns = @JoinColumn(name = "constituent_id")
    )
    private Set<Constituent> constituents;
}