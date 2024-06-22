package com.dev.abhi.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseModel {
    private String name;
    private String state;
    private String country;

    @OneToMany
    private List<Theatre> theatres;
}
