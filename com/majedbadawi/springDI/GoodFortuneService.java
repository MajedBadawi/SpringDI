package com.majedbadawi.springDI;

public class GoodFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "You get good fortune";
	}
}