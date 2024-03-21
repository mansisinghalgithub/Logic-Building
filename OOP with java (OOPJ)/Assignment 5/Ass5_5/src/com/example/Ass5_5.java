package com.example;

import java.util.Scanner;

public class Ass5_5 {

	public static void main(String[] args) {
		
			int customer_bill;
			double calculate_bill=0;
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter customer name: ");
			String customer_name=sc.nextLine();
			
			System.out.println("Enter phone number: ");
			long number=sc.nextLong();
			
			System.out.println("Enter no.of calls: ");
			int no_of_calls=sc.nextInt();		
			
			if(no_of_calls>1 && no_of_calls<=100)
			{
				customer_bill=no_of_calls*50;
			}
			
			else 
			{
				 customer_bill=100*50+(no_of_calls-100)*25;
			}
			
			
			
			System.out.println("Enter the duration of call (in minutes)");
			double duration_of_call=sc.nextDouble();
			if(duration_of_call<=1)
			{
				duration_of_call=1;
			}
			
		
	        calculate_bill += duration_of_call * 0.5; 

	        
	        calculate_bill += customer_bill;

	        calculate_bill +=10;
	        System.out.println("Total Bill: $" + calculate_bill);
	        sc.close();
	}
}


