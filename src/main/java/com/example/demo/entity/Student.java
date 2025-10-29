package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer roll;
}
