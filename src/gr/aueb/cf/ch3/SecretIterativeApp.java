package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επαναλληπτικά ο χρήστης προσπαθέι να μαντέψει το secret
 */

public class SecretIterativeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;              // Μυστικός ακέραιος
        int guess = 0;                      // Εικασία χρήστη


        while (true){
            System.out.println("Προσπαθήστε να μαντέψετε το μυστικό ακέραιο!");
            guess = scanner.nextInt();

            if (guess != SECRET) {
                System.out.println("Λυπάμαι η εικασία σας είναι λάθος, Παρακαλώ προσπαθήστε ξανά!");
                continue;
            }

            System.out.println("Συγχαρητήρια!");
            break;
        }
    }
}
