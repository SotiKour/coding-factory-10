package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων αριθμών.
 */

public class Sum10 {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10){
            sum += i;
            i++;
        }

        while (j <= 10){
            mul *= j;
            j++;
        }
        System.out.println("Mul: " + mul);
        System.out.println("Sum: " + sum);
    }

}
