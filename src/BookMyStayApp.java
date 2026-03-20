import java.util.*;

class Room {
    int id;
    boolean booked;

    Room(int id) {
        this.id = id;
        this.booked = false;
    }
}

public class HotelBookingApp {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            rooms.add(new Room(i));
        }

        System.out.println("Rooms created: " + rooms.size());
    }
}