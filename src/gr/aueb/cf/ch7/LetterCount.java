package gr.aueb.cf.ch7;

/**
 * Δημιουργήστε μία μέθοδο που να παίρνει σαν είσοδο ένα String και ένα char και επιστρέφει το πλήθος
 * των εμφανίσεων του char στο String
 */

public class LetterCount {
    public static void main(String[] args) {
        String s = "coding factory";
        char letter = 'c';


        System.out.println(getLetterCount(s, letter));

    }

    public static int getLetterCount(String s, char letter) {
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == letter) count++;
        }

        return count;
    }
}
