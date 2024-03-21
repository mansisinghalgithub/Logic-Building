package com.example;

import java.util.Scanner;

public class Ass_7 {
	private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;
	

	public static void main(String[] args) {
		Ass_7 tollBooth = new Ass_7();
        tollBooth.showMenu();
	}
	
	public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("a. Enter vehicle type (car, van, bus, or truck)");
            System.out.println("b. Enter number of axles");
            System.out.println("c. Enter distance traveled");
            System.out.println("d. Calculate toll fee");
            System.out.println("e. Generate bill");
            System.out.println("f. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "a":
                    System.out.print("Enter vehicle type: ");
                    vehicleType = scanner.nextLine();
                    break;
                case "b":
                    System.out.print("Enter number of axles: ");
                    numAxles = scanner.nextInt();
                    break;
                case "c":
                    System.out.print("Enter distance traveled: ");
                    distanceTraveled = scanner.nextDouble();
                    break;
                case "d":
                    calculateTollFee();
                    break;
                case "e":
                    generateBill();
                    break;
                case "f":
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void calculateTollFee() {
        double baseRate = 0.25; 
        if (vehicleType.equalsIgnoreCase("truck")) {
            baseRate = 0.50; 
        }

        tollFee = baseRate * numAxles * distanceTraveled;
        System.out.println("Toll fee calculated.");
    }

    private void generateBill() {
        totalAmountDue = tollFee + 2.00; 
        System.out.println("Bill generated:");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Number of Axles: " + numAxles);
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
        System.out.println("Toll Fee: $" + tollFee);
        System.out.println("Total Amount Due: $" + totalAmountDue);
    }


}
