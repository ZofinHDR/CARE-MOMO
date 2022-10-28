package com.example.mypkg.bootstrap;

import com.example.mypkg.model.Functionality;
import com.example.mypkg.model.Resident;
import com.example.mypkg.model.Social;
import com.example.mypkg.model.Transparency;
import com.example.mypkg.model.enums.Gender;
import com.example.mypkg.model.enums.Religion;
import com.example.mypkg.model.enums.Sexuality;
import com.example.mypkg.reposetories.ResidentRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CreateDataResident implements CommandLineRunner {

    private final ResidentRepo residentRepo;

    public CreateDataResident(ResidentRepo residentRepo) {
        this.residentRepo = residentRepo;
    }

    @Override
    public void run(String... args) throws Exception {


        ////Create Resident
        Resident resident = new Resident();
        resident.setName("Maksym");
        resident.setBirthday(LocalDate.now());
        resident.setGender(Gender.Male);
        resident.setReligion(Religion.atheist);
        resident.setSexuality(Sexuality.straight);
        resident.setHobby("Boxen");
        resident.setNickname("Max");
        resident.setNationality("Ukraine");
        resident.setLastJob("LastJob");

        ////Create Social
        Social social = new Social();
        social.setSq1(true);
        social.setSq2(false);
        social.setSq3(true);
        social.setSq4(false);

        ////Create Transparency
        Transparency transparency = new Transparency();
        transparency.setTq1(false);
        transparency.setTq2(true);
        transparency.setTq3(false);
        transparency.setTq4(true);

        ////Create Functionality
        Functionality functionality = new Functionality();
        functionality.setFq1(true);
        functionality.setFq2(false);
        functionality.setFq3(true);
        functionality.setFq4(false);
        functionality.setFq5("Lol keine Antwort");
        functionality.setFq6("Lol keine Antwort");

        ////Add Dependencies to Resident
        resident.setSocial(social);
        resident.setTransparency(transparency);
        resident.setFunctionality(functionality);

        resident = residentRepo.save(resident);
        //Jackson → Java Klasse zu JSON später für Testing Post-method usw.
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.findAndRegisterModules();
        String residentString = objectMapper.writeValueAsString(resident);

        System.out.println(residentString);

    }
}
