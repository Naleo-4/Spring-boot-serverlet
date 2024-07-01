package com.example.test.User.dbo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "address")
@Table(name = "address", schema = "TESTful_API")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "suite")
    private String suite;

    @Column(name = "city")
    private String city;

    @Column(name = "zipcode")
    private String zipcode;

    @Embedded
    private Geo geo;

}
