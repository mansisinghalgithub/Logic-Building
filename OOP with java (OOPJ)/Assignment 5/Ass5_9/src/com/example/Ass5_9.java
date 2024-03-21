package com.example;

import java.util.Scanner;

class Date
{
	private int day,month,year;
	
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date: ");
		int day=sc.nextInt();
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month: ");
		int month=sc.nextInt();
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		this.year = year;
	}
	public boolean isValid()
	{
		if(year<0 || year>9999)
			return false;
		
		if(month<1 || month>12)
			return false;
		
		int maxDays=31;
		if(month==4 || month==6 || month==9 || month==11)
		{
			maxDays=30;
		}
		else if(month==2)
		{
			maxDays=(isLeapYear(year)) ? 29 :28;
			
		}
		
		return day>=1 && day<=maxDays;
	}
	
	public void getDayOfWeek()
	{
		
	}
	
	public void isLeapYear()
	{
		if(isLeapYear(year))
		{
			System.out.println("Year is leap ");
		}
		else
		{
			System.out.println("Year is not leap");
		}
	}
	
	private boolean isLeapYear(int year)
	{
		return (year%4==0 && year%100!=0) || (year%400==0);
	}
	public void getNextDay()
	{
		
	}
	
	public void getPreviousDay()
	{
		
	}
	
}

public class Ass5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date(1,1,2001);
		d.setDay();
		d.setMonth();
		d.setYear();
		
		System.out.println("Date:  "+d.getDay()+"-"+d.getMonth()+"-"+d.getYear());
		System.out.println("Is date valid: " +d.isValid());
		d.isLeapYear();
	}

}
