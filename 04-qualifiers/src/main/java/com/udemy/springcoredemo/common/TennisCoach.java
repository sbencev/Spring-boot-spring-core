package com.udemy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";

	}

}
