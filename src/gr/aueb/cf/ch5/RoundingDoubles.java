package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Demo of Rounding Doubles.
 * Ο χρήστης εισάγει έκταση με 6 δεκαδικά και υπολογίζουμε
 * την έκταση στρογγυλοποιημένη στα 2 δεκαδικά.
 */

public class RoundingDoubles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double area = 0.0;
        double roundedArea = 0.0;
        double truncatedArea = 0.0;

        System.out.println("Δώστε την έκταση με 6 δεκαδικά.");
        area = scanner.nextDouble();

        // Επειδή η Math.round() στρογγυλοποιεί μόνο σε ακέραιο
        // Χρησιμοποιούμε ένα hack με πολλαπλασιασμό και διαίρεση
        roundedArea = Math.round(area * 100) / 100.0;

        // Για αποκοπή των δεκαδικών κάνουμε Typecast σε int
        truncatedArea = (int) (area * 100) / 100.0;

        System.out.printf("Έκταση (αρχική): %.6f%n", area);
        System.out.printf("Έκταση (στρογγυλοποιημένη): %.2f%n", roundedArea);
        System.out.printf("Έκταση (αποκομμένη): %.2f%n", truncatedArea);
    }
}
