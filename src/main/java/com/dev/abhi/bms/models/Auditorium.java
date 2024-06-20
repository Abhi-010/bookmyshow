package com.dev.abhi.bms.models;

import java.util.List;

public class Auditorium extends BaseModel{
    private String name;
    private List<Seat> seats;

    private int capacity ;

    private List<AuditoriumFeature> features;

    private Theatre theatre;

}
