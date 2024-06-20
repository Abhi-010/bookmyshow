package com.dev.abhi.bms.models;

import java.util.Date;
import java.util.List;

public class Show extends BaseModel{
    private Date startTime;
    private Date endTime;
    private Movie movie;
    private Auditorium auditorium;
    private List<Features> featuresList;
}
