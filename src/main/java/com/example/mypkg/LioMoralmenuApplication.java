package com.example.mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


//Main method of the moral module
@RestController
@SpringBootApplication
public class LioMoralmenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(LioMoralmenuApplication.class, args);
	}
}
