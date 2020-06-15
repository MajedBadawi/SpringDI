package com.majedbadawi.springDI;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	
	//setter dependency injection
	public void setFortuneService(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	//injecting literal values
	public void setEmail(String theEmail) {
		this.email = theEmail;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in Track";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach Fortune: " + fortuneService.getFortune();
	}
}