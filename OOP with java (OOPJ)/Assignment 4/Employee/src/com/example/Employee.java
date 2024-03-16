package com.example;

public class Employee {

		String name;
		int empid;
		double salary;
		
		
		public static void employee1(String n1, int n2, double n3) {
		
			System.out.println( n1 + " " +n2 +" " +n3);

		}
		
		public static void employee1(String n1, double n2 ) {
			
			System.out.println(n1 +" " +n2);

		}
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee emp=new Employee();
			emp.employee1("Mansi",1, 1000.00);
			emp.employee1("Nishi",2000.00);
			
			

		}
		
		


}
