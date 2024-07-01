package com.example.test.User.dbo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Geo {
    private String lat;
    private String lng;
}
