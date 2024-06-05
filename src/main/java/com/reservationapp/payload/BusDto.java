package com.reservationapp.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.reservationapp.entity.Driver;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
public class BusDto {


    private Long busId;


    private String busNumber;

    private String busType;
    private String fromLocation;
    private String toLocation;


    private String fromDate;


    private String toDate;
    private String fromTime;
    private String toTime;
    private int totalSeats;
    private int availableSeats;
    private double price;
    private String totalDuration;
    private Driver driver;

}
