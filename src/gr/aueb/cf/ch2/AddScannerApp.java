package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει 2 ακεραίους από το stdin (Keyboard)
 * και υπολογίζει το άθροισμα και το εκτυπώνει.
 */

public class AddScannerApp {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Διαβάζει και εκχωρεί σε μεταβλητές - Data Binding
        System.out.println("παρακαλώ εισάγεται 2 ακεραίους!");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Λογική Εφαρμογής - Παραστάσεις
        sum = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και των %d είναι: %d\n",num1, num2, sum);
    }
}
