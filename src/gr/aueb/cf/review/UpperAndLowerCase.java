package gr.aueb.cf.review;

import java.util.Scanner;

/**
 * Δοθέντος ενός String, μετατρέπει σε κεφαλαία-πεζά εναλλάξ
 * Παράδειγμα: "he!llo WORLD" -> "He!LlO wOrLd"
 * Άλλο παράδειγμα coding -> CoDiNg
 */

public class UpperAndLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        String result = "";

        System.out.println("Enter a String: ");
        inputStr = scanner.nextLine();

        result = getUpperLowerCase(inputStr);
        System.out.println("Result: " + result);

    }

    public static String getUpperLowerCase(String inputStr) {
        StringBuilder sb = new StringBuilder(inputStr.length());
        char ch;
        int letterIndex = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            ch = inputStr.charAt(i);

            if (Character.isLetter(ch)) {
                ch = letterIndex % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                letterIndex++;
            }
            sb.append(ch);
        }
         return sb.toString();
    }
}
