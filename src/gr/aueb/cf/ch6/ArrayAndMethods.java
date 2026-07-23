package gr.aueb.cf.ch6;

/**
 * Array and Methods
 * Πως περνάμε ένα πίνακα ως τυπική παράμετρο μιας μεθόδου
 * και πως καλούμε μία μέθοδο περνώντας πίνακα ως πραγματική παράμετρο.
 */

public class ArrayAndMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);

        System.out.println();

        printArray(arr, 0,arr.length);


    }


    /**
     * Prints the element of an array
     * @param arr the input array to print
     */
    public static void printArray(int[] arr){

        for (int item : arr){
            System.out.print(item + " ");
        }
    }

    /**
     * Prints the element of an array between two indices.
     * Low index is inclusive
     * High index is exclusive
     * @param arr   the input array to print
     * @param low   the starting index (inclusive)
     * @param high  the ending index (exclusive)
     */
    public static void printArray(int[] arr, int low, int high){
        if (arr == null) return;
        if (low < 0 || high > arr.length) return;
        if (low > high) return;

        for (int i = low; i < high; i++){
            System.out.print(arr[i] + " ");
        }


    }



}
