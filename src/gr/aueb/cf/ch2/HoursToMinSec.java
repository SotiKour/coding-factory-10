package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από το χρήστη ένα ακέραιο που αντιστοιχεί σε ώρες (hours)
 * Μετατρέπει σε Λεπτά και Δευτερόλεπτα και τα εκτυπώνει.
 */

public class HoursToMinSec {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);

        final int HOURS_ΤΟ_MINUTES = 60;
        final int HOURS_IN_SECONDS = 3600;

        int inputHours = 0;
        int minutes = 0;
        int seconds = 0;

        // Input - Data Binding
        System.out.println("Παρακαλώ δώστε έναν ακέραιο για τις ώρες!");
        inputHours = scanner.nextInt();

        //Εντολές Επεξεργασίας
        minutes = inputHours * HOURS_ΤΟ_MINUTES;
        seconds = inputHours * HOURS_IN_SECONDS;

        // Εκτύπωση
        System.out.printf("Οι %d ώρες είναι %,d λεπτά και %,d δευτερόλεπτα!%n", inputHours, minutes, seconds);

    }
}
