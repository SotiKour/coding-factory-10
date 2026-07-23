package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το a^n. Ο χρήστης εισάγει το a και το n
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = 0;
        int base = 0;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλώ εισάγετε τη βάση (a): ");
        base = scanner.nextInt();
        System.out.println("Παρακαλώ εισάγετε την δύναμη (n): ");
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.printf("%,d ^ %,d = %,d%n",base, power, result);
    }
}
