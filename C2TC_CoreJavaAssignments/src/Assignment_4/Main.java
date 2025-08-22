package Assignment_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String bookingInput = sc.nextLine().trim();
            if (bookingInput.isEmpty()) break;

            String[] details = bookingInput.split(",");
            String stageEvent = details[0];
            String customer = details[1];
            Integer noOfSeats = Integer.parseInt(details[2]);

            TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

            int choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1: {
                    double amount = Double.parseDouble(sc.nextLine().trim());
                    booking.makePayment(amount);
                    break;
                }
                case 2: {
                    double amount = Double.parseDouble(sc.nextLine().trim());
                    String walletNumber = sc.nextLine().trim();
                    booking.makePayment(amount, walletNumber);
                    break;
                }
                case 3: {
                    String holderName = sc.nextLine().trim();
                    double amount = Double.parseDouble(sc.nextLine().trim());
                    String cardType = sc.nextLine().trim();
                    String ccv = sc.nextLine().trim();
                    booking.makePayment(holderName, amount, cardType, ccv);
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
