package gr.aueb.cf.review;

/**
 * Έστω ότι θέλουμε να αναπαριστούμε μεγάλους ακεραίους σε μορφή πίνακα. Θέλουμε να προσθέτουμε τη μονάδα
 */

public class AddOneApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result;

        result = addOne(arr);
        System.out.println(result[3]);

    }

    public static int[] addOne(int[] arr) {
        int[] arrayOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;               // Προσθέτουμε το ψηφίο με το carry
            arrayOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arrayOut[0] = 1;
        }

        return arrayOut;
    }
}
