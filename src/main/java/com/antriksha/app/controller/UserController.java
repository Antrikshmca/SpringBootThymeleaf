package com.antriksha.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/ping")
	public String ping(Model map) {
		map.addAttribute("name", "Antriksh");
		return "about";
	}

	// handling iterate
	@GetMapping("/pings")
	public String iterateHandler(Model map) {
		List<String> names = List.of("sandeep", "naveen", "vikash", " dhanush");
		map.addAttribute("list", names);
		return "iterate";
	}
}
