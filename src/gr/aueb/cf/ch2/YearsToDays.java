package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει την ηλικία του σε έτη και το πρόγραμμα
 * επιστρέφει την ηλικία του σε μέρες όπου θεωρούμε ότι ένα έτος
 * = με 365 ημέρες. Για παράδειγμα, αν δοθεί ηλικία 20 ετών το αποτέλεσμα θα είναι 7.300 ημέρες.
 */

public class YearsToDays {

    public static void main(String[] args) {
        int inputAgeInYears = 0;
        int ageInDays = 0;
        final int DAYS_IN_A_YEAR = 365;

        Scanner scanner = new Scanner(System.in);

        //Input και Data Binding
        System.out.println("Παρακαλώ εισάγετε την ηλικία σας σε έτη!");
        inputAgeInYears = scanner.nextInt();

        //Λογική Εφαρμογής
        ageInDays = inputAgeInYears * DAYS_IN_A_YEAR;

        //Εκτύπωση Αποτελεσμάτων
        System.out.printf("Η ηλικία σας σε έτη είναι: %d, η οποία αντιστοιχεί σε %,d μέρες%n", inputAgeInYears, ageInDays);
    }
}
