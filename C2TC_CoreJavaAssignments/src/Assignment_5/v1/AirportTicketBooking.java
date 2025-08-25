package Assignment_5.v1;

import java.util.Scanner;

public class AirportTicketBooking {

    // Step 1: Interface
    interface Airfare {
        Double calculateAmount();
    }

    // Step 2: AirIndia Class
    static class AirIndia implements Airfare {
        private int hours;
        private double costPerHour;

        public AirIndia() {}

        public AirIndia(int hours, double costPerHour) {
            this.hours = hours;
            this.costPerHour = costPerHour;
        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public double getCostPerHour() {
            return costPerHour;
        }

        public void setCostPerHour(double costPerHour) {
            this.costPerHour = costPerHour;
        }

        public Double calculateAmount() {
            return hours * costPerHour;
        }
    }

    // Step 3: KingFisher Class
    static class KingFisher implements Airfare {
        private int hours;
        private double costPerHour;

        public KingFisher() {}

        public KingFisher(int hours, double costPerHour) {
            this.hours = hours;
            this.costPerHour = costPerHour;
        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public double getCostPerHour() {
            return costPerHour;
        }

        public void setCostPerHour(double costPerHour) {
            this.costPerHour = costPerHour;
        }

        public Double calculateAmount() {
            return hours * costPerHour * 4;
        }
    }

    // Step 4: Indigo Class
    static class Indigo implements Airfare {
        private int hours;
        private double costPerHour;

        public Indigo() {}

        public Indigo(int hours, double costPerHour) {
            this.hours = hours;
            this.costPerHour = costPerHour;
        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public double getCostPerHour() {
            return costPerHour;
        }

        public void setCostPerHour(double costPerHour) {
            this.costPerHour = costPerHour;
        }

        public Double calculateAmount() {
            return hours * costPerHour * 8;
        }
    }

    // Step 5: Main Method
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
