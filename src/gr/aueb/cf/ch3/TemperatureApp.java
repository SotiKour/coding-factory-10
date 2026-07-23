package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει τη θερμοκρασία σε βαθμούς κελσίου.
 * Το πρόγραμμα υπολογίζει αν η θερμοκρασία είναι < 0 μία μεταβλητή,
 * isTempBelowZero γίνεται true αλλιώς false. Τέλος, εκτυπώνει το αποτέλεσμα
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασίας");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.println("Η θερμοκρασία είναι κάτω από το 0: " + isTempBelowZero);



    }
}
