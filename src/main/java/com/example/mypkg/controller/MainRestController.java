package com.example.mypkg.controller;


import com.example.mypkg.reposetories.ResidentRepo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    private ResidentRepo repo;

    public MainRestController(ResidentRepo repo) {
        this.repo = repo;
    }
    // TODO: CRUD


}
