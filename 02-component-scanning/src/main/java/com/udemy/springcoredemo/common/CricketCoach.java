package com.udemy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice fat bowling for 15 minutes.";
		
	}

}
