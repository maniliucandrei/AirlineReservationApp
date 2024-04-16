import java.util.ArrayList;
import java.util.Scanner;

class AirlineSystem {
    private ArrayList<Flight> flights;
    private ArrayList<Reservation> reservations;

    public AirlineSystem() {
        flights = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public boolean bookFlight(String flightNumber, Passenger passenger) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber) && flight.bookSeat()) {
                reservations.add(new Reservation(flight, passenger));
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AirlineSystem system = new AirlineSystem();
        system.addFlight(new Flight("123", "Delta Airlines", "NYC", "London", 200));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger name:");
        String name = scanner.nextLine();
        System.out.println("Enter passport number:");
        String passport = scanner.nextLine();
        Passenger passenger = new Passenger(name, passport);

        if (system.bookFlight("123", passenger)) {
            System.out.println("Flight booked successfully!");
        } else {
            System.out.println("Failed to book the flight.");
        }

        scanner.close();
    }
}