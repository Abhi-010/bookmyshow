package com.dev.abhi.bms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatTypeShow extends BaseModel{

    @ManyToOne
    private Show show;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    @ManyToOne
    private Price price ;
}
