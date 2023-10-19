package com.Abstraction_Interface;

public class Ford implements Vehicle {

	@Override
	public String drive() {

		return "Runs 230 mph";
	}

	@Override
	public String usage() {

		return "1 gallon per mail";
	}

}
