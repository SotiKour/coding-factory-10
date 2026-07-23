package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Θέλουμε να βρούμε πόσες φορές εμφανίζεται ένα στοιχείο σε ένα πίνακα
 */

public class ArrayCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int value = 0;
        int count = 0;

        System.out.println("Please insert a value to search for: ");
        value = scanner.nextInt();

        count = getCount(arr, value);

        System.out.println("The number of times " + value + " appears in the array is: " + count);

    }


    /**
     * Calculates the count of times an element exist in a given array
     * @param arr       the input array to search through
     * @param value     the value to count in the array
     * @return          the count of occurrences of value in the array, or -1 if the array is null or empty
     */
    public static int getCount(int[] arr,int value){
        if (arr == null) return -1;                         // Δεν υπάρχει πίνακας
        if (arr.length == 0) return -1;
        if (value < 0 || value >= arr.length) return -1;

        int count = 0;

        for (int element : arr) {
            if (value == element) count++;
        }
        return count;
    }
}
