interface BookingStrategy {
    void book();
}

class NormalBooking implements BookingStrategy {
    public void book() {
        System.out.println("Normal booking");
    }
}

public class HotelBookingApp {
    public static void main(String[] args) {
        BookingStrategy strategy = new NormalBooking();
        strategy.book();
    }
}