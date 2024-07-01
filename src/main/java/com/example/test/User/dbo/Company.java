package com.example.test.User.dbo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "company")
@Table(name = "company", schema = "TESTful_API")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "catch_phrase")
    private String catchPhrase;

    @Column(name = "bs")
    private String bs;
}
