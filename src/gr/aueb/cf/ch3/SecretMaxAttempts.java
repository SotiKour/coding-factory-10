package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικά ο χρήστης προσπαθεί να μαντέψει ένα μυστικό ακέραιο αλλά έχει
 * ένα όριο προσπαθειών. Αν ξεπεράσει το ότιο χάνει.
 */

public class SecretMaxAttempts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_PIN = 1234;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        int inputPin = 0;

        while (true){
            if (attempts == MAX_ATTEMPTS){
                System.out.println("Έχετε ξεπεράσει το όριο προσπαθειών. Χάσατε!");
                break;
            }

            System.out.println("Προσπαθήστε να μαντέψετε το Pin! Προσπάθεια!" + (attempts + 1) + " από " + MAX_ATTEMPTS);
            inputPin = scanner.nextInt();

            if (inputPin != SECRET_PIN){
                System.out.println("Λάθος pin. Προσπαθήστε ξανά!");
                attempts++;
                continue;
            }

            System.out.println("Συγχαρητήρια. Μαντέψατε σωστά!");
            break;

        }



    }
}
