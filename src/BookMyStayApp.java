import java.util.*;

public class HotelBookingApp {

    static boolean search(List<Integer> list, int i, int target) {
        if (i >= list.size()) return false;
        if (list.get(i) == target) return true;
        return search(list, i + 1, target);
    }

    public static void main(String[] args) {
        List<Integer> rooms = Arrays.asList(101, 102, 103);

        System.out.println(search(rooms, 0, 102));
    }
}