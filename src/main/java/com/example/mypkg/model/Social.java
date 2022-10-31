package com.example.mypkg.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean sq1;

    private Boolean sq2;

    private Boolean sq3;

    private Boolean sq4;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSq1() {
        return sq1;
    }

    public void setSq1(Boolean sq1) {
        this.sq1 = sq1;
    }

    public Boolean getSq2() {
        return sq2;
    }

    public void setSq2(Boolean sq2) {
        this.sq2 = sq2;
    }

    public Boolean getSq3() {
        return sq3;
    }

    public void setSq3(Boolean sq3) {
        this.sq3 = sq3;
    }

    public Boolean getSq4() { return sq4; }

    public void setSq4(Boolean sq4) { this.sq4 = sq4; }
}
