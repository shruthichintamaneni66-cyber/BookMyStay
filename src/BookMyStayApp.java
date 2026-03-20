import java.util.*;

public class HotelBookingApp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Customer1");
        queue.add("Customer2");

        System.out.println("Serving: " + queue.poll());
    }
}