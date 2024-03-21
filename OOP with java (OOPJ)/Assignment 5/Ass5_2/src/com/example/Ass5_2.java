package com.example;

import java.util.Scanner;

class BMI{
	private double height;
	private double weight;
	
	 BMI(double height, double weight)
	{
		this.height=height;
		this.weight=weight;
	}
	double getHeight()
	{
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	double calculateBMI()
	{
		return (weight/(height*height));
	}
	void Display()
	{
		
	}
	
}

public class Ass5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter height: ");
		double height=sc.nextDouble();
		System.out.println("Enter weight :");
		double weight=sc.nextDouble();
		BMI mass=new BMI(0,0);
		mass.setHeight(height);
		mass.setWeight(weight);
		
		System.out.println(mass.calculateBMI());
		sc.close();
		
		

	}

}
