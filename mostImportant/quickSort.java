import java.util.*;

public class quickSort {

    // partition method to split subarrays
    // returns the starting point of partition
    static int partition(int[] num, int i, int j) {     //0 and 6   { 27, 23, 11, 7, 9, 17, 6 };
        // i -> pointer on the leftmost element (for smaller elements)
        // j -> pointer on the rightmost element (for greater elements)

        // taking pivot at the middle of the array
        int pivot = num[(i + j) / 2];   // 3 

        while (i < j) {      //0  < 6
            // The pointer 'i' moves ahead till num[i] < pivot,
            // it stops at when num[i] >= pivot
            while (num[i] < pivot) {    //27 < 7
                i++;
            }

            // The pointer 'j' moves back till num[j] > pivot,
            // it stops at when num[j] <= pivot
            while (pivot < num[j]) {    // 7  < 6
                j--;
            }

            // When i<=j holds true, the elements will be swapped
            if (i <= j) {      // 0 <= 6
                int temp = num[i];   //27
                num[i] = num[j];     //27 = 6
                num[j] = temp;       //6 = 27     =>  {6, 23, 11, 7, 9, 17, 27}

                // Now, the pointers will be moved to their next position
                i++;               // 23
                j--;               // 17
            }
        }
        return i;
    }

    // recursive quicksort method
    static void quicksort(int[] num, int i, int j) {  //0  and 6
        int pivot_index = partition(num, i, j);   

        //  {6, 23, 11, 7, 9, 17, 27},  
        // if 'i' is less than pivot_index-1,
        // then the element(s) at left are to be sorted
        if (i < pivot_index - 1) {        // 
            quicksort(num, i, pivot_index - 1);
        }

        // if 'j' is greater than pivot_index-1,
        // then the element(s) at right are to be sorted
        if (pivot_index < j) {
            quicksort(num, pivot_index, j);
        }

    }

    // Main method
    public static void main(String[] args) {
        int[] num = { 27, 23, 11, 7, 9, 17, 6 };

        // Printing unsorted elements
        System.out.println("Unsorted array:");
        for (int i : num) {
            System.out.print(i + " ");
        }

        // Calling quicksort method to sort the elements
        quicksort(num, 0, num.length - 1);    //0  and 6

        // Printing sorted elements
        System.out.println("\nSorted array:");
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
