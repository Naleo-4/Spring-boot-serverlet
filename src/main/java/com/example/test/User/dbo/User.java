package com.example.test.User.dbo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "user")
@Table(name = "user", schema = "TESTful_API")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "user_name")
    private String username;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "website")
    private String website;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id" ,referencedColumnName = "id" )
    private Company company;
}
