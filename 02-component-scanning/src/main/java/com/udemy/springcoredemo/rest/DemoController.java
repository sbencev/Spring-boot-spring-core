package com.udemy.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.springcoredemo.common.ICoach;

@RestController
public class DemoController {

	private ICoach myCoach;

	@Autowired
	public DemoController(ICoach theCoach) {
		
		myCoach = theCoach;

	}

	@GetMapping("/dailyworkout")
	public String getDaliyWorkout() {
		
		return myCoach.getDailyWorkout();
		
	}

}
