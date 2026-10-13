
public class Bus {

    private int busNumber;
    private String busName;
    private String source;
    private String destination;
    private int totalSeats;
    private double fare;

    public Bus(int busNumber, String busName,
               String source, String destination,
               int totalSeats, double fare) {

        this.busNumber = busNumber;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.fare = fare;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public double getFare() {
        return fare;
    }
}