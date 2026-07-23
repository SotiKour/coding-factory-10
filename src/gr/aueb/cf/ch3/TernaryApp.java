package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής για τον υπολογισμό του μικρότερου
 * μεταξύ δύο ακεραίων
 */

public class TernaryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Εισάγεται 2 ακεραίους!");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if(num1 < num2){
//            min = num1;
//        }else{
//            min = num2;
//        }


        min = (num1 < num2) ? num1 : num2;


        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Ο μικρότερος αριθμός μεταξύ του %d και %d είναι ο %d", num1, num2, min);
    }
}
