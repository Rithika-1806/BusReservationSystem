
public class Reservation {

    int reservationId;
    Passenger passenger;
    Bus bus;

    public Reservation(int reservationId, Passenger passenger, Bus bus) {
        this.reservationId = reservationId;
        this.passenger = passenger;
        this.bus = bus;
    }

    public void displayReservation() {

        System.out.println("\n===== RESERVATION DETAILS =====");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Passenger Name: " + passenger.passengerName);
        System.out.println("Passenger Age: " + passenger.age);
        System.out.println("Gender: " + passenger.gender);
        System.out.println("Bus Number: " + bus.getBusNumber());
        System.out.println("Bus Name: " + bus.getBusName());
        System.out.println("Route: " + bus.getSource()
                + " to " + bus.getDestination());
        System.out.println("Fare: Rs. " + bus.getFare());
    }
}
