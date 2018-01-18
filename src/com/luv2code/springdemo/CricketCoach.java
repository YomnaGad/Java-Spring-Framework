package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
	// TODO Auto-generated constructor stu
	System.out.println("inside no arg constructor");
    }

    public String getEmailAddress() {
	return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
    }

    public String getTeam() {
	return team;
    }

    public void setTeam(String team) {
	this.team = team;
    }

    @Override
    public String getDailyWorkout() {
	// TODO Auto-generated method stub
	return "practice fast bowling ";
    }

    public FortuneService getFortuneService() {
	return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
	System.out.println("inside setter method");
	this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune();
    }

}
