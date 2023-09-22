import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = scn.nextInt();
        // }

        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        insertion(arr);
    }

    static void insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  //34
            int j = i - 1;     //0

            while (j >= 0 && arr[j] > key) {   // 0 >= 0  && 64 > 34
                arr[j + 1] = arr[j];           // arr[1] = arr[0]  ==  34 = 64
                j--;                           
            }

            arr[j + 1] = key;                  
        }

        System.out.println(Arrays.toString(arr));
    }
}
