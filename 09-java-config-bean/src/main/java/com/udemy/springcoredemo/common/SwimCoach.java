package com.udemy.springcoredemo.common;

public class SwimCoach implements ICoach {

	public SwimCoach() {

		System.out.println("In constructor: " + getClass().getSimpleName());

	}

	@Override
	public String getDailyWorkout() {

		return "Swim a 1000m as a warmup.";
	}

}
