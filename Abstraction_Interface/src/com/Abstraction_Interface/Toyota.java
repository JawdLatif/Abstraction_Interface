package com.Abstraction_Interface;

public class Toyota implements Vehicle {

	@Override
	public String drive() {
		
		return "Runs 150 mph";
	}

	@Override
	public String usage() {
		
		return "1 gallon per mail";
	}

}
