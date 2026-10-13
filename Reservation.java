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
        System.out.println("===== RESERVATION DETAILS =====");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Passenger Name: " + passenger.passengerName);
        System.out.println("Age: " + passenger.age);
        System.out.println("Gender: " + passenger.gender);
        System.out.println("Bus Name: " + bus.busName);
        System.out.println("Route: " + bus.source + " to " + bus.destination);
        System.out.println("Fare: Rs. " + bus.fare);
    }
}
