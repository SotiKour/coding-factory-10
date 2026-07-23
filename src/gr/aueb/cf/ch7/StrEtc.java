package gr.aueb.cf.ch7;

public class StrEtc {

    public static void main(String[] args) {

        // Cplit

        String s = "Athens University of Economics and Business";
        String[] tokens;

        tokens = s.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }

        // Concat
        String s1 = "Coding";
        String s2 = " Factory";
        String fullName = s1 + s2;
        String fullName2 = s1.concat(s2);

        System.out.println(fullName);

        // Replace
        String sDashed = s.replace(" ", "-");

        System.out.println(sDashed);

        // Format
        char row = 'A';
        int col = 5;
        String seat = String.format("%c%d", row, col);
        System.out.println(seat);

        // Trim
        String lastName = " Kourmpetis ";
        String trimmedLastName = lastName.trim();
        System.out.println(trimmedLastName);

        // To upper and To lower
        String lower = "Coding Factory";
        String upper = "CODING FACTORY";

        boolean isEqualIgnoreCase = lower.toUpperCase().equals(upper.toUpperCase());      //Normalization



    }
}
