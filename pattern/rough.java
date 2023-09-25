import java.util.*;

public class rough {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] arr = { "a", "b", "ba", "bca", "bda", "bdca" };

        Arrays.sort(arr, Comparator.comparing(String::length)); // sort ther string array with respect to length of the
                                                                // string element

        Arrays.sort(arr, (a, b) -> a.length() - b.length()); // sorting wrt to length
        System.out.println(Arrays.toString(arr));
    }
}
