public class Reservation {

    private  int reservationId;
    private Passenger passenger;
    private Bus bus;

    public Reservation(int reservationId, Passenger passenger, Bus bus) {
        this.reservationId = reservationId;
        this.passenger = passenger;
        this.bus = bus;
    }
    public int getReservationId() {
        return reservationId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Bus getBus() {
        return bus;
    }
    public void displayReservation() {

        System.out.println("\n===== RESERVATION DETAILS =====");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Passenger Name: "
                + passenger.getPassengerName());
        System.out.println("Passenger Age: " + passenger.getAge());
        System.out.println("Gender: " + passenger.getGender());
        System.out.println("Bus Number: " + bus.getBusNumber());
        System.out.println("Bus Name: " + bus.getBusName());
        System.out.println("Route: " + bus.getSource()
                + " to " + bus.getDestination());
        System.out.println("Fare: Rs. " + bus.getFare());
    }
}