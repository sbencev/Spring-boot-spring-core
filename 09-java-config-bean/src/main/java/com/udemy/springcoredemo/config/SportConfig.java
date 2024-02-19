package com.udemy.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemy.springcoredemo.common.ICoach;
import com.udemy.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

	@Bean("aquatic")
	public ICoach swimCoach() {

		return new SwimCoach();

	}

}
