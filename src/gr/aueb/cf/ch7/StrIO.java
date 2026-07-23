package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Demo of String I/O
 */

public class StrIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "";
        String str2 = "";

        System.out.println("Παρακαλώ εισάγετε 2 Strings: ");
        str1 = in.next();       // Διαβάζει μέχρι το πρώτο whitespace
        str2 = in.nextLine();       //Διαβάζει μέχρι να βρει newline

    }
}
