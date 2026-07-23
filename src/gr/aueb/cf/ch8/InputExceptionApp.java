package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Το {@link java.util.InputMismatchException}  δημιουργεί όταν προσπαθούμε να διαβάσουμε
 * ένα διαφορετικό τύπο δεδομένων από αυτό που περιμένουμε.
 * Για παράδειγμα, αν περιμένουμε έναν ακέραιο και ο χρήστης εισάγει ένα String, τότε θα
 * δημιουργηθεί ένα InputMismatchException.
 */

public class InputExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ εισάγεται έναν ακέραιο!");
        // num = scanner.nextInt();

        if (!scanner.hasNextInt()) {            // state tests
            System.out.println("Δεν εισάγατε ακέραιο!");
        } else {
            num = scanner.nextInt();
            System.out.println("Ο ακέραιος είναι ο: " + num);
        }
    }
}
