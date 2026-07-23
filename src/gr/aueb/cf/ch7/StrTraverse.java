package gr.aueb.cf.ch7;

/**
 * Traverse ένα String (και Reverse) με τη χρήση charAt().
 */

public class StrTraverse {
    public static void main(String[] args) {
        String s = "Coding Factory";

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }


        // Reverse
        for (int i = s.length() - 1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }



    }
}
