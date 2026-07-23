package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n (n!), όπου το n το δίνει ο χρήστης
 */

public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result= 1;
        int i = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο n για τον υπολογισμό του n!: ");
        n = scanner.nextInt();

        while (i <= n) {
            result *= i;
            i++;
        }

        System.out.printf("Το παραγοντικό του %d είναι %d!%n", n, result);


    }
}
