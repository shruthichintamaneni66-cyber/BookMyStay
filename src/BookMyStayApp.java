import java.util.*;

class BookingService {
    Map<Integer, String> bookings = new HashMap<>();

    void book(int room, String name) {
        bookings.put(room, name);
    }
}

public class HotelBookingApp {
    public static void main(String[] args) {
        BookingService service = new BookingService();
        service.book(101, "John");
    }
}