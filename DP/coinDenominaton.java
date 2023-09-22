import java.util.*;

public class coinDenominaton {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        int n = 11;
        int[] coin = { 1, 2, 5 };
        coinpermu(coin, n, "");
        // coincomb(coin, n, "", 0);

    }

    // T-1 : coins supply infinite!! permutatuion!
    public static void coinpermu(int[] coin, int amount, String path) {
        if (amount == 0) {
            System.out.println(path);
            return;
        }
        if (amount < 0) {
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            coinpermu(coin, amount - coin[i], path + coin[i] + " ");
        }
    }

    // combination!
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(candidates);
        backTrack(result, ans, candidates, target, 0);
        return result;
    }

    public static void backTrack(List<List<Integer>> result, List<Integer> ans, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return;
        }

        if (remain == 0) {
            result.add(new ArrayList<Integer>(ans));
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            ans.add(candidates[i]);
            backTrack(result, ans, candidates, remain - candidates[i], i + 1);
            ans.remove(ans.size() - 1);
        }
    }

}
