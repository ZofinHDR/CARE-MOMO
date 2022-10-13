package com.example.mypkg.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Social {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean sq1;
    private Boolean sq2;
    private Boolean sq3;
    private Boolean sq4;


}
