package com.luv2code.springdemo;

public class BaseballCoach extends Coach {
	
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}
}
