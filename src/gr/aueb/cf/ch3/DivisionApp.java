package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επιτρέπει στο χρήστη να εισάγει αριθμητή και παρανομαστή και
 * να εκτλεί τη διαίρεση
 */

public class DivisionApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;


        // Είσοδος δεδομένων και επεξεργασία
        while (true){
            System.out.println("Παρακαλώ εισάγετε τον αριθμητή! (Έξοδος με 0)!");
            numerator = scanner.nextInt();

            if (numerator == 0){
                System.out.println("Έξοδος! ");
                break;
            }

            System.out.println("Παρακαλώ εισάγετε τον παρανομαστή!");
            denominator = scanner.nextInt();

            if (denominator == 0){
                System.out.println("ο Παρανομαστής δεν μπορεί να είναι 0!");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("Το αποτέλεσμα της Διαίρεσης %d / %d = %d%n",numerator,denominator,result);
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το πρόγραμμα!");

    }
}
