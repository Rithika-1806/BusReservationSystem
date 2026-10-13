
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bus bus1 = new Bus(101, "Kovai Express",
                "Coimbatore", "Chennai", 40, 500);

        Bus bus2 = new Bus(102, "Nilgiri Express",
                "Coimbatore", "Ooty", 35, 300);

        System.out.println("===== BUS RESERVATION SYSTEM =====");
        System.out.println("1. View Available Buses");
        System.out.println("2. Book a Ticket");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            displayBus(bus1);
            displayBus(bus2);
        } else if (choice == 2) {
            System.out.print("Enter passenger name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter gender: ");
            String gender = sc.nextLine();

            System.out.println("Available buses:");
            System.out.println("101 - Kovai Express - Rs. 500");
            System.out.println("102 - Nilgiri Express - Rs. 300");

            System.out.print("Enter bus number: ");
            int busNumber = sc.nextInt();

            Bus selectedBus = null;

            if (busNumber == 101) {
                selectedBus = bus1;
            } else if (busNumber == 102) {
                selectedBus = bus2;
            }

            if (selectedBus != null) {
                if (selectedBus.totalSeats > 0) {
                    Passenger passenger =
                            new Passenger(name, age, gender);

                    Reservation reservation =
                            new Reservation(1001, passenger, selectedBus);

                    selectedBus.totalSeats--;

                    System.out.println("Ticket booked successfully!");
                    reservation.displayReservation();
                    System.out.println("Remaining seats: "
                            + selectedBus.totalSeats);
                } else {
                    System.out.println("Sorry, no seats available.");
                }
            } else {
                System.out.println("Invalid bus number.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }

    public static void displayBus(Bus bus) {
        System.out.println("---------------------------");
        System.out.println("Bus Number: " + bus.busNumber);
        System.out.println("Bus Name: " + bus.busName);
        System.out.println("Route: " + bus.source
                + " to " + bus.destination);
        System.out.println("Available Seats: " + bus.totalSeats);
        System.out.println("Fare: Rs. " + bus.fare);
    }
}
