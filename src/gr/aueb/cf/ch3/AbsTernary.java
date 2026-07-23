package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο. Το πρόγραμμα υπολογίζει το απόλυτο του ακεραίου.
 * Το απόλυτο ενώς ακεραίου είναι θετικός αριθμός. Για παράδειγμα, το απόλυτο του -5 είναι και
 * το απόλυτο του 5 είναι 5.
 */

public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int absNum = 0;

        System.out.println("Παρακαλώ δώστε έναν αριθμό!");
        num = scanner.nextInt();


        absNum = (num > 0) ? num : -num;

        System.out.printf("Ο απόλυτος του αριθμού %d είναι ο αριθμός %d%n", num, absNum);
    }
}
