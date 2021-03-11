package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    
	
	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	
	private String emailAddress;
	
	private String team;
	
	
	
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	
	
	
	
    public String getEmailAddress() {
		return emailAddress;
	}




	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : Inside setter for set email");
		this.emailAddress = emailAddress;
	}




	public String getTeam() {
		return team;
	}




	public void setTeam(String team) {
		System.out.println("CricketCoach : Inside setter for set team");

		this.team = team;
	}




	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : Inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
