package com.Abstraction_Interface;

public class BMW implements Vehicle {

	@Override
	public String drive() {
		
		return "Run 180 mph";
	}

	@Override
	public String usage() {
		
		return "1 gallon per mail";
	}

}
