package com.dev.abhi.bms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{

    @ManyToOne
    private Show show;
    @ManyToOne
    private User bookedBy;
    @OneToMany
    private List<ShowSeat> showSeats;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;

    private Date timeOfBooking;
}
