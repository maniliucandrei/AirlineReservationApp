public class Flight {
    private String flightNumber;
    private String airline;
    private String departure;
    private String destination;
    private int capacity;
    private int seatsBooked;

    public Flight(String flightNumber, String airline, String departure, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departure = departure;
        this.destination = destination;
        this.capacity = capacity;
        this.seatsBooked = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public boolean bookSeat() {
        if (seatsBooked < capacity) {
            seatsBooked++;
            return true;
        }
        return false;
    }
}
