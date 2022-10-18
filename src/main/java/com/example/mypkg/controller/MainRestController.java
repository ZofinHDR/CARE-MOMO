package com.example.mypkg.controller;


import com.example.mypkg.model.Resident;
import com.example.mypkg.reposetories.ResidentRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class MainRestController {

    private ResidentRepo repo;

    public MainRestController(ResidentRepo repo) {
        this.repo = repo;
    }
    // TODO: CRUD
    @GetMapping("/residents")
    public List<Resident> getResidents() {
        return repo.findAll();
    }

    @GetMapping("/resident/{id}")
    public Resident getResident(@PathVariable Long id) {
        return repo.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/resident")
    public ResponseEntity createResident(@RequestBody Resident resident) throws URISyntaxException {
        Resident savedResident = repo.save(resident);
        return new ResponseEntity<Resident>(savedResident, HttpStatus.CREATED);
    }

    @PutMapping("/resident/{id}")
    public ResponseEntity updateResident(@PathVariable Long id, @RequestBody Resident resident) {
        Resident currentResident = repo.findById(id).orElseThrow(RuntimeException::new);

        //TODO: Aus dem RequestBody Resident alle Informationen mit Setter in currentResident übertragen
        currentResident = repo.save(currentResident);
        return ResponseEntity.ok(currentResident);
    }

    @DeleteMapping("/resident/{id}")
    public ResponseEntity deleteResident(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
