import java.util.*;

public class ImpArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = scn.nextInt();
        // }
        int[] arr = { 2, 3, 6, 9, 8, 3, 2, 3, 6, 4 };
        int num = scn.nextInt();

        System.out.println(firstidx(arr, 0, num));
        System.out.println();

        System.out.println(lastIdx(arr, arr.length - 1, num));
        System.out.println();

        System.out.println(lastIdx2(arr, 0, num));
        System.out.println();

        allIndex(arr, 0, num);
        System.out.println();
        
        System.out.println(Arrays.toString(allidx(arr, num, 0, 0)));

    }

    // FIND THE FIRST INDEX OF ELEMENT
    public static int firstidx(int[] arr, int idx, int num) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == num) {
            return idx;
        }

        return firstidx(arr, idx + 1, num);
    }

    // MODERATE
    // FIND THE LAST INDEX OF AN ELEMENT
    public static int lastIdx(int[] arr, int idx, int num) {
        if (idx < 0) {
            return -1;
        }
        if (arr[idx] == num) {
            return idx;
        }
        return lastIdx(arr, idx - 1, num);
    }

    // HARD IMPORTANT
    // FIND THE LAST INDEX OF AN ELEMENT
    public static int lastIdx2(int[] arr, int idx, int num) {
        if (idx == arr.length) {
            return -1;
        }
        int ans = lastIdx2(arr, idx + 1, num);
        if (ans == -1) {
            if (arr[idx] == num) {
                ans = idx;
                return ans;
            } else {
                return -1;
            }
        }
        return ans;
    }

    // FIND ALL THE INDEX OF AN ELEMENT
    public static void allIndex(int[] arr, int idx, int num) {
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == num) {
            System.out.print(idx + "\t");
        }
        allIndex(arr, idx + 1, num);
        return;
    }

    // HARD
    // FIND ALL THE INDEX OF AN ELEMENT INTO AN ARRAY
    public static int[] allidx(int[] arr, int num, int idx, int idx2) {
        if (idx == arr.length) {
            return new int[idx2];
        }
        if (arr[idx] == num) {
            int[] arr2 = allidx(arr, num, idx + 1, idx2 + 1);
            arr2[idx2] = idx;
            return arr2;
        }
        return allidx(arr, num, idx + 1, idx2);
    }
}
