package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με πολλαπλά if
 */

public class MultipleIfApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές!");
            System.out.println("1. Εισαγωγή προϊόντος!");
            System.out.println("2. Ενημέρωση προϊόντος!");
            System.out.println("3. Διαγραφή προϊόντος!");
            System.out.println("4. Αναζήτηση προϊόντος!");
            System.out.println("5. Έξοδος!");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("1. Εισαγωγή προϊόντος!");
            } else if (choice == 2) {
                System.out.println("2. Ενημέρωση προϊόντος!");
            } else if (choice == 3) {
                System.out.println("3. Διαγραφή προϊόντος!");
            } else if (choice == 4){
                System.out.println("4. Αναζήτηση προϊόντος!");
            } else {
                System.out.println("Μη έγκυρη επιλογή! Παρακαλώ προσπαθήστε ξανά!");
            }
        } while (choice != 5); //exit





    }
}
