package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει με τη χρήση μεθόδου το παραγοντικό του n.
 * Δηλαδή n! = 1 * 2 * 3 * ... * n
 */

public class Factorial {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int result = 0;

        // Input & Data Binding
        System.out.println("Για ποιον αριθμό θες να βρεις το παραγοντικό?");
        n = scanner.nextInt();

        // Calls the service - delegation
        result = facto(n);          // Inject the real parameter

        // Εκτύπωση
        System.out.printf("Το παραγοντικό του %d είναι το %d%n", n, result);

    }

    /**
     * Calculate Factroial of n.
     * @param n         the number of calculate factorial for
     * @return    the factorial of n
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }



}
