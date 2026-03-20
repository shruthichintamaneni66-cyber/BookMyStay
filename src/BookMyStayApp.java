import java.util.*;

public class HotelBookingApp {
    public static void main(String[] args) {
        Set<Integer> bookedRooms = new HashSet<>();

        int room = 101;

        if (!bookedRooms.contains(room)) {
            bookedRooms.add(room);
            System.out.println("Room booked");
        } else {
            System.out.println("Already booked");
        }
    }
}