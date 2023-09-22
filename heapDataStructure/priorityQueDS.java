import java.util.*;

public class priorityQueDS {
    // HEAP SORT <- SOMETHING LIKE THAT
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // Collections.reverseOrder() <- in the constructor make the priority que to
        // prioritize the higher value first
        int[] arr = { 22, 99, 3, 11, 88, 4, 1 };

        for (int num : arr) {
            pq.add(num); // O(logn)
        }

        while (pq.size() > 0) {
            System.out.print(pq.peek() + " "); // peek() <- O(n)
            pq.remove(); // O(logn)
        }
    }

}
