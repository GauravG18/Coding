import java.util.*;

public class coinCombPrint {
    public static void printCoinCombinations(int[] coins, int amount) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(coins, amount, 0, currentCombination, result);

        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    private static void backtrack(int[] coins, int remaining, int startIndex, List<Integer> currentCombination,
            List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = startIndex; i < coins.length; i++) {
            if (coins[i] <= remaining) {
                currentCombination.add(coins[i]);
                backtrack(coins, remaining - coins[i], i, currentCombination, result);
                currentCombination.remove(currentCombination.size() - 1); // Backtrack

                // currentCombination.remove(currentCombination.size() - 1);:
                // After the recursive call returns, we remove the last coin added to the
                // currentCombination. This is the backtrack step. We remove the coin we added
                // earlier because we want to explore other possibilities without that specific
                // coin in the combination.
            }
        }
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        printCoinCombinations(coins, amount);
    }
}
