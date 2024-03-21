package com.example;

import java.util.Scanner;

class Book{
	private String title,author,publisher,isbn;
	private int year;
	private double price;
	private int quantity;
	
	public Book(){
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.isbn=isbn;
		this.year=year;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public String getPublisher() {
		return publisher;
	}
	
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	public int getYear() {
		return year;
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public void increaseQuantity(int qn) {
		this.quantity=this.quantity+qn;//
	}
	
	public void decreaseQuantity(int qn) {
		this.quantity=this.quantity-qn;//
	}
	public void getInventoryValue() {
		double totalcost=this.price*this.quantity;//
		System.out.println("Total inventory value: "+totalcost);
	}
	
}

	

public class Ass5_3 {

	public static void main(String[] args) {
		
		Book b=new Book();
		b.setTitle("Java");
		b.setAuthor("Greedy Booch");
		b.setPublisher("ABC");
		b.setIsbn("12345");
		b.setYear(2024);
		b.setPrice(500);
		b.setQuantity(500);
		
		System.out.println("Name of Book title: "+b.getTitle());
		System.out.println("Name of Author: "+b.getAuthor());
		System.out.println("Name of Publisher: "+b.getPublisher());
		System.out.println("Isbn: "+b.getIsbn());
		System.out.println("Year: "+b.getYear());
		System.out.println("Price: "+b.getPrice());
		System.out.println("Quantity: "+b.getQuantity());
		
		b.increaseQuantity(5);
		b.getInventoryValue();
		

	}

}
