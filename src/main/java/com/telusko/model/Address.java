package com.telusko.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pinCode;
    private String street;
    private String city;
    private String country;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
