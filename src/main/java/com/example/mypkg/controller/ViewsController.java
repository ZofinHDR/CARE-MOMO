package com.example.mypkg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Controller for all html views
@Controller
public class ViewsController {

	@GetMapping("/homeUserView")
	public String homeUserView() {
		return "homeUserView";
	}

	@GetMapping("/infoUserView")
	public String infoUserView() {
		return "infoUserView";
	}

	@GetMapping("/socialUserView")
	public String socialUserView() {
		return "socialUserView";
	}

	@GetMapping("/transparencyUserView")
	public String transparencyUserView() {
		return "transparencyUserView";
	}

	@GetMapping("/functionalityUserView")
	public String functionalityUserView() {
		return "functionalityUserView";
	}
}