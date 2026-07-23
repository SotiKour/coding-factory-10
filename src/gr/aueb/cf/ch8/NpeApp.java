package gr.aueb.cf.ch8;

/**
 * Null Pointer Exception. The most popular exception in Java.
 */

public class NpeApp {

    public static void main(String[] args) {
        String s;

        s = getOneOrNull();

        if (s == null) {
            System.out.println("Το String είναι Null!");
        } else {
            System.out.println(s.length());
        }
    }

    public static String getOneOrNull() {
        return null;
    }
}
