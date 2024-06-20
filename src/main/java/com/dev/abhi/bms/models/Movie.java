package com.dev.abhi.bms.models;

import java.util.List;

public class Movie extends BaseModel{
    private String name;
    private List<Languague> languagues;
    private List<Actor> actors;

    private int length;
    private double rating;
    private List<MovieFeature> features;
}
