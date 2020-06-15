package com.majedbadawi.springDI;

import java.util.Random;

public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"good", "bad", "medium"};
		return "You get " + fortunes[new Random().nextInt(fortunes.length)] + " fortune";
	}

}
