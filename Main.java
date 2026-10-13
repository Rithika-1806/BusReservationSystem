
public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(101, "Kovai Express",
                "Coimbatore", "Chennai", 40, 500);

        Bus bus2 = new Bus(102, "Nilgiri Express",
                "Coimbatore", "Ooty", 35, 300);

        System.out.println("===== BUS RESERVATION SYSTEM =====");
        System.out.println();

        System.out.println("Bus Number: " + bus1.busNumber);
        System.out.println("Bus Name: " + bus1.busName);
        System.out.println("Route: " + bus1.source + " to " + bus1.destination);
        System.out.println("Available Seats: " + bus1.totalSeats);
        System.out.println("Fare: Rs. " + bus1.fare);

        System.out.println();

        System.out.println("Bus Number: " + bus2.busNumber);
        System.out.println("Bus Name: " + bus2.busName);
        System.out.println("Route: " + bus2.source + " to " + bus2.destination);
        System.out.println("Available Seats: " + bus2.totalSeats);
        System.out.println("Fare: Rs. " + bus2.fare);
    }
}
