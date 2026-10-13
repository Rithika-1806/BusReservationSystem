public class Bus {
    int busNumber;
    String busName;
    String source;
    String destination;
    int totalSeats;
    double fare;

    public Bus(int busNumber, String busName, String source,
               String destination, int totalSeats, double fare) {
        this.busNumber = busNumber;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.fare = fare;
    }
}
