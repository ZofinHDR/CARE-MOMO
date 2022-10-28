package com.example.mypkg.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Functionality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean fq1;

    private Boolean fq2;

    private Boolean fq3;

    private Boolean fq4;
    private String fq5;
    private String fq6;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFq1(Boolean fq1) {
        this.fq1 = fq1;
    }

    public Boolean getFq1() {
        return fq1;
    }

    public void setFq2(Boolean fq2) {
        this.fq2 = fq2;
    }

    public Boolean getFq2() {
        return fq2;
    }

    public void setFq3(Boolean fq3) {
        this.fq3 = fq3;
    }

    public Boolean getFq3() {
        return fq3;
    }

    public void setFq4(Boolean fq4) {
        this.fq4 = fq4;
    }

    public Boolean getFq4() {
        return fq4;
    }

    public void setFq5(String fq5) {
        this.fq5 = fq5;
    }

    public String getFq5() {
        return fq5;
    }

    public void setFq6(String fq6) {
        this.fq6 = fq6;
    }

    public String getFq6() {
        return fq6;
    }
}

