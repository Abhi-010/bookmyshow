package com.dev.abhi.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class City extends BaseModel {
    private String name;
    private String state;
    private String country;

    private List<Theatre> theatres;
}
