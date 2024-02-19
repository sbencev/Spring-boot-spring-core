package com.udemy.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.springcoredemo.common.ICoach;

@RestController
public class DemoController {

	private ICoach myCoach;
	private ICoach anotherCoach;

	@Autowired
	public DemoController(@Qualifier("cricketCoach") ICoach theCoach, @Qualifier("cricketCoach") ICoach theanotherCoach) {

		System.out.println("In constructor: " + getClass().getSimpleName());
		myCoach = theCoach;
		anotherCoach = theanotherCoach;

	}

	@GetMapping("/dailyworkout")
	public String getDaliyWorkout() {

		return myCoach.getDailyWorkout();

	}

	@GetMapping("/check")
	public String check() {

		return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);

	}

}
