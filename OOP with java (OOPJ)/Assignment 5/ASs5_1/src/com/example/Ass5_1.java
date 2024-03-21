package com.example;

import java.util.Scanner;

public class Ass5_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter date(dd/mm/yyyy): ");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		
		
		System.out.printf("dd/mm/yyyy : %02d/%02d/%04d",dd,mm,yyyy);
		System.out.printf("\nmm/dd/yyyy : %02d/%02d/%04d",mm,dd,yyyy);
		System.out.printf("\nyyyy/mm/dd : %04d/%02d/%02d",yyyy,mm,dd);
		
		System.out.println("\nEnter time(hr:min:sec)");
		int hr=sc.nextInt();
		int min=sc.nextInt();
		int sec=sc.nextInt();
				
		System.out.printf("hr:min:sec : %02d:%02d:%02d",hr,min,sec);
		
		String a=(hr>=12) ? "PM" : "AM";
		hr=(hr>12)?hr-12 :hr;
		
		System.out.printf("\nhr:min:sec:a : %02d:%02d:%02d %s",hr,min,sec,a);
		System.out.printf("\nhr:min %02d:%02d",hr,min);
		System.out.printf("\ndd/mm/yyyy hr:min:sec : %02d/%02d/%04d %02d:%02d:%02d",dd,mm,yyyy,hr,min,sec);
		System.out.printf("\nmm/dd/yyyy : %02d/%02d/%04d %02d:%02d:%02d %s",mm,dd,yyyy,hr,min,sec,a);
		System.out.printf("\nyyyy/mm/dd : %04d/%02d/%02d %02d:%02d",yyyy,mm,dd,hr,min);
		
		sc.close();
		

	}

}




	

	


		
	