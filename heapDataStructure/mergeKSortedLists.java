import java.util.*;

public class mergeKSortedLists {

    // 1. You are given a list of lists, where each list is sorted.
    // 2. You are required to complete the body of mergeKSortedLists function. The
    // function is expected to merge k sorted lists to create one sorted list.

    // Space complextiy = O(k)
    // Time complexity = nlogk
    // where k is the number of lists and n is number of elements across all lists.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = scn.nextInt();
            for (int j = 0; j < n; j++) {
                list.add(scn.nextInt());
            }
            lists.add(list);
        }
    }

    public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> lists){
        ArrayList<Integer> ans =new ArrayList<>();
        return ans;
    }
}
