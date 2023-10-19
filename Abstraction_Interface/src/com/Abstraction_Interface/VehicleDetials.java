package com.Abstraction_Interface;

public class VehicleDetials {

	public static void main(String[] args) {
		
		System.out.println("************BMW**************\n");
		Vehicle obj1 = new BMW();
		System.out.println(obj1.drive());
		System.out.println(obj1.usage());

		System.out.println("************Toyota**************\n");
		Vehicle obj2 = new Toyota();
		System.out.println(obj2.drive());
		System.out.println(obj2.usage());
		
		System.out.println("************Ford**************\n");
		Vehicle obj3 = new Ford();
		System.out.println(obj3.drive());
		System.out.println(obj3.usage());
	}

}
