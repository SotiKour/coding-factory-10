package gr.aueb.cf.ch18.bankapp;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String option;
        String iban;
        BigDecimal balance;                                 // BigDecimal αντί για double σε χρήματα λόγω ακρίβειας.


        while (true) {
            printMenu();
            option = scanner.nextLine().trim();                   // Με τηω trim δεν παίρνουμε κενά στην αρχή ή στο τέλος!

            try {
                switch (option) {
                    case "1" -> {
                        System.out.println("Παρακαλώ εισάγεται το IBAN!");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγεται το αρχικό υπόλοιπο!");
                        balance = new BigDecimal(scanner.nextLine().trim());

                        //AccountReadOnlyDTO readOnlyDTO = accountController.createNewAccount(iban, balance);

                        System.out.println("\n Ο λογαριασμός δημιουργήθηκε ή ανανεώθηκε επιτυχώς");
                        System.out.println("ΙΒΑΝ: " + readOnlyDTO.iban() + "Υπόλοιπο: " + readOnlyDTO.balance());

                    }




                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }





    }

    private static void printMenu() {
        System.out.println("\n=======================================");
        System.out.println("|          Υπηρεσία Bank App            |");
        System.out.println("========================================");
        System.out.println("\nΥποσύστημα Τράπεζας");
        System.out.println("    1. Δημιουργία / Ενημέρωση λογαριασμού");
        System.out.println("    2. Προβολή λογαριασμών");
        System.out.println("Υποσύστημα Πελατών");
        System.out.println("    3. Κατάθεση");
        System.out.println("    4. Ανάληψη");
        System.out.println("    5. Ερώτηση υπολοίπου");
        System.out.println("[Qq]. Έξοδος");
        System.out.print("\n Εισάγετε μία επιλογή");
    }



}
