package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {
	
	//define a private filed for the dependency
	
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
     public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
		
	}
    @Override
	public String getDailyWorkout() {
		
	  return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a forrtun
		
		return fortuneService.getFortune();
	}

}
