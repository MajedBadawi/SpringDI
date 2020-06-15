package com.majedbadawi.springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach constructorCoach = context.getBean("baseballCoach", Coach.class);
		
		// call methods on the bean
		System.out.println("constructor DI: " + constructorCoach.getDailyFortune());
		
		// retrieve bean from spring container
		TrackCoach setterCoach = context.getBean("trackCoach", TrackCoach.class);
				
		// call methods on the bean
		System.out.println("setter DI: " + setterCoach.getDailyFortune() + " - email: " + setterCoach.getEmail());
		
		// close the context
		context.close();
	}

}
