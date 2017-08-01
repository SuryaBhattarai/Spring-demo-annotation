package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// crate a array of string
	private String[] data = {
			" This is mx new watcg ",
			"Company nae of this watch BOSS",
			"It cost 77 EURO"
			
	};
	
	// crate a random number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		// Pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
