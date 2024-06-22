package com.dev.abhi.bms.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Price extends BaseModel{
    private Double price ;
    private String currency;
}
