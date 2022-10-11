package com.example.mypkg;

import com.example.mypkg.model.Resident;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


//Main method of the moral module
@EnableWebMvc
@SpringBootApplication
public class LioMoralmenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(LioMoralmenuApplication.class, args);
		Resident re = new Resident();
	}
}
