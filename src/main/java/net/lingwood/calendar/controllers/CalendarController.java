package net.lingwood.calendar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalendarController {
	
	@GetMapping("/calendar")
	public String calendar() {
		return "Welcome to Calendar";
	}
	
}
