package gr.aueb.cf.ch6;

/**
 * Συμμετρικός είναι ένας πίνακας αν διαβάζετε το ίδιο από την αρχή μέχρι το τέλος.
 * [1,2,3,3,2,1] Συμμετρικός πίνακας
 * [1,2,3,2,1] Συμμεντρικός πίνακας
 */

public class ArraySymmetric {
    public static void main(String[] args) {

    }


    /**
     *  Επιστρέφει αν ένας πίνακας είναι συμμετρικός
     * @param arr   Ο πίνακας που θέλουμε να ελέγξουμε
     * @return      true αν ο πίνακας είναι συμμετρικός αλλιώς false
     */
    public static boolean isArraySymmetric(int[] arr) {
        if (arr ==  null || arr.length == 0) return false;

        for (int i = 0 , j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) return false;
        }
         return true;
    }
}
