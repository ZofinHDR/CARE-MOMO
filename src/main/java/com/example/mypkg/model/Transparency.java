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

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setTq1(Boolean tq1) {
        this.tq1 = tq1;
    }

    public Boolean getTq1() {
        return tq1;
    }

    public void setTq2(Boolean tq2) {
        this.tq2 = tq2;
    }

    public Boolean getTq2() {
        return tq2;
    }

    public void setTq3(Boolean tq3) {
        this.tq3 = tq3;
    }

    public Boolean getTq3() {
        return tq3;
    }

    public void setTq4(Boolean tq4) {
        this.tq4 = tq4;
    }

    public Boolean getTq4() {
        return tq4;
    }
}
