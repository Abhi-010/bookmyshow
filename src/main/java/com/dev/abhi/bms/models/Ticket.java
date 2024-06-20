package com.dev.abhi.bms.models;

import java.util.Date;
import java.util.List;

public class Ticket extends BaseModel{

    private Show show;
    private User bookedBy;
    private List<ShowSeat> showSeats;

    private TicketStatus ticketStatus;

    private Date timeOfBooking;
}
