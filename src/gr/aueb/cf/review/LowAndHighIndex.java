package gr.aueb.cf.review;

/**
 * Έστω ένας ταξινομημένος πίνακας {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 12, 12}.
 * Να επιστέφει το low & high index για ένα key. Αν το key είναι το 8, τότε
 * πρέπει να επιστρέψει {7, 9} ή user-friendly {8, 10}
 */

public class LowAndHighIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 12, 12};
        int key = 8;

        int[] lowAndHighIndex = getLowAndHighIndex(arr, key);
        System.out.println("Low = " + lowAndHighIndex[0] +
                " High = " + lowAndHighIndex[1]);

    }

    public static int[] getLowAndHighIndex(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }
        high = low;
        pivot = low + 1;

        while (pivot < arr.length && arr[pivot++] == key) {
            high++;
        }

        return new int[]{low, high};
    }
}
