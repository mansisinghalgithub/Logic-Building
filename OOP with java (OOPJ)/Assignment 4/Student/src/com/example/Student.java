package com.example;

import java.util.Scanner;

public class Student {

	String name;
	int rollno;
	int marks;

	public void acceptRecord() {
		try(Scanner sc=new Scanner(System.in)){
		System.out.print("Name: ");
		this.name=sc.nextLine();
		System.out.print("Rollno: ");
		this.rollno=sc.nextInt();
		System.out.print("Marks: ");
		this.marks=sc.nextInt();
		}
	}
	
	public void printRecord() {
		System.out.println(this.name+ "  "+this.rollno+ "   " +this.marks);
	}
	


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Student stu=new Student();
	stu.acceptRecord();
	stu.printRecord();
}

}
