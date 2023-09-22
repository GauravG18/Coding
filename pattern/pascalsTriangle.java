import java.util.*;

public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> ans = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ans.add(1);
                } else {

                    ans.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }

            result.add(ans);
        }
        System.out.println(result);
    }
}
