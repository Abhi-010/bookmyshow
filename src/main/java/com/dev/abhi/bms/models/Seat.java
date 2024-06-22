package com.dev.abhi.bms.models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int row;
    private int col;
    private String number;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    @Enumerated(EnumType.ORDINAL)
    private GenericSeatStatus genericSeatStatus;

}
