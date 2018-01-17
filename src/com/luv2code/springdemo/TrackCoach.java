package com.luv2code.springdemo;

public class TrackCoach extends Coach {
	
	private FortuneService fortuneService;
	public TrackCoach(){}
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();	}

}
