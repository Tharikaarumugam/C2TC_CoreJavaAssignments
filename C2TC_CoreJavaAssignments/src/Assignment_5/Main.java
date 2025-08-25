package Assignment_5;

import java.util.Scanner;


import Assignment_5.AirIndia;
import Assignment_5.Airfare;
import Assignment_5.Indigo;
import Assignment_5.KingFisher;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter airline choice (1 for AirIndia, 2 for KingFisher, 3 for Indigo):");
        int choice = sc.nextInt();
        
        System.out.println("Enter number of seats:");
        int hours = sc.nextInt();
        
        System.out.println("Enter cost per seat:");
        double costPerHour = sc.nextDouble();

        Airfare airfare = null;
        String airlineName = "";


        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }

        double totalAmount = airfare.calculateAmount();
        
        System.out.println("Airline: " + airlineName);
        System.out.println("Seats: " + hours);
        System.out.printf("%.2f\n", totalAmount);  // Rounding to 2 decimal places
    }
}
