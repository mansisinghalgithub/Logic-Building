package com.example;


public class Vehicle {
	String name;
	String color;
	int prize;
	String tyre;
	
	public static void vehicle1(String n1, String n2) {
	
		System.out.println("Name of car: "+n1 +n2);

	}
	
	public static void vehicle1(String n1, String n2, String n3 ) {
		
		System.out.println("Colour of car: "+n1 +n2 +n3);

	}
	
	public static void vehicle1(String n1 ) {
		
		System.out.println("Tyre of car: "+n1);

	}
	
	public static void vehicle1(int n1, int n2 ) {
		
		System.out.println("Prize of car: "+n1 +n2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle veh=new Vehicle();
		veh.vehicle1(" Nexon "," Alto ");
		veh.vehicle1(" Yellow ", " Blue "," Red ");
		veh.vehicle1("MRF");
		veh.vehicle1(100000, 200000);
		
		

	}
	
	

}

