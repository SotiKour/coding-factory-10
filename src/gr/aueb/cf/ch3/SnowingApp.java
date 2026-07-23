package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει αν βρέχει και τη θερμοκρασία και το πρόγραμμα
 * υπολογίζει αν χιονίζει. Χιονίζει σημαίνει ότι βρέχει και η θερμοκρασία είναι
 * κάτω από το 0
 */

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRaining = false;
        boolean isSnowing = false;
        int temperature = 0;

        System.out.println("Βρέχει? (true/false)!");
        isRaining = scanner.nextBoolean();

        System.out.println("Παρακαλώ εισάγεται τη θερμοκρασία!");
        temperature = scanner.nextInt();

        isSnowing =  isRaining && (temperature < 0);

        System.out.printf("Χιονίζει: %b %n", isSnowing);

    }
}
