package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει τα base και power και το πρόγραμμα υπολογίζει και
 * εκτυπώνει το base ^ power.
 * Για παράδειγμα, το 2^10 = 1024
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Εισάγεται τη βάση (base) και τη δύναμη (power)");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;     // result = result * base
        }
        System.out.printf("%d ^ %d = %d%n", base, power, result);

    }
}
