package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	
	
	
	public TrackCoach() {
	
		// TODO Auto-generated constructor stub
	}



	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It!"+this.fortuneService.getFortune();
		
		
	}

	

}
