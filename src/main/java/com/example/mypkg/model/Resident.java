package com.example.mypkg.model;

import com.example.mypkg.model.enums.Gender;
import com.example.mypkg.model.enums.Religion;
import com.example.mypkg.model.enums.Sexuality;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Resident {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "DATE")
    private LocalDate birthday;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private Religion religion;
    @Enumerated(EnumType.STRING)
    private Sexuality sexuality;
    private String hobby;
    private String nickname;
    private String nationality;
    private String lastJob;





}
