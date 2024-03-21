package com.example;

import java.util.Scanner;

public class Ass5_8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first rational number:");
		System.out.println("Numerator: ");
		double numerator=sc.nextInt();
		
		System.out.println("Denominator: ");
		double denominator=sc.nextInt();
		
		System.out.println("Enter the second rational number:");
		System.out.println("Numerator: ");
		double numerator1=sc.nextInt();
		
		System.out.println("Denominator: ");
		double denominator1=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the arithmetic operation(+,-,*,/):");
		String operator=sc.nextLine();
		
		double result=0;
		switch(operator)
		{
		case "+":
			result=((double)numerator/denominator)+((double)numerator1/denominator1);
			break;
			
		case "-":
			result=((double)numerator/denominator)-((double)numerator1/denominator1);
			break;
			
		case "*":
			result=((double)numerator/denominator)*((double)numerator1/denominator1);
			break;
			
		case "/":
			result=((double)numerator/denominator)+((double)numerator1/denominator1);

			break;
		default:
			System.out.println("Wrong input entered by the user");
			break;
			
		}
		System.out.printf("Result: %.2f%n",result);
		sc.close();
	}

}
