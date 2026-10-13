
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Reservation> reservations = new ArrayList<>();
    static int nextReservationId = 1001;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bus bus1 = new Bus(101, "Kovai Express",
                "Coimbatore", "Chennai", 40, 500);

        Bus bus2 = new Bus(102, "Nilgiri Express",
                "Coimbatore", "Ooty", 35, 300);

        int choice;

        do {
            System.out.println("\n===== BUS RESERVATION SYSTEM =====");
            System.out.println("1. View Available Buses");
            System.out.println("2. Book a Ticket");
            System.out.println("3. View Reservations");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = getNumber(sc);
            sc.nextLine();

            if (choice == 1) {

                displayBus(bus1);
                displayBus(bus2);

            } else if (choice == 2) {

                System.out.print("Enter passenger name: ");
                String name = sc.nextLine().trim();

                if (name.isEmpty()) {
                    System.out.println("Passenger name cannot be empty.");
                    continue;
                }

                System.out.print("Enter age: ");
                int age = getNumber(sc);
                sc.nextLine();

                if (age <= 0 || age > 120) {
                    System.out.println(
                            "Invalid age. Please enter an age between 1 and 120.");
                    continue;
                }

                System.out.print("Enter gender (M/F/Other): ");
                String gender = sc.nextLine().trim();

                if (!gender.equalsIgnoreCase("M")
                        && !gender.equalsIgnoreCase("F")
                        && !gender.equalsIgnoreCase("Other")) {

                    System.out.println(
                            "Invalid gender. Please enter M, F, or Other.");
                    continue;
                }

                System.out.print("Enter bus number (101 or 102): ");
                int busNumber = getNumber(sc);
                sc.nextLine();

                Bus selectedBus = null;

                if (busNumber == 101) {
                    selectedBus = bus1;
                } else if (busNumber == 102) {
                    selectedBus = bus2;
                }

                if (selectedBus != null
                        && selectedBus.getTotalSeats() > 0) {

                    Passenger passenger =
                            new Passenger(name, age, gender);

                    Reservation reservation = new Reservation(
                            nextReservationId, passenger, selectedBus);

                    reservations.add(reservation);
                    nextReservationId++;

                    selectedBus.setTotalSeats(
                            selectedBus.getTotalSeats() - 1);

                    System.out.println("Ticket booked successfully!");
                    reservation.displayReservation();

                } else {
                    System.out.println(
                            "Invalid bus number or no seats available.");
                }

            } else if (choice == 3) {

                if (reservations.isEmpty()) {
                    System.out.println("No reservations found.");
                } else {
                    for (Reservation reservation : reservations) {
                        reservation.displayReservation();
                    }
                }

            } else if (choice == 4) {

                System.out.print("Enter reservation ID to cancel: ");
                int id = getNumber(sc);
                sc.nextLine();

                boolean found = false;

                for (int i = 0; i < reservations.size(); i++) {

                    Reservation reservation = reservations.get(i);

                    if (reservation.getReservationId() == id) {

                        reservation.getBus().setTotalSeats(
                                reservation.getBus().getTotalSeats() + 1);

                        reservations.remove(i);

                        System.out.println(
                                "Reservation cancelled successfully.");

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Reservation ID not found.");
                }

            } else if (choice == 5) {

                System.out.println(
                        "Thank you for using the Bus Reservation System.");

            } else {

                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    public static void displayBus(Bus bus) {

        System.out.println("---------------------------");
        System.out.println("Bus Number: " + bus.getBusNumber());
        System.out.println("Bus Name: " + bus.getBusName());
        System.out.println("Route: " + bus.getSource()
                + " to " + bus.getDestination());
        System.out.println("Available Seats: " + bus.getTotalSeats());
        System.out.println("Fare: Rs. " + bus.getFare());
    }

    public static int getNumber(Scanner sc) {

        while (!sc.hasNextInt()) {
            System.out.println(
                    "Invalid input. Please enter a number.");
            sc.next();
            System.out.print("Enter again: ");
        }

        return sc.nextInt();
    }
}
