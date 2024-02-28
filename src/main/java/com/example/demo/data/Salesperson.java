package com.example.demo.data;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SALESPERSON")
@Data
public class Salesperson {
    @Id
    @Column(name = "SALESPERSON_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phoneNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String string;

    @Column(name = "ZIPCODE")
    private String zipCode;
}
