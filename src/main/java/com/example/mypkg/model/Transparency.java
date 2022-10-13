package com.example.mypkg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Transparency {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean tq1;
    private Boolean tq2;
    private Boolean tq3;
    private Boolean tq4;
}
