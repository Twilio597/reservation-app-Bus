package com.reservationapp.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;

    @Column(name="bus_number",unique = true)
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

    @OneToOne
    @JoinColumn(name = "driver_id")//driver_id is the foreign key present in Bus Entity
    private Driver driver;

    // Getters and Setters

}
