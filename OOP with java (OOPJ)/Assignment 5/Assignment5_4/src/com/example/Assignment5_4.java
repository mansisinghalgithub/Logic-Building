package com.example;

import java.io.InputStream;
import java.util.Scanner;

class ElectricityBill{
	String customerName;
	double unitsConsumed;
	double billAmount;
	
	public double calculateBillAmount(){
		double perunit;
		if(unitsConsumed>=0&&unitsConsumed<=100)
		{
			perunit=unitsConsumed*5;
		}
		else if(unitsConsumed>=100&&unitsConsumed<=200)
		{
			perunit=unitsConsumed*7;
		}
		else
		{
			perunit=unitsConsumed*10;
		}
		return perunit;
	}

	public ElectricityBill()
	{
		this.customerName="Name";
		this.unitsConsumed=0;
	}

}
	public class Assignment5_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ElectricityBill b=new ElectricityBill();
		
		System.out.println("Enter the name of the customer and units consumed instance variable:");
		String name=sc.nextLine();
		double unitsConsumed=sc.nextDouble();
		
		b.customerName=name;
		b.unitsConsumed=unitsConsumed;
		
		double billAmount=b.calculateBillAmount();
		
		System.out.printf("\nCustomer name: %s\nUnits Consumed: %.2f\nBill Amount: %.2f",name,unitsConsumed,billAmount);
		sc.close();
	}
	
}

