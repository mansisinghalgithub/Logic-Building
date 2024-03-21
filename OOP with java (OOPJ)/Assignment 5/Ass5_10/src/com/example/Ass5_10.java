package com.example;

import java.util.Scanner;

class Credit{
	private int creditHistory;
	private double creditUtilization;
	private boolean paymentHistory;
	
	public Credit(int creditHistory, double creditUtilization, boolean paymentHistory){
		this.creditHistory=creditHistory;
		this.creditUtilization=creditUtilization;
		this.paymentHistory=paymentHistory;
	}

	public int getCreditHistory() {
		return creditHistory;
	}

	/*public void setCreditHistory(int creditHistory) {
		this.creditHistory = creditHistory;
	}*/

	public double getCreditUtilization() {
		return creditUtilization;
	}

	/*public void setCreditUtilization(double creditUtilization) {
		this.creditUtilization = creditUtilization;
	}*/

	public boolean isPaymentHistory() {
		return paymentHistory;
	}

	/*public void setPaymentHistory(boolean paymentHistory) {
		this.paymentHistory = paymentHistory;
	}*/
	
	int calculateCreditScore()
	{
		if (paymentHistory)
		{
		return ((creditHistory * 15) + (int)(creditUtilization * 30) + 55);
		}
		
		else
		{
		return ((creditHistory * 15) + (int)(creditUtilization * 30) + 35);
		}
		
	}
	
	void Display()
	{
		
	}
	
}
public class Ass5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter length of the individual's credit history: ");
		int creditHistory=sc.nextInt();
		
		System.out.println("Enter Percentage of available credit the individual is using. :");
		double creditUtilisation=sc.nextDouble();
		
		System.out.println("the individual has a good payment history or not.(true/false) :");
		boolean paymentHistory=sc.nextBoolean();
		
		
		Credit c= new Credit(creditHistory, creditUtilisation, paymentHistory);
		//c.setCreditHistory(creditHistory);
		//c.setCreditUtilization(creditUtilization);
		c.isPaymentHistory();
		
		System.out.println("Credit Score : "+c.calculateCreditScore());
		sc.close();
	}

}

