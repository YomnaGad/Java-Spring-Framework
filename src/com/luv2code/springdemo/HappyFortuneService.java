package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private String[] fortuneArray = {
	    "fortuneElementOne",
	    "fortuneElementTwo",
	    "fortuneElementThree" };
    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
	// TODO Auto-generated method stub
	int idx = myRandom.nextInt(fortuneArray.length);
	String randomElement = fortuneArray[idx];

	// TODO Auto-generated method stub
	return randomElement;
    }

}
