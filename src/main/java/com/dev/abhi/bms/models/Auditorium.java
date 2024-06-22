package com.dev.abhi.bms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{

    private String name;
    private int capacity ;

    @OneToMany
    private List<Seat> seats;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<AuditoriumFeature> features;

    @ManyToOne
    private Theatre theatre;
}
