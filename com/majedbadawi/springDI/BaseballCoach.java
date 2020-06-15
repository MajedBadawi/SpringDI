package com.majedbadawi.springDI;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	//constructor dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in Baseball";
	}

	@Override
	public String getDailyFortune() {
		return "Baseball Coach Fortune: " + fortuneService.getFortune();
	}
}
