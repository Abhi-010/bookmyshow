package com.dev.abhi.bms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Features> featuresList;
}
