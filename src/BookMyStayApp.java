import java.util.*;

public class HotelBookingApp {
    public static void main(String[] args) {
        Map<Integer, String> bookings = new HashMap<>();

        bookings.put(101, "John");
        bookings.remove(101);

        System.out.println("Booking cancelled");
    }
}