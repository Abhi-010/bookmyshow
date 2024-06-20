package com.dev.abhi.bms.models;

import java.util.Date;

public class Payment extends BaseModel{
    private String razorPayId;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;

    private Date timeOfPayment ;
    private double amount ;

}
