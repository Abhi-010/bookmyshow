package com.dev.abhi.bms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Languague> languagues;

    @ManyToMany
    private List<Actor> actors;

    private int length;
    private double rating;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<MovieFeature> features;
}
