package com.example.mypkg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Functionality {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean fq1;
    private Boolean fq2;
    private Boolean fq3;
    private Boolean fq4;
    private String fq5;
    private String fq6;
}
