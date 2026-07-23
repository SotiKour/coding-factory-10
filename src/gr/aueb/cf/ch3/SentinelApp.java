package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει ακεραίους από το χρήστη μέχρι να δοθεί ο ακέραιος -1 (Sentinel)
 */

public class SentinelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Παρακαλώ δώστε έναν ακέραιο (-1 για έξοδο)");

        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.println("Παρακαλώ δώστε έναν ακέραιο (-1 για έξοδο)");
        }

        System.out.printf("Επαναλήψεις %d%n", iterations);





    }
}
