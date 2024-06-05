package com.reservationapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    private String driverName;
    private String driverLicenceNumber;
    private String aadharNumber;
    private String driverAddress;
    private String driverContactNumber;
    private String alternateContactNumber;
    private String driverEmailId;

    // Getters and Setters
}
